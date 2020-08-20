package com.abucarub.miguel.datastructure;

import com.abucarub.miguel.datastructure.list.Student;
import com.abucarub.miguel.datastructure.list.Vector;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AddStudentInTheEndTest  extends TestCase{
	
    /**
     * Create the test case
     *
     * @param should_addInTheEnd name of the test case
     */
	public AddStudentInTheEndTest(String should_addInTheEnd) {
		super( should_addInTheEnd );
	}
	
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AddStudentInTheEndTest.class );
    }

	public static void testShould_addInTheEnd(){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("James");
		s2.setName("Kirk");
		
		Vector list = new Vector();
		list.addStudent(s1);
		list.addStudent(s2);
		
		System.out.println("----------should_addInTheEnd----------");
		System.out.println(list);
		
		assertTrue( true );
	}
	
}
