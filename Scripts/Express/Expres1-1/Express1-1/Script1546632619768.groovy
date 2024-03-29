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

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'fanta@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Express_Chazki/span_luis chavez'), 'fanta fanta')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/ContactoRecojo'), 'MARIELA')

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/TelefonoRecojo'), '963258741')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/DireccionRecojo'), 'los jardines de ')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/DireccionRecojo'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Express_Chazki/Entrega/Entrega0/ContactoEntrega-0'), 'carlos')

WebUI.delay(5)

WebUI.setText(findTestObject('Express_Chazki/Entrega/Entrega0/TelefonoEntrega-0'), '999046712')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/DireccionEntrega-0'), 'avenida la molina')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/DireccionEntrega-0'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_No'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/ProductoEntrega-0'), 'celular')

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_PEDIR'))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_Si'))

WebUI.delay(20)

WebUI.click(findTestObject('VerificarPrecioyKilometraje/MIS ENVIOS'))

WebUI.delay(20)

WebUI.takeScreenshot('C:\\Users\\Administrator\\Desktop\\CAPTURA EXPRESS\\express1-1-envios.png')

