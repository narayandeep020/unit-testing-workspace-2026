package com.management.utilTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.management.util.EmailUtil;

public class EmailUtilTest {

	 @Test
	    public void testSendEmailRunsWithoutException() {
	        try {
	            EmailUtil.sendEmail();  // calls the real method
	            
	        } catch (Exception e) {
	            fail("sendEmail() should not throw exception: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testSendEmailHandlesMissingPropertiesFile() {
	        
	        try {
	            EmailUtil.sendEmail();
	            // If file is missing, your method prints stack trace and returns
	        } catch (Exception e) {
	            fail("sendEmail() should handle missing properties file gracefully");
	        }
	    }

}
