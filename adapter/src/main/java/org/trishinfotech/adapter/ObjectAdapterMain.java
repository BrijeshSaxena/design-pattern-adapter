package org.trishinfotech.adapter;

import org.trishinfotech.adapter.extra.Rhombus;
import org.trishinfotech.adapter.extra.Triangle;

public class ObjectAdapterMain {

	public static void main(String[] args) {

		System.out.println("Creating drawing of shapes...");
		Drawing drawing = new Drawing();
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());
		drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
		drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

		System.out.println("Drawing...");
		drawing.draw();
		System.out.println("Resizing...");
		drawing.resize();
	}

}
