package org.Student;

import org.college.College;

public class Student extends College {
	public static void Stdid() {
       System.out.println("Stdid:145544");
	}
	public static void Stdname() {
         System.out.println("Stdname:vijay");
	}
	public static void Stdclass() {
		System.out.println("Stdclass:10A");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.Stdid();
		s.Stdname();
		s.Stdclass();
	}

}
