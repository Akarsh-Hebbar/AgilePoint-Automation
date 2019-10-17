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

WebUI.setText(findTestObject('Format/Local Format'), '123-4567')

WebUI.setText(findTestObject('Format/International Format'), '1234567890')

WebUI.setText(findTestObject('Format/Dialed in US'), '1-233-434 5464')

WebUI.setText(findTestObject('Format/Dialed in Canada'), '123-456 7890')

WebUI.setText(findTestObject('Format/Dialed from Other countries'), '123-456-789 1234')

WebUI.setText(findTestObject('Format/Other Format'), '123456')

WebUI.setText(findTestObject('Format/Max 5'), '12345')

WebUI.setText(findTestObject('Format/Max 4'), '1234')

WebUI.setText(findTestObject('Format/Max 10'), '1234567890')

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(2)

