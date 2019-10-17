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

CustomKeywords.'agilepoint.LoginModule.LoginIntoAgilePointNX'()

WebUI.delay(7)

CustomKeywords.'agilepoint.LoginModule.NavigatetoMyApplication'()

WebUI.setText(findTestObject('LabelName/EmptyLabelName'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/SpclCharacters_Field'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/EnglishLabel'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/ChineseLabel_Field'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/JapaneseLabel_field'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/FormVariable'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/GlobalVariable'), 'https://trialapp2.nxone.com')

WebUI.setText(findTestObject('LabelName/SysData'), 'https://trialapp2.nxone.com')

WebUI.delay(2)

WebUI.click(findTestObject('AgilePointNX Metadata/Next_Button'))

WebUI.delay(1)

