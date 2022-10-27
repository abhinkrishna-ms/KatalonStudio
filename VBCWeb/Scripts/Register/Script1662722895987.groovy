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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vbcdev.mangosciences.com/')

WebUI.click(findTestObject('Object Repository/Page_Log in to pbp-dev/a_Register Now'))

System.out.println(GlobalVariable.Name)

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Register_newUserEmail'), 
    GlobalVariable.Name)

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Register_newUserEmail_1'), 
    GlobalVariable.Email)

WebUI.click(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/button_Next'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/v4/public/inboxes.jsp')

WebUI.setText(findTestObject('Object Repository/Page_Mailinator/input_Public Messages_inbox_field'), email)

WebUI.sendKeys(findTestObject('Object Repository/Page_Mailinator/input_Public Messages_inbox_field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Mailinator/td_Your OTP has been generated'))

String otpText = WebUI.getText(findTestObject('Page_Mailinator/td_548437 is your OTP for logging in to the Mango Portal. Please do not share your OTP with anyone for security reasons'))

System.out.println(otpText)

String[] s = otpText.split(' ')

System.out.println(s[0])

//(s[0]) = (s[0]).replace(''', '')
//System.out.println(s[0])
WebUI.switchToWindowTitle('Mango Cancer Care | Patient Benefit Program')

WebUI.setText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Danny_otp'), s[0])

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/input_Danny_password'), 
    GlobalVariable.Pass)

WebUI.setEncryptedText(findTestObject('Page_Mango Cancer Care  Patient Benefit Program/input_Denny_mt-3 p-3 form-control'), 
    GlobalVariable.Pass)

WebUI.click(findTestObject('Object Repository/Page_Mango Cancer Care  Patient Benefit Program/button_Next'))

