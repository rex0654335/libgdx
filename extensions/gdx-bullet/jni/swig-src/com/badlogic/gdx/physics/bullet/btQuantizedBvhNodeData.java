/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btQuantizedBvhNodeData extends BulletBase {
	private long swigCPtr;
	
	protected btQuantizedBvhNodeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btQuantizedBvhNodeData(long cPtr, boolean cMemoryOwn) {
		this("btQuantizedBvhNodeData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btQuantizedBvhNodeData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btQuantizedBvhNodeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setQuantizedAabbMin(int[] value) {
    gdxBulletJNI.btQuantizedBvhNodeData_quantizedAabbMin_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMin() {
    return gdxBulletJNI.btQuantizedBvhNodeData_quantizedAabbMin_get(swigCPtr, this);
  }

  public void setQuantizedAabbMax(int[] value) {
    gdxBulletJNI.btQuantizedBvhNodeData_quantizedAabbMax_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMax() {
    return gdxBulletJNI.btQuantizedBvhNodeData_quantizedAabbMax_get(swigCPtr, this);
  }

  public void setEscapeIndexOrTriangleIndex(int value) {
    gdxBulletJNI.btQuantizedBvhNodeData_escapeIndexOrTriangleIndex_set(swigCPtr, this, value);
  }

  public int getEscapeIndexOrTriangleIndex() {
    return gdxBulletJNI.btQuantizedBvhNodeData_escapeIndexOrTriangleIndex_get(swigCPtr, this);
  }

  public btQuantizedBvhNodeData() {
    this(gdxBulletJNI.new_btQuantizedBvhNodeData(), true);
  }

}
