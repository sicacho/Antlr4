package com.language.util;

/**
 * Created by tnkhang on 11/18/2016.
 */
public class RuleResult {
  private String _id;
  private String _rev;
  private String name;
  private Boolean result;

  public RuleResult(String _id, String _rev, String name, Boolean result) {
    this._id = _id;
    this._rev = _rev;
    this.name = name;
    this.result = result;
  }

  @Override
  public String toString() {
    return "RuleResult{" +
            "_id='" + _id + '\'' +
            ", _rev='" + _rev + '\'' +
            ", name='" + name + '\'' +
            ", result=" + result +
            '}';
  }
}
