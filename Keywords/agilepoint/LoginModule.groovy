package agilepoint

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LoginModule {

	@Keyword
	public void login(String ApplicationUrl, String Domain, String Username, String Password){

		WebUI.openBrowser(ApplicationUrl)
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies()
		WebUI.setText(findTestObject('AgilePointNX Metadata/Domain'),Domain)
		WebUI.setText(findTestObject('AgilePointNX Metadata/UserName'), Username)
		WebUI.setEncryptedText(findTestObject('AgilePointNX Metadata/Password'), Password)
		WebUI.click(findTestObject('AgilePointNX Metadata/LoginButton'))
		WebUI.waitForPageLoad(GlobalVariable.Timeout)
	}

	@Keyword
	public void LoginIntoAgilePointNX(){
		login(GlobalVariable.ApplicationURL, GlobalVariable.Domain, GlobalVariable.Username, GlobalVariable.Password )
	}

	@Keyword
	public void NavigatetoMyApplication(){
		WebUI.click(findTestObject('AgilePointNX Metadata/WorkCenter'))
		WebUI.delay(2)
		WebUI.click(findTestObject('AgilePointNX Metadata/My Applications'))
		WebUI.delay(2)
		WebUI.switchToFrame(findTestObject('AgilePointNX Metadata/SwitchtoMyApplicationFrame'), 0)
		WebUI.delay(1)
		WebUI.setText(findTestObject('AgilePointNX Metadata/SearchTextBox'), GlobalVariable.ApplicationName)
		//WebUI.delay(2)
		WebUI.mouseOver(findTestObject('AgilePointNX Metadata/SelectProcessModel'))
		WebUI.delay(1)
		WebUI.click(findTestObject('AgilePointNX Metadata/SelectProcessModel'))
		WebUI.switchToWindowIndex(1)

	}
}
