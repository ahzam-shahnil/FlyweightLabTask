package com.FlyweightLabTask;

public class CircleType {
	
	private String name;
	private int  radius;
	private String color;
	public CircleType(String name, int radius, String color) {
		this.name = name;
		this.radius = radius;
		this.color = color;
	}
	@Override
	public String toString() {
		return "CircleType [name=" + name + ", radius=" + radius + ", color=" + color + "]";
	}
	
	void draw(int x, int y) {
		this.toString();
		System.out.println("the circle is Drawn at x:"+ x +" y:"+ y);
	}
	
	
	

}
