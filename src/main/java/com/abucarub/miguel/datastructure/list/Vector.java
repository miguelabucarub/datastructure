package com.abucarub.miguel.datastructure.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * This class stores students in arrays
 * 
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-08-20
 */
public class Vector implements ListStudent {

	// Setting student array with 100 elements
	private Student[] students = new Student[100];

	private int sumOfStudents = 0;

	private void checkArraySize() {

		if (this.sumOfStudents == this.students.length) {
			Student[] newArray = new Student[this.students.length * 2];
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = this.students[i];
			}
			this.students = newArray;
		}
	}

	// add in the end of list
	public void addStudent(Student student) {
		this.checkArraySize();
		long tempoInicial = System.currentTimeMillis();
		this.students[this.sumOfStudents] = student;
		this.sumOfStudents++;
		System.out.println("Time spent was: " + (System.currentTimeMillis() - tempoInicial));
	}

	public void addStudent(int position, Student student) {

		this.checkArraySize();
		if (!this.isPositionIsValid(position)) {
			throw new IllegalArgumentException("Is not a valid position!");
		}

		for (int i = this.sumOfStudents - 1; i >= position; i -= 1) {
			this.students[i + 1] = this.students[i];
		}

		this.students[position] = student;
		this.sumOfStudents++;
	}

	public void remove(int position) {

		if (!this.isPositionIsFilled(position)) {
			throw new IllegalArgumentException("Position filled");
		}

		for (int i = position; i < this.sumOfStudents - 1; i++) {
			this.students[i] = this.students[i + 1];
		}
		this.sumOfStudents--;
	}

	public Student retrive(int position) {

		if (!this.isPositionFree(position)) {
			throw new IllegalArgumentException("Invalid position!!");
		}
		return this.students[position];
	}

	private boolean isPositionIsValid(int position) {
		return position >= 0 && position <= this.sumOfStudents;
	}

	private boolean isPositionFree(int position) {
		return position >= 0 && position < this.size();
	}

	private boolean isPositionIsFilled(int position) {
		return position < this.students.length && position >= 0;
	}

	public boolean contains(Student student) {
		for (int i = 0; i < this.students.length; i++) {
			if (student.equals(this.students[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return this.sumOfStudents;
	}

	public String toString() {
		return Arrays.toString(students);
	}

}
