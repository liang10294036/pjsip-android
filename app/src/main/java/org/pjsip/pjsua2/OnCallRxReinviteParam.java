/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCallRxReinviteParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallRxReinviteParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallRxReinviteParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnCallRxReinviteParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOffer(SdpSession value) {
    pjsua2JNI.OnCallRxReinviteParam_offer_set(swigCPtr, this, SdpSession.getCPtr(value), value);
  }

  public SdpSession getOffer() {
    long cPtr = pjsua2JNI.OnCallRxReinviteParam_offer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SdpSession(cPtr, false);
  }

  public void setRdata(SipRxData value) {
    pjsua2JNI.OnCallRxReinviteParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnCallRxReinviteParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  public void setAsync(boolean value) {
    pjsua2JNI.OnCallRxReinviteParam_async_set(swigCPtr, this, value);
  }

  public boolean getAsync() {
    return pjsua2JNI.OnCallRxReinviteParam_async_get(swigCPtr, this);
  }

  public void setStatusCode(pjsip_status_code value) {
    pjsua2JNI.OnCallRxReinviteParam_statusCode_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_status_code getStatusCode() {
    return pjsip_status_code.swigToEnum(pjsua2JNI.OnCallRxReinviteParam_statusCode_get(swigCPtr, this));
  }

  public void setOpt(CallSetting value) {
    pjsua2JNI.OnCallRxReinviteParam_opt_set(swigCPtr, this, CallSetting.getCPtr(value), value);
  }

  public CallSetting getOpt() {
    long cPtr = pjsua2JNI.OnCallRxReinviteParam_opt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CallSetting(cPtr, false);
  }

  public OnCallRxReinviteParam() {
    this(pjsua2JNI.new_OnCallRxReinviteParam(), true);
  }

}
