package com.demo.di_set;

public class Employee {
private int emp_id;
private String emp_name;
private String emp_city;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmp_city() {
	return emp_city;
}
public void setEmp_city(String emp_city) {
	this.emp_city = emp_city;
}
public void showResult() {
	System.out.println("\nEmployee details ? Id="+emp_id+" Name : "+emp_name+"City : "+emp_city);
}
}
