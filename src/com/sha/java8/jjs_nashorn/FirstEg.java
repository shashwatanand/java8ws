package com.sha.java8.jjs_nashorn;

import javax.script.ScriptEngineManager;

public class FirstEg {
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		scriptEngineManager.getEngineByName("nashorn");
	}
}
