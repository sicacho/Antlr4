package com.language.util;

/**
 * Created by tnkhang on 11/18/2016.
 */
public interface Rule {
  public RuleResult matches(Post p,PostComparator postComparator);
}
