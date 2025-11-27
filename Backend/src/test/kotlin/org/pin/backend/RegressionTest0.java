package org.pin.backend;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.pin.backend.repository.GastoRepository gastoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.GastoService gastoService1 = new org.pin.backend.service.GastoService(gastoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.GastoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.pin.backend.repository.VotoRepository votoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.VotoService votoService1 = new org.pin.backend.service.VotoService(votoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.VotoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.pin.backend.repository.TareaRepository tareaRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.TareaService tareaService1 = new org.pin.backend.service.TareaService(tareaRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.TareaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.pin.backend.repository.EncuestaRepository encuestaRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.EncuestaService encuestaService1 = new org.pin.backend.service.EncuestaService(encuestaRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.EncuestaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.pin.backend.service.CasaService casaService0 = null;
        org.pin.backend.repository.CasaRepository casaRepository1 = null;
        org.pin.backend.repository.UsuarioRepository usuarioRepository2 = null;
        org.pin.backend.repository.ListaRepository listaRepository3 = null;
        org.pin.backend.repository.TareaRepository tareaRepository4 = null;
        org.pin.backend.service.PostItService postItService5 = null;
        org.pin.backend.service.ImagenService imagenService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.CasaController casaController7 = new org.pin.backend.controller.CasaController(casaService0, casaRepository1, usuarioRepository2, listaRepository3, tareaRepository4, postItService5, imagenService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.CasaController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.pin.backend.service.VotoService votoService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.VotoController votoController1 = new org.pin.backend.controller.VotoController(votoService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.VotoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.pin.backend.service.PushService pushService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.PushController pushController1 = new org.pin.backend.controller.PushController(pushService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.PushController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.pin.backend.service.InvitacionService invitacionService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.InvitacionController invitacionController1 = new org.pin.backend.controller.InvitacionController(invitacionService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.InvitacionController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.pin.backend.repository.ListaRepository listaRepository0 = null;
        org.pin.backend.repository.CasaRepository casaRepository1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.ListaController listaController2 = new org.pin.backend.controller.ListaController(listaRepository0, casaRepository1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.ListaController.<init>, parameter listaRepository");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.pin.backend.repository.InvitacionRepository invitacionRepository0 = null;
        org.pin.backend.repository.UsuarioRepository usuarioRepository1 = null;
        org.pin.backend.repository.CasaRepository casaRepository2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.InvitacionService invitacionService3 = new org.pin.backend.service.InvitacionService(invitacionRepository0, usuarioRepository1, casaRepository2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.InvitacionService.<init>, parameter invitacionRepository");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.pin.backend.service.MqttService mqttService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.MqttTestController mqttTestController1 = new org.pin.backend.controller.MqttTestController(mqttService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.MqttTestController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.pin.backend.repository.LienzoRepository lienzoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.LienzoService lienzoService1 = new org.pin.backend.service.LienzoService(lienzoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.LienzoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.pin.backend.service.EncuestaService encuestaService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.EncuestaController encuestaController1 = new org.pin.backend.controller.EncuestaController(encuestaService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.EncuestaController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.pin.backend.service.MultimediaService multimediaService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.MultimediaController multimediaController1 = new org.pin.backend.controller.MultimediaController(multimediaService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.MultimediaController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.pin.backend.service.GastoService gastoService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.GastoController gastoController1 = new org.pin.backend.controller.GastoController(gastoService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.GastoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler0 = new org.pin.backend.exception.GlobalExceptionHandler();
        java.lang.Exception exception1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<org.pin.backend.exception.ErrorResponse> errorResponseResponseEntity2 = globalExceptionHandler0.handleGenericException(exception1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.exception.GlobalExceptionHandler.handleGenericException, parameter e");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.pin.backend.repository.AudioRepository audioRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.AudioService audioService1 = new org.pin.backend.service.AudioService(audioRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.AudioService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.pin.backend.service.LienzoService lienzoService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.LienzoController lienzoController1 = new org.pin.backend.controller.LienzoController(lienzoService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.LienzoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.pin.backend.service.PopUpService popUpService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.PopUpController popUpController1 = new org.pin.backend.controller.PopUpController(popUpService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.PopUpController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.pin.backend.service.PostItService postItService0 = null;
        org.pin.backend.service.CasaService casaService1 = null;
        org.pin.backend.service.LienzoService lienzoService2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.PostItController postItController3 = new org.pin.backend.controller.PostItController(postItService0, casaService1, lienzoService2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.PostItController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.pin.backend.service.ElementoService elementoService0 = null;
        org.pin.backend.repository.ElementoRepository elementoRepository1 = null;
        org.pin.backend.repository.ItemRepository itemRepository2 = null;
        org.pin.backend.repository.ListaRepository listaRepository3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.ElementoController elementoController4 = new org.pin.backend.controller.ElementoController(elementoService0, elementoRepository1, itemRepository2, listaRepository3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.ElementoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.pin.backend.repository.ItemRepository itemRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.ItemService itemService1 = new org.pin.backend.service.ItemService(itemRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.ItemService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        java.lang.Class<?> wildcardClass1 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.pin.backend.repository.MultimediaRepository multimediaRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MultimediaService multimediaService1 = new org.pin.backend.service.MultimediaService(multimediaRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.MultimediaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.pin.backend.service.NotificacionService notificacionService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.NotificacionController notificacionController1 = new org.pin.backend.controller.NotificacionController(notificacionService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.NotificacionController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.pin.backend.repository.OpcionRepository opcionRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.OpcionService opcionService1 = new org.pin.backend.service.OpcionService(opcionRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.OpcionService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.pin.backend.repository.UsuarioRepository usuarioRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.UsuarioService usuarioService1 = new org.pin.backend.service.UsuarioService(usuarioRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.UsuarioService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.pin.backend.repository.ElementoRepository elementoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.ElementoService elementoService1 = new org.pin.backend.service.ElementoService(elementoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.ElementoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.pin.backend.repository.ListaRepository listaRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.ListaService listaService1 = new org.pin.backend.service.ListaService(listaRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.ListaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.pin.backend.service.TareaService tareaService0 = null;
        org.pin.backend.repository.TareaRepository tareaRepository1 = null;
        org.pin.backend.repository.UsuarioRepository usuarioRepository2 = null;
        org.pin.backend.repository.CasaRepository casaRepository3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.TareaController tareaController4 = new org.pin.backend.controller.TareaController(tareaService0, tareaRepository1, usuarioRepository2, casaRepository3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.TareaController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.pin.backend.service.OpcionService opcionService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.OpcionController opcionController1 = new org.pin.backend.controller.OpcionController(opcionService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.OpcionController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.pin.backend.service.MqttService mqttService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.BackendApplication backendApplication1 = new org.pin.backend.BackendApplication(mqttService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.BackendApplication.<init>, parameter mqttService");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.pin.backend.service.ItemService itemService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.ItemController itemController1 = new org.pin.backend.controller.ItemController(itemService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.ItemController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.pin.backend.repository.ResumenRepository resumenRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.ResumenService resumenService1 = new org.pin.backend.service.ResumenService(resumenRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.ResumenService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing scheme in broker URI: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.pin.backend.service.PagoService pagoService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.PagoController pagoController1 = new org.pin.backend.controller.PagoController(pagoService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.PagoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.pin.backend.repository.UsuarioRepository usuarioRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.AuthController authController1 = new org.pin.backend.controller.AuthController(usuarioRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.AuthController.<init>, parameter usuarioRepository");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.pin.backend.service.ImagenService imagenService0 = null;
        org.pin.backend.service.CasaService casaService1 = null;
        org.pin.backend.service.LienzoService lienzoService2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.ImagenController imagenController3 = new org.pin.backend.controller.ImagenController(imagenService0, casaService1, lienzoService2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.ImagenController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService3 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.pin.backend.service.EventoService eventoService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.EventoController eventoController1 = new org.pin.backend.controller.EventoController(eventoService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.EventoController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.pin.backend.service.ResumenService resumenService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.ResumenController resumenController1 = new org.pin.backend.controller.ResumenController(resumenService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.ResumenController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.pin.backend.repository.EventoRepository eventoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.EventoService eventoService1 = new org.pin.backend.service.EventoService(eventoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.EventoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.pin.backend.service.UsuarioService usuarioService0 = null;
        org.pin.backend.repository.UsuarioRepository usuarioRepository1 = null;
        org.pin.backend.repository.CasaRepository casaRepository2 = null;
        org.pin.backend.repository.EventoRepository eventoRepository3 = null;
        org.pin.backend.repository.TareaRepository tareaRepository4 = null;
        org.pin.backend.repository.InvitacionRepository invitacionRepository5 = null;
        org.pin.backend.repository.MultimediaRepository multimediaRepository6 = null;
        org.pin.backend.repository.NotificacionRepository notificacionRepository7 = null;
        org.pin.backend.repository.GastoRepository gastoRepository8 = null;
        org.pin.backend.repository.VotoRepository votoRepository9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.UsuarioController usuarioController10 = new org.pin.backend.controller.UsuarioController(usuarioService0, usuarioRepository1, casaRepository2, eventoRepository3, tareaRepository4, invitacionRepository5, multimediaRepository6, notificacionRepository7, gastoRepository8, votoRepository9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.UsuarioController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.pin.backend.service.AudioService audioService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.controller.AudioController audioController1 = new org.pin.backend.controller.AudioController(audioService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.controller.AudioController.<init>, parameter service");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.pin.backend.repository.PopUpRepository popUpRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.PopUpService popUpService1 = new org.pin.backend.service.PopUpService(popUpRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.PopUpService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.pin.backend.repository.NotificacionRepository notificacionRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.NotificacionService notificacionService1 = new org.pin.backend.service.NotificacionService(notificacionRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.NotificacionService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        java.lang.Exception exception8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<org.pin.backend.exception.ErrorResponse> errorResponseResponseEntity9 = globalExceptionHandler6.handleGenericException(exception8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.exception.GlobalExceptionHandler.handleGenericException, parameter e");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.pin.backend.repository.PagoRepository pagoRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.PagoService pagoService1 = new org.pin.backend.service.PagoService(pagoRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.PagoService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        java.lang.Class<?> wildcardClass12 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("hi!");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        boolean boolean16 = lZ4Compression0.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray24 = lZ4Compression19.decompress(byteArray23);
        byte[] byteArray25 = lZ4Compression18.decompress(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression18.compress(byteArray31);
        byte[] byteArray33 = lZ4Compression17.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression34.decompress(byteArray40);
        boolean boolean42 = lZ4Compression17.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray50 = lZ4Compression45.decompress(byteArray49);
        byte[] byteArray51 = lZ4Compression44.decompress(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression44.compress(byteArray57);
        byte[] byteArray59 = lZ4Compression43.decompress(byteArray58);
        byte[] byteArray60 = lZ4Compression17.compress(byteArray59);
        byte[] byteArray61 = lZ4Compression0.compress(byteArray60);
        byte[] byteArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray63 = lZ4Compression0.compress(byteArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 12, (byte) -64, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.pin.backend.repository.PushRepository pushRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.PushService pushService1 = new org.pin.backend.service.PushService(pushRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.PushService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        java.lang.Class<?> wildcardClass9 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.toString();
        int int14 = errorResponse2.component1();
        java.lang.Class<?> wildcardClass15 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.exception.ErrorResponse errorResponse4 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse4.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService9 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean10 = errorResponse7.equals((java.lang.Object) fileStorageService9);
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService11 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing scheme in broker URI: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=97, message=hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=97, message=hi!)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.toString();
        java.lang.String str14 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str14, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        int int5 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.toString();
        java.lang.Class<?> wildcardClass14 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        boolean boolean14 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression23.decompress(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        boolean boolean37 = lZ4Compression23.isCompressed(byteArray35);
        boolean boolean38 = lZ4Compression15.isCompressed(byteArray35);
        byte[] byteArray39 = lZ4Compression0.decompress(byteArray35);
        java.lang.Class<?> wildcardClass40 = byteArray35.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=-1, message=)");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse2.copy((int) ' ', "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        java.lang.String str9 = errorResponse2.toString();
        int int10 = errorResponse2.component1();
        int int11 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str9, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService7 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean8 = errorResponse5.equals((java.lang.Object) fileStorageService7);
        org.springframework.web.multipart.MultipartFile multipartFile9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = fileStorageService7.save(multipartFile9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        java.lang.Class<?> wildcardClass12 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray8 = lZ4Compression3.decompress(byteArray7);
        byte[] byteArray9 = lZ4Compression2.decompress(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression2.compress(byteArray15);
        byte[] byteArray17 = lZ4Compression1.decompress(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray23 = lZ4Compression18.decompress(byteArray22);
        byte[] byteArray24 = lZ4Compression1.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray32 = lZ4Compression27.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression26.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression26.compress(byteArray39);
        byte[] byteArray41 = lZ4Compression25.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression25.decompress(byteArray46);
        boolean boolean49 = lZ4Compression1.isCompressed(byteArray46);
        byte[] byteArray50 = lZ4Compression0.compress(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray58 = lZ4Compression53.decompress(byteArray57);
        byte[] byteArray59 = lZ4Compression52.decompress(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray65 = lZ4Compression60.decompress(byteArray64);
        byte[] byteArray66 = lZ4Compression52.compress(byteArray65);
        byte[] byteArray67 = lZ4Compression51.decompress(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray74 = lZ4Compression69.decompress(byteArray73);
        byte[] byteArray75 = lZ4Compression68.decompress(byteArray74);
        boolean boolean76 = lZ4Compression51.isCompressed(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray84 = lZ4Compression79.decompress(byteArray83);
        byte[] byteArray85 = lZ4Compression78.decompress(byteArray84);
        org.pin.backend.utils.LZ4Compression lZ4Compression86 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray90 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray91 = lZ4Compression86.decompress(byteArray90);
        byte[] byteArray92 = lZ4Compression78.compress(byteArray91);
        byte[] byteArray93 = lZ4Compression77.decompress(byteArray92);
        byte[] byteArray94 = lZ4Compression51.compress(byteArray93);
        boolean boolean95 = lZ4Compression0.isCompressed(byteArray93);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression86);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        java.lang.Class<?> wildcardClass12 = errorResponse11.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=35, message=)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=35, message=)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 1, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse6 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse6.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse9.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse9.copy((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        boolean boolean16 = errorResponse2.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(errorResponse9);
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (short) 100, "ErrorResponse(status=-1, message=)");
        java.lang.String str13 = errorResponse12.component2();
        boolean boolean15 = errorResponse12.equals((java.lang.Object) "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=-1, message=)");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        int int16 = errorResponse14.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        java.lang.String str8 = errorResponse7.toString();
        int int9 = errorResponse7.component1();
        java.lang.String str10 = errorResponse7.toString();
        java.lang.String str11 = errorResponse7.toString();
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse7.copy(0, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int15 = errorResponse14.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str8, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str10, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str11, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        int int11 = errorResponse10.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean8 = errorResponse6.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse6.copy((int) '#', "");
        java.lang.String str12 = errorResponse11.toString();
        int int13 = errorResponse11.component1();
        java.lang.String str14 = errorResponse11.toString();
        java.lang.String str15 = errorResponse11.toString();
        boolean boolean16 = errorResponse2.equals((java.lang.Object) str15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str12, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str14, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str15, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '#', "hi!");
        int int3 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray5 = lZ4Compression0.decompress(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression7 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression7.decompress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray20 = lZ4Compression15.decompress(byteArray19);
        byte[] byteArray21 = lZ4Compression7.compress(byteArray20);
        byte[] byteArray22 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression0.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray38 = lZ4Compression33.decompress(byteArray37);
        byte[] byteArray39 = lZ4Compression25.compress(byteArray38);
        byte[] byteArray40 = lZ4Compression24.decompress(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression41.decompress(byteArray47);
        boolean boolean49 = lZ4Compression24.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression51.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray64 = lZ4Compression59.decompress(byteArray63);
        byte[] byteArray65 = lZ4Compression51.compress(byteArray64);
        byte[] byteArray66 = lZ4Compression50.decompress(byteArray65);
        byte[] byteArray67 = lZ4Compression24.compress(byteArray66);
        byte[] byteArray68 = lZ4Compression0.decompress(byteArray66);
        java.lang.Class<?> wildcardClass69 = byteArray66.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(lZ4Compression7);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression23.decompress(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression31.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        boolean boolean45 = lZ4Compression31.isCompressed(byteArray43);
        boolean boolean46 = lZ4Compression23.isCompressed(byteArray43);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray54 = lZ4Compression49.decompress(byteArray53);
        byte[] byteArray55 = lZ4Compression48.decompress(byteArray54);
        byte[] byteArray56 = lZ4Compression47.decompress(byteArray55);
        boolean boolean57 = lZ4Compression23.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray64 = lZ4Compression59.decompress(byteArray63);
        byte[] byteArray65 = lZ4Compression58.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray71 = lZ4Compression66.decompress(byteArray70);
        byte[] byteArray72 = lZ4Compression58.compress(byteArray71);
        byte[] byteArray73 = lZ4Compression23.compress(byteArray71);
        byte[] byteArray74 = lZ4Compression15.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression0.decompress(byteArray74);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=-1, message=)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=-1, message=)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray38 = lZ4Compression33.decompress(byteArray37);
        byte[] byteArray39 = lZ4Compression25.compress(byteArray38);
        byte[] byteArray40 = lZ4Compression24.decompress(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        byte[] byteArray47 = lZ4Compression24.decompress(byteArray45);
        boolean boolean48 = lZ4Compression0.isCompressed(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression50.compress(byteArray63);
        byte[] byteArray65 = lZ4Compression49.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray72 = lZ4Compression67.decompress(byteArray71);
        byte[] byteArray73 = lZ4Compression66.decompress(byteArray72);
        boolean boolean74 = lZ4Compression49.isCompressed(byteArray73);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression76 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray82 = lZ4Compression77.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression76.decompress(byteArray82);
        org.pin.backend.utils.LZ4Compression lZ4Compression84 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray88 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray89 = lZ4Compression84.decompress(byteArray88);
        byte[] byteArray90 = lZ4Compression76.compress(byteArray89);
        byte[] byteArray91 = lZ4Compression75.decompress(byteArray90);
        byte[] byteArray92 = lZ4Compression49.compress(byteArray91);
        byte[] byteArray93 = lZ4Compression0.compress(byteArray91);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(lZ4Compression76);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression84);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        java.lang.String str15 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse8.copy(35, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorResponse18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        int int15 = errorResponse11.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression24.decompress(byteArray32);
        boolean boolean34 = lZ4Compression0.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        boolean boolean49 = lZ4Compression35.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression35.decompress(byteArray56);
        boolean boolean59 = lZ4Compression0.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray67 = lZ4Compression62.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression61.decompress(byteArray67);
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray74 = lZ4Compression69.decompress(byteArray73);
        byte[] byteArray75 = lZ4Compression61.compress(byteArray74);
        byte[] byteArray76 = lZ4Compression60.decompress(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray82 = lZ4Compression77.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression60.decompress(byteArray81);
        boolean boolean84 = lZ4Compression0.isCompressed(byteArray81);
        byte[] byteArray86 = new byte[] { (byte) 0 };
        byte[] byteArray87 = lZ4Compression0.decompress(byteArray86);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 0 });
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 0, "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse11.component1();
        int int13 = errorResponse11.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray23 = lZ4Compression18.decompress(byteArray22);
        byte[] byteArray24 = lZ4Compression17.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray33 = lZ4Compression28.decompress(byteArray32);
        byte[] byteArray34 = lZ4Compression27.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression27.compress(byteArray40);
        byte[] byteArray42 = lZ4Compression26.decompress(byteArray41);
        byte[] byteArray43 = lZ4Compression0.compress(byteArray42);
        java.lang.Class<?> wildcardClass44 = byteArray43.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        java.lang.String str9 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy((int) (short) 1, "");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str9, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(errorResponse12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray5 = lZ4Compression0.decompress(byteArray4);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = lZ4Compression0.compress(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str3, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression0.decompress(byteArray21);
        java.lang.Class<?> wildcardClass24 = byteArray21.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        java.lang.String str8 = errorResponse2.toString();
        java.lang.String str9 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str8, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str9, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=97, message=hi!)");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService7 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean8 = errorResponse5.equals((java.lang.Object) fileStorageService7);
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse11.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler15 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean16 = errorResponse11.equals((java.lang.Object) globalExceptionHandler15);
        int int17 = errorResponse11.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse20 = errorResponse11.copy((int) 'a', "hi!");
        boolean boolean22 = errorResponse20.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse25 = errorResponse20.copy((int) (short) 1, "");
        boolean boolean26 = errorResponse5.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(errorResponse20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(errorResponse25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.toString();
        java.lang.String str14 = errorResponse2.component2();
        int int15 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(97, "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        byte[] byteArray9 = lZ4Compression0.decompress(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray16 = lZ4Compression11.decompress(byteArray15);
        byte[] byteArray17 = lZ4Compression10.decompress(byteArray16);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray17);
        java.lang.Class<?> wildcardClass19 = byteArray17.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray23 = lZ4Compression18.decompress(byteArray22);
        byte[] byteArray24 = lZ4Compression17.decompress(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression33.decompress(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        boolean boolean47 = lZ4Compression33.isCompressed(byteArray45);
        boolean boolean48 = lZ4Compression25.isCompressed(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression49.decompress(byteArray57);
        boolean boolean59 = lZ4Compression25.isCompressed(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray66 = lZ4Compression61.decompress(byteArray65);
        byte[] byteArray67 = lZ4Compression60.decompress(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray73 = lZ4Compression68.decompress(byteArray72);
        byte[] byteArray74 = lZ4Compression60.compress(byteArray73);
        byte[] byteArray75 = lZ4Compression25.compress(byteArray73);
        byte[] byteArray76 = lZ4Compression17.decompress(byteArray73);
        byte[] byteArray77 = lZ4Compression0.compress(byteArray76);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        java.lang.Class<?> wildcardClass17 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression24.decompress(byteArray32);
        boolean boolean34 = lZ4Compression0.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression35.compress(byteArray48);
        byte[] byteArray50 = lZ4Compression0.compress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression51.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray65 = lZ4Compression60.decompress(byteArray64);
        byte[] byteArray66 = lZ4Compression59.decompress(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray72 = lZ4Compression67.decompress(byteArray71);
        boolean boolean73 = lZ4Compression59.isCompressed(byteArray71);
        boolean boolean74 = lZ4Compression51.isCompressed(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression76 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray82 = lZ4Compression77.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression76.decompress(byteArray82);
        byte[] byteArray84 = lZ4Compression75.decompress(byteArray83);
        boolean boolean85 = lZ4Compression51.isCompressed(byteArray83);
        boolean boolean86 = lZ4Compression0.isCompressed(byteArray83);
        java.lang.Class<?> wildcardClass87 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(lZ4Compression76);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (short) 1, "");
        java.lang.String str17 = errorResponse11.toString();
        java.lang.String str18 = errorResponse11.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str17, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str18, "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (short) 100, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (byte) 1, "ErrorResponse(status=97, message=hi!)");
        java.lang.String str15 = errorResponse14.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str15, "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        int int11 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=35, message=)");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str3, "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        int int8 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        int int19 = errorResponse14.component1();
        org.pin.backend.exception.ErrorResponse errorResponse22 = errorResponse14.copy(97, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse25 = errorResponse22.copy((int) (short) 1, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(errorResponse22);
        org.junit.Assert.assertNotNull(errorResponse25);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        java.lang.String str15 = errorResponse8.component2();
        int int16 = errorResponse8.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        int int19 = errorResponse14.component1();
        org.pin.backend.exception.ErrorResponse errorResponse22 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse25 = errorResponse22.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler26 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean27 = errorResponse22.equals((java.lang.Object) globalExceptionHandler26);
        java.lang.String str28 = errorResponse22.toString();
        int int29 = errorResponse22.component1();
        boolean boolean30 = errorResponse14.equals((java.lang.Object) int29);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(errorResponse25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str28, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=97, message=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression23.decompress(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        boolean boolean37 = lZ4Compression23.isCompressed(byteArray35);
        boolean boolean38 = lZ4Compression15.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        byte[] byteArray47 = lZ4Compression40.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression39.decompress(byteArray47);
        boolean boolean49 = lZ4Compression15.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        boolean boolean64 = lZ4Compression50.isCompressed(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray71 = lZ4Compression66.decompress(byteArray70);
        byte[] byteArray72 = lZ4Compression65.decompress(byteArray71);
        byte[] byteArray73 = lZ4Compression50.decompress(byteArray71);
        boolean boolean74 = lZ4Compression15.isCompressed(byteArray73);
        byte[] byteArray75 = lZ4Compression0.compress(byteArray73);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=100, message=)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=100, message=)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression24.decompress(byteArray32);
        boolean boolean34 = lZ4Compression0.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression35.compress(byteArray48);
        byte[] byteArray50 = lZ4Compression0.compress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression51.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray65 = lZ4Compression60.decompress(byteArray64);
        byte[] byteArray66 = lZ4Compression59.decompress(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray72 = lZ4Compression67.decompress(byteArray71);
        boolean boolean73 = lZ4Compression59.isCompressed(byteArray71);
        boolean boolean74 = lZ4Compression51.isCompressed(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression76 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray82 = lZ4Compression77.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression76.decompress(byteArray82);
        byte[] byteArray84 = lZ4Compression75.decompress(byteArray83);
        boolean boolean85 = lZ4Compression51.isCompressed(byteArray83);
        boolean boolean86 = lZ4Compression0.isCompressed(byteArray83);
        org.pin.backend.utils.LZ4Compression lZ4Compression87 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray91 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray92 = lZ4Compression87.decompress(byteArray91);
        byte[] byteArray93 = lZ4Compression0.decompress(byteArray92);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(lZ4Compression76);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(lZ4Compression87);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression16.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        boolean boolean30 = lZ4Compression16.isCompressed(byteArray28);
        boolean boolean31 = lZ4Compression8.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression33.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression32.decompress(byteArray40);
        boolean boolean42 = lZ4Compression8.isCompressed(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray49 = lZ4Compression44.decompress(byteArray48);
        byte[] byteArray50 = lZ4Compression43.decompress(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression43.compress(byteArray56);
        byte[] byteArray58 = lZ4Compression8.compress(byteArray56);
        byte[] byteArray59 = lZ4Compression0.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray66 = lZ4Compression61.decompress(byteArray65);
        byte[] byteArray67 = lZ4Compression60.decompress(byteArray66);
        boolean boolean68 = lZ4Compression0.isCompressed(byteArray66);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        int int15 = errorResponse5.component1();
        java.lang.Class<?> wildcardClass16 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=97, message=)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=97, message=)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.toString();
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str5, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        java.lang.String str13 = errorResponse8.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str13, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '#', "ErrorResponse(status=35, message=)");
        java.lang.Class<?> wildcardClass3 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        int int19 = errorResponse14.component1();
        org.pin.backend.exception.ErrorResponse errorResponse22 = errorResponse14.copy(97, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray30 = lZ4Compression25.decompress(byteArray29);
        byte[] byteArray31 = lZ4Compression24.decompress(byteArray30);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray38 = lZ4Compression24.compress(byteArray37);
        boolean boolean39 = lZ4Compression23.isCompressed(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression41.decompress(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray54 = lZ4Compression49.decompress(byteArray53);
        byte[] byteArray55 = lZ4Compression41.compress(byteArray54);
        byte[] byteArray56 = lZ4Compression40.decompress(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression57.decompress(byteArray63);
        boolean boolean65 = lZ4Compression40.isCompressed(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray73 = lZ4Compression68.decompress(byteArray72);
        byte[] byteArray74 = lZ4Compression67.decompress(byteArray73);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray80 = lZ4Compression75.decompress(byteArray79);
        byte[] byteArray81 = lZ4Compression67.compress(byteArray80);
        byte[] byteArray82 = lZ4Compression66.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression40.compress(byteArray82);
        byte[] byteArray84 = lZ4Compression23.compress(byteArray83);
        boolean boolean85 = errorResponse14.equals((java.lang.Object) byteArray84);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(errorResponse22);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 12, (byte) -64, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        java.lang.String str8 = errorResponse7.toString();
        java.lang.String str9 = errorResponse7.toString();
        int int10 = errorResponse7.component1();
        int int11 = errorResponse7.component1();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str8, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str9, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 1, "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 100, "ErrorResponse(status=97, message=)");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        byte[] byteArray9 = lZ4Compression0.decompress(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.compress(byteArray15);
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=35, message=)");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse11.getStatus();
        int int13 = errorResponse11.getStatus();
        java.lang.String str14 = errorResponse11.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (short) 1, "");
        org.pin.backend.exception.ErrorResponse errorResponse19 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse22 = errorResponse19.copy((int) (short) -1, "");
        int int23 = errorResponse19.component1();
        boolean boolean24 = errorResponse16.equals((java.lang.Object) errorResponse19);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertNotNull(errorResponse22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int3 = errorResponse2.component1();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression16.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        boolean boolean30 = lZ4Compression16.isCompressed(byteArray28);
        boolean boolean31 = lZ4Compression8.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression33.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression32.decompress(byteArray40);
        boolean boolean42 = lZ4Compression8.isCompressed(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray49 = lZ4Compression44.decompress(byteArray48);
        byte[] byteArray50 = lZ4Compression43.decompress(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression43.compress(byteArray56);
        byte[] byteArray58 = lZ4Compression8.compress(byteArray56);
        byte[] byteArray59 = lZ4Compression0.decompress(byteArray56);
        java.lang.Class<?> wildcardClass60 = byteArray59.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse8.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean16 = errorResponse14.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse14.copy((int) '#', "");
        boolean boolean20 = errorResponse11.equals((java.lang.Object) errorResponse14);
        boolean boolean21 = errorResponse2.equals((java.lang.Object) errorResponse11);
        java.lang.String str22 = errorResponse11.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorResponse19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=97, message=)" + "'", str3, "ErrorResponse(status=97, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(35, "ErrorResponse(status=-1, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 1, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse8.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean16 = errorResponse14.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse14.copy((int) '#', "");
        boolean boolean20 = errorResponse11.equals((java.lang.Object) errorResponse14);
        boolean boolean21 = errorResponse2.equals((java.lang.Object) errorResponse11);
        int int22 = errorResponse11.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorResponse19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        java.lang.String str15 = errorResponse11.toString();
        java.lang.String str16 = errorResponse11.toString();
        java.lang.String str17 = errorResponse11.component2();
        java.lang.String str18 = errorResponse11.component2();
        java.lang.String str19 = errorResponse11.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str15, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str16, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse11.copy((-1), "ErrorResponse(status=35, message=)");
        java.lang.String str18 = errorResponse11.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(97, "ErrorResponse(status=35, message=)");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str3, "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=)" + "'", str3, "ErrorResponse(status=10, message=)");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        java.lang.String str15 = errorResponse11.toString();
        java.lang.String str16 = errorResponse11.toString();
        java.lang.String str17 = errorResponse11.component2();
        java.lang.String str18 = errorResponse11.component2();
        java.lang.Class<?> wildcardClass19 = errorResponse11.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str15, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str16, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "ErrorResponse(status=35, message=)");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService7 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean8 = errorResponse5.equals((java.lang.Object) fileStorageService7);
        boolean boolean10 = errorResponse5.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 1, "ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray23 = lZ4Compression18.decompress(byteArray22);
        byte[] byteArray24 = lZ4Compression17.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray33 = lZ4Compression28.decompress(byteArray32);
        byte[] byteArray34 = lZ4Compression27.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression27.compress(byteArray40);
        byte[] byteArray42 = lZ4Compression26.decompress(byteArray41);
        byte[] byteArray43 = lZ4Compression0.compress(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        byte[] byteArray52 = lZ4Compression45.decompress(byteArray51);
        byte[] byteArray53 = lZ4Compression44.decompress(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray60 = lZ4Compression55.decompress(byteArray59);
        byte[] byteArray61 = lZ4Compression54.decompress(byteArray60);
        byte[] byteArray62 = lZ4Compression44.decompress(byteArray61);
        boolean boolean63 = lZ4Compression0.isCompressed(byteArray61);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse11.getStatus();
        java.lang.String str13 = errorResponse11.toString();
        org.pin.backend.exception.ErrorResponse errorResponse16 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        boolean boolean17 = errorResponse11.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str13, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        int int14 = errorResponse2.component1();
        int int15 = errorResponse2.getStatus();
        java.lang.Class<?> wildcardClass16 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (short) 100, "hi!");
        int int11 = errorResponse10.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(97, "");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=97, message=)" + "'", str3, "ErrorResponse(status=97, message=)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray30 = lZ4Compression25.decompress(byteArray29);
        byte[] byteArray31 = lZ4Compression24.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression24.compress(byteArray37);
        byte[] byteArray39 = lZ4Compression0.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression41.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression40.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression40.decompress(byteArray57);
        byte[] byteArray59 = lZ4Compression0.compress(byteArray57);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("hi!");
        java.lang.Class<?> wildcardClass2 = fileStorageService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression9.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression9.compress(byteArray22);
        byte[] byteArray24 = lZ4Compression8.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray33 = lZ4Compression28.decompress(byteArray32);
        byte[] byteArray34 = lZ4Compression27.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression27.compress(byteArray40);
        byte[] byteArray42 = lZ4Compression26.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray49 = lZ4Compression44.decompress(byteArray48);
        byte[] byteArray50 = lZ4Compression43.decompress(byteArray49);
        boolean boolean51 = lZ4Compression26.isCompressed(byteArray50);
        byte[] byteArray52 = lZ4Compression0.decompress(byteArray50);
        java.lang.Class<?> wildcardClass53 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray29 = lZ4Compression15.compress(byteArray28);
        boolean boolean30 = lZ4Compression0.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression31.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        boolean boolean45 = lZ4Compression31.isCompressed(byteArray43);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray52 = lZ4Compression47.decompress(byteArray51);
        byte[] byteArray53 = lZ4Compression46.decompress(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray60 = lZ4Compression55.decompress(byteArray59);
        byte[] byteArray61 = lZ4Compression54.decompress(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray67 = lZ4Compression62.decompress(byteArray66);
        boolean boolean68 = lZ4Compression54.isCompressed(byteArray66);
        boolean boolean69 = lZ4Compression46.isCompressed(byteArray66);
        byte[] byteArray70 = lZ4Compression31.decompress(byteArray66);
        boolean boolean71 = lZ4Compression0.isCompressed(byteArray66);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression9.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression9.compress(byteArray22);
        byte[] byteArray24 = lZ4Compression8.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray32 = lZ4Compression27.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression26.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression26.compress(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression41.decompress(byteArray47);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray55 = lZ4Compression41.compress(byteArray54);
        boolean boolean56 = lZ4Compression26.isCompressed(byteArray54);
        byte[] byteArray57 = lZ4Compression0.compress(byteArray54);
        byte[] byteArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray59 = lZ4Compression0.compress(byteArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=10, message=)");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (short) 1, "");
        int int17 = errorResponse11.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse20 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse23 = errorResponse20.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse26 = errorResponse23.copy((int) (short) -1, "");
        int int27 = errorResponse26.component1();
        org.pin.backend.exception.ErrorResponse errorResponse30 = errorResponse26.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        boolean boolean31 = errorResponse11.equals((java.lang.Object) errorResponse30);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(errorResponse23);
        org.junit.Assert.assertNotNull(errorResponse26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(errorResponse30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse8.copy((int) (short) 10, "ErrorResponse(status=97, message=hi!)");
        java.lang.String str16 = errorResponse8.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        int int8 = errorResponse7.component1();
        java.lang.Class<?> wildcardClass9 = errorResponse7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        boolean boolean14 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression0.decompress(byteArray21);
        byte[] byteArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = lZ4Compression0.decompress(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.decompress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=100, message=)");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression9.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression9.compress(byteArray22);
        byte[] byteArray24 = lZ4Compression8.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray33 = lZ4Compression28.decompress(byteArray32);
        byte[] byteArray34 = lZ4Compression27.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression27.compress(byteArray40);
        byte[] byteArray42 = lZ4Compression26.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray49 = lZ4Compression44.decompress(byteArray48);
        byte[] byteArray50 = lZ4Compression43.decompress(byteArray49);
        boolean boolean51 = lZ4Compression26.isCompressed(byteArray50);
        byte[] byteArray52 = lZ4Compression0.decompress(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray58 = lZ4Compression53.decompress(byteArray57);
        byte[] byteArray59 = lZ4Compression0.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray68 = lZ4Compression63.decompress(byteArray67);
        byte[] byteArray69 = lZ4Compression62.decompress(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray75 = lZ4Compression70.decompress(byteArray74);
        byte[] byteArray76 = lZ4Compression62.compress(byteArray75);
        byte[] byteArray77 = lZ4Compression61.decompress(byteArray76);
        byte[] byteArray78 = lZ4Compression60.compress(byteArray77);
        byte[] byteArray79 = lZ4Compression0.decompress(byteArray77);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 100, "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=)" + "'", str3, "ErrorResponse(status=100, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.Class<?> wildcardClass5 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        int int6 = errorResponse2.component1();
        int int7 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int12 = errorResponse11.getStatus();
        java.lang.String str13 = errorResponse11.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))" + "'", str13, "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=97, message=)");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) '#', "ErrorResponse(status=97, message=)");
        java.lang.Object obj11 = null;
        boolean boolean12 = errorResponse10.equals(obj11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '#', "ErrorResponse(status=97, message=)");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService7 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean8 = errorResponse5.equals((java.lang.Object) fileStorageService7);
        boolean boolean10 = errorResponse5.equals((java.lang.Object) '#');
        java.lang.String str11 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray24 = lZ4Compression19.decompress(byteArray23);
        byte[] byteArray25 = lZ4Compression18.decompress(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression18.compress(byteArray31);
        byte[] byteArray33 = lZ4Compression17.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        byte[] byteArray40 = lZ4Compression17.decompress(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression42.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray55 = lZ4Compression50.decompress(byteArray54);
        byte[] byteArray56 = lZ4Compression42.compress(byteArray55);
        byte[] byteArray57 = lZ4Compression41.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression41.decompress(byteArray62);
        boolean boolean65 = lZ4Compression17.isCompressed(byteArray62);
        byte[] byteArray66 = lZ4Compression16.compress(byteArray62);
        boolean boolean67 = errorResponse14.equals((java.lang.Object) lZ4Compression16);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        java.lang.String str15 = errorResponse8.component2();
        int int16 = errorResponse8.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse10.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler14 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean15 = errorResponse10.equals((java.lang.Object) globalExceptionHandler14);
        int int16 = errorResponse10.getStatus();
        java.lang.String str17 = errorResponse10.toString();
        boolean boolean18 = errorResponse2.equals((java.lang.Object) str17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str17, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=10, message=)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=10, message=)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=100, message=)");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        java.lang.Class<?> wildcardClass15 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        java.lang.Class<?> wildcardClass19 = errorResponse18.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (short) 100, "ErrorResponse(status=-1, message=)");
        int int13 = errorResponse12.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) 'a', "ErrorResponse(status=35, message=)");
        java.lang.String str9 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str9, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=97, message=)");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        boolean boolean16 = lZ4Compression0.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray24 = lZ4Compression19.decompress(byteArray23);
        byte[] byteArray25 = lZ4Compression18.decompress(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression18.compress(byteArray31);
        byte[] byteArray33 = lZ4Compression17.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray40 = lZ4Compression35.decompress(byteArray39);
        byte[] byteArray41 = lZ4Compression34.decompress(byteArray40);
        boolean boolean42 = lZ4Compression17.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray50 = lZ4Compression45.decompress(byteArray49);
        byte[] byteArray51 = lZ4Compression44.decompress(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression44.compress(byteArray57);
        byte[] byteArray59 = lZ4Compression43.decompress(byteArray58);
        byte[] byteArray60 = lZ4Compression17.compress(byteArray59);
        byte[] byteArray61 = lZ4Compression0.compress(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray69 = lZ4Compression64.decompress(byteArray68);
        byte[] byteArray70 = lZ4Compression63.decompress(byteArray69);
        org.pin.backend.utils.LZ4Compression lZ4Compression71 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray76 = lZ4Compression71.decompress(byteArray75);
        byte[] byteArray77 = lZ4Compression63.compress(byteArray76);
        byte[] byteArray78 = lZ4Compression62.decompress(byteArray77);
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray85 = lZ4Compression80.decompress(byteArray84);
        byte[] byteArray86 = lZ4Compression79.decompress(byteArray85);
        boolean boolean87 = lZ4Compression62.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression0.decompress(byteArray86);
        org.pin.backend.utils.LZ4Compression lZ4Compression89 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray93 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray94 = lZ4Compression89.decompress(byteArray93);
        byte[] byteArray95 = lZ4Compression0.decompress(byteArray93);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 12, (byte) -64, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression89);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        boolean boolean14 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression23.decompress(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        boolean boolean37 = lZ4Compression23.isCompressed(byteArray35);
        boolean boolean38 = lZ4Compression15.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        byte[] byteArray47 = lZ4Compression40.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression39.decompress(byteArray47);
        boolean boolean49 = lZ4Compression15.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression50.compress(byteArray63);
        byte[] byteArray65 = lZ4Compression15.compress(byteArray63);
        byte[] byteArray66 = lZ4Compression0.decompress(byteArray63);
        org.pin.backend.exception.ErrorResponse errorResponse69 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse72 = errorResponse69.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler73 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean74 = errorResponse69.equals((java.lang.Object) globalExceptionHandler73);
        int int75 = errorResponse69.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse78 = errorResponse69.copy((int) 'a', "hi!");
        int int79 = errorResponse78.getStatus();
        int int80 = errorResponse78.getStatus();
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray87 = lZ4Compression82.decompress(byteArray86);
        byte[] byteArray88 = lZ4Compression81.decompress(byteArray87);
        byte[] byteArray94 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray95 = lZ4Compression81.compress(byteArray94);
        boolean boolean96 = errorResponse78.equals((java.lang.Object) byteArray95);
        boolean boolean97 = lZ4Compression0.isCompressed(byteArray95);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(errorResponse72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(errorResponse78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse11.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler15 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean16 = errorResponse11.equals((java.lang.Object) globalExceptionHandler15);
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse11.copy((int) (byte) 10, "hi!");
        java.lang.String str20 = errorResponse11.toString();
        int int21 = errorResponse11.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse11.copy((int) '#', "");
        org.pin.backend.exception.ErrorResponse errorResponse27 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int28 = errorResponse27.getStatus();
        java.lang.String str29 = errorResponse27.component2();
        org.pin.backend.exception.ErrorResponse errorResponse32 = errorResponse27.copy(0, "ErrorResponse(status=-1, message=)");
        boolean boolean33 = errorResponse11.equals((java.lang.Object) errorResponse32);
        boolean boolean34 = errorResponse5.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorResponse19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str20, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(errorResponse32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) '#', "ErrorResponse(status=97, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy((int) (short) 1, "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        byte[] byteArray9 = lZ4Compression0.decompress(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray16 = lZ4Compression11.decompress(byteArray15);
        byte[] byteArray17 = lZ4Compression10.decompress(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray24 = lZ4Compression19.decompress(byteArray23);
        byte[] byteArray25 = lZ4Compression18.decompress(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        boolean boolean32 = lZ4Compression18.isCompressed(byteArray30);
        boolean boolean33 = lZ4Compression10.isCompressed(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        byte[] byteArray43 = lZ4Compression34.decompress(byteArray42);
        boolean boolean44 = lZ4Compression10.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        byte[] byteArray52 = lZ4Compression45.decompress(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray58 = lZ4Compression53.decompress(byteArray57);
        boolean boolean59 = lZ4Compression45.isCompressed(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray66 = lZ4Compression61.decompress(byteArray65);
        byte[] byteArray67 = lZ4Compression60.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression45.decompress(byteArray66);
        byte[] byteArray69 = lZ4Compression10.decompress(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression71 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray77 = lZ4Compression72.decompress(byteArray76);
        byte[] byteArray78 = lZ4Compression71.decompress(byteArray77);
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray84 = lZ4Compression79.decompress(byteArray83);
        byte[] byteArray85 = lZ4Compression71.compress(byteArray84);
        byte[] byteArray86 = lZ4Compression70.decompress(byteArray85);
        org.pin.backend.utils.LZ4Compression lZ4Compression87 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray91 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray92 = lZ4Compression87.decompress(byteArray91);
        byte[] byteArray93 = lZ4Compression70.decompress(byteArray91);
        boolean boolean94 = lZ4Compression10.isCompressed(byteArray91);
        boolean boolean95 = lZ4Compression0.isCompressed(byteArray91);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(lZ4Compression71);
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression87);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        int int12 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse2.copy((int) '#', "");
        java.lang.String str16 = errorResponse15.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str16, "ErrorResponse(status=35, message=)");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int3 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((-1), "ErrorResponse(status=35, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse9 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "");
        boolean boolean10 = errorResponse2.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.Class<?> wildcardClass15 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        boolean boolean14 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression16.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression16.compress(byteArray29);
        byte[] byteArray31 = lZ4Compression15.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression15.decompress(byteArray36);
        boolean boolean39 = lZ4Compression0.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        byte[] byteArray47 = lZ4Compression40.decompress(byteArray46);
        boolean boolean48 = lZ4Compression0.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression50.compress(byteArray63);
        byte[] byteArray65 = lZ4Compression49.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray71 = lZ4Compression66.decompress(byteArray70);
        byte[] byteArray72 = lZ4Compression49.decompress(byteArray70);
        byte[] byteArray73 = lZ4Compression0.decompress(byteArray72);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        int int14 = errorResponse2.component1();
        java.lang.String str15 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse2.copy(97, "ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorResponse18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        java.lang.String str8 = errorResponse7.toString();
        int int9 = errorResponse7.component1();
        java.lang.String str10 = errorResponse7.toString();
        java.lang.String str11 = errorResponse7.toString();
        int int12 = errorResponse7.component1();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str8, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str10, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str11, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        java.lang.String str5 = errorResponse2.toString();
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.toString();
        int int8 = errorResponse2.getStatus();
        int int9 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str5, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str7, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        java.lang.String str5 = errorResponse2.toString();
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.toString();
        int int8 = errorResponse2.getStatus();
        java.lang.Class<?> wildcardClass9 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str5, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str7, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) '#', "ErrorResponse(status=97, message=)");
        int int11 = errorResponse10.getStatus();
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression13 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray18 = lZ4Compression13.decompress(byteArray17);
        byte[] byteArray19 = lZ4Compression12.decompress(byteArray18);
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray26 = lZ4Compression21.decompress(byteArray25);
        byte[] byteArray27 = lZ4Compression20.decompress(byteArray26);
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray33 = lZ4Compression28.decompress(byteArray32);
        boolean boolean34 = lZ4Compression20.isCompressed(byteArray32);
        boolean boolean35 = lZ4Compression12.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray43 = lZ4Compression38.decompress(byteArray42);
        byte[] byteArray44 = lZ4Compression37.decompress(byteArray43);
        byte[] byteArray45 = lZ4Compression36.decompress(byteArray44);
        boolean boolean46 = lZ4Compression12.isCompressed(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray53 = lZ4Compression48.decompress(byteArray52);
        byte[] byteArray54 = lZ4Compression47.decompress(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray60 = lZ4Compression55.decompress(byteArray59);
        boolean boolean61 = lZ4Compression47.isCompressed(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray68 = lZ4Compression63.decompress(byteArray67);
        byte[] byteArray69 = lZ4Compression62.decompress(byteArray68);
        byte[] byteArray70 = lZ4Compression47.decompress(byteArray68);
        boolean boolean71 = lZ4Compression12.isCompressed(byteArray70);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray77 = lZ4Compression72.decompress(byteArray76);
        byte[] byteArray78 = lZ4Compression12.compress(byteArray77);
        boolean boolean79 = errorResponse10.equals((java.lang.Object) byteArray77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(lZ4Compression13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 1, "ErrorResponse(status=-1, message=)");
        int int3 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse6 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        java.lang.String str7 = errorResponse6.component2();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse6.copy(100, "hi!");
        boolean boolean11 = errorResponse2.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (short) 100, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (byte) 1, "ErrorResponse(status=97, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse14.copy((int) ' ', "ErrorResponse(status=97, message=hi!)");
        java.lang.String str18 = errorResponse17.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))" + "'", str18, "ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        java.lang.String str12 = errorResponse11.component2();
        int int13 = errorResponse11.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=97, message=hi!)");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        int int7 = errorResponse2.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str3, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=97, message=hi!)");
        int int3 = errorResponse2.getStatus();
        int int4 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray8 = lZ4Compression3.decompress(byteArray7);
        byte[] byteArray9 = lZ4Compression2.decompress(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray15 = lZ4Compression10.decompress(byteArray14);
        byte[] byteArray16 = lZ4Compression2.compress(byteArray15);
        byte[] byteArray17 = lZ4Compression1.decompress(byteArray16);
        byte[] byteArray18 = lZ4Compression0.compress(byteArray17);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray26 = lZ4Compression21.decompress(byteArray25);
        byte[] byteArray27 = lZ4Compression20.decompress(byteArray26);
        byte[] byteArray28 = lZ4Compression19.decompress(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray34 = lZ4Compression29.decompress(byteArray33);
        byte[] byteArray35 = lZ4Compression19.compress(byteArray34);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression19.decompress(byteArray38);
        boolean boolean40 = lZ4Compression0.isCompressed(byteArray38);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        int int11 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        int int13 = errorResponse12.component1();
        java.lang.Class<?> wildcardClass14 = errorResponse12.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (short) 1, "");
        java.lang.Class<?> wildcardClass17 = errorResponse16.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse8.copy((int) (short) 10, "ErrorResponse(status=97, message=hi!)");
        java.lang.Class<?> wildcardClass16 = errorResponse15.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression4 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray9 = lZ4Compression4.decompress(byteArray8);
        byte[] byteArray10 = lZ4Compression3.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray16 = lZ4Compression11.decompress(byteArray15);
        byte[] byteArray17 = lZ4Compression3.compress(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray24 = lZ4Compression19.decompress(byteArray23);
        byte[] byteArray25 = lZ4Compression18.decompress(byteArray24);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray32 = lZ4Compression18.compress(byteArray31);
        boolean boolean33 = lZ4Compression3.isCompressed(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression35.compress(byteArray48);
        byte[] byteArray50 = lZ4Compression34.decompress(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray57 = lZ4Compression52.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression51.decompress(byteArray57);
        boolean boolean59 = lZ4Compression34.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray67 = lZ4Compression62.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression61.decompress(byteArray67);
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray74 = lZ4Compression69.decompress(byteArray73);
        byte[] byteArray75 = lZ4Compression61.compress(byteArray74);
        byte[] byteArray76 = lZ4Compression60.decompress(byteArray75);
        byte[] byteArray77 = lZ4Compression34.compress(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray85 = lZ4Compression80.decompress(byteArray84);
        byte[] byteArray86 = lZ4Compression79.decompress(byteArray85);
        byte[] byteArray92 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray93 = lZ4Compression79.compress(byteArray92);
        boolean boolean94 = lZ4Compression78.isCompressed(byteArray92);
        boolean boolean95 = lZ4Compression34.isCompressed(byteArray92);
        boolean boolean96 = lZ4Compression3.isCompressed(byteArray92);
        boolean boolean97 = errorResponse2.equals((java.lang.Object) boolean96);
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(lZ4Compression4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        java.lang.String str15 = errorResponse11.toString();
        java.lang.String str16 = errorResponse11.toString();
        java.lang.String str17 = errorResponse11.component2();
        java.lang.String str18 = errorResponse11.component2();
        int int19 = errorResponse11.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str15, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str16, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        java.lang.String str15 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse18 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse18.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler22 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean23 = errorResponse18.equals((java.lang.Object) globalExceptionHandler22);
        int int24 = errorResponse18.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse27 = errorResponse18.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse30 = errorResponse18.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.Class<?> wildcardClass31 = errorResponse30.getClass();
        boolean boolean32 = errorResponse5.equals((java.lang.Object) errorResponse30);
        int int33 = errorResponse5.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse36 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse39 = errorResponse36.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler40 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean41 = errorResponse36.equals((java.lang.Object) globalExceptionHandler40);
        java.lang.String str42 = errorResponse36.toString();
        int int43 = errorResponse36.component1();
        int int44 = errorResponse36.component1();
        java.lang.String str45 = errorResponse36.component2();
        boolean boolean46 = errorResponse5.equals((java.lang.Object) errorResponse36);
        org.pin.backend.exception.ErrorResponse errorResponse49 = errorResponse36.copy(0, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(errorResponse27);
        org.junit.Assert.assertNotNull(errorResponse30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(errorResponse39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str42, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(errorResponse49);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (short) 100, "ErrorResponse(status=-1, message=)");
        int int13 = errorResponse12.getStatus();
        java.lang.Class<?> wildcardClass14 = errorResponse12.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        int int12 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse2.copy((int) '#', "");
        int int16 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse2.copy(0, "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
        int int20 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(errorResponse19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=35, message=)");
        java.lang.Class<?> wildcardClass2 = fileStorageService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=97, message=)");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        java.lang.String str3 = errorResponse2.component2();
        java.lang.Object obj4 = null;
        boolean boolean5 = errorResponse2.equals(obj4);
        int int6 = errorResponse2.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        int int15 = errorResponse5.component1();
        int int16 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((-1), "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        java.lang.String str15 = errorResponse8.component2();
        java.lang.String str16 = errorResponse8.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str16, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        int int9 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean10 = errorResponse8.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) '#', "");
        boolean boolean14 = errorResponse5.equals((java.lang.Object) errorResponse8);
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse5.copy(35, "hi!");
        java.lang.String str18 = errorResponse5.toString();
        java.lang.String str19 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str18, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "ErrorResponse(status=35, message=)");
        int int3 = errorResponse2.component1();
        int int4 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '4', "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(errorResponse7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 100, "ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))" + "'", str3, "ErrorResponse(status=-1, message=ErrorResponse(status=97, message=hi!))");
        org.junit.Assert.assertNotNull(errorResponse6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int3 = errorResponse2.component1();
        java.lang.String str4 = errorResponse2.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str4, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray28 = lZ4Compression23.decompress(byteArray27);
        boolean boolean29 = lZ4Compression15.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        byte[] byteArray37 = lZ4Compression30.decompress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        byte[] byteArray45 = lZ4Compression38.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        boolean boolean52 = lZ4Compression38.isCompressed(byteArray50);
        boolean boolean53 = lZ4Compression30.isCompressed(byteArray50);
        byte[] byteArray54 = lZ4Compression15.decompress(byteArray50);
        byte[] byteArray55 = lZ4Compression0.decompress(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression57.decompress(byteArray63);
        byte[] byteArray65 = lZ4Compression56.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray71 = lZ4Compression66.decompress(byteArray70);
        byte[] byteArray72 = lZ4Compression56.compress(byteArray71);
        boolean boolean73 = lZ4Compression0.isCompressed(byteArray71);
        byte[] byteArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = lZ4Compression0.isCompressed(byteArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.isCompressed, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression23.decompress(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        byte[] byteArray37 = lZ4Compression23.compress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        byte[] byteArray45 = lZ4Compression38.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        boolean boolean52 = lZ4Compression38.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray59 = lZ4Compression54.decompress(byteArray58);
        byte[] byteArray60 = lZ4Compression53.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray67 = lZ4Compression62.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression61.decompress(byteArray67);
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray74 = lZ4Compression69.decompress(byteArray73);
        boolean boolean75 = lZ4Compression61.isCompressed(byteArray73);
        boolean boolean76 = lZ4Compression53.isCompressed(byteArray73);
        byte[] byteArray77 = lZ4Compression38.decompress(byteArray73);
        byte[] byteArray78 = lZ4Compression23.decompress(byteArray77);
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray85 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray86 = lZ4Compression81.decompress(byteArray85);
        byte[] byteArray87 = lZ4Compression80.decompress(byteArray86);
        byte[] byteArray88 = lZ4Compression79.decompress(byteArray87);
        org.pin.backend.utils.LZ4Compression lZ4Compression89 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray93 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray94 = lZ4Compression89.decompress(byteArray93);
        byte[] byteArray95 = lZ4Compression79.compress(byteArray94);
        boolean boolean96 = lZ4Compression23.isCompressed(byteArray94);
        boolean boolean97 = lZ4Compression8.isCompressed(byteArray94);
        byte[] byteArray98 = lZ4Compression0.decompress(byteArray94);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression89);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(byteArray98);
        org.junit.Assert.assertArrayEquals(byteArray98, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(97, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        java.lang.Class<?> wildcardClass13 = errorResponse12.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse8.copy((int) (short) 10, "ErrorResponse(status=97, message=hi!)");
        int int16 = errorResponse8.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) '#', "");
        java.lang.String str8 = errorResponse7.toString();
        int int9 = errorResponse7.component1();
        java.lang.String str10 = errorResponse7.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean15 = errorResponse13.equals((java.lang.Object) (short) 100);
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse13.copy((int) '#', "");
        java.lang.String str19 = errorResponse18.toString();
        java.lang.String str20 = errorResponse18.toString();
        org.pin.backend.exception.ErrorResponse errorResponse23 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse26 = errorResponse23.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse29 = errorResponse26.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse32 = errorResponse26.copy((int) (byte) 10, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse35 = errorResponse32.copy(100, "ErrorResponse(status=-1, message=)");
        boolean boolean36 = errorResponse18.equals((java.lang.Object) errorResponse35);
        boolean boolean37 = errorResponse7.equals((java.lang.Object) errorResponse18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str8, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str19, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ErrorResponse(status=35, message=)" + "'", str20, "ErrorResponse(status=35, message=)");
        org.junit.Assert.assertNotNull(errorResponse26);
        org.junit.Assert.assertNotNull(errorResponse29);
        org.junit.Assert.assertNotNull(errorResponse32);
        org.junit.Assert.assertNotNull(errorResponse35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        int int14 = errorResponse2.component1();
        int int15 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse2.copy((int) (byte) -1, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse21 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse21.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler25 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean26 = errorResponse21.equals((java.lang.Object) globalExceptionHandler25);
        int int27 = errorResponse21.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse30 = errorResponse21.copy((int) 'a', "hi!");
        boolean boolean32 = errorResponse30.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse35 = errorResponse30.copy((int) (short) 1, "");
        boolean boolean36 = errorResponse2.equals((java.lang.Object) errorResponse30);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(errorResponse30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorResponse35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        boolean boolean4 = errorResponse2.equals((java.lang.Object) (short) 100);
        int int5 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((-1), "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(errorResponse8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.pin.backend.repository.CasaRepository casaRepository0 = null;
        org.pin.backend.service.LienzoService lienzoService1 = null;
        org.pin.backend.service.FileStorageService fileStorageService3 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.CasaService casaService4 = new org.pin.backend.service.CasaService(casaRepository0, lienzoService1, fileStorageService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.CasaService.<init>, parameter repo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse18.copy((int) (byte) -1, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertNotNull(errorResponse21);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression24.decompress(byteArray32);
        boolean boolean34 = lZ4Compression0.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray49 = lZ4Compression44.decompress(byteArray48);
        byte[] byteArray50 = lZ4Compression43.decompress(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        boolean boolean57 = lZ4Compression43.isCompressed(byteArray55);
        boolean boolean58 = lZ4Compression35.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray66 = lZ4Compression61.decompress(byteArray65);
        byte[] byteArray67 = lZ4Compression60.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression59.decompress(byteArray67);
        boolean boolean69 = lZ4Compression35.isCompressed(byteArray67);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression71 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray76 = lZ4Compression71.decompress(byteArray75);
        byte[] byteArray77 = lZ4Compression70.decompress(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray82 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray83 = lZ4Compression78.decompress(byteArray82);
        boolean boolean84 = lZ4Compression70.isCompressed(byteArray82);
        org.pin.backend.utils.LZ4Compression lZ4Compression85 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression86 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray90 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray91 = lZ4Compression86.decompress(byteArray90);
        byte[] byteArray92 = lZ4Compression85.decompress(byteArray91);
        byte[] byteArray93 = lZ4Compression70.decompress(byteArray91);
        byte[] byteArray94 = lZ4Compression35.decompress(byteArray91);
        byte[] byteArray95 = lZ4Compression0.decompress(byteArray94);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(lZ4Compression71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(lZ4Compression85);
        org.junit.Assert.assertNotNull(lZ4Compression86);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        java.lang.String str14 = errorResponse2.toString();
        java.lang.String str15 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str14, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str15, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        boolean boolean14 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray22 = lZ4Compression17.decompress(byteArray21);
        byte[] byteArray23 = lZ4Compression16.decompress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray29 = lZ4Compression24.decompress(byteArray28);
        byte[] byteArray30 = lZ4Compression16.compress(byteArray29);
        byte[] byteArray31 = lZ4Compression15.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression15.decompress(byteArray36);
        boolean boolean39 = lZ4Compression0.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray46 = lZ4Compression41.decompress(byteArray45);
        byte[] byteArray47 = lZ4Compression40.decompress(byteArray46);
        boolean boolean48 = lZ4Compression0.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression50.compress(byteArray63);
        byte[] byteArray65 = lZ4Compression49.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray71 = lZ4Compression66.decompress(byteArray70);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression73 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression74 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray79 = lZ4Compression74.decompress(byteArray78);
        byte[] byteArray80 = lZ4Compression73.decompress(byteArray79);
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray85 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray86 = lZ4Compression81.decompress(byteArray85);
        byte[] byteArray87 = lZ4Compression73.compress(byteArray86);
        byte[] byteArray88 = lZ4Compression72.decompress(byteArray87);
        byte[] byteArray89 = lZ4Compression66.decompress(byteArray88);
        byte[] byteArray90 = lZ4Compression49.compress(byteArray88);
        byte[] byteArray91 = lZ4Compression0.compress(byteArray90);
        java.lang.Class<?> wildcardClass92 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(lZ4Compression73);
        org.junit.Assert.assertNotNull(lZ4Compression74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 12, (byte) -64, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=)");
        java.lang.String str14 = errorResponse13.component2();
        boolean boolean16 = errorResponse13.equals((java.lang.Object) "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str14, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        int int12 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse2.copy((int) '#', "");
        org.pin.backend.exception.ErrorResponse errorResponse18 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int19 = errorResponse18.getStatus();
        java.lang.String str20 = errorResponse18.component2();
        org.pin.backend.exception.ErrorResponse errorResponse23 = errorResponse18.copy(0, "ErrorResponse(status=-1, message=)");
        boolean boolean24 = errorResponse2.equals((java.lang.Object) errorResponse23);
        int int25 = errorResponse23.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorResponse23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) '#', "ErrorResponse(status=97, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse2.copy((int) (short) 1, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str15 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        int int19 = errorResponse14.component1();
        org.pin.backend.exception.ErrorResponse errorResponse22 = errorResponse14.copy(97, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        int int23 = errorResponse14.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str15, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(errorResponse22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        // The following exception was thrown during execution in test generation
        try {
            org.pin.backend.service.MqttService mqttService1 = new org.pin.backend.service.MqttService("ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't parse string to URI \"ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray30 = lZ4Compression25.decompress(byteArray29);
        byte[] byteArray31 = lZ4Compression24.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray37 = lZ4Compression32.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression24.compress(byteArray37);
        byte[] byteArray39 = lZ4Compression0.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray47 = lZ4Compression42.decompress(byteArray46);
        byte[] byteArray48 = lZ4Compression41.decompress(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray54 = lZ4Compression49.decompress(byteArray53);
        byte[] byteArray55 = lZ4Compression41.compress(byteArray54);
        byte[] byteArray56 = lZ4Compression40.decompress(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression57.decompress(byteArray63);
        boolean boolean65 = lZ4Compression40.isCompressed(byteArray64);
        byte[] byteArray66 = lZ4Compression0.decompress(byteArray64);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression2 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray7 = lZ4Compression2.decompress(byteArray6);
        byte[] byteArray8 = lZ4Compression1.decompress(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression1.compress(byteArray14);
        byte[] byteArray16 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray23 = lZ4Compression18.decompress(byteArray22);
        byte[] byteArray24 = lZ4Compression17.decompress(byteArray23);
        boolean boolean25 = lZ4Compression0.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray32 = lZ4Compression27.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression26.decompress(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray39 = lZ4Compression34.decompress(byteArray38);
        boolean boolean40 = lZ4Compression26.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        byte[] byteArray49 = lZ4Compression42.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray55 = lZ4Compression50.decompress(byteArray54);
        byte[] byteArray56 = lZ4Compression42.compress(byteArray55);
        byte[] byteArray57 = lZ4Compression41.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression41.decompress(byteArray62);
        boolean boolean65 = lZ4Compression26.isCompressed(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray72 = lZ4Compression67.decompress(byteArray71);
        byte[] byteArray73 = lZ4Compression66.decompress(byteArray72);
        boolean boolean74 = lZ4Compression26.isCompressed(byteArray72);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray80 = lZ4Compression75.decompress(byteArray79);
        byte[] byteArray81 = lZ4Compression26.decompress(byteArray80);
        byte[] byteArray82 = lZ4Compression0.decompress(byteArray81);
        java.lang.Class<?> wildcardClass83 = byteArray82.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(lZ4Compression2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = errorResponse11.toString();
        java.lang.String str15 = errorResponse11.toString();
        java.lang.String str16 = errorResponse11.toString();
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse11.copy((-1), "ErrorResponse(status=100, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str14, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str15, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str16, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy(0, "ErrorResponse(status=-1, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int11 = errorResponse10.getStatus();
        int int12 = errorResponse10.getStatus();
        boolean boolean13 = errorResponse2.equals((java.lang.Object) int12);
        int int14 = errorResponse2.getStatus();
        boolean boolean16 = errorResponse2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray28 = lZ4Compression23.decompress(byteArray27);
        boolean boolean29 = lZ4Compression15.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        byte[] byteArray37 = lZ4Compression30.decompress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        byte[] byteArray45 = lZ4Compression38.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        boolean boolean52 = lZ4Compression38.isCompressed(byteArray50);
        boolean boolean53 = lZ4Compression30.isCompressed(byteArray50);
        byte[] byteArray54 = lZ4Compression15.decompress(byteArray50);
        byte[] byteArray55 = lZ4Compression0.decompress(byteArray54);
        java.lang.Class<?> wildcardClass56 = byteArray54.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray14 = lZ4Compression9.decompress(byteArray13);
        byte[] byteArray15 = lZ4Compression8.decompress(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        boolean boolean22 = lZ4Compression8.isCompressed(byteArray20);
        boolean boolean23 = lZ4Compression0.isCompressed(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray31 = lZ4Compression26.decompress(byteArray30);
        byte[] byteArray32 = lZ4Compression25.decompress(byteArray31);
        byte[] byteArray33 = lZ4Compression24.decompress(byteArray32);
        boolean boolean34 = lZ4Compression0.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray41 = lZ4Compression36.decompress(byteArray40);
        byte[] byteArray42 = lZ4Compression35.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray48 = lZ4Compression43.decompress(byteArray47);
        boolean boolean49 = lZ4Compression35.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray56 = lZ4Compression51.decompress(byteArray55);
        byte[] byteArray57 = lZ4Compression50.decompress(byteArray56);
        byte[] byteArray58 = lZ4Compression35.decompress(byteArray56);
        boolean boolean59 = lZ4Compression0.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray67 = lZ4Compression62.decompress(byteArray66);
        byte[] byteArray68 = lZ4Compression61.decompress(byteArray67);
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray74 = lZ4Compression69.decompress(byteArray73);
        byte[] byteArray75 = lZ4Compression61.compress(byteArray74);
        byte[] byteArray76 = lZ4Compression60.decompress(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray82 = lZ4Compression77.decompress(byteArray81);
        byte[] byteArray83 = lZ4Compression60.decompress(byteArray81);
        boolean boolean84 = lZ4Compression0.isCompressed(byteArray81);
        byte[] byteArray85 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray86 = lZ4Compression0.decompress(byteArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.decompress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 0.0f);
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) '#', "ErrorResponse(status=97, message=)");
        int int11 = errorResponse10.getStatus();
        int int12 = errorResponse10.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str6, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        java.lang.String str16 = errorResponse15.component2();
        java.lang.Object obj17 = null;
        boolean boolean18 = errorResponse15.equals(obj17);
        boolean boolean19 = errorResponse12.equals(obj17);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) (byte) 100);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (short) 1, "");
        int int17 = errorResponse11.getStatus();
        int int18 = errorResponse11.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "ErrorResponse(status=97, message=hi!)");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        int int9 = errorResponse8.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse8.copy((int) (byte) 0, "ErrorResponse(status=100, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse15.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler19 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean20 = errorResponse15.equals((java.lang.Object) globalExceptionHandler19);
        int int21 = errorResponse15.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse15.copy((int) 'a', "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse27 = errorResponse15.copy((int) (short) 10, "ErrorResponse(status=-1, message=)");
        java.lang.String str28 = errorResponse27.toString();
        org.pin.backend.exception.ErrorResponse errorResponse31 = errorResponse27.copy((int) (byte) -1, "ErrorResponse(status=97, message=hi!)");
        java.lang.Object obj32 = null;
        boolean boolean33 = errorResponse31.equals(obj32);
        java.lang.String str34 = errorResponse31.component2();
        boolean boolean35 = errorResponse12.equals((java.lang.Object) str34);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertNotNull(errorResponse27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))" + "'", str28, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        org.junit.Assert.assertNotNull(errorResponse31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str34, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((-1), "ErrorResponse(status=10, message=ErrorResponse(status=10, message=ErrorResponse(status=-1, message=)))");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 100, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler9 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) globalExceptionHandler9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse5.copy((int) (short) 100, "hi!");
        boolean boolean14 = errorResponse2.equals((java.lang.Object) errorResponse13);
        int int15 = errorResponse13.component1();
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        int int8 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) 'a', "hi!");
        int int12 = errorResponse2.getStatus();
        java.lang.String str13 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse16 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse19 = errorResponse16.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler20 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean21 = errorResponse16.equals((java.lang.Object) globalExceptionHandler20);
        int int22 = errorResponse16.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse25 = errorResponse16.copy((int) 'a', "hi!");
        boolean boolean27 = errorResponse25.equals((java.lang.Object) (byte) 100);
        boolean boolean28 = errorResponse2.equals((java.lang.Object) boolean27);
        org.pin.backend.exception.ErrorResponse errorResponse31 = errorResponse2.copy((int) (short) 100, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=))");
        java.lang.String str32 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(errorResponse19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(errorResponse25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(errorResponse31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str32, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "hi!");
        java.lang.String str3 = errorResponse2.component2();
        java.lang.String str4 = errorResponse2.toString();
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression7 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray12 = lZ4Compression7.decompress(byteArray11);
        byte[] byteArray13 = lZ4Compression6.decompress(byteArray12);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray20 = lZ4Compression6.compress(byteArray19);
        boolean boolean21 = lZ4Compression5.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression22 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray28 = lZ4Compression23.decompress(byteArray27);
        byte[] byteArray29 = lZ4Compression22.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        byte[] byteArray37 = lZ4Compression30.decompress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray43 = lZ4Compression38.decompress(byteArray42);
        boolean boolean44 = lZ4Compression30.isCompressed(byteArray42);
        boolean boolean45 = lZ4Compression22.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray53 = lZ4Compression48.decompress(byteArray52);
        byte[] byteArray54 = lZ4Compression47.decompress(byteArray53);
        byte[] byteArray55 = lZ4Compression46.decompress(byteArray54);
        boolean boolean56 = lZ4Compression22.isCompressed(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray63 = lZ4Compression58.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression57.decompress(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray69 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray70 = lZ4Compression65.decompress(byteArray69);
        boolean boolean71 = lZ4Compression57.isCompressed(byteArray69);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression73 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray77 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray78 = lZ4Compression73.decompress(byteArray77);
        byte[] byteArray79 = lZ4Compression72.decompress(byteArray78);
        byte[] byteArray80 = lZ4Compression57.decompress(byteArray78);
        boolean boolean81 = lZ4Compression22.isCompressed(byteArray80);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray87 = lZ4Compression82.decompress(byteArray86);
        byte[] byteArray88 = lZ4Compression22.compress(byteArray87);
        byte[] byteArray89 = lZ4Compression5.decompress(byteArray87);
        boolean boolean90 = errorResponse2.equals((java.lang.Object) lZ4Compression5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str4, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(lZ4Compression7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lZ4Compression22);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(lZ4Compression73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = lZ4Compression1.decompress(byteArray5);
        byte[] byteArray7 = lZ4Compression0.decompress(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray13 = lZ4Compression8.decompress(byteArray12);
        byte[] byteArray14 = lZ4Compression0.compress(byteArray13);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray21 = lZ4Compression16.decompress(byteArray20);
        byte[] byteArray22 = lZ4Compression15.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray28 = lZ4Compression23.decompress(byteArray27);
        boolean boolean29 = lZ4Compression15.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray36 = lZ4Compression31.decompress(byteArray35);
        byte[] byteArray37 = lZ4Compression30.decompress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray44 = lZ4Compression39.decompress(byteArray43);
        byte[] byteArray45 = lZ4Compression38.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray51 = lZ4Compression46.decompress(byteArray50);
        boolean boolean52 = lZ4Compression38.isCompressed(byteArray50);
        boolean boolean53 = lZ4Compression30.isCompressed(byteArray50);
        byte[] byteArray54 = lZ4Compression15.decompress(byteArray50);
        byte[] byteArray55 = lZ4Compression0.decompress(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray62 = lZ4Compression57.decompress(byteArray61);
        byte[] byteArray63 = lZ4Compression56.decompress(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.exception.ErrorResponse errorResponse67 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse70 = errorResponse67.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler71 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean72 = errorResponse67.equals((java.lang.Object) globalExceptionHandler71);
        int int73 = errorResponse67.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse76 = errorResponse67.copy((int) 'a', "hi!");
        int int77 = errorResponse76.getStatus();
        int int78 = errorResponse76.getStatus();
        org.pin.backend.utils.LZ4Compression lZ4Compression79 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray85 = lZ4Compression80.decompress(byteArray84);
        byte[] byteArray86 = lZ4Compression79.decompress(byteArray85);
        byte[] byteArray92 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray93 = lZ4Compression79.compress(byteArray92);
        boolean boolean94 = errorResponse76.equals((java.lang.Object) byteArray93);
        boolean boolean95 = lZ4Compression64.isCompressed(byteArray93);
        byte[] byteArray96 = lZ4Compression56.compress(byteArray93);
        boolean boolean97 = lZ4Compression0.isCompressed(byteArray93);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(errorResponse70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(errorResponse76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(lZ4Compression79);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 14, (byte) -32, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler6 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean7 = errorResponse2.equals((java.lang.Object) globalExceptionHandler6);
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse2.copy((int) (byte) 10, "hi!");
        java.lang.String str11 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse14.copy((int) (short) -1, "");
        org.pin.backend.exception.GlobalExceptionHandler globalExceptionHandler18 = new org.pin.backend.exception.GlobalExceptionHandler();
        boolean boolean19 = errorResponse14.equals((java.lang.Object) globalExceptionHandler18);
        int int20 = errorResponse14.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse23 = errorResponse14.copy((int) 'a', "hi!");
        boolean boolean25 = errorResponse23.equals((java.lang.Object) (byte) 100);
        java.lang.String str26 = errorResponse23.toString();
        org.pin.backend.exception.ErrorResponse errorResponse29 = errorResponse23.copy((-1), "ErrorResponse(status=35, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse32 = errorResponse29.copy((int) (byte) 10, "");
        boolean boolean33 = errorResponse2.equals((java.lang.Object) "");
        java.lang.String str34 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str11, "ErrorResponse(status=-1, message=)");
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(errorResponse23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ErrorResponse(status=97, message=hi!)" + "'", str26, "ErrorResponse(status=97, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse29);
        org.junit.Assert.assertNotNull(errorResponse32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ErrorResponse(status=-1, message=)" + "'", str34, "ErrorResponse(status=-1, message=)");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (short) -1, "");
        org.pin.backend.service.FileStorageService fileStorageService7 = new org.pin.backend.service.FileStorageService("hi!");
        boolean boolean8 = errorResponse5.equals((java.lang.Object) fileStorageService7);
        java.lang.String str9 = errorResponse5.component2();
        java.lang.String str10 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.pin.backend.service.FileStorageService fileStorageService1 = new org.pin.backend.service.FileStorageService("ErrorResponse(status=32, message=ErrorResponse(status=97, message=hi!))");
        org.springframework.web.multipart.MultipartFile multipartFile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fileStorageService1.save(multipartFile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.service.FileStorageService.save, parameter file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

