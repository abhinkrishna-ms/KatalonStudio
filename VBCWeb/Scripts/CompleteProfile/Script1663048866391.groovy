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

WebUI.setText(findTestObject('Object Repository/Page_Log in to pbp-dev/input_pbp-dev_username'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to pbp-dev/input_pbp-dev_password'), GlobalVariable.Pass)

WebUI.click(findTestObject('Object Repository/Page_Log in to pbp-dev/input_Forgot Password_login'))

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Personal Details_Last-Name'), 
    'M')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_GenderMaleFemale'), 
    'MALE', true)

WebUI.setText(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/DOB'), '01021998')

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Address Information_Address'), 
    '#43,dhw9dh')

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Address Information_form-control'))

WebUI.selectOptionByValue(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/select_Select CountryIndia'), 
    'India', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Select StateAndaman and Nicobar Isla_d8bd3f'), 
    'Haryana', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Select CityAmbalaAsandhAteli MandiBa_a68b53'), 
    'Charkhi Dadri', true)

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Address Information_form-control'), 
    '321212')

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Address Information_form-check-input'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Select DiagnosisNon-small Cell Lung _e09e88'), 
    'Head & Neck Cancer', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Medication NameTagrisso-OsimertinibD_c55ba4'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Select Hospital Aster CMI  Aster MIM_737570'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/select_Select Doctor Ganesh  Naik  Sunny  m_418ce3'), 
    '8', true)

WebUI.setText(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/input_Hospital Details_medical-record-name'), 
    MRN)

WebUI.setText(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/input_Financial Information_pan-number'), 
    PAN)

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Financial Information_formBasicCheckbox'))

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Next'))

WebUI.verifyElementPresent(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/VBChomepage'), 5)

