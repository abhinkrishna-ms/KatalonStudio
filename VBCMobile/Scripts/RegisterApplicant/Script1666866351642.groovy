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

Mobile.startExistingApplication('com.mangosciences.vbc')

//Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText'), '2431341212', 0)
//
//Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText (1)'), '422781', 0)
//
//Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - Continue'), 0)
//
//Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText (2)'), 'Pass@123', 0)
//
//Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText (3)'), 'Pass@123', 0)
//
//Mobile.tap(findTestObject('Object Repository/Register-CompleteProfile/android.widget.TextView - Continue (1)'), 0)
//
//Mobile.comment('Add DOB')
//
//WebUI.delay(30)
Mobile.scrollToText('address')

Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText (4)'), '#30,ojhc8whve,ewfvoefh', 
    0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView-Country'), 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - India'), 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView-State'), 0)

Mobile.selectListItemByLabel(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - Chandigarh'), 
    'Assam', 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView-City'), 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - Chandigarh (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText-pinCode'), '654322', 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - Checkbox Address'), 0)

Mobile.scrollToText('Continue')

Mobile.setText(findTestObject('Object Repository/Register-Applicant/android.widget.EditText-PAN'), 'NATYI8919K', 0)

Mobile.tap(findTestObject('Object Repository/Register-Applicant/android.widget.TextView - Checkbox Terms of Use'), 0)

Mobile.tap(findTestObject('Register-Applicant/android.widget.TextView - Continue (2)'), 0)

Mobile.closeApplication()

