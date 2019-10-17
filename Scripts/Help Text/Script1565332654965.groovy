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

WebUI.mouseOver(findTestObject('HelpText/HoverLabel_Eng'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/HoverLabel_Chinese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/HoverLabel_Japanese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/HoverField_Eng'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/HoverField_Chinesse'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/HoverField_Japanese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Label_Eng'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Field_Eng'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Label_Chinese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Field_Chinese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Label_Japanese'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HelpText/Both_Field_Japanese'))

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(2)

