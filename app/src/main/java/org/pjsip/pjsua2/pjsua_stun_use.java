/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_stun_use {
  public final static pjsua_stun_use PJSUA_STUN_USE_DEFAULT = new pjsua_stun_use("PJSUA_STUN_USE_DEFAULT");
  public final static pjsua_stun_use PJSUA_STUN_USE_DISABLED = new pjsua_stun_use("PJSUA_STUN_USE_DISABLED");
  public final static pjsua_stun_use PJSUA_STUN_RETRY_ON_FAILURE = new pjsua_stun_use("PJSUA_STUN_RETRY_ON_FAILURE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_stun_use swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_stun_use.class + " with value " + swigValue);
  }

  private pjsua_stun_use(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_stun_use(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_stun_use(String swigName, pjsua_stun_use swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_stun_use[] swigValues = { PJSUA_STUN_USE_DEFAULT, PJSUA_STUN_USE_DISABLED, PJSUA_STUN_RETRY_ON_FAILURE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

