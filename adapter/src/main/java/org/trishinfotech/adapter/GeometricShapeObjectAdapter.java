package org.trishinfotech.adapter;

import org.trishinfotech.adapter.extra.GeometricShape;
import org.trishinfotech.adapter.extra.Rhombus;
import org.trishinfotech.adapter.extra.Triangle;

public class GeometricShapeObjectAdapter implements Shape {

	private GeometricShape adaptee;

	public GeometricShapeObjectAdapter(GeometricShape adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
	}

	@Override
	public String description() {
		if (adaptee instanceof Triangle) {
			return "Triangle object";
		} else if (adaptee instanceof Rhombus) {
			return "Rhombus object";
		} else {
			return "Unknown object";
		}
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
