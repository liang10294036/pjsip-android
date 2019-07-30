/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsip_ssl_method {
  public final static pjsip_ssl_method PJSIP_SSL_UNSPECIFIED_METHOD = new pjsip_ssl_method("PJSIP_SSL_UNSPECIFIED_METHOD", pjsua2JNI.PJSIP_SSL_UNSPECIFIED_METHOD_get());
  public final static pjsip_ssl_method PJSIP_SSLV2_METHOD = new pjsip_ssl_method("PJSIP_SSLV2_METHOD", pjsua2JNI.PJSIP_SSLV2_METHOD_get());
  public final static pjsip_ssl_method PJSIP_SSLV3_METHOD = new pjsip_ssl_method("PJSIP_SSLV3_METHOD", pjsua2JNI.PJSIP_SSLV3_METHOD_get());
  public final static pjsip_ssl_method PJSIP_TLSV1_METHOD = new pjsip_ssl_method("PJSIP_TLSV1_METHOD", pjsua2JNI.PJSIP_TLSV1_METHOD_get());
  public final static pjsip_ssl_method PJSIP_TLSV1_1_METHOD = new pjsip_ssl_method("PJSIP_TLSV1_1_METHOD", pjsua2JNI.PJSIP_TLSV1_1_METHOD_get());
  public final static pjsip_ssl_method PJSIP_TLSV1_2_METHOD = new pjsip_ssl_method("PJSIP_TLSV1_2_METHOD", pjsua2JNI.PJSIP_TLSV1_2_METHOD_get());
  public final static pjsip_ssl_method PJSIP_SSLV23_METHOD = new pjsip_ssl_method("PJSIP_SSLV23_METHOD", pjsua2JNI.PJSIP_SSLV23_METHOD_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsip_ssl_method swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsip_ssl_method.class + " with value " + swigValue);
  }

  private pjsip_ssl_method(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsip_ssl_method(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsip_ssl_method(String swigName, pjsip_ssl_method swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsip_ssl_method[] swigValues = { PJSIP_SSL_UNSPECIFIED_METHOD, PJSIP_SSLV2_METHOD, PJSIP_SSLV3_METHOD, PJSIP_TLSV1_METHOD, PJSIP_TLSV1_1_METHOD, PJSIP_TLSV1_2_METHOD, PJSIP_SSLV23_METHOD };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

