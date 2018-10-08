package com.rakesh.ConsumerJava8;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student a) {
		System.out.println(a);
		
	}

}
