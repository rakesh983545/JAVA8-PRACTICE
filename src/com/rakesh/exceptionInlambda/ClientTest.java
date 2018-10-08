package com.rakesh.exceptionInlambda;

import java.util.Arrays;
import java.util.List;

public class ClientTest {
	
	public static void main(String[] args)
	{
		List<Integer> integers=Arrays.asList(3,9,7,6,10,20,0);
		try {
			integers.forEach(i->System.out.println(50/i));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Invalid Input please give the valid array elements");
		}
	}

}
