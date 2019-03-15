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

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_envos_emailLogin'), 'lala@gmail.com')

WebUI.setText(findTestObject('LoginMario/LoginPage_Chazki/input_Campo requerido_password'), 'tutu102')

WebUI.click(findTestObject('LoginMario/LoginPage_Chazki/button_Ingresar'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Express_Chazki/span_luis chavez'), 'lala carrasco')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Recojo/ContactoRecojo'), 'MICHAEL')

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

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega1/Producto-Entrega-1'), 'casaca')

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/AgregarDestino/p_Agregar Destino'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega2/Contacto-Entrega-2'), 'carmen')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega2/Telefono-Entrega-2'), '998852321')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega2/Direccion-Entrega-2'), 'san borja')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega2/Direccion-Entrega-2'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToPosition(50, 60)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega2/Producto-Entrega-2'), 'talco')

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/AgregarDestino/p_Agregar Destino'))

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega3/Contacto-Entrega-3'), 'xiomara')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega3/Telefono-Entrega-3'), '987456311')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega3/Direccion-Entrega-3'), 'surco')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega3/Direccion-Entrega-3'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToPosition(50, 60)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega3/Producto-Entrega-3'), 'medias')

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/AgregarDestino/p_Agregar Destino'))

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega4/Contacto-Entrega-4'), 'cristel')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega4/Telefono-Entrega-4'), '987456311')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega4/Direccion-Entrega-4'), 'open plaza angamos')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega4/Direccion-Entrega-4'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToPosition(50, 60)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega4/Producto-Entrega-4'), 'polos')

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/AgregarDestino/p_Agregar Destino'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega5/Contacto-Entrega-5'), 'OFELIA')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega5/Telefono-Entrega-5'), '987456311')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega5/Direccion-Entrega-5'), 'miraflores')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega5/Direccion-Entrega-5'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToPosition(50, 60)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Express_Chazki/Entrega/Entrega5/Producto-Entrega-5'), 'pantalones')

WebUI.sendKeys(findTestObject('MercadoPago/CVV-PEDIR'), '123')

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_PEDIR'))

WebUI.delay(5)

WebUI.click(findTestObject('Express_Chazki/ConfirmarOrden/button_Si'))

WebUI.delay(20)

WebUI.click(findTestObject('VerificarPrecioyKilometraje/MIS ENVIOS'))

WebUI.delay(20)

WebUI.delay(5)

