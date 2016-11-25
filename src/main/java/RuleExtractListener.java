import antlr4.generate.rule.RuleBaseListener;
import antlr4.generate.rule.RuleParser;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by tnkhang on 11/16/2016.
 */
public class RuleExtractListener extends RuleBaseListener {

  Queue<String> fieldQueue = new ArrayDeque<>();
  private String id ;
  private String rev;
  private String name;
  private StringBuilder stringBuilder = new StringBuilder();
  private String className;

  @Override
  public void enterId(RuleParser.IdContext ctx) {
    id = ctx.STRING().getText().replace("\"","");
    super.enterId(ctx);
  }

  @Override
  public void enterRev(RuleParser.RevContext ctx) {
    rev = ctx.STRING().getText().replace("\"","");
    stringBuilder.append("package com.language.generate;\n");
//    stringBuilder.append("import com.language.util.Post;\n");
//    stringBuilder.append("import com.language.util.PostComparator;\n");
//    stringBuilder.append("import com.language.util.Rule;\n");
//    stringBuilder.append("import com.language.util.RuleResult;\n");
    stringBuilder.append("public class "+id+"_"+rev+" implements com.language.util.Rule {\n");
    className = id+"_"+rev;
    super.enterRev(ctx);
  }

  @Override
  public void enterName(RuleParser.NameContext ctx) {
    name = ctx.STRING().getText().replace("\"","");
    stringBuilder.append("   private static final com.language.util.RuleResult matched = new com.language.util.RuleResult(\""+id+"\""+","+"\""+rev+"\""+",\""+name+"\",true);\n");
    stringBuilder.append("   private static final com.language.util.RuleResult notMatched = new com.language.util.RuleResult(\""+id+"\""+","+"\""+rev+"\""+",\""+name+"\",false);\n");
    stringBuilder.append("   private com.language.util.PostComparator postComparator;\n");
    super.enterName(ctx);
  }

  @Override
  public void enterRuleEx(RuleParser.RuleExContext ctx) {
    stringBuilder.append("   public com.language.util.RuleResult matches(com.language.util.Post p,com.language.util.PostComparator postComparator) {\n");
    stringBuilder.append("      this.postComparator = postComparator;\n");
    stringBuilder.append("      return epxr_" + UUID.nameUUIDFromBytes(ctx.expression().getText().getBytes()).toString().replace("-","_") + "(p) ? matched : notMatched" + ";\n");
    stringBuilder.append("   }\n");
    super.enterRuleEx(ctx);
  }

  @Override
  public void enterAnd(RuleParser.AndContext ctx) {
    stringBuilder.append("   public boolean epxr_" +UUID.nameUUIDFromBytes(ctx.getText().getBytes()).toString().replace("-","_") + "(com.language.util.Post p) {\n");
    stringBuilder.append("      return " +ctx.expression().stream()
            .map(expressionContext -> "epxr_"+ UUID.nameUUIDFromBytes(expressionContext.getText().getBytes()).toString().replace("-","_") + "(p)")
            .collect(Collectors.joining(" && ")) + ";\n");
    stringBuilder.append("   }\n");
    super.enterAnd(ctx);
  }

  @Override
  public void enterOr(RuleParser.OrContext ctx) {
    stringBuilder.append("   public boolean epxr_" +UUID.nameUUIDFromBytes(ctx.getText().getBytes()).toString().replace("-","_") + "(com.language.util.Post p) {\n");
    stringBuilder.append("      return " +ctx.expression().stream()
            .map(expressionContext ->
                    "epxr_"+ UUID.nameUUIDFromBytes(expressionContext.getText().getBytes()).toString().replace("-","_") + "(p)")
            .collect(Collectors.joining(" || ")) + ";\n");
    stringBuilder.append("   }\n");
    super.enterOr(ctx);
  }

  @Override
  public void enterField(RuleParser.FieldContext ctx) {
    stringBuilder.append("    public boolean epxr_" +UUID.nameUUIDFromBytes(ctx.getText().getBytes()).toString().replace("-","_") + "(com.language.util.Post p) {\n");
    stringBuilder.append("        return " + ctx.match().stream()
            .map(matchContext ->"epxr_"+  UUID.nameUUIDFromBytes(matchContext.getText().getBytes()).toString().replace("-","_") + "(p)")
            .collect(Collectors.joining(" && ")) + ";\n");
    stringBuilder.append("    }\n");
    fieldQueue.add(ctx.STRING().getText());
    super.enterField(ctx);
  }

  @Override
  public void enterMatch(RuleParser.MatchContext ctx) {
    String operator = operator(ctx);
    stringBuilder.append("    public boolean epxr_"+UUID.nameUUIDFromBytes(ctx.getText().getBytes()).toString().replace("-","_") + "(com.language.util.Post p) {\n");
    stringBuilder.append("      return " + "postComparator.match("+ctx.value().getText()+","+operator+","+fieldQueue.poll()+",p);\n");
    stringBuilder.append("    }\n");
    super.enterMatch(ctx);
  }

  @Override
  public void exitRuleEx(RuleParser.RuleExContext ctx) {
    stringBuilder.append("}\n");
    System.out.println(stringBuilder.toString());
    super.exitRuleEx(ctx);
  }

  private String operator(RuleParser.MatchContext ctx) {
    return ctx.operator().getText();
  }

  public String getClassSource() {
    return stringBuilder.toString();
  }

  public String getClassName() {
    return className;
  }
}
