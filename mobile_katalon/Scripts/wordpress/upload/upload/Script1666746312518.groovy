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

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_Following  Reader  WordPress.com/img_Write_gravatar masterbar__item-me-gravatar'))

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/button_Change My Photo'))

WebUI.click(findTestObject('wordpress/coba upload/klik_ganti_foto'))

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_Following  Reader  WordPress.com/img_Write_gravatar masterbar__item-me-gravatar'))

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/div_Click to change photo'))

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/button_Change My Photo'))

WebUI.verifyElementText(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/span_You successfully uploaded a new profil_422ed0'), 
    'You successfully uploaded')

WebUI.setText(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/input_First name_first_name'), 
    'nama depan s')

WebUI.setText(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/input_Last name_last_name'), 
    'nama belakang si')

WebUI.click(findTestObject('Object Repository/wordpress/coba upload/ups/Page_My Profile  WordPress.com/button_Save profile details'))

WebUI.closeBrowser()

