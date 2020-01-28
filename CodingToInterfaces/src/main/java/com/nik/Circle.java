package com.nik;

public class Circle implements Shape
{
	private Point center;

	public void setCenter(Point center)
	{
		this.center = center;
	}

	@Override
	public void draw()
	{
		System.out.println("Circle is drawn of center (" + center.getX() + ", "
				+ center.getY() + ")");
	}
}