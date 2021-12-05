package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\failed.txt",glue="org.stepdefinition",dryRun=false,monochrome=true,
strict=true,plugin= {"rerun:C:\\Users\\Karthiksofia\\eclipse-workspace\\FacebookApplication\\ReRun\\failed.txt"})

public class ReRunnerClass {
	
	@AfterClass
	public static void report() {
		
		JVMReport.generatingJVMReport(System.getProperty("user.dir")+"\\target\\AllReports\\fblogin.json");
	
	

	}
}
