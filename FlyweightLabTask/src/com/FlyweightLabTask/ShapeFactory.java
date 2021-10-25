package com.FlyweightLabTask;

public class ShapeFactory {
	private static final HashMap circleMap = new HashMap();

	public static Shape getCircleType(String name,String color,) {
		Circle circle = (Circle)circleMap.get(color);

		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
