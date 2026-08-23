package com.management.utilTest;

import com.management.util.DbUtil;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class DbUtilTest {

    @Test
    public void testGetConnectionSuccess() throws Exception {
    	
        try(Connection conn = DbUtil.getConnection()){
        	assertNotNull("Connection should not be null with valid properties", conn);
        	assertFalse("Connection should be open", conn.isClosed());
        }
    }
        
    @Test
    public void testSimpleQuery() throws Exception {
    	
    	try(Connection conn = DbUtil.getConnection();
    			Statement stmt = conn.createStatement()){
    		ResultSet rs = stmt.executeQuery("SELECT admin_name FROM admin WHERE admin_id=102");
    		assertTrue("ResultSet should contain a row",rs.next());
    		assertEquals("CHOTA KAKA", rs.getString("admin_name"));
    	}
    }

    @Test(expected = ClassNotFoundException.class)
    public void testWrongCredentials() throws Exception {
    	
    	System.setProperty("db.url", "jdbc:mysql://localhost:3306/servlet_crud");
    	System.setProperty("db.driver", "com.mysql.cj.jdbc.driver");
    	System.setProperty("db.uesrname", "wrong");
    	System.setProperty("db.password", "wrong");
    	DbUtil.getConnection_readingSystemProperty();
    }

}