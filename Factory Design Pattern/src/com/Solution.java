package com;
import java.util.Scanner;

class Food
{
	
}
class Dosa extends Food
{
	public String toString()
	{
		return "Eating Dosa";
	}
}
class Idly extends Food
{
	public String toString()
	{
		return "Eating Idly";
	}
}
class LemonRice extends Food
{
	public String toString()
	{
		return "Eating LemonRice";
	}
}
class Poori extends Food
{
	
}
class Chapati extends Food
{
	public String toString()
	{
		return "Eating Chapati";
	}
}
class Pongal extends Food
{
	public String toString()
	{
		return "Eating Pongal";
	}
}
class Hotel
{
	Food orderFood(int choice)
	{
		if(choice ==1)
		{
		Dosa d=new Dosa();
		return d;
		}
		else if(choice==2)
		{
			Idly i=new Idly();
			return i;
		}
		else if(choice==3)
		{
			LemonRice l=new LemonRice();
			return l;
		}
		else if(choice==4)
		{
			Poori p=new Poori();
			return p;
		}
		else if(choice==5)
		{
			Chapati c=new Chapati();
			return c;
		}
		else if(choice==6)
		{
			Pongal po=new Pongal();
			return po;
		}
		else
		{
			return null;
		}
		
	}
	
}
public class Solution
{
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Order the Food items you want");
	System.out.println("1.Dosa\n2.Idly\n3.Lemon Rice\n4.Chapati\n5.Pongal");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	
//	System.out.println("Invalid Choice");
//	int choice=sc.nextInt();
	
	
	/*1. if choice is 1,internally calls -->Food obj=new Idly();
	 *2. if choice is 2	,internally calls-->Food obj=new LemonRice();
	 *3* if choice is 3	,internally calls-->Food obj=new Poori();*/
	
	
	
	
	
	
	
	Hotel hotel=new Hotel();
	Food food=hotel.orderFood(choice);
	
	if(food!=null)
	{
		System.out.println(food);
	}
	else
	{
		System.out.println("Invalid Choice");
	}
	
	}
}	
