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

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'lele@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Express_Chazki/span_luis chavez'), 'lele carrasco')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/ContactoRecojo'), 'CARMEN')

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/TelefonoRecojo'), '963258741')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('MercadoPago/Recojo/Direccion'), 'los jardines de ')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('MercadoPago/Recojo/Direccion'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Express_Chazki/Entrega/Entrega0/ContactoEntrega-0'), 'carlos')

WebUI.delay(5)

WebUI.setText(findTestObject('Express_Chazki/Entrega/Entrega0/TelefonoEntrega-0'), '999046712')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/DireccionEntrega-0'), 'avenida la molina')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/DireccionEntrega-0'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega0/ProductoEntrega-0'), 'celular')

WebUI.click(findTestObject('Express_Chazki/AgregarDestino/p_Agregar Destino'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Contacto-Entrega-1'), 'lesly')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Telefono-Entrega-1'), '998852321')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Direccion-Entrega-1'), 'san isidro')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Direccion-Entrega-1'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToPosition(50, 60)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Producto-Entrega-1'), 'casaca')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('MercadoPago/CVV-PEDIR'), '123')

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_PEDIR'))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_Si'))

WebUI.delay(15)

WebUI.click(findTestObject('VerificarPrecioyKilometraje/MIS ENVIOS'))

