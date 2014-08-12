/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgImageShape extends MgBaseRect {
  private long swigCPtr;

  protected MgImageShape(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgImageShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgImageShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgImageShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MgImageShape create() {
    long cPtr = touchvgJNI.MgImageShape_create();
    return (cPtr == 0) ? null : new MgImageShape(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgImageShape_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgImageShape_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgImageShape_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgImageShape_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgImageShape_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgImageShape_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgImageShape_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgImageShape_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgImageShape_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgImageShape_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgImageShape_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgImageShape_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgImageShape_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgImageShape_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgImageShape_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgImageShape_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgImageShape_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgImageShape_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgImageShape_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgImageShape_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgImageShape_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgImageShape_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgImageShape_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgImageShape_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgImageShape_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgImageShape_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgImageShape_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgImageShape_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

  public void setName(String name) {
    touchvgJNI.MgImageShape_setName(swigCPtr, this, name);
  }

  public static MgShape findShapeByImageID(MgShapes shapes, String name) {
    long cPtr = touchvgJNI.MgImageShape_findShapeByImageID(MgShapes.getCPtr(shapes), shapes, name);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

}
