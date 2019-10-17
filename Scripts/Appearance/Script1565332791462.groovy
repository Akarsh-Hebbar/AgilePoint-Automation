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

WebUI.setText(findTestObject('Appearance/Default Fonts'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/Bold Style'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/Underlined Style'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/Italics Style'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/BAckground color'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/Border Color'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('Appearance/Foreground Color'), 'https://trialapp2.nxone.com')

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(2)

