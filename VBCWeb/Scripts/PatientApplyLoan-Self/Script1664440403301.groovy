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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vbcdev.mangosciences.com/')

WebUI.setText(findTestObject('Object Repository/Page_Log in to Querent PBP/input_Querent PBP_username'), 'sukesh@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Querent PBP/input_Querent PBP_password'), 'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Log in to Querent PBP/input_Querent PBP_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/span_PBP Program'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/a_Application'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_step 4_formBasicCheckbox'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Self Pay_radio'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Save  Proceed'))

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input__form-control'), 'HDCF722')

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/div_PAN Number Education level Select Educa_550a64'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/div_Designation'))

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input__form-control'), 'HD')

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Save  Proceed_1'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_View PBP Schedule_form-check-input'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/div_BackSave  Proceed'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Save  Proceed_1'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Submit Application'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/div_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/span_Logout'))

