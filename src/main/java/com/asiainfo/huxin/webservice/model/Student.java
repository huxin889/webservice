package com.asiainfo.huxin.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class Student {
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + "]";
	}

	private long studentNo;
	private String name;
	private int age;

	public long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
