package P2;

import java.io.*;

import P1.*;
import java.util.Scanner;

public class Rectangle extends Shape
{
	private double length;
	private double breadth;

	protected void getData()throws IOException
	{
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter the length: ");
		length=sr.nextDouble();

		System.out.println("Enter the breadth: ");
		breadth=sr.nextDouble();
	}

	public double area()throws IOException
	{
		getData();
		return length*breadth;
	}
}
