package org.adactin;

import org.baseclass.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before
	public void initialization() {
		
		 initialize("chrome");

	}
	
	@After
	public void quit() {
		
		closing("quit");

	}

}
