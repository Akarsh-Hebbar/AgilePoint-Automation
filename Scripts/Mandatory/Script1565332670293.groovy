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

WebUI.delay(2)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Mandatory/Close validation'))

WebUI.setText(findTestObject('Mandatory/Mandatory Checked'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/Mandatory Unchecked'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/Validation_Eng'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/Validation_Chinese'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/Validation_japanese'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/UrlValidation_Eng'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/UrlValidation_Chinese'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Mandatory/UrlValidation_Japanese'), 'https://trialapp2.nxone.com')

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

