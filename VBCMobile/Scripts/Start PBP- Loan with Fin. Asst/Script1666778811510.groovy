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

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText'), 'chetan.s@mailinator.com', 0)

Mobile.setText(findTestObject('Login-logout/android.widget.EditText (1)'), 'Pass@123', 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - PBP'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Start Application'), 0)

Mobile.tap(findTestObject('VBC PBP/android.widget.TextView - checkbox terms n cond'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Confirm'), 0)

Mobile.tap(findTestObject('VBC PBP/android.widget.TextView - Loan with Financial Assistance'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Save  Proceed'), 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-Bank Acc no'), '378298187191', 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-Bank Name'), 'HDFC', 0)

Mobile.setText(findTestObject('VBC PBP/android.widget.EditText-Bank Branch'), 'MNJU', 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-IFSC'), 'HDFC8812', 0)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('education')

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Education level'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Post-graduate'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Profession'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Private Service'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView-Employer'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Tata Consultancy Services Limited'), 0)

Mobile.scrollToText('Designation')

Mobile.tap(findTestObject('VBC PBP/android.widget.TextView - IndustryNew'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Capital Goods'), 0)

Mobile.setText(findTestObject('VBC PBP/android.widget.EditText- Designation1'), 'HH', 0)

Mobile.setText(findTestObject('VBC PBP/android.widget.EditText-Average Annual Income1'), '322323', 0)

Mobile.setText(findTestObject('VBC PBP/android.widget.EditText-AnyOtherourceIncome1'), '0', 0)

Mobile.scrollToText('Annual Family')

Mobile.setText(findTestObject('VBC PBP/android.widget.EditText-Annual Family Invome1'), '2102929', 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Save  Proceed (1)'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - PBP Schedule Agree'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Save  Proceed (2)'), 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText- First Name'), 'Chorry', 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText- Last Name'), 'Garry', 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-Age'), '32', 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView-Gender'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - FEMALE'), 0)

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-Mobile'), '2123312123', 0)

Mobile.scrollToText('Save')

Mobile.setText(findTestObject('Object Repository/VBC PBP/android.widget.EditText-Email'), 'chorry@mailinator.com', 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView-Relationship'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Sibling'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Save'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Save  Proceed (3)'), 0)

Mobile.scrollToText('start application')

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Start Application (2)'), 0)

Mobile.tap(findTestObject('Object Repository/VBC PBP/android.widget.TextView - Confirm (2)'), 0)

Mobile.closeApplication()

