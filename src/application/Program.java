package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	public static void main(String[] args) {
		Connection conn = null; 
		PreparedStatement stat = null; 
		ResultSet rs = null; 
		
		try {
		
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(stat);
			DB.closeConnection();
		}
		
	}
}
