package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generatingJVMReport(String jsonPath) {
		
		File file = new File(System.getProperty("user.dir")+"\\target\\AllReports");
		
		Configuration con = new Configuration(file, "Facebook Application");
		
		con.addClassifications("platform", "Windows10");
		con.addClassifications("browser", "Chrome");
		
		List<String> list = new ArrayList<String>();
		
		list.add(jsonPath);
		
		ReportBuilder reportBuilder = new ReportBuilder(list, con);
		
		reportBuilder.generateReports();
		
	}

}
