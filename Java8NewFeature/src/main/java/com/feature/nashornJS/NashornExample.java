package com.feature.nashornJS;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

	public static void main(String[] args) {

		// Create a script engine manager
		ScriptEngineManager sem = new ScriptEngineManager();

		// Obtain a Nashorn script engine instances
		ScriptEngine se = sem.getEngineByName("nashorn");

		try {
			// Evaluate JavaScript code from String
			se.eval("print('Hello, Nashorn');");

			Object result = se.eval("10 + 2");
			System.out.println("Result of 10 + 2: " + result);

			// Define a JavaScript function and call it from Java
			se.eval("function sum(a,b){return a+b;}");
			Object sumResult = se.eval("sum(10,15);");
			System.out.println("Result of sum(10,15): " + sumResult);
		} catch (ScriptException e) {
			System.out.println(e.getMessage());
		}
	}

}
