package com.rays.models;
import java.sql.SQLException;
import java.util.Scanner;
import com.rays.beans.Marksheet;

public class TestmarksheetModel {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//testAdd();
			//testGet();
			testDelete();
			//testupdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void testAdd() throws SQLException, ClassNotFoundException {
		MarksheetModel model = new MarksheetModel();
		Marksheet m = new Marksheet();
		int rollno = model.nextPk();
		m.setRollno(rollno);
		m.setName("sachin");
		m.setPhy(60);
		m.setChem(96);
		m.setMaths(94);
		model.Add(m);
		}
	public static void testGet() throws SQLException, ClassNotFoundException {
	MarksheetModel model = new MarksheetModel();
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno to get your Marksheet.");
	   int rn = sc.nextInt();
		Marksheet marksheet = model.getMarksheet(rn);
		System.out.println(marksheet);
	}
	public static void testupdate() throws SQLException, ClassNotFoundException {
		MarksheetModel model = new MarksheetModel();
		Marksheet m = new Marksheet();
		m.setName("sachin");
		m.setPhy(45);
		m.setChem(98);
		m.setMaths(97);
		m.setRollno(1);
		model.update(m);
		System.out.println(m);
		}
	public static void testDelete() throws SQLException, ClassNotFoundException {
		MarksheetModel model = new MarksheetModel();
			Marksheet m= new Marksheet();
			m.setRollno(10);
			model.delete(m);
		}
	}
		

