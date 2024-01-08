package com.DSA.StreamAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SchoolStudent extends Student{
    private String boardName; 
    
    
	public SchoolStudent(int id, String name, String state, String boardName) {
		super(id, name, state);
		this.boardName = boardName;
	}


	@Override
	public String toString() {
		return "SchoolStudent [boardName=" + boardName + "]";
	}


	public String getBoardName() {
		return boardName;
	}


	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}


	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1","kota"));
		students.add(new Student(20,"Name2","baran"));
		students.add(new Student(13,"Name3","jaipur"));
		students.add(new Student(25,"Name4","ajamer"));
		students.add(new Student(15,"Name5","bikaner"));
		System.out.println(students);

		 //sort with Integer type paramerer
		 Collections.sort(students,(s1,s2) -> s1.getId()>s2.getId() ? 1 : -1);
		 System.out.println(students);
		 
		//sort with String type paramerer
		 Collections.sort(students,(s1,s2) -> s1.getState().compareTo(s2.getState()));
		 System.out.println(students);
		
		//sort with Double type paramerer
		 //Collections.sort(students, (s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));

		  
		 
	}
}

class CollegeStudent extends Student{
	private String universityName;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public CollegeStudent(int id, String name, String state, String universityName) {
		super(id, name, state);
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "CollegeStudent [universityName=" + universityName + "]";
	}
	
	
}

class Main{
	
	public static void copy(List<? extends Student> ss, List<? super Student> cs) {
		for(Student st : ss) {
			cs.add(st);
		}
		System.out.println(cs);
	}
	public static void main(String[] args) {
		List<SchoolStudent> students = new ArrayList<>();
		students.add(new SchoolStudent(10,"Name1","kota","RBSE"));
		students.add(new SchoolStudent(20,"Name2","baran","CBSE"));
		students.add(new SchoolStudent(13,"Name3","jaipur","BPSE"));
		students.add(new SchoolStudent(25,"Name4","ajamer","RBSE"));
		students.add(new SchoolStudent(15,"Name5","bikaner","CBSE"));
		//System.out.println(students);
		
		List<Object> SchoolStudent = new ArrayList<>();
		copy(students,SchoolStudent);
		
		List<CollegeStudent> collegeStudent = new ArrayList<>();
		collegeStudent.add(new CollegeStudent(10,"Name1","kota","RTU"));
		collegeStudent.add(new CollegeStudent(20,"Name2","baran","BTU"));
		collegeStudent.add(new CollegeStudent(13,"Name3","jaipur","MIT"));
		collegeStudent.add(new CollegeStudent(25,"Name4","ajamer","UP"));
		collegeStudent.add(new CollegeStudent(15,"Name5","bikaner","MP"));
		//System.out.println(students);
		
		List<Student> CC = new ArrayList<>();
		copy(collegeStudent,CC);
		
	}
}
