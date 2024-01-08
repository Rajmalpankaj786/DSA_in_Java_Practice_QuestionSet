package com.DSA.StringProblem;

import java.util.Objects;

// compare two object in java using equals methods
public class Student {

    private Integer id;
    private String name;

    // ... (other methods and constructors)

    public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

    public static void main(String[] args) {
        Student st1 = new Student(2, "rajmal");
        Student st2 = new Student(2, "rajmal");

        if (st1.equals(st2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
