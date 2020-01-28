package com.nik;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		System.out.println("Enter you choice");
		System.out.println("1.Triangle");
		System.out.println("2.Circle");
		Scanner scanner = new Scanner(System.in);
		int ch = scanner.nextInt();
		Shape shape = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		if (ch == 1) {
			shape = context.getBean("triangle", Triangle.class);
		} else if (ch == 2) {
			shape = context.getBean("circle", Circle.class);
		}

		shape.draw();
		scanner.close();
	}

}
