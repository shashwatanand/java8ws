package com.sha.java8.jjs_nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class FirstEg {
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		String script = "var greet = 'Hello'; "
				+ "greet += ' Shashwat'; "
				+ "greet;";
		
		Object output;
		try {
			output = engine.eval(script);
			System.out.println(output);
		} catch (Exception e) {
			System.out.println("Javascript Exception");
			e.printStackTrace();
		}
	}
}
