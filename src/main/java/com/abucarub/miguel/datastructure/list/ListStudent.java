package com.abucarub.miguel.datastructure.list;

/**
 * This interface defines all available operations for use in the system
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-08-20
 *
 */
public interface ListStudent {
	/**
	 * This method add student in the end of list
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 * @param student
	 */
	public void addStudent(Student student);
	/**
	 * This method add student in the specific position
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 * @param position
	 * @param student
	 */
	public void addStudent(int position, Student student);
	/**
	 * This method remove student of list according position informed
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 * @param position
	 */
	public void remove(int position);
	/**
	 * This method retrives a student from according postion informed
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 * @param position
	 * @return
	 */
	public Student retrive(int position);
	/**
	 * This method checks if students exists in the list
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 * @param student
	 * @return
	 */
	public boolean contains(Student student);
	/**
	 * This method count the students in the list
	 * 
	 * @author miguel.abucarub.neto
	 * @Date 2020-08-20
	 *
	 */
	public void count();
}
