import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

for (int i = 0; i < 1; i++) {
    WebUI.navigateToUrl('http://ap-626:13491/data-entity/designer/new/entity')

    WebUI.click(findTestObject('Page_AgilePoint NX/a_AgilePoint ID'))

    WebUI.setText(findTestObject('Page_AgilePoint NX - Sign In using your AgilePoint ID/input_User Name_userNameOrEmail'), 
        'admin')

    WebUI.setEncryptedText(findTestObject('Page_AgilePoint NX - Sign In using your AgilePoint ID/input_Password_password'), 
        'NOZHw6sL/1I=')

    WebUI.click(findTestObject('Page_AgilePoint NX - Sign In using your AgilePoint ID/button_Login'))

    WebUI.setText(findTestObject('Object Repository/Page_nxone - Data Entities/input_Display Name_displayName (2) (1)'), 
        'TestAutomation22')

    WebUI.click(findTestObject('Object Repository/Page_nxone - Data Entities/div_ (1) (1) (1)'))

    WebUI.click(findTestObject('Object Repository/Page_nxone - Data Entities/div_Human Resources (1)'))

    WebUI.setText(findTestObject('Object Repository/Page_nxone - Data Entities/input_Record Display Name_primaryField.displayName (2) (1)'), 
        'TestAuto22')

    WebUI.setText(findTestObject('Object Repository/Page_nxone - Data Entities/textarea_Descriptio'), 'Description')

    WebUI.click(findTestObject('Page_nxone - Data Entities/button_Create Entity (2) (1)'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(10)

WebUI.closeBrowser()

WebUI.openBrowser('')

