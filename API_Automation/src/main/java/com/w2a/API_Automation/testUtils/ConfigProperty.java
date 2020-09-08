package com.w2a.API_Automation.testUtils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"file:src/test/resources/PropertyFiles/${environment}.properties"
})
public interface ConfigProperty extends Config{
	
	@Key("baseURI")
	String getBaseURI();
	
	@Key("basePath")
	String getBasePath();
	
	@Key("secretKey")
	String getSecretKey();
	
	@Key("testReportPath")
	String getTestFilePath();
	
	@Key("testReportName")
	String getTestReportName();
	
	@Key("testDataSheetName")
	String getTestDataSheetName();

}
