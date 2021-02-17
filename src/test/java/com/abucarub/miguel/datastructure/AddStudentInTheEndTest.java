package com.abucarub.miguel.datastructure;

import org.junit.runner.RunWith;

import com.abucarub.miguel.datastructure.list.Student;
import com.abucarub.miguel.datastructure.list.Vector;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AddStudentInTheEndTest{

	@Test
	public void should_testAddInTheEnd(){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("James");
		s2.setName("Kirk");
		
		Vector list = new Vector();
		list.addStudent(s1);
		
		System.out.println("----------should_addInTheEnd----------");
		System.out.println(list);
		
		assertTrue( true );
	}
	
}
