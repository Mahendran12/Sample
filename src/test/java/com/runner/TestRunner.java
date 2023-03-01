package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Reporting.ReportingClass;
import com.base.BaseClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Login"), features = "src\\test\\resources", snippets = SnippetType.CAMELCASE, glue = "com.definition", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target\\Output.html","json:target\\Output.json" })


public class TestRunner extends BaseClass{


	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		ReportingClass.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonpath"));

	}

}
