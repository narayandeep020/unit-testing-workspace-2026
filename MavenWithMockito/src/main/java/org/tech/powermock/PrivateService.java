package org.tech.powermock;

public class PrivateService {

	 public String callSecret() {
	        return secretMethod();
	    }

	    private String secretMethod() {
	        return "Real Secret";
	    }
}
