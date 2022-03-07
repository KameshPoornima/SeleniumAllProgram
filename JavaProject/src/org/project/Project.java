package org.project;

import client.Client;

public  class Project  extends Client{
	public static void Projectname() {
       System.out.println("TestNG");
	}
	public static void main(String[] args) {
		Project p = new Project();
		
		p.empname();
		p.companyname();
		p.Clientname();
		p.Projectname();
	}

}
