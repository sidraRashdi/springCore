package com.springcore.springcore;

public class Student {
   private int studentId;
   private String studentAdress;
   private String studentName;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentAdress() {
	return studentAdress;
}
public void setStudentAdress(String studentAdress) {
	this.studentAdress = studentAdress;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Student(int studentId, String studentAdress, String studentName) {
	super();
	this.studentId = studentId;
	this.studentAdress = studentAdress;
	this.studentName = studentName;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentAdress=" + studentAdress + ", studentName=" + studentName
			+ "]";
}

}
