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

WebUI.navigateToUrl('https://nx01.nxone.com/login?returnUrl=%2fappbuilder%2findex')

WebUI.click(findTestObject('Object Repository/New Folder/Page_AgilePoint NX/li_AgilePoint ID'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_AgilePoint NX - Sign In using your AgilePoint ID/input_User Name_userNameOrEmail'), 
    'apqatrial1')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/Page_AgilePoint NX - Sign In using your AgilePoint ID/input_Password_password'), 
    'EaBgMVsWgjpeT1yKxugBHQ==')

WebUI.click(findTestObject('Object Repository/New Folder/Page_AgilePoint NX - Sign In using your AgilePoint ID/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/Page_AgilePoint NX - Sign In using your AgilePoint ID/input_Password_password'), 
    'EaBgMVsWgjoJfFwstKGmCg==')

WebUI.click(findTestObject('Object Repository/New Folder/Page_AgilePoint NX - Sign In using your AgilePoint ID/button_Login'))

WebUI.switchToWindowTitle('nxone - Create Request')

WebUI.click(findTestObject('Object Repository/New Folder/Page_nxone - Create Request/div_A                                r                                                                                                        ArunSPapp'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_eForm/input_E_ID_E_ID-05af-411e2-a20f-d8cf'), 'test')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_eForm/input_E_Name_E_Name-9bc3-4d5d1-8c01-7366'), 'test')

WebUI.click(findTestObject('Object Repository/New Folder/Page_eForm/a_20'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_eForm/input__Salary-5de9-4682f-9034-adf9'), '344')

WebUI.click(findTestObject('Object Repository/New Folder/Page_eForm/input__submit popActionButtons'))

WebUI.closeBrowser()

