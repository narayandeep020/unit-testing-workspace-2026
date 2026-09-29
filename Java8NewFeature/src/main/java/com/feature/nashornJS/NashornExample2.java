package com.feature.nashornJS;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornExample2 {

	public static void main(String[] args) {

		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");

		try {
			se.eval(new FileReader("E:\\2026_java_notes\\java8feature_NashornJS\\hello.js"));
		} catch (ScriptException | FileNotFoundException e) {
			e.printStackTrace();
		}

//		se.eval("print('Hello, Nashorn');");
	}
}
