import java.io.*;

import P1.*;
import P2.*;
import P3.*;
import java.util.Scanner;

class Main
{
	public static void main(String args[])throws IOException
	{
		Scanner sr = new Scanner(System.in);

		int ch;
		while(true)
		{
			System.out.println("Enter shape type:- \n1: for Rectangle  \n2: for Circle  \n3: for Exit: ");
			ch=sr.nextInt();

			Shape sh;
		
		
			if (ch==1)
			{
				sh=new Rectangle();
				System.out.println("Area of Rectangle is: " + sh.area() + " sq. units");

			}

			else if(ch==2)
			{
				sh=new Circle();
				System.out.println("Area Circle is: " + sh.area() + " sq. units");
	
			}

			else
			{
				System.out.println("EXITING...");
				System.exit(0);
			}
		}
	}
}
