package com.rays.beans;

public class Marksheet {
	private String name;
	private int rollno;
	private int phy;
	private int chem;
	private int maths;
	
	public Marksheet() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return"marksheet:\n Rollno:"+rollno+"\nName:"+name+"\nPhy:"+phy+"\nChem:"+chem+"\nMaths:"+maths;
	}

	
	
	
}


