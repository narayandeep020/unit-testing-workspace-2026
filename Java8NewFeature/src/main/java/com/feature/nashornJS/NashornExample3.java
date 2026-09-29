package com.feature.nashornJS;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import java.io.FileReader;

public class NashornExample3 {

	public static void main(String[] args) throws Exception {
		// Calling JavaScript function inside Java code

		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");

		se.eval(new FileReader("E:\\2026_java_notes\\java8feature_NashornJS\\hello3.js"));
		Invocable invoc = (Invocable) se;

		invoc.invokeFunction("functionDemo1");
		invoc.invokeFunction("functionDemo2", "Nashorn");
	}

}
