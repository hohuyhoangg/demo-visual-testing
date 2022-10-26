import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.katalon.custom.CustomKeyword as CustomKeyword

WebUI.openBrowser('')

CustomKeyword.enhancedSetViewportSize(1920, 1080)

WebUI.navigateToUrl('https://testops.katalon.io/')

WebUI.delay(3)


WebUI.takeScreenshotAsCheckpoint('Page login start')

WebUI.setText(findTestObject('Object Repository/Automation V1/Page_Katalon TestOps/input_Sign Up_username'), 'automation.katalon.ai@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Automation V1/Page_Katalon TestOps/input_Sign Up_password'), '8yf1ABfOiFPGlHnEY6XTKvY2lIo2eaTs')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Page login fill username, password')

WebUI.click(findTestObject('Object Repository/Automation V1/Page_Katalon TestOps/button_Sign in'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Page dashboard')

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/button_My Organization_01'))

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/div_My Organization_01CurrentMOMy Organizat_e387fd'))

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/a_Download Studio'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Dialog download Studio')

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/div_Start testing with the Katalon Platform_43b96c'))

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/button_Created with Sketch'))

WebUI.click(findTestObject('Object Repository/Automation V1/Page_My Organization_01 - Katalon TestOps/span_KA'))

WebUI.delay(1)

WebUI.takeScreenshotAsCheckpoint('Setting profile')

WebUI.closeBrowser()

