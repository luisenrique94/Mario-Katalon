import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://mario.chazki.com/#/')

WebUI.click(findTestObject('NewUser/strong_registrate aqu'))

WebUI.setText(findTestObject('NewUser/nombre'), 'kanu')

WebUI.setText(findTestObject('NewUser/Apellidos'), 'kanu')

WebUI.setText(findTestObject('NewUser/Telefono'), '999046712')

WebUI.setText(findTestObject('NewUser/Correo'), 'kanu@gmail.com')

WebUI.setText(findTestObject('NewUser/contrasena'), 'tutu102')

WebUI.setText(findTestObject('NewUser/repetir_contrasena'), 'tutu102')

WebUI.click(findTestObject('NewUser/button_Guardar'))

