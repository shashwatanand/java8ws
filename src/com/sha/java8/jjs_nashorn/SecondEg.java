package com.sha.java8.jjs_nashorn;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class SecondEg {
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		try {
			File file = new File("js_scripts/fetchurl.js");
			Reader reader = new FileReader(file);
			Object output = engine.eval(reader);
			System.out.println(output);
		} catch (Exception e) {
			System.out.println("Javascript Exception");
			e.printStackTrace();
		}
	}
}
