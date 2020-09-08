package com.w2a.API_Automation.testCases;

import java.util.Hashtable;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.w2a.API_Automation.API.CustomerAPI;
import com.w2a.API_Automation.setUp.APISetUp;
import com.w2a.API_Automation.testUtils.DataProviderClass;

import io.restassured.response.Response;

public class TestCreateCostumerAPI extends APISetUp {

	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp", priority = 0, enabled = true)
	public void validateCreateCustomerAPIWithValidData(Hashtable<String, String> data) {
		testLevelLog.get().assignAuthor("Lavendra");
		testLevelLog.get().assignCategory("Sanity");
		Response response =CustomerAPI.sendPostRequestWithValidData(data);
		Assert.assertEquals(response.statusCode(), Integer.parseInt(data.get("expectedStatusCode")));
		Assert.assertEquals(response.jsonPath().get("email"), data.get("expectedEmail"));

	}
	
//	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp", priority = 1, enabled = true)
//	public void validateCreateCustomerAPIWithInvalidAuthKey(Hashtable<String, String> data) {
//
//	}
//
//	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp", priority = 4, enabled = true)
//	public void validateCreateCustomerAPIWithInvalidEmail(Hashtable<String, String> data) {
//
//	}
//
//	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp", priority = 2, enabled = true)
//	public void validateCreateCustomerAPIWithoutPassingAuthKey(Hashtable<String, String> data) {
//
//	}
//
//	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp", priority = 3, enabled = true)
//	public void validateCreateCustomerAPIWithInvalidField(Hashtable<String, String> data) {
//
//	}

}
