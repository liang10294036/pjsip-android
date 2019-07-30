/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipMultipartPart {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipMultipartPart(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipMultipartPart obj) {
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
        pjsua2JNI.delete_SipMultipartPart(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHeaders(SipHeaderVector value) {
    pjsua2JNI.SipMultipartPart_headers_set(swigCPtr, this, SipHeaderVector.getCPtr(value), value);
  }

  public SipHeaderVector getHeaders() {
    long cPtr = pjsua2JNI.SipMultipartPart_headers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipHeaderVector(cPtr, false);
  }

  public void setContentType(SipMediaType value) {
    pjsua2JNI.SipMultipartPart_contentType_set(swigCPtr, this, SipMediaType.getCPtr(value), value);
  }

  public SipMediaType getContentType() {
    long cPtr = pjsua2JNI.SipMultipartPart_contentType_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipMediaType(cPtr, false);
  }

  public void setBody(String value) {
    pjsua2JNI.SipMultipartPart_body_set(swigCPtr, this, value);
  }

  public String getBody() {
    return pjsua2JNI.SipMultipartPart_body_get(swigCPtr, this);
  }

  public SipMultipartPart() {
    this(pjsua2JNI.new_SipMultipartPart(), true);
  }

}
