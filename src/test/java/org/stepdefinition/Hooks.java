package org.stepdefinition;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void starts() {
		System.out.println("starts.....");
		System.out.println(new Date());
		launchBrowser();

	}
	
	@After
	public void ends() throws InterruptedException {
		System.out.println(new Date());
		System.out.println("ends.....");
		Thread.sleep(5000);
		browserQuit();
	
	}
	
	@After
	public void failedScenarioScreenShots(Scenario s) {
		
		if(s.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot) driver;
			
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			
			s.embed(screenshot, "image/png");
			
			
		}
		
	}

}
