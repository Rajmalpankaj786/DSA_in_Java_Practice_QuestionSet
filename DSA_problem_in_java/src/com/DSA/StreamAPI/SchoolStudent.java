package com.DSA.StreamAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SchoolStudent extends Student{
      
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1","kota"));
		students.add(new Student(20,"Name2","baran"));
		students.add(new Student(13,"Name3","jaipur"));
		students.add(new Student(25,"Name4","ajamer"));
		students.add(new Student(15,"Name5","bikaner"));
		 System.out.println(students);
		 
		 Collections.sort(students,(s1,s2) -> s1.getId()>s2.getId() ? 1 : -1);
		 System.out.println(students);
		 
		 
	}
}
