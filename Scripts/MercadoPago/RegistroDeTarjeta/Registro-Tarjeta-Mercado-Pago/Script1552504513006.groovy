import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

WebUI.openBrowser('https://mario.chazki.com/#/', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'loloi@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Express_Chazki/span_luis chavez'), 'lolo carrasco')

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.click(findTestObject('MercadoPago/NuevaTarjeta'))

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/Correo'), 'loloi@gmail.com')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/NumeroDeTarjeta'), '4009 1753 3280 6176')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/CVV'), '123')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/Mes'), '04')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/Anio'), '2020')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/NombreTitular'), 'lulu')

WebUI.sendKeys(findTestObject('MercadoPago/DatosTarjeta/NumeroDeDocumento'), '73957839')

WebUI.click(findTestObject('MercadoPago/DatosTarjeta/AgregarTarjeta'))

