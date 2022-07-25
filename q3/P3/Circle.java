package P3;

import java.io.*;

import P1.*;
import java.util.Scanner;

public class Circle extends Shape
{
	private double radius;

	protected void getData()throws IOException
	{
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		radius=sr.nextDouble();
	}

	public double area()throws IOException
	{
		getData();
		return 3.14*radius*radius;
	}
}
