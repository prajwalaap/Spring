package com.autowiring.byName;

public class Student2 {
	private int id;
	private String name;
	private Scholarship sch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Scholarship getSch() {
		return sch;
	}
	public void setSch(Scholarship sch) {
		this.sch = sch;
	}
   public Student2(){
	   System.out.println("student2 is created");
   }
   public void display(){
	   sch.setId(101);
	   sch.setAmt(2000);
	   System.out.println(sch);
   }
@Override
public String toString() {
	return "Student2 [id=" + id + ", name=" + name + ", sch=" + sch + "]";
}
}
