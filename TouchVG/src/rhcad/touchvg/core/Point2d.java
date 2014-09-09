/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class Point2d {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Point2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Point2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Point2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    touchvgJNI.Point2d_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return touchvgJNI.Point2d_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    touchvgJNI.Point2d_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return touchvgJNI.Point2d_y_get(swigCPtr, this);
  }

  public static Point2d kOrigin() {
    return new Point2d(touchvgJNI.Point2d_kOrigin(), true);
  }

  public Point2d() {
    this(touchvgJNI.new_Point2d__SWIG_0(), true);
  }

  public Point2d(float xx, float yy) {
    this(touchvgJNI.new_Point2d__SWIG_1(xx, yy), true);
  }

  public Point2d(Point2d src) {
    this(touchvgJNI.new_Point2d__SWIG_2(Point2d.getCPtr(src), src), true);
  }

  public Point2d transform(Matrix2d m) {
    return new Point2d(touchvgJNI.Point2d_transform(swigCPtr, this, Matrix2d.getCPtr(m), m), true);
  }

  public Point2d scaleBy(float sx, float sy) {
    return new Point2d(touchvgJNI.Point2d_scaleBy__SWIG_0(swigCPtr, this, sx, sy), false);
  }

  public Point2d scaleBy(float s) {
    return new Point2d(touchvgJNI.Point2d_scaleBy__SWIG_1(swigCPtr, this, s), false);
  }

  public void offset(float dx, float dy) {
    touchvgJNI.Point2d_offset__SWIG_0(swigCPtr, this, dx, dy);
  }

  public void offset(Vector2d vec) {
    touchvgJNI.Point2d_offset__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public Point2d add(Point2d pnt) {
    return new Point2d(touchvgJNI.Point2d_add(swigCPtr, this, Point2d.getCPtr(pnt), pnt), true);
  }

  public Vector2d subtract(Point2d pnt) {
    return new Vector2d(touchvgJNI.Point2d_subtract__SWIG_0(swigCPtr, this, Point2d.getCPtr(pnt), pnt), true);
  }

  public Point2d subtract(Vector2d vec) {
    return new Point2d(touchvgJNI.Point2d_subtract__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec), true);
  }

  public Vector2d negate() {
    return new Vector2d(touchvgJNI.Point2d_negate(swigCPtr, this), true);
  }

  public Vector2d asVector() {
    return new Vector2d(touchvgJNI.Point2d_asVector(swigCPtr, this), true);
  }

  public float length() {
    return touchvgJNI.Point2d_length(swigCPtr, this);
  }

  public float distanceTo(Point2d pnt) {
    return touchvgJNI.Point2d_distanceTo(swigCPtr, this, Point2d.getCPtr(pnt), pnt);
  }

  public float distanceSquare(Point2d pnt) {
    return touchvgJNI.Point2d_distanceSquare(swigCPtr, this, Point2d.getCPtr(pnt), pnt);
  }

  public boolean isEqualTo(Point2d pnt, Tol tol) {
    return touchvgJNI.Point2d_isEqualTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(pnt), pnt, Tol.getCPtr(tol), tol);
  }

  public boolean isEqualTo(Point2d pnt) {
    return touchvgJNI.Point2d_isEqualTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(pnt), pnt);
  }

  public boolean isDegenerate() {
    return touchvgJNI.Point2d_isDegenerate(swigCPtr, this);
  }

  public Point2d set(float xx, float yy) {
    return new Point2d(touchvgJNI.Point2d_set__SWIG_0(swigCPtr, this, xx, yy), false);
  }

  public Point2d set(Point2d pnt) {
    return new Point2d(touchvgJNI.Point2d_set__SWIG_1(swigCPtr, this, Point2d.getCPtr(pnt), pnt), false);
  }

  public Point2d polarPoint(float angle, float dist) {
    return new Point2d(touchvgJNI.Point2d_polarPoint(swigCPtr, this, angle, dist), true);
  }

  public Point2d rulerPoint(Point2d dir, float yoff) {
    return new Point2d(touchvgJNI.Point2d_rulerPoint__SWIG_0(swigCPtr, this, Point2d.getCPtr(dir), dir, yoff), true);
  }

  public Point2d rulerPoint(Point2d dir, float xoff, float yoff) {
    return new Point2d(touchvgJNI.Point2d_rulerPoint__SWIG_1(swigCPtr, this, Point2d.getCPtr(dir), dir, xoff, yoff), true);
  }

}
