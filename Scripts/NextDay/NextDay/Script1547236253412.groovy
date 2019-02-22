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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://mario.chazki.com/#/', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'barriga@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Express_Chazki/span_luis chavez'), 'barriga barriga')

WebUI.delay(5)

WebUI.click(findTestObject('NextDay/NextDay'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Recojo/Contacto-Recojo-NextDay'), 'JAVIER CIEZA')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Recojo/Telefono-Recojo-NextDay'), '963222698')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Recojo/Direccion-Recojo-NextDay'), 'AVENIDA LA MOLINA')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Recojo/Direccion-Recojo-NextDay'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Entrega/Contacto-Entrega-NextDay'), 'CARLA PALOMINO')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Entrega/Telefono-Entrega-NextDay'), '999046712')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Entrega/Direccion-Entrega-NextDay'), 'san isidro')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('NextDay/Entrega/Direccion-Entrega-NextDay'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_No'))

WebUI.sendKeys(findTestObject('NextDay/Entrega/Producto-Entrega-NextDay'), 'PELUCHES')

WebUI.takeScreenshot('C:\\Users\\Administrator\\Desktop\\CAPTURA EXPRESS\\NextDay-Pedir.png')

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_PEDIR'))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_Si'))

WebUI.delay(20)

WebUI.click(findTestObject('VerificarPrecioyKilometraje/MIS ENVIOS'))

WebUI.delay(20)

WebUI.takeScreenshot('C:\\Users\\Administrator\\Desktop\\CAPTURA EXPRESS\\NextDay-Envios.png')

WebUI.delay(5)

