/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgView {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgView(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgView(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static MgView fromHandle(int h) {
    long cPtr = touchvgJNI.MgView_fromHandle(h);
    return (cPtr == 0) ? null : new MgView(cPtr, false);
  }

  public int toHandle() {
    return touchvgJNI.MgView_toHandle(swigCPtr, this);
  }

  public MgMotion motion() {
    long cPtr = touchvgJNI.MgView_motion(swigCPtr, this);
    return (cPtr == 0) ? null : new MgMotion(cPtr, false);
  }

  public MgCmdManager cmds() {
    long cPtr = touchvgJNI.MgView_cmds(swigCPtr, this);
    return (cPtr == 0) ? null : new MgCmdManager(cPtr, false);
  }

  public GiTransform xform() {
    long cPtr = touchvgJNI.MgView_xform(swigCPtr, this);
    return (cPtr == 0) ? null : new GiTransform(cPtr, false);
  }

  public MgShapeDoc doc() {
    long cPtr = touchvgJNI.MgView_doc(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public MgShapes shapes() {
    long cPtr = touchvgJNI.MgView_shapes(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapes(cPtr, false);
  }

  public GiContext context() {
    long cPtr = touchvgJNI.MgView_context(swigCPtr, this);
    return (cPtr == 0) ? null : new GiContext(cPtr, false);
  }

  public Matrix2d modelTransform() {
    return new Matrix2d(touchvgJNI.MgView_modelTransform(swigCPtr, this), false);
  }

  public MgShapeFactory getShapeFactory() {
    long cPtr = touchvgJNI.MgView_getShapeFactory(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeFactory(cPtr, false);
  }

  public MgSnap getSnap() {
    long cPtr = touchvgJNI.MgView_getSnap(swigCPtr, this);
    return (cPtr == 0) ? null : new MgSnap(cPtr, false);
  }

  public MgActionDispatcher getAction() {
    long cPtr = touchvgJNI.MgView_getAction(swigCPtr, this);
    return (cPtr == 0) ? null : new MgActionDispatcher(cPtr, false);
  }

  public CmdSubject getCmdSubject() {
    long cPtr = touchvgJNI.MgView_getCmdSubject(swigCPtr, this);
    return (cPtr == 0) ? null : new CmdSubject(cPtr, false);
  }

  public MgSelection getSelection() {
    long cPtr = touchvgJNI.MgView_getSelection(swigCPtr, this);
    return (cPtr == 0) ? null : new MgSelection(cPtr, false);
  }

  public boolean setCurrentShapes(MgShapes shapes) {
    return touchvgJNI.MgView_setCurrentShapes(swigCPtr, this, MgShapes.getCPtr(shapes), shapes);
  }

  public boolean toSelectCommand() {
    return touchvgJNI.MgView_toSelectCommand(swigCPtr, this);
  }

  public int getNewShapeID() {
    return touchvgJNI.MgView_getNewShapeID(swigCPtr, this);
  }

  public void setNewShapeID(int sid) {
    touchvgJNI.MgView_setNewShapeID(swigCPtr, this, sid);
  }

  public MgCommand getCommand() {
    long cPtr = touchvgJNI.MgView_getCommand(swigCPtr, this);
    return (cPtr == 0) ? null : new MgCommand(cPtr, false);
  }

  public MgCommand findCommand(String name) {
    long cPtr = touchvgJNI.MgView_findCommand(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MgCommand(cPtr, false);
  }

  public boolean setCommand(String name) {
    return touchvgJNI.MgView_setCommand(swigCPtr, this, name);
  }

  public boolean isReadOnly() {
    return touchvgJNI.MgView_isReadOnly(swigCPtr, this);
  }

  public boolean isCommand(String name) {
    return touchvgJNI.MgView_isCommand(swigCPtr, this, name);
  }

  public void regenAll(boolean changed) {
    touchvgJNI.MgView_regenAll(swigCPtr, this, changed);
  }

  public void regenAppend(int sid, int playh) {
    touchvgJNI.MgView_regenAppend__SWIG_0(swigCPtr, this, sid, playh);
  }

  public void regenAppend(int sid) {
    touchvgJNI.MgView_regenAppend__SWIG_1(swigCPtr, this, sid);
  }

  public void redraw(boolean changed) {
    touchvgJNI.MgView_redraw__SWIG_0(swigCPtr, this, changed);
  }

  public void redraw() {
    touchvgJNI.MgView_redraw__SWIG_1(swigCPtr, this);
  }

  public boolean useFinger() {
    return touchvgJNI.MgView_useFinger(swigCPtr, this);
  }

  public void commandChanged() {
    touchvgJNI.MgView_commandChanged(swigCPtr, this);
  }

  public void selectionChanged() {
    touchvgJNI.MgView_selectionChanged(swigCPtr, this);
  }

  public void dynamicChanged() {
    touchvgJNI.MgView_dynamicChanged(swigCPtr, this);
  }

  public boolean shapeWillAdded(MgShape shape) {
    return touchvgJNI.MgView_shapeWillAdded(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public void shapeAdded(MgShape shape) {
    touchvgJNI.MgView_shapeAdded(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeWillDeleted(MgShape shape) {
    return touchvgJNI.MgView_shapeWillDeleted(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean removeShape(MgShape shape) {
    return touchvgJNI.MgView_removeShape(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanRotated(MgShape shape) {
    return touchvgJNI.MgView_shapeCanRotated(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanTransform(MgShape shape) {
    return touchvgJNI.MgView_shapeCanTransform(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanUnlock(MgShape shape) {
    return touchvgJNI.MgView_shapeCanUnlock(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanUngroup(MgShape shape) {
    return touchvgJNI.MgView_shapeCanUngroup(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanMovedHandle(MgShape shape, int index) {
    return touchvgJNI.MgView_shapeCanMovedHandle(swigCPtr, this, MgShape.getCPtr(shape), shape, index);
  }

  public void shapeMoved(MgShape shape, int segment) {
    touchvgJNI.MgView_shapeMoved(swigCPtr, this, MgShape.getCPtr(shape), shape, segment);
  }

  public boolean shapeWillChanged(MgShape shape, MgShape oldsp) {
    return touchvgJNI.MgView_shapeWillChanged(swigCPtr, this, MgShape.getCPtr(shape), shape, MgShape.getCPtr(oldsp), oldsp);
  }

  public void shapeChanged(MgShape shape) {
    touchvgJNI.MgView_shapeChanged(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeClicked(int sid, int tag, float x, float y) {
    return touchvgJNI.MgView_shapeClicked(swigCPtr, this, sid, tag, x, y);
  }

  public void showMessage(String text) {
    touchvgJNI.MgView_showMessage(swigCPtr, this, text);
  }

  public void getLocalizedString(String name, MgStringCallback result) {
    touchvgJNI.MgView_getLocalizedString(swigCPtr, this, name, MgStringCallback.getCPtr(result), result);
  }

  public boolean isContextActionsVisible() {
    return touchvgJNI.MgView_isContextActionsVisible(swigCPtr, this);
  }

  public void hideContextActions() {
    touchvgJNI.MgView_hideContextActions(swigCPtr, this);
  }

  public int getOptionInt(String group, String name, int defValue) {
    return touchvgJNI.MgView_getOptionInt(swigCPtr, this, group, name, defValue);
  }

  public float getOptionFloat(String group, String name, float defValue) {
    return touchvgJNI.MgView_getOptionFloat(swigCPtr, this, group, name, defValue);
  }

  public void setOptionInt(String group, String name, int value) {
    touchvgJNI.MgView_setOptionInt(swigCPtr, this, group, name, value);
  }

  public void setOptionFloat(String group, String name, float value) {
    touchvgJNI.MgView_setOptionFloat(swigCPtr, this, group, name, value);
  }

}
