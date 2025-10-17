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

/**
 * The following prompt is for generating script that uses CSV data file with StudioAssist
 * 
 * Select the prompt -> Right-click -> StudioAssist -> Generate Code
 */

/*
 *  I have a list of test objects:
 *  	- Options: 'Page_CuraAppointment/lst_Facility'
 *  	- Health program: 'Page_CuraAppointment/chk_Medicaid'
 *  	- Date: 'Page_CuraAppointment/txt_VisitDate'
 *  	- Comment: 'Page_CuraAppointment/txt_Comment'
 *  	- Make appointment button: 'Page_CuraAppointment/btn_BookAppointment'
 *
 *  Write me a script to perform the steps as follows:
 *  	- Find and call the 'Generate Code/4.1. Called Test Case' test case with the variable 'Username' as 'John Doe' and
 *   		'Password' as the Password variable to login
 *  	- Select the option with the variable 'Facility' and the label is not a regex
 *  	- Check the health program option
 *      - Set the date with the 'Visit_Date' variable
 *      - Write comment with the value in the 'Comment' variable
 *  	- Submit the appointment
 *  	- Capture the screenshot of the page
 *  	- Close the browser
*/
