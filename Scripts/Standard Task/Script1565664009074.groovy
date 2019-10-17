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

WebUI.delay(4)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('AgilePointNX Metadata/Inbox'))

WebUI.delay(4)

WebUI.switchToFrame(findTestObject('AgilePointNX Metadata/SwitchToMyTaskFrame'), 1)

WebUI.delay(6)

WebUI.click(findTestObject('AgilePointNX Metadata/MyTasks'))

WebUI.delay(3)

WebUI.click(findTestObject('Standard Task/SecondForm'))

WebUI.click(findTestObject('Standard Task/Open Task'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('LabelName/Label_SpclChars'), 'Spcl@#$%^%&')

WebUI.verifyElementText(findTestObject('LabelName/Label_English'), 'English Label')

WebUI.verifyElementText(findTestObject('LabelName/Label_Chinese'), 'Ch-标签名称的日文字符')

WebUI.verifyElementText(findTestObject('LabelName/Label_Japanese'), 'Jp- 日本語のキ')

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverLabel_Eng'), 'title', 'Help text in English', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverLabel_Chinese'), 'title', '标签名称的日文字符', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverLabel_Japanese'), 'title', '日本語のキ', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverField_Eng'), 'title', 'Help text display in English', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverField_Chinesse'), 'title', '标签名称的日文字符', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/HoverField_Japanese'), 'title', '日本語のキ', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/Both_Label_Eng'), 'title', 'Help text display in English', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/Both_Field_Eng'), 'title', 'Help text display in English', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/Both_Label_Japanese'), 'title', '日本語のキ', 1)

WebUI.verifyElementAttributeValue(findTestObject('HelpText/Both_Field_Japanese'), 'title', '日本語のキ', 1)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/Mandatory Checked'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/Mandatory Unchecked'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/Validation_Eng'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/Validation_Chinese'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/Validation_japanese'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/UrlValidation_Eng'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/UrlValidation_Chinese'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.verifyElementAttributeValue(findTestObject('Mandatory/UrlValidation_Japanese'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.delay(2)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Appearance/Default Fonts'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Appearance/Bold Style'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.mouseOver(findTestObject('Appearance/BAckground color'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Appearance/Border Color'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Appearance/Foreground Color'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('Appearance/Foreground Color'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/Enable Checked'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/ReadOnly_Unchecked'), 'value', 'https://trialapp2.nxone.com', 
    1)

WebUI.mouseOver(findTestObject('Behavior/RTL_Checked'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/Visible Checked'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/Align Left'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Behavior/Position Left'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Advanced/UpperCase'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Advanced/LowerCase'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Advanced/Show in Tab'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.verifyElementAttributeValue(findTestObject('Advanced/Show in Mob'), 'value', 'https://trialapp2.nxone.com', 1)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Rules/URL'), 'value', 'https://trialapp2.nxone.com/login?returnUrl=%2f', 
    1)

WebUI.delay(1)

WebUI.click(findTestObject('AgilePointNX Metadata/Submit_Button'))

WebUI.delay(2)

