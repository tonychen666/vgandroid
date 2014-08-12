/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgBaseShape extends MgObject {
  private long swigCPtr;

  protected MgBaseShape(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgBaseShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgBaseShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgBaseShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.MgBaseShape_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgBaseShape_change_ownership(this, swigCPtr, true);
  }

  public MgBaseShape() {
    this(touchvgJNI.new_MgBaseShape(), true);
    touchvgJNI.MgBaseShape_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public static int Type() {
    return touchvgJNI.MgBaseShape_Type();
  }

  public static Tol minTol() {
    return new Tol(touchvgJNI.MgBaseShape_minTol(), false);
  }

  public MgBaseShape cloneShape() {
    long cPtr = touchvgJNI.MgBaseShape_cloneShape(swigCPtr, this);
    return (cPtr == 0) ? null : new MgBaseShape(cPtr, false);
  }

  public Box2d getExtent() {
    return new Box2d((getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_getExtent(swigCPtr, this) : touchvgJNI.MgBaseShape_getExtentSwigExplicitMgBaseShape(swigCPtr, this), true);
  }

  public int getChangeCount() {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_getChangeCount(swigCPtr, this) : touchvgJNI.MgBaseShape_getChangeCountSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public void resetChangeCount(int count) {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_resetChangeCount(swigCPtr, this, count); else touchvgJNI.MgBaseShape_resetChangeCountSwigExplicitMgBaseShape(swigCPtr, this, count);
  }

  public void afterChanged() {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_afterChanged(swigCPtr, this); else touchvgJNI.MgBaseShape_afterChangedSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public void update() {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_update(swigCPtr, this); else touchvgJNI.MgBaseShape_updateSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat); else touchvgJNI.MgBaseShape_transformSwigExplicitMgBaseShape(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_clear(swigCPtr, this); else touchvgJNI.MgBaseShape_clearSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public void clearCachedData() {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_clearCachedData(swigCPtr, this); else touchvgJNI.MgBaseShape_clearCachedDataSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgBaseShape_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgBaseShape_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgBaseShape_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_isClosed(swigCPtr, this) : touchvgJNI.MgBaseShape_isClosedSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public boolean isCurve() {
    return touchvgJNI.MgBaseShape_isCurve(swigCPtr, this);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgBaseShape_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

  public float hitTest2(Point2d pt, float tol, Point2d nearpt) {
    return touchvgJNI.MgBaseShape_hitTest2(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, Point2d.getCPtr(nearpt), nearpt);
  }

  public boolean hitTestBox(Box2d rect) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect) : touchvgJNI.MgBaseShape_hitTestBoxSwigExplicitMgBaseShape(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgBaseShape_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgBaseShape_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_save(swigCPtr, this, MgStorage.getCPtr(s), s) : touchvgJNI.MgBaseShape_saveSwigExplicitMgBaseShape(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s) : touchvgJNI.MgBaseShape_loadSwigExplicitMgBaseShape(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_getHandleCount(swigCPtr, this) : touchvgJNI.MgBaseShape_getHandleCountSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d((getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_getHandlePoint(swigCPtr, this, index) : touchvgJNI.MgBaseShape_getHandlePointSwigExplicitMgBaseShape(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol) : touchvgJNI.MgBaseShape_setHandlePointSwigExplicitMgBaseShape(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_isHandleFixed(swigCPtr, this, index) : touchvgJNI.MgBaseShape_isHandleFixedSwigExplicitMgBaseShape(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_getHandleType(swigCPtr, this, index) : touchvgJNI.MgBaseShape_getHandleTypeSwigExplicitMgBaseShape(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment) : touchvgJNI.MgBaseShape_offsetSwigExplicitMgBaseShape(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public boolean getFlag(MgShapeBit bit) {
    return touchvgJNI.MgBaseShape_getFlag(swigCPtr, this, bit.swigValue());
  }

  public void setFlag(MgShapeBit bit, boolean on) {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_setFlag(swigCPtr, this, bit.swigValue(), on); else touchvgJNI.MgBaseShape_setFlagSwigExplicitMgBaseShape(swigCPtr, this, bit.swigValue(), on);
  }

  public void copy(MgObject src) {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_copy(swigCPtr, this, MgObject.getCPtr(src), src); else touchvgJNI.MgBaseShape_copySwigExplicitMgBaseShape(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public boolean equals(MgObject src) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_equals(swigCPtr, this, MgObject.getCPtr(src), src) : touchvgJNI.MgBaseShape_equalsSwigExplicitMgBaseShape(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public boolean isKindOf(int type) {
    return (getClass() == MgBaseShape.class) ? touchvgJNI.MgBaseShape_isKindOf(swigCPtr, this, type) : touchvgJNI.MgBaseShape_isKindOfSwigExplicitMgBaseShape(swigCPtr, this, type);
  }

  public void addRef() {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_addRef(swigCPtr, this); else touchvgJNI.MgBaseShape_addRefSwigExplicitMgBaseShape(swigCPtr, this);
  }

  public void setExtent(Box2d rect) {
    touchvgJNI.MgBaseShape_setExtent(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public void setOwner(MgShape owner) {
    if (getClass() == MgBaseShape.class) touchvgJNI.MgBaseShape_setOwner(swigCPtr, this, MgShape.getCPtr(owner), owner); else touchvgJNI.MgBaseShape_setOwnerSwigExplicitMgBaseShape(swigCPtr, this, MgShape.getCPtr(owner), owner);
  }

}
