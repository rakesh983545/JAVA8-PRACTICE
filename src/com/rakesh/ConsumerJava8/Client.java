package com.rakesh.ConsumerJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Client {
	
	public static void main(String[] args) {
		
	List<Student> list=new ArrayList<Student>();
		list.add(new Student("rakehs","78"));
		list.add(new Student("fjhgd","75"));
		list.add(new Student("manu","74"));
		list.add(new Student("fanu","90"));
		
	//list.forEach(new MyConsumer());
		
	//list.forEach(s->System.out.println(s));
		list.forEach(System.out::println);

	}
}
	



