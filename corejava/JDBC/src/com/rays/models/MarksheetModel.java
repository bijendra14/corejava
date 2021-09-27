package com.rays.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rays.beans.Marksheet;

public class MarksheetModel {
	public Connection getConnection()  throws SQLException, ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
				e.printStackTrace();
				
			}
			String url = "jdbc:mysql://localhost:3306/students";
			Connection conn = DriverManager.getConnection(url,"root" ,"root");
			return conn;
		}
	public void Add(Marksheet m) throws SQLException, ClassNotFoundException{
	            Connection c = getConnection();
	    PreparedStatement pst=c.prepareStatement("insert into marksheet values(?,?,?,?,?)");
	    pst.setInt(1, m.getRollno());
	    pst.setString(2, m.getName());
	    pst.setInt(3, m.getPhy());
	    pst.setInt(4, m.getChem());
	    pst.setInt(5, m.getMaths());
	    int n= pst.executeUpdate();
	    if (n > 0) {
	    	System.out.println("Row INserted:" + n);
	    }else {
	    	System.out.println("Not INserted");

		

	}
	    }
	public int nextPk() throws SQLException, ClassNotFoundException {

	int pk =0;
	Connection conn = getConnection();
	Statement st =conn.createStatement();
	String qry = "Select max(rollno) from marksheet";
	ResultSet rs =st.executeQuery(qry);
	if (rs.next()) {
		pk = rs.getInt(1);
	}
	System.out.println(pk);
	 return pk + 1;
	}
	public Marksheet getMarksheet(int rollno) throws SQLException, ClassNotFoundException {
	Connection conn=getConnection();
	PreparedStatement ps=conn.prepareStatement("select * from marksheet where rollno=?");
	ps.setInt(1, rollno);
	ResultSet rs = ps.executeQuery();
	Marksheet m = null;
	while(rs.next()) {
		m = new Marksheet();
		m.setRollno(rs.getInt("rollno"));
		m.setChem(rs.getInt("chem"));
		m.setName(rs.getString("Name"));
		m.setPhy(rs.getInt("phy"));
		m.setMaths(rs.getInt("maths"));
	}
	conn.close();
	return m;
	}
	public void update(Marksheet m) throws SQLException, ClassNotFoundException {
	    Connection c = getConnection();
	    PreparedStatement pst=c.prepareStatement("update marksheet set name=? , phy=? , chem=?, maths=? where rollno=?");
	 
	      pst.setString(1, m.getName());
		    pst.setInt(2, m.getPhy());
		    pst.setInt(3, m.getChem());
		    pst.setInt(4, m.getMaths());
		    pst.setInt(5, m.getRollno());
		    
		    
		    pst.executeUpdate();
		    System.out.println("records update");
			pst.close();
		    c.close();
		    }
		    
	
		


//	public void update(Marksheet m) throws SQLException, ClassNotFoundException{
//	    Connection c = getConnection();
//	    PreparedStatement ps =c.prepareStatement("update marksheet set name=? where rollno=? set phy=? set chem=? set maths=?");
//	    ps.setString(1, "bijendra");
//		ps.setInt(2, 3);
//		ps.setInt(2, 45);
//		ps.setInt(2, 76);
//		ps.setInt(2, 87);
//		int n = ps.executeUpdate();
//		System.out.println("Record Inserted:+n");
//		ps.close();
//		c.close();}
//	}
	public void  delete(Marksheet m) throws SQLException, ClassNotFoundException {
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("delete from marksheet where rollno=?");
		ps.setInt(1, m.getRollno());
		ps.execute();
		System.out.println("delete");
		ps.close();
		conn.close();
		
	}
	
}