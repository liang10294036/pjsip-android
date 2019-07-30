/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class EpConfig extends PersistentObject {
  private transient long swigCPtr;

  protected EpConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.EpConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EpConfig obj) {
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
        pjsua2JNI.delete_EpConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setUaConfig(UaConfig value) {
    pjsua2JNI.EpConfig_uaConfig_set(swigCPtr, this, UaConfig.getCPtr(value), value);
  }

  public UaConfig getUaConfig() {
    long cPtr = pjsua2JNI.EpConfig_uaConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new UaConfig(cPtr, false);
  }

  public void setLogConfig(LogConfig value) {
    pjsua2JNI.EpConfig_logConfig_set(swigCPtr, this, LogConfig.getCPtr(value), value);
  }

  public LogConfig getLogConfig() {
    long cPtr = pjsua2JNI.EpConfig_logConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LogConfig(cPtr, false);
  }

  public void setMedConfig(MediaConfig value) {
    pjsua2JNI.EpConfig_medConfig_set(swigCPtr, this, MediaConfig.getCPtr(value), value);
  }

  public MediaConfig getMedConfig() {
    long cPtr = pjsua2JNI.EpConfig_medConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaConfig(cPtr, false);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.EpConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.EpConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public EpConfig() {
    this(pjsua2JNI.new_EpConfig(), true);
  }

}
