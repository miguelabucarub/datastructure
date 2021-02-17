package com.abucarub.miguel.datastructure.list;

import java.util.ArrayList;

public class ListStudentApp {

	public static void main(String[] args) {

//		ArrayList vetorSemGenerics = new ArrayList();
//		ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
//		Aluno aluno = new Aluno();
//		vetorSemGenerics.add(aluno);
//		vetorComGenerics.add(aluno);
//		Aluno a1 = (Aluno) vetorSemGenerics.get(0);
//		Aluno a2 = vetorComGenerics.get(0);
		
		ArrayList vectorWithoutGenerics = new ArrayList();
		ArrayList<Student> vectorWithGenerics = new ArrayList<Student>();
		
		Student student = new Student();
		vectorWithGenerics.add(student);
		vectorWithoutGenerics.add(student);
		
		Student s1 = (Student) vectorWithoutGenerics.get(0);
		Student s2 = vectorWithGenerics.get(0);

	}

}
