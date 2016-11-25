import antlr4.generate.labeledExpr.LabeledExprBaseVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tnkhang on 11/11/2016.
 */
public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
  Map<String,Integer> memory = new HashMap<>();

}
