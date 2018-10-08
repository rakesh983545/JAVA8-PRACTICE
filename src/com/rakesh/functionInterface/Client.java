package com.rakesh.functionInterface;

public class Client implements Interface1,Interface2 {
	
	public void display()
	{
		Interface1.super.display();
		Interface2.super.display();
	}
	
	public static void main(String[] args)
	{
		Client c=new Client();
		c.display();
	}

}
