import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
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

Mobile.startExistingApplication('com.mangosciences.vbc')

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - New User Register Now'), 
    0)

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText'), 'Joshi', 0)

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText (1)'), 'joshi@mailinator.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - Continue'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - Submit'), 0)

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText (2)'), 'Pass@123', 0)

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText (3)'), 'Pass@123', 0)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - Continue (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText (4)'), 'Hector', 0)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - MALE'), 0)

Mobile.tap(findTestObject('Register-CompleteProfile/android.widget.TextView - Date of Birth'), 0)

Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText - Oct (1)'), 0)

Mobile.scrollToText('Feb')

Mobile.setText(findTestObject('Object Repository/Register-CompleteProfile/android.widget.EditText - 02'), 01, 0)

Mobile.tap(findTestObject('Register-CompleteProfile/android.widget.EditText - 2000'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register-CompleteProfile/android.widget.EditText - 2000'), '1996', 0)

Mobile.tap(findTestObject('Register-CompleteProfile/android.widget.EditText - 2000'), 0)

Mobile.closeApplication()

