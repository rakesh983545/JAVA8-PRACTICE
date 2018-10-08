package com.rakesh.comparatorImplLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rakesh.ConsumerJava8.Student;

public class Client {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("rakehs","78",100));
		list.add(new Employee("fjhgd","75",200));
		list.add(new Employee("manu","74",300));
		list.add(new Employee("fanu","90",400));
		
	//list.forEach(new MyConsumer());
		
	//list.forEach(s->System.out.println(s));
	//	list.forEach(System.out::println);
		
		Collections.sort(list,new sortingInterface());
		list.forEach(System.out::println);
	}

}
