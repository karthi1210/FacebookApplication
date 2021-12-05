package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.stepdefinition",dryRun=false,monochrome=true,
strict=true,plugin= {"json:target\\AllReports\\fblogin.json","html:target\\AllReports","junit:target\\AllReports\\fb.xml","rerun:C:\\Users\\Karthiksofia\\eclipse-workspace\\FacebookApplication\\ReRun\\failed.txt"})

public class RunnerAll {
	
	@AfterClass
	public static void report() {
		
		JVMReport.generatingJVMReport(System.getProperty("user.dir")+"\\target\\AllReports\\fblogin.json");
		
	}

}
