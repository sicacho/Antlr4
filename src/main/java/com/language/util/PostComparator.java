package com.language.util;

/**
 * Created by tnkhang on 11/18/2016.
 */
@FunctionalInterface
public interface PostComparator {
  public boolean match(Object value,String operator,String field,Post post);
}
