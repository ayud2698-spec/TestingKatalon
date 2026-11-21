import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000')

WebUI.mouseOver(findTestObject('ABRAHAM/Page_TP - PKK Kabupaten Nganjuk/li_Profil'))

WebUI.click(findTestObject('ABRAHAM/Page_TP - PKK Kabupaten Nganjuk/a_Masuk Admin'))

WebUI.setText(findTestObject('ABRAHAM/Page_Login - PKK Kabupaten Nganjuk/input_Email atau Nomor WhatsApp _'), 'pkknganjuk3005@gmail.com')

WebUI.setEncryptedText(findTestObject('ABRAHAM/Page_Login - PKK Kabupaten Nganjuk/input_Kata sandi _'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('ABRAHAM/Page_Login - PKK Kabupaten Nganjuk/button_Masuk'))

WebUI.click(findTestObject('ABRAHAM/Page_Dashboard/a_Kelompok Kerja'))

WebUI.click(findTestObject('ABRAHAM/Page_Dashboard/span_Kelompok Kerja 2'))

WebUI.click(findTestObject('ABRAHAM/Page_Dashboard/button_Cetak Laporan'))

WebUI.selectOptionByValue(findTestObject('ABRAHAM/Page_Dashboard/select_bulan'), '10', false)

WebUI.selectOptionByValue(findTestObject('ABRAHAM/Page_Dashboard/select_tahun'), '2026', false)

WebUI.selectOptionByValue(findTestObject('ABRAHAM/Page_Dashboard/select_bidang'), 'pengembangan', false)

WebUI.selectOptionByValue(findTestObject('ABRAHAM/Page_Dashboard/select_formatExportPokja2'), 'pdf', false)

WebUI.click(findTestObject('ABRAHAM/Page_Dashboard/button_btnExportPokja2'))

