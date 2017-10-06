package com.autowiring.byName;

public class Scholarship {
	public Scholarship(){
		System.out.println("scholarship is created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	private int id;
	private float amt;
	@Override
	public String toString() {
		return "Scholarship [id=" + id + ", amt=" + amt + "]";
	}
	

}
