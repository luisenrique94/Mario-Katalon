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

WebUI.openBrowser('https://mario.chazki.com/#/', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'durazno@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.click(findTestObject('Tarjetas/Page_Chazki/Page_MI CUENTA'))

WebUI.delay(5)

WebUI.click(findTestObject('Tarjetas/Page_Chazki/Page_MIS TARJETAS'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Email'), 'fanta@gmail.com')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Numero_Tarjeta'), '4111 1111 1111 1111')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/CVV'), '123')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Mes'), '09')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Year'), '2020')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Direccion'), 'los jardines')

WebUI.click(findTestObject('Tarjetas/Page_Chazki/button_Agregar'))

WebUI.delay(60)

WebUI.verifyElementText(findTestObject('Tarjetas/Page_Chazki/TextTarjetaVisa'), 'Visa 411111******1111')

WebUI.delay(10)

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Email'), 'fanta@gmail.com')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Numero_Tarjeta'), '3712 1212 1212 122')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/CVV'), '2841')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Mes'), '11')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Year'), '2020')

WebUI.click(findTestObject('Tarjetas/Page_Chazki/button_Agregar'))

WebUI.delay(60)

WebUI.verifyElementText(findTestObject('Tarjetas/Page_Chazki/TextTarjetaAmerican'), '3712 1212 1212 122')

WebUI.delay(10)

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Email'), 'fanta@gmail.com')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Numero_Tarjeta'), '360012 1212 1210')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/CVV'), '964')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Mes'), '04')

WebUI.setText(findTestObject('Tarjetas/Page_Chazki/Year'), '2020')

WebUI.click(findTestObject('Tarjetas/Page_Chazki/button_Agregar'))

WebUI.delay(60)

WebUI.verifyElementText(findTestObject('Tarjetas/Page_Chazki/TextTarjetaDiners'), '360012 1212 1210')

WebUI.delay(10)

