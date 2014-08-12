/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgLines extends MgBaseLines {
  private long swigCPtr;

  protected MgLines(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgLines_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgLines obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgLines(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MgLines create() {
    long cPtr = touchvgJNI.MgLines_create();
    return (cPtr == 0) ? null : new MgLines(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgLines_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgLines_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgLines_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgLines_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgLines_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgLines_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgLines_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgLines_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgLines_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgLines_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgLines_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgLines_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgLines_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgLines_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgLines_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgLines_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgLines_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgLines_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgLines_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgLines_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgLines_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgLines_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgLines_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgLines_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgLines_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgLines_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgLines_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgLines_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

}
