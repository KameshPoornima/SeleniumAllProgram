package org.staff;

import org.Student.Student;

public class Staff extends Student {
	public static void Staffid() {
		System.out.println("Staffid:2222");
	}
	public static void Staffname() {
		System.out.println("Staffname:RAJU");
	}
	public static void main(String[] args) {
		Staff s = new Staff();
		s.Collegename();
		s.Stdid();
		s.Stdname();
		s.Stdclass();
		s.Staffid();
		s.Staffname();
	}

}
