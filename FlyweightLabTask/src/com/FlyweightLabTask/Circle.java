package com.FlyweightLabTask;

public class Circle {
	
	
private int x;
private int y;
private CircleType type;
public Circle(int x, int y) {
	
	this.x = x;
	this.y = y;
	this.type=type;
}

void draw() {
	type.draw(x,y);
}
}
