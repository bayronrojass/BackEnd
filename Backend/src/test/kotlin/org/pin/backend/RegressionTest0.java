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
        org.pin.backend.BackendApplication backendApplication0 = new org.pin.backend.BackendApplication();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        java.lang.Class<?> wildcardClass5 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 1, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        byte[] byteArray42 = lZ4Compression24.decompress(byteArray39);
        byte[] byteArray43 = lZ4Compression12.decompress(byteArray42);
        boolean boolean44 = lZ4Compression0.isCompressed(byteArray43);
        java.lang.Class<?> wildcardClass45 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        java.lang.Class<?> wildcardClass1 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.Class<?> wildcardClass8 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "");
        boolean boolean6 = errorResponse2.equals((java.lang.Object) "");
        int int7 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        java.lang.String str9 = errorResponse5.toString();
        java.lang.Class<?> wildcardClass10 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        java.lang.Class<?> wildcardClass11 = errorResponse8.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        java.lang.Class<?> wildcardClass7 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.component1();
        java.lang.Class<?> wildcardClass4 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray29 = lZ4Compression0.compress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression42.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean52 = lZ4Compression48.isCompressed(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean58 = lZ4Compression53.isCompressed(byteArray57);
        byte[] byteArray59 = lZ4Compression48.decompress(byteArray57);
        byte[] byteArray60 = lZ4Compression42.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression61.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression73 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean77 = lZ4Compression73.isCompressed(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean83 = lZ4Compression78.isCompressed(byteArray82);
        byte[] byteArray84 = lZ4Compression73.decompress(byteArray82);
        byte[] byteArray85 = lZ4Compression67.decompress(byteArray82);
        byte[] byteArray86 = lZ4Compression61.decompress(byteArray82);
        byte[] byteArray89 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray90 = lZ4Compression61.compress(byteArray89);
        boolean boolean91 = lZ4Compression42.isCompressed(byteArray90);
        byte[] byteArray92 = lZ4Compression30.compress(byteArray90);
        byte[] byteArray93 = lZ4Compression0.decompress(byteArray92);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(lZ4Compression73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        java.lang.Class<?> wildcardClass6 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((-1), "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.Class<?> wildcardClass9 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        byte[] byteArray30 = lZ4Compression19.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression49.isCompressed(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression54.isCompressed(byteArray58);
        byte[] byteArray60 = lZ4Compression49.decompress(byteArray58);
        byte[] byteArray61 = lZ4Compression43.decompress(byteArray58);
        boolean boolean62 = lZ4Compression31.isCompressed(byteArray58);
        boolean boolean63 = lZ4Compression19.isCompressed(byteArray58);
        byte[] byteArray64 = lZ4Compression0.compress(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean70 = lZ4Compression65.isCompressed(byteArray69);
        org.pin.backend.utils.LZ4Compression lZ4Compression71 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean76 = lZ4Compression71.isCompressed(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean81 = lZ4Compression77.isCompressed(byteArray80);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression82.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression77.decompress(byteArray86);
        byte[] byteArray89 = lZ4Compression71.decompress(byteArray86);
        byte[] byteArray90 = lZ4Compression65.decompress(byteArray86);
        byte[] byteArray91 = lZ4Compression0.compress(byteArray90);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(lZ4Compression71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int12 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression39.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        byte[] byteArray50 = lZ4Compression39.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression57.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression62.isCompressed(byteArray66);
        byte[] byteArray68 = lZ4Compression57.decompress(byteArray66);
        byte[] byteArray69 = lZ4Compression51.decompress(byteArray66);
        byte[] byteArray70 = lZ4Compression39.decompress(byteArray69);
        byte[] byteArray71 = lZ4Compression0.compress(byteArray70);
        byte[] byteArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = lZ4Compression0.isCompressed(byteArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.isCompressed, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        boolean boolean13 = errorResponse11.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        java.lang.String str82 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse10.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse10.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.toString();
        java.lang.String str18 = errorResponse16.component2();
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse16.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse21.copy((int) (byte) 1, "hi!");
        boolean boolean25 = errorResponse7.equals((java.lang.Object) errorResponse24);
        java.lang.String str26 = errorResponse7.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str17, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str18, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str26, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str12 = errorResponse11.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str12, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray29 = lZ4Compression0.compress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression30.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression36.isCompressed(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = lZ4Compression41.isCompressed(byteArray45);
        byte[] byteArray47 = lZ4Compression36.decompress(byteArray45);
        byte[] byteArray48 = lZ4Compression30.decompress(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression55.isCompressed(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean65 = lZ4Compression61.isCompressed(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression66 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = lZ4Compression66.isCompressed(byteArray70);
        byte[] byteArray72 = lZ4Compression61.decompress(byteArray70);
        byte[] byteArray73 = lZ4Compression55.decompress(byteArray70);
        byte[] byteArray74 = lZ4Compression49.decompress(byteArray70);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray78 = lZ4Compression49.compress(byteArray77);
        boolean boolean79 = lZ4Compression30.isCompressed(byteArray78);
        boolean boolean80 = lZ4Compression0.isCompressed(byteArray78);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(lZ4Compression66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean50 = lZ4Compression45.isCompressed(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression57.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression62.isCompressed(byteArray66);
        byte[] byteArray68 = lZ4Compression57.decompress(byteArray66);
        byte[] byteArray69 = lZ4Compression51.decompress(byteArray66);
        byte[] byteArray70 = lZ4Compression45.decompress(byteArray66);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray74 = lZ4Compression45.compress(byteArray73);
        boolean boolean75 = lZ4Compression19.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression0.compress(byteArray74);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean81 = lZ4Compression77.isCompressed(byteArray80);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression82.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression77.decompress(byteArray86);
        boolean boolean89 = lZ4Compression0.isCompressed(byteArray86);
        byte[] byteArray92 = new byte[] { (byte) 10, (byte) 1 };
        boolean boolean93 = lZ4Compression0.isCompressed(byteArray92);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str3, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str8 = errorResponse2.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.String str9 = errorResponse5.component2();
        int int10 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass6 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(1, "");
        org.junit.Assert.assertNotNull(errorResponse5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "");
        boolean boolean6 = errorResponse2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass7 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 100, "ErrorResponse(status=10, message=hi!)");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        byte[] byteArray45 = lZ4Compression0.decompress(byteArray40);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray52 = lZ4Compression0.compress(byteArray51);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray56 = lZ4Compression0.decompress(byteArray55);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        java.lang.Class<?> wildcardClass9 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) 1, "hi!");
        int int17 = errorResponse13.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        int int8 = errorResponse5.component1();
        java.lang.String str9 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        java.lang.Class<?> wildcardClass82 = byteArray78.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        org.pin.backend.exception.ErrorResponse errorResponse9 = new org.pin.backend.exception.ErrorResponse(10, "");
        boolean boolean10 = errorResponse5.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass11 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression32.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        byte[] byteArray43 = lZ4Compression32.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        byte[] byteArray74 = lZ4Compression56.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression44.decompress(byteArray74);
        boolean boolean76 = lZ4Compression32.isCompressed(byteArray75);
        byte[] byteArray77 = lZ4Compression0.compress(byteArray75);
        java.lang.Class<?> wildcardClass78 = byteArray75.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        java.lang.Class<?> wildcardClass82 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.component1();
        java.lang.String str8 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.component2();
        java.lang.String str18 = errorResponse16.toString();
        int int19 = errorResponse16.component1();
        boolean boolean20 = errorResponse5.equals((java.lang.Object) errorResponse16);
        org.pin.backend.exception.ErrorResponse errorResponse23 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse26 = errorResponse23.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str27 = errorResponse26.component2();
        java.lang.String str28 = errorResponse26.toString();
        java.lang.String str29 = errorResponse26.toString();
        boolean boolean30 = errorResponse16.equals((java.lang.Object) str29);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str17, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str18, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorResponse26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str27, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str28, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str29, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        int int10 = errorResponse2.component1();
        int int11 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.Class<?> wildcardClass9 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        java.lang.Class<?> wildcardClass5 = errorResponse2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        int int10 = errorResponse2.component1();
        java.lang.String str11 = errorResponse2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str11, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.toString();
        java.lang.String str8 = errorResponse2.component2();
        java.lang.String str9 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        java.lang.String str10 = errorResponse2.component2();
        int int11 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        boolean boolean31 = lZ4Compression0.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression32.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        byte[] byteArray43 = lZ4Compression32.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression50.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression55.isCompressed(byteArray59);
        byte[] byteArray61 = lZ4Compression50.decompress(byteArray59);
        byte[] byteArray62 = lZ4Compression44.decompress(byteArray59);
        boolean boolean63 = lZ4Compression32.isCompressed(byteArray59);
        byte[] byteArray64 = lZ4Compression0.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean70 = lZ4Compression65.isCompressed(byteArray69);
        byte[] byteArray71 = lZ4Compression0.decompress(byteArray69);
        java.lang.Class<?> wildcardClass72 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.String str9 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))" + "'", str6, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression38.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        byte[] byteArray56 = lZ4Compression38.decompress(byteArray53);
        byte[] byteArray57 = lZ4Compression32.decompress(byteArray53);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray61 = lZ4Compression32.compress(byteArray60);
        byte[] byteArray62 = lZ4Compression0.decompress(byteArray60);
        java.lang.Class<?> wildcardClass63 = byteArray60.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression26.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        byte[] byteArray37 = lZ4Compression26.decompress(byteArray35);
        boolean boolean38 = lZ4Compression0.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression39.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        byte[] byteArray50 = lZ4Compression39.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression57.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression62.isCompressed(byteArray66);
        byte[] byteArray68 = lZ4Compression57.decompress(byteArray66);
        byte[] byteArray69 = lZ4Compression51.decompress(byteArray66);
        byte[] byteArray70 = lZ4Compression39.decompress(byteArray69);
        boolean boolean71 = lZ4Compression0.isCompressed(byteArray69);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        int int14 = errorResponse13.component1();
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse13.copy((int) (byte) 10, "ErrorResponse(status=32, message=)");
        java.lang.String str18 = errorResponse13.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=0, message=)" + "'", str18, "ErrorResponse(status=0, message=)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        int int7 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.component1();
        java.lang.String str4 = errorResponse2.toString();
        int int5 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str4, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        byte[] byteArray42 = lZ4Compression24.decompress(byteArray39);
        boolean boolean43 = lZ4Compression12.isCompressed(byteArray39);
        boolean boolean44 = lZ4Compression0.isCompressed(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression45.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression50.isCompressed(byteArray54);
        byte[] byteArray56 = lZ4Compression45.decompress(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression57.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression62.isCompressed(byteArray66);
        byte[] byteArray68 = lZ4Compression57.decompress(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression69 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean74 = lZ4Compression69.isCompressed(byteArray73);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean79 = lZ4Compression75.isCompressed(byteArray78);
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean85 = lZ4Compression80.isCompressed(byteArray84);
        byte[] byteArray86 = lZ4Compression75.decompress(byteArray84);
        byte[] byteArray87 = lZ4Compression69.decompress(byteArray84);
        boolean boolean88 = lZ4Compression57.isCompressed(byteArray84);
        boolean boolean89 = lZ4Compression45.isCompressed(byteArray84);
        byte[] byteArray90 = lZ4Compression0.compress(byteArray84);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        java.lang.String str4 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=10, message=hi!)" + "'", str4, "ErrorResponse(status=10, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression32.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        byte[] byteArray43 = lZ4Compression32.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        byte[] byteArray74 = lZ4Compression56.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression44.decompress(byteArray74);
        boolean boolean76 = lZ4Compression32.isCompressed(byteArray75);
        byte[] byteArray77 = lZ4Compression0.compress(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean82 = lZ4Compression78.isCompressed(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression83 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean88 = lZ4Compression83.isCompressed(byteArray87);
        byte[] byteArray89 = lZ4Compression78.decompress(byteArray87);
        byte[] byteArray90 = lZ4Compression0.compress(byteArray87);
        byte[] byteArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray92 = lZ4Compression0.compress(byteArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(lZ4Compression83);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "");
        boolean boolean6 = errorResponse2.equals((java.lang.Object) "");
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse2.copy(100, "ErrorResponse(status=10, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorResponse9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        boolean boolean7 = errorResponse5.equals((java.lang.Object) 10L);
        int int8 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        byte[] byteArray42 = lZ4Compression24.decompress(byteArray39);
        byte[] byteArray43 = lZ4Compression12.decompress(byteArray42);
        byte[] byteArray44 = lZ4Compression6.decompress(byteArray43);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression45.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression50.isCompressed(byteArray54);
        byte[] byteArray56 = lZ4Compression45.decompress(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = lZ4Compression57.isCompressed(byteArray61);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression63.isCompressed(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean73 = lZ4Compression68.isCompressed(byteArray72);
        byte[] byteArray74 = lZ4Compression63.decompress(byteArray72);
        byte[] byteArray75 = lZ4Compression57.decompress(byteArray72);
        byte[] byteArray76 = lZ4Compression45.decompress(byteArray75);
        byte[] byteArray77 = lZ4Compression6.compress(byteArray76);
        boolean boolean78 = errorResponse5.equals((java.lang.Object) lZ4Compression6);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        java.lang.String str6 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy((int) (short) 1, "hi!");
        java.lang.String str13 = errorResponse12.component2();
        boolean boolean15 = errorResponse12.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        java.lang.String str5 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression1.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        byte[] byteArray12 = lZ4Compression1.decompress(byteArray10);
        boolean boolean13 = lZ4Compression0.isCompressed(byteArray12);
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = lZ4Compression0.isCompressed(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.isCompressed, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        byte[] byteArray45 = lZ4Compression0.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean50 = lZ4Compression46.isCompressed(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        byte[] byteArray57 = lZ4Compression46.decompress(byteArray55);
        byte[] byteArray58 = lZ4Compression0.decompress(byteArray55);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        java.lang.Object obj4 = null;
        boolean boolean5 = errorResponse2.equals(obj4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        int int6 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.component2();
        java.lang.String str18 = errorResponse16.toString();
        int int19 = errorResponse16.component1();
        boolean boolean20 = errorResponse5.equals((java.lang.Object) errorResponse16);
        java.lang.Class<?> wildcardClass21 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str17, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str18, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.utils.LZ4Compression lZ4Compression4 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean9 = lZ4Compression4.isCompressed(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean15 = lZ4Compression10.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression16.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean26 = lZ4Compression21.isCompressed(byteArray25);
        byte[] byteArray27 = lZ4Compression16.decompress(byteArray25);
        byte[] byteArray28 = lZ4Compression10.decompress(byteArray25);
        byte[] byteArray29 = lZ4Compression4.decompress(byteArray25);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        boolean boolean42 = lZ4Compression4.isCompressed(byteArray39);
        boolean boolean43 = errorResponse2.equals((java.lang.Object) lZ4Compression4);
        java.lang.Class<?> wildcardClass44 = errorResponse2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(lZ4Compression4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.component2();
        java.lang.String str18 = errorResponse16.toString();
        int int19 = errorResponse16.component1();
        boolean boolean20 = errorResponse5.equals((java.lang.Object) errorResponse16);
        java.lang.String str21 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str17, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str18, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str21, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse2.toString();
        java.lang.String str7 = errorResponse2.component2();
        int int8 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        java.lang.String str14 = errorResponse13.toString();
        boolean boolean15 = errorResponse5.equals((java.lang.Object) errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str14, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 100, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        java.lang.Class<?> wildcardClass6 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean15 = lZ4Compression11.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = lZ4Compression16.isCompressed(byteArray20);
        byte[] byteArray22 = lZ4Compression11.decompress(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean33 = lZ4Compression29.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression34.isCompressed(byteArray38);
        byte[] byteArray40 = lZ4Compression29.decompress(byteArray38);
        byte[] byteArray41 = lZ4Compression23.decompress(byteArray38);
        byte[] byteArray42 = lZ4Compression11.decompress(byteArray41);
        byte[] byteArray43 = lZ4Compression5.decompress(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        byte[] byteArray74 = lZ4Compression56.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression44.decompress(byteArray74);
        byte[] byteArray76 = lZ4Compression5.compress(byteArray75);
        boolean boolean77 = lZ4Compression0.isCompressed(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean83 = lZ4Compression78.isCompressed(byteArray82);
        byte[] byteArray84 = lZ4Compression0.decompress(byteArray82);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) 1, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse19 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse22 = errorResponse19.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str23 = errorResponse19.toString();
        int int24 = errorResponse19.component1();
        boolean boolean25 = errorResponse13.equals((java.lang.Object) int24);
        java.lang.Class<?> wildcardClass26 = errorResponse13.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertNotNull(errorResponse22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str23, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int13 = errorResponse12.getStatus();
        int int14 = errorResponse12.component1();
        boolean boolean15 = errorResponse2.equals((java.lang.Object) errorResponse12);
        java.lang.Class<?> wildcardClass16 = errorResponse12.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse2.copy((int) '#', "ErrorResponse(status=10, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int13 = errorResponse12.getStatus();
        java.lang.String str14 = errorResponse12.component2();
        java.lang.String str15 = errorResponse12.component2();
        org.pin.backend.exception.ErrorResponse errorResponse18 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse18.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str22 = errorResponse18.toString();
        boolean boolean23 = errorResponse12.equals((java.lang.Object) errorResponse18);
        boolean boolean24 = errorResponse2.equals((java.lang.Object) errorResponse18);
        java.lang.Class<?> wildcardClass25 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(errorResponse9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str22, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        int int4 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        int int3 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 100, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(errorResponse6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        byte[] byteArray30 = lZ4Compression19.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression49.isCompressed(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression54.isCompressed(byteArray58);
        byte[] byteArray60 = lZ4Compression49.decompress(byteArray58);
        byte[] byteArray61 = lZ4Compression43.decompress(byteArray58);
        boolean boolean62 = lZ4Compression31.isCompressed(byteArray58);
        boolean boolean63 = lZ4Compression19.isCompressed(byteArray58);
        byte[] byteArray64 = lZ4Compression0.compress(byteArray58);
        java.lang.Class<?> wildcardClass65 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray42 = lZ4Compression0.compress(byteArray41);
        byte[] byteArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray44 = lZ4Compression0.compress(byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 0, (byte) -1 });
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy((int) (short) 1, "hi!");
        java.lang.String str13 = errorResponse12.component2();
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse12.copy((int) (byte) -1, "ErrorResponse(status=10, message=hi!)");
        java.lang.String str17 = errorResponse12.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=1, message=hi!)" + "'", str17, "ErrorResponse(status=1, message=hi!)");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.toString();
        int int8 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        java.lang.String str7 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression38.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        byte[] byteArray56 = lZ4Compression38.decompress(byteArray53);
        byte[] byteArray57 = lZ4Compression32.decompress(byteArray53);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray61 = lZ4Compression32.compress(byteArray60);
        byte[] byteArray62 = lZ4Compression0.decompress(byteArray60);
        java.lang.Class<?> wildcardClass63 = byteArray62.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.component1();
        java.lang.String str7 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str3 = errorResponse2.component2();
        java.lang.String str4 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str3, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str4, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        int int3 = errorResponse2.component1();
        java.lang.String str4 = errorResponse2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))" + "'", str4, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) -1, "ErrorResponse(status=32, message=)");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse2.toString();
        java.lang.String str7 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int11 = errorResponse10.getStatus();
        java.lang.String str12 = errorResponse10.component2();
        java.lang.String str13 = errorResponse10.component2();
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse10.copy(10, "hi!");
        boolean boolean17 = errorResponse2.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str3 = errorResponse2.toString();
        java.lang.String str4 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str3, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str4, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        int int5 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str3, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        java.lang.String str6 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        byte[] byteArray55 = lZ4Compression37.decompress(byteArray52);
        byte[] byteArray56 = lZ4Compression31.decompress(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray60 = lZ4Compression31.compress(byteArray59);
        boolean boolean61 = lZ4Compression12.isCompressed(byteArray60);
        byte[] byteArray62 = lZ4Compression0.compress(byteArray60);
        java.lang.Class<?> wildcardClass63 = byteArray62.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        boolean boolean5 = errorResponse2.equals((java.lang.Object) 100);
        java.lang.String str6 = errorResponse2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray42 = lZ4Compression0.compress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression55.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = lZ4Compression60.isCompressed(byteArray64);
        byte[] byteArray66 = lZ4Compression55.decompress(byteArray64);
        byte[] byteArray67 = lZ4Compression49.decompress(byteArray64);
        byte[] byteArray68 = lZ4Compression43.decompress(byteArray64);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray72 = lZ4Compression43.compress(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression73 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean77 = lZ4Compression73.isCompressed(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean83 = lZ4Compression78.isCompressed(byteArray82);
        byte[] byteArray84 = lZ4Compression73.decompress(byteArray82);
        byte[] byteArray85 = lZ4Compression43.compress(byteArray82);
        byte[] byteArray86 = lZ4Compression0.decompress(byteArray82);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '#', "hi!");
        int int3 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        int int9 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.toString();
        int int7 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=0, message=ErrorResponse(status=100, message=hi!))" + "'", str6, "ErrorResponse(status=0, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=52, message=)" + "'", str3, "ErrorResponse(status=52, message=)");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        byte[] byteArray45 = lZ4Compression0.decompress(byteArray40);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray52 = lZ4Compression0.compress(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean58 = lZ4Compression53.isCompressed(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression53.decompress(byteArray74);
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray82 = lZ4Compression53.compress(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression83 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression83.isCompressed(byteArray86);
        org.pin.backend.utils.LZ4Compression lZ4Compression88 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray92 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean93 = lZ4Compression88.isCompressed(byteArray92);
        byte[] byteArray94 = lZ4Compression83.decompress(byteArray92);
        byte[] byteArray95 = lZ4Compression53.compress(byteArray92);
        boolean boolean96 = lZ4Compression0.isCompressed(byteArray95);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression83);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(lZ4Compression88);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression38.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        byte[] byteArray49 = lZ4Compression38.decompress(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression50.isCompressed(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression56.isCompressed(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression61.isCompressed(byteArray65);
        byte[] byteArray67 = lZ4Compression56.decompress(byteArray65);
        byte[] byteArray68 = lZ4Compression50.decompress(byteArray65);
        byte[] byteArray69 = lZ4Compression38.decompress(byteArray68);
        byte[] byteArray70 = lZ4Compression32.decompress(byteArray69);
        byte[] byteArray71 = lZ4Compression0.compress(byteArray70);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean76 = lZ4Compression72.isCompressed(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean82 = lZ4Compression77.isCompressed(byteArray81);
        byte[] byteArray83 = lZ4Compression72.decompress(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression84 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean88 = lZ4Compression84.isCompressed(byteArray87);
        byte[] byteArray89 = lZ4Compression72.compress(byteArray87);
        byte[] byteArray90 = lZ4Compression0.decompress(byteArray89);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression84);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.toString();
        int int9 = errorResponse5.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse5.copy(0, "hi!");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))" + "'", str3, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.component1();
        java.lang.String str7 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean44 = lZ4Compression39.isCompressed(byteArray43);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean50 = lZ4Compression45.isCompressed(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression51.isCompressed(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        byte[] byteArray62 = lZ4Compression51.decompress(byteArray60);
        byte[] byteArray63 = lZ4Compression45.decompress(byteArray60);
        byte[] byteArray64 = lZ4Compression39.decompress(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        boolean boolean77 = lZ4Compression39.isCompressed(byteArray74);
        boolean boolean78 = lZ4Compression0.isCompressed(byteArray74);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        java.lang.String str6 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        int int3 = errorResponse2.getStatus();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "");
        boolean boolean6 = errorResponse2.equals((java.lang.Object) "");
        int int7 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str12 = errorResponse11.toString();
        java.lang.String str13 = errorResponse11.toString();
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse11.copy((int) (byte) 100, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str12, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str13, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertNotNull(errorResponse16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str6 = errorResponse2.toString();
        int int7 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=10, message=)" + "'", str6, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 0, "ErrorResponse(status=10, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse2.copy(100, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        int int10 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertNotNull(errorResponse9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        int int7 = errorResponse2.getStatus();
        int int8 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        java.lang.String str4 = errorResponse2.component2();
        int int5 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.String str8 = errorResponse5.toString();
        int int9 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "");
        java.lang.Class<?> wildcardClass7 = errorResponse2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression1.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        byte[] byteArray12 = lZ4Compression1.decompress(byteArray10);
        boolean boolean13 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression14 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean19 = lZ4Compression15.isCompressed(byteArray18);
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression20.isCompressed(byteArray24);
        byte[] byteArray26 = lZ4Compression15.decompress(byteArray24);
        boolean boolean27 = lZ4Compression14.isCompressed(byteArray26);
        boolean boolean28 = lZ4Compression0.isCompressed(byteArray26);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        byte[] byteArray47 = lZ4Compression29.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean58 = lZ4Compression54.isCompressed(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        byte[] byteArray65 = lZ4Compression54.decompress(byteArray63);
        byte[] byteArray66 = lZ4Compression48.decompress(byteArray63);
        byte[] byteArray67 = lZ4Compression29.decompress(byteArray63);
        byte[] byteArray68 = lZ4Compression0.compress(byteArray63);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lZ4Compression14);
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) ' ', "ErrorResponse(status=10, message=)");
        int int6 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        java.lang.String str10 = errorResponse2.component2();
        int int11 = errorResponse2.component1();
        boolean boolean13 = errorResponse2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) 'a', "ErrorResponse(status=0, message=)");
        java.lang.String str3 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=97, message=ErrorResponse(status=0, message=))" + "'", str3, "ErrorResponse(status=97, message=ErrorResponse(status=0, message=))");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        byte[] byteArray42 = lZ4Compression24.decompress(byteArray39);
        boolean boolean43 = lZ4Compression12.isCompressed(byteArray39);
        boolean boolean44 = lZ4Compression0.isCompressed(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean50 = lZ4Compression45.isCompressed(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression52.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = lZ4Compression57.isCompressed(byteArray61);
        byte[] byteArray63 = lZ4Compression52.decompress(byteArray61);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean68 = lZ4Compression64.isCompressed(byteArray67);
        byte[] byteArray69 = lZ4Compression52.compress(byteArray67);
        byte[] byteArray70 = lZ4Compression51.decompress(byteArray67);
        byte[] byteArray71 = lZ4Compression45.compress(byteArray67);
        boolean boolean72 = lZ4Compression0.isCompressed(byteArray71);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression38.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        byte[] byteArray49 = lZ4Compression38.decompress(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression50.isCompressed(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression56.isCompressed(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression61.isCompressed(byteArray65);
        byte[] byteArray67 = lZ4Compression56.decompress(byteArray65);
        byte[] byteArray68 = lZ4Compression50.decompress(byteArray65);
        byte[] byteArray69 = lZ4Compression38.decompress(byteArray68);
        byte[] byteArray70 = lZ4Compression32.decompress(byteArray69);
        byte[] byteArray71 = lZ4Compression0.compress(byteArray70);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean76 = lZ4Compression72.isCompressed(byteArray75);
        boolean boolean77 = lZ4Compression0.isCompressed(byteArray75);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = lZ4Compression0.decompress(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.decompress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        java.lang.String str11 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str11, "ErrorResponse(status=100, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        byte[] byteArray30 = lZ4Compression19.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        byte[] byteArray55 = lZ4Compression37.decompress(byteArray52);
        byte[] byteArray56 = lZ4Compression31.decompress(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray60 = lZ4Compression31.compress(byteArray59);
        byte[] byteArray61 = lZ4Compression19.compress(byteArray59);
        byte[] byteArray62 = lZ4Compression0.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression63.isCompressed(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean73 = lZ4Compression68.isCompressed(byteArray72);
        byte[] byteArray74 = lZ4Compression63.decompress(byteArray72);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean80 = lZ4Compression75.isCompressed(byteArray79);
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean85 = lZ4Compression81.isCompressed(byteArray84);
        org.pin.backend.utils.LZ4Compression lZ4Compression86 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray90 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean91 = lZ4Compression86.isCompressed(byteArray90);
        byte[] byteArray92 = lZ4Compression81.decompress(byteArray90);
        byte[] byteArray93 = lZ4Compression75.decompress(byteArray90);
        byte[] byteArray94 = lZ4Compression63.decompress(byteArray93);
        byte[] byteArray95 = lZ4Compression0.compress(byteArray94);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(lZ4Compression86);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 0, "ErrorResponse(status=10, message=)");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression1 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression1.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        byte[] byteArray12 = lZ4Compression1.decompress(byteArray10);
        boolean boolean13 = lZ4Compression0.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression14 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = lZ4Compression14.isCompressed(byteArray18);
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression33.isCompressed(byteArray36);
        byte[] byteArray38 = lZ4Compression21.compress(byteArray36);
        byte[] byteArray39 = lZ4Compression20.decompress(byteArray36);
        byte[] byteArray40 = lZ4Compression14.compress(byteArray36);
        boolean boolean41 = lZ4Compression0.isCompressed(byteArray36);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(lZ4Compression1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lZ4Compression14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression55.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = lZ4Compression60.isCompressed(byteArray64);
        byte[] byteArray66 = lZ4Compression55.decompress(byteArray64);
        byte[] byteArray67 = lZ4Compression49.decompress(byteArray64);
        byte[] byteArray68 = lZ4Compression43.decompress(byteArray64);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray72 = lZ4Compression43.compress(byteArray71);
        byte[] byteArray73 = lZ4Compression31.compress(byteArray71);
        byte[] byteArray74 = lZ4Compression12.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression0.decompress(byteArray71);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) ' ', "ErrorResponse(status=10, message=)");
        int int6 = errorResponse2.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int13 = errorResponse12.getStatus();
        int int14 = errorResponse12.component1();
        boolean boolean15 = errorResponse2.equals((java.lang.Object) errorResponse12);
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse2.copy((int) (byte) 100, "");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorResponse18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "");
        int int7 = errorResponse2.getStatus();
        java.lang.String str8 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.toString();
        java.lang.String str8 = errorResponse2.toString();
        java.lang.String str9 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        java.lang.String str5 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str3, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        int int82 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "ErrorResponse(status=52, message=)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(1, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        int int6 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        byte[] byteArray55 = lZ4Compression37.decompress(byteArray52);
        byte[] byteArray56 = lZ4Compression31.decompress(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray60 = lZ4Compression31.compress(byteArray59);
        boolean boolean61 = lZ4Compression12.isCompressed(byteArray60);
        byte[] byteArray62 = lZ4Compression0.compress(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression63.isCompressed(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean73 = lZ4Compression68.isCompressed(byteArray72);
        byte[] byteArray74 = lZ4Compression63.decompress(byteArray72);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean80 = lZ4Compression75.isCompressed(byteArray79);
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean85 = lZ4Compression81.isCompressed(byteArray84);
        org.pin.backend.utils.LZ4Compression lZ4Compression86 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray90 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean91 = lZ4Compression86.isCompressed(byteArray90);
        byte[] byteArray92 = lZ4Compression81.decompress(byteArray90);
        byte[] byteArray93 = lZ4Compression75.decompress(byteArray90);
        byte[] byteArray94 = lZ4Compression63.decompress(byteArray93);
        byte[] byteArray95 = lZ4Compression0.decompress(byteArray93);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(lZ4Compression86);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int12 = errorResponse11.getStatus();
        int int13 = errorResponse11.component1();
        boolean boolean14 = errorResponse8.equals((java.lang.Object) int13);
        java.lang.String str15 = errorResponse8.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str15, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray42 = lZ4Compression0.compress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression49.isCompressed(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression54.isCompressed(byteArray58);
        byte[] byteArray60 = lZ4Compression49.decompress(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression61 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression61.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean71 = lZ4Compression67.isCompressed(byteArray70);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean77 = lZ4Compression72.isCompressed(byteArray76);
        byte[] byteArray78 = lZ4Compression67.decompress(byteArray76);
        byte[] byteArray79 = lZ4Compression61.decompress(byteArray76);
        byte[] byteArray80 = lZ4Compression49.decompress(byteArray79);
        byte[] byteArray81 = lZ4Compression43.decompress(byteArray80);
        byte[] byteArray84 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray85 = lZ4Compression43.compress(byteArray84);
        boolean boolean86 = lZ4Compression0.isCompressed(byteArray85);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "ErrorResponse(status=10, message=hi!)");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=hi!)" + "'", str3, "ErrorResponse(status=10, message=hi!)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression7 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression7.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        byte[] byteArray18 = lZ4Compression7.decompress(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        byte[] byteArray24 = lZ4Compression7.compress(byteArray22);
        byte[] byteArray25 = lZ4Compression6.decompress(byteArray22);
        byte[] byteArray26 = lZ4Compression0.compress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean32 = lZ4Compression27.isCompressed(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean38 = lZ4Compression33.isCompressed(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression39.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        byte[] byteArray50 = lZ4Compression39.decompress(byteArray48);
        byte[] byteArray51 = lZ4Compression33.decompress(byteArray48);
        byte[] byteArray52 = lZ4Compression27.decompress(byteArray48);
        byte[] byteArray53 = lZ4Compression0.decompress(byteArray48);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(lZ4Compression7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 0, "ErrorResponse(status=10, message=hi!)");
        int int7 = errorResponse6.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int11 = errorResponse10.component1();
        boolean boolean12 = errorResponse6.equals((java.lang.Object) errorResponse10);
        int int13 = errorResponse6.component1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse5.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str12 = errorResponse11.toString();
        int int13 = errorResponse11.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str12, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        byte[] byteArray30 = lZ4Compression19.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        byte[] byteArray55 = lZ4Compression37.decompress(byteArray52);
        byte[] byteArray56 = lZ4Compression31.decompress(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray60 = lZ4Compression31.compress(byteArray59);
        byte[] byteArray61 = lZ4Compression19.compress(byteArray59);
        byte[] byteArray62 = lZ4Compression0.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression63.isCompressed(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean73 = lZ4Compression68.isCompressed(byteArray72);
        byte[] byteArray74 = lZ4Compression63.decompress(byteArray72);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean80 = lZ4Compression75.isCompressed(byteArray79);
        org.pin.backend.utils.LZ4Compression lZ4Compression81 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean85 = lZ4Compression81.isCompressed(byteArray84);
        org.pin.backend.utils.LZ4Compression lZ4Compression86 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray90 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean91 = lZ4Compression86.isCompressed(byteArray90);
        byte[] byteArray92 = lZ4Compression81.decompress(byteArray90);
        byte[] byteArray93 = lZ4Compression75.decompress(byteArray90);
        byte[] byteArray94 = lZ4Compression63.decompress(byteArray93);
        byte[] byteArray95 = lZ4Compression0.decompress(byteArray94);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(lZ4Compression81);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(lZ4Compression86);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse7.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse7.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str14 = errorResponse13.toString();
        java.lang.String str15 = errorResponse13.component2();
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse13.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse13.copy((int) (byte) 10, "hi!");
        boolean boolean22 = errorResponse2.equals((java.lang.Object) errorResponse13);
        java.lang.Class<?> wildcardClass23 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str14, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str15, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.utils.LZ4Compression lZ4Compression4 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean9 = lZ4Compression4.isCompressed(byteArray8);
        org.pin.backend.utils.LZ4Compression lZ4Compression10 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean15 = lZ4Compression10.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression16.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean26 = lZ4Compression21.isCompressed(byteArray25);
        byte[] byteArray27 = lZ4Compression16.decompress(byteArray25);
        byte[] byteArray28 = lZ4Compression10.decompress(byteArray25);
        byte[] byteArray29 = lZ4Compression4.decompress(byteArray25);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression30.isCompressed(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression35.isCompressed(byteArray39);
        byte[] byteArray41 = lZ4Compression30.decompress(byteArray39);
        boolean boolean42 = lZ4Compression4.isCompressed(byteArray39);
        boolean boolean43 = errorResponse2.equals((java.lang.Object) lZ4Compression4);
        org.pin.backend.exception.ErrorResponse errorResponse46 = errorResponse2.copy((int) ' ', "ErrorResponse(status=0, message=)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(lZ4Compression4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lZ4Compression10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(errorResponse46);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        int int10 = errorResponse2.getStatus();
        java.lang.String str11 = errorResponse2.toString();
        int int12 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str11, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 0, "ErrorResponse(status=10, message=hi!)");
        java.lang.Object obj7 = null;
        boolean boolean8 = errorResponse2.equals(obj7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy((int) (short) 1, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse2.copy(10, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertNotNull(errorResponse15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse10.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse10.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.toString();
        java.lang.String str18 = errorResponse16.component2();
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse16.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse21.copy((int) (byte) 1, "hi!");
        boolean boolean25 = errorResponse7.equals((java.lang.Object) errorResponse24);
        int int26 = errorResponse24.component1();
        java.lang.Class<?> wildcardClass27 = errorResponse24.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str17, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str18, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=)" + "'", str3, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse10 = errorResponse5.copy(0, "ErrorResponse(status=0, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str14 = errorResponse13.toString();
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean26 = lZ4Compression21.isCompressed(byteArray25);
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression27.isCompressed(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        byte[] byteArray38 = lZ4Compression27.decompress(byteArray36);
        byte[] byteArray39 = lZ4Compression21.decompress(byteArray36);
        byte[] byteArray40 = lZ4Compression15.decompress(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression41.isCompressed(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression46.isCompressed(byteArray50);
        byte[] byteArray52 = lZ4Compression41.decompress(byteArray50);
        boolean boolean53 = lZ4Compression15.isCompressed(byteArray50);
        boolean boolean54 = errorResponse13.equals((java.lang.Object) lZ4Compression15);
        java.lang.String str55 = errorResponse13.toString();
        boolean boolean56 = errorResponse10.equals((java.lang.Object) str55);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(errorResponse10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str14, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str55, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (short) 0, "ErrorResponse(status=10, message=hi!)");
        java.lang.String str7 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=10, message=hi!)" + "'", str7, "ErrorResponse(status=10, message=hi!)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        int int10 = errorResponse2.getStatus();
        java.lang.String str11 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str18 = errorResponse14.toString();
        org.pin.backend.exception.ErrorResponse errorResponse21 = errorResponse14.copy((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        java.lang.Class<?> wildcardClass22 = errorResponse21.getClass();
        boolean boolean23 = errorResponse2.equals((java.lang.Object) errorResponse21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str11, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str18, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str8 = errorResponse2.toString();
        java.lang.Class<?> wildcardClass9 = errorResponse2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.String str8 = errorResponse5.toString();
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse11.copy((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse14.copy(35, "ErrorResponse(status=100, message=hi!)");
        boolean boolean18 = errorResponse5.equals((java.lang.Object) 35);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        java.lang.String str10 = errorResponse2.component2();
        int int11 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse2.copy((int) '4', "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(errorResponse14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "");
        int int7 = errorResponse2.component1();
        java.lang.String str8 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        org.pin.backend.exception.ErrorResponse errorResponse84 = errorResponse2.copy(10, "hi!");
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(errorResponse84);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.Class<?> wildcardClass10 = errorResponse8.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((-1), "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        byte[] byteArray30 = lZ4Compression19.decompress(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        byte[] byteArray55 = lZ4Compression37.decompress(byteArray52);
        byte[] byteArray56 = lZ4Compression31.decompress(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray60 = lZ4Compression31.compress(byteArray59);
        byte[] byteArray61 = lZ4Compression19.compress(byteArray59);
        byte[] byteArray62 = lZ4Compression0.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean68 = lZ4Compression63.isCompressed(byteArray67);
        byte[] byteArray69 = lZ4Compression0.decompress(byteArray67);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        byte[] byteArray31 = lZ4Compression0.decompress(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression32.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        byte[] byteArray43 = lZ4Compression32.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression44.isCompressed(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression49 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression49.isCompressed(byteArray53);
        byte[] byteArray55 = lZ4Compression44.decompress(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        byte[] byteArray74 = lZ4Compression56.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression44.decompress(byteArray74);
        boolean boolean76 = lZ4Compression32.isCompressed(byteArray75);
        byte[] byteArray77 = lZ4Compression0.compress(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean82 = lZ4Compression78.isCompressed(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression83 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean88 = lZ4Compression83.isCompressed(byteArray87);
        byte[] byteArray89 = lZ4Compression78.decompress(byteArray87);
        byte[] byteArray90 = lZ4Compression0.compress(byteArray87);
        java.lang.Class<?> wildcardClass91 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lZ4Compression49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(lZ4Compression83);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        boolean boolean7 = errorResponse5.equals((java.lang.Object) 10L);
        int int8 = errorResponse5.getStatus();
        int int9 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse2.getStatus();
        java.lang.String str10 = errorResponse2.component2();
        int int11 = errorResponse2.component1();
        int int12 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse8.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str12 = errorResponse8.toString();
        boolean boolean13 = errorResponse2.equals((java.lang.Object) errorResponse8);
        java.lang.String str14 = errorResponse8.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str12, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.component1();
        java.lang.String str4 = errorResponse2.toString();
        int int5 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str4, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        java.lang.String str9 = errorResponse2.toString();
        int int10 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "");
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse2.copy(0, "");
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse12.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        boolean boolean17 = errorResponse15.equals((java.lang.Object) 10L);
        int int18 = errorResponse15.getStatus();
        java.lang.Class<?> wildcardClass19 = errorResponse15.getClass();
        boolean boolean20 = errorResponse9.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertNotNull(errorResponse9);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 1, "ErrorResponse(status=0, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int6 = errorResponse5.getStatus();
        java.lang.String str7 = errorResponse5.component2();
        int int8 = errorResponse5.getStatus();
        boolean boolean9 = errorResponse2.equals((java.lang.Object) int8);
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy(10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str13 = errorResponse12.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str13, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 10, "");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((-1), "hi!");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int13 = errorResponse12.getStatus();
        int int14 = errorResponse12.component1();
        boolean boolean15 = errorResponse2.equals((java.lang.Object) errorResponse12);
        java.lang.String str16 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str16, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 100, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.component2();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean15 = lZ4Compression11.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = lZ4Compression16.isCompressed(byteArray20);
        byte[] byteArray22 = lZ4Compression11.decompress(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean33 = lZ4Compression29.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression34.isCompressed(byteArray38);
        byte[] byteArray40 = lZ4Compression29.decompress(byteArray38);
        byte[] byteArray41 = lZ4Compression23.decompress(byteArray38);
        byte[] byteArray42 = lZ4Compression11.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean47 = lZ4Compression43.isCompressed(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = lZ4Compression48.isCompressed(byteArray52);
        byte[] byteArray54 = lZ4Compression43.decompress(byteArray52);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression55.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = lZ4Compression60.isCompressed(byteArray64);
        byte[] byteArray66 = lZ4Compression55.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression73 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean77 = lZ4Compression73.isCompressed(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean83 = lZ4Compression78.isCompressed(byteArray82);
        byte[] byteArray84 = lZ4Compression73.decompress(byteArray82);
        byte[] byteArray85 = lZ4Compression67.decompress(byteArray82);
        byte[] byteArray86 = lZ4Compression55.decompress(byteArray85);
        boolean boolean87 = lZ4Compression43.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression11.compress(byteArray86);
        boolean boolean89 = errorResponse10.equals((java.lang.Object) byteArray86);
        boolean boolean90 = errorResponse5.equals((java.lang.Object) byteArray86);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(lZ4Compression73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        java.lang.String str7 = errorResponse5.toString();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (short) 100, "ErrorResponse(status=32, message=)");
        java.lang.String str11 = errorResponse10.toString();
        boolean boolean12 = errorResponse5.equals((java.lang.Object) str11);
        int int13 = errorResponse5.component1();
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse5.copy(35, "ErrorResponse(status=100, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        int int17 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))" + "'", str11, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(35, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) -1, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression38.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        byte[] byteArray49 = lZ4Compression38.decompress(byteArray47);
        byte[] byteArray50 = lZ4Compression32.decompress(byteArray47);
        byte[] byteArray51 = lZ4Compression26.decompress(byteArray47);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray55 = lZ4Compression26.compress(byteArray54);
        boolean boolean56 = lZ4Compression0.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = lZ4Compression57.isCompressed(byteArray61);
        byte[] byteArray63 = lZ4Compression0.decompress(byteArray61);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean68 = lZ4Compression64.isCompressed(byteArray67);
        byte[] byteArray69 = lZ4Compression0.compress(byteArray67);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse9 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse9.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        boolean boolean13 = errorResponse2.equals((java.lang.Object) errorResponse12);
        boolean boolean15 = errorResponse2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str5, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        int int8 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse5.component1();
        java.lang.String str7 = errorResponse5.toString();
        org.pin.backend.exception.ErrorResponse errorResponse10 = new org.pin.backend.exception.ErrorResponse((int) (short) 100, "ErrorResponse(status=32, message=)");
        java.lang.String str11 = errorResponse10.toString();
        boolean boolean12 = errorResponse5.equals((java.lang.Object) str11);
        int int13 = errorResponse5.component1();
        java.lang.Class<?> wildcardClass14 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))" + "'", str11, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(32, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str3 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "");
        int int7 = errorResponse2.getStatus();
        boolean boolean9 = errorResponse2.equals((java.lang.Object) "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str3, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "ErrorResponse(status=0, message=ErrorResponse(status=100, message=hi!))");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.component1();
        int int4 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression26.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        byte[] byteArray37 = lZ4Compression26.decompress(byteArray35);
        boolean boolean38 = lZ4Compression0.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression41.isCompressed(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression46 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression46.isCompressed(byteArray50);
        byte[] byteArray52 = lZ4Compression41.decompress(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression53.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression41.compress(byteArray56);
        byte[] byteArray59 = lZ4Compression40.decompress(byteArray56);
        byte[] byteArray60 = lZ4Compression39.compress(byteArray56);
        byte[] byteArray61 = lZ4Compression0.compress(byteArray56);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lZ4Compression46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray48 = lZ4Compression19.compress(byteArray47);
        boolean boolean49 = lZ4Compression0.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression50.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression55.isCompressed(byteArray59);
        byte[] byteArray61 = lZ4Compression50.decompress(byteArray59);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        org.pin.backend.utils.LZ4Compression lZ4Compression74 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean79 = lZ4Compression74.isCompressed(byteArray78);
        org.pin.backend.utils.LZ4Compression lZ4Compression80 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean84 = lZ4Compression80.isCompressed(byteArray83);
        org.pin.backend.utils.LZ4Compression lZ4Compression85 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray89 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean90 = lZ4Compression85.isCompressed(byteArray89);
        byte[] byteArray91 = lZ4Compression80.decompress(byteArray89);
        byte[] byteArray92 = lZ4Compression74.decompress(byteArray89);
        byte[] byteArray93 = lZ4Compression62.decompress(byteArray92);
        boolean boolean94 = lZ4Compression50.isCompressed(byteArray93);
        boolean boolean95 = lZ4Compression0.isCompressed(byteArray93);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(lZ4Compression80);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(lZ4Compression85);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        int int14 = errorResponse13.component1();
        int int15 = errorResponse13.getStatus();
        int int16 = errorResponse13.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int6 = errorResponse2.component1();
        java.lang.String str7 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy(10, "hi!");
        int int9 = errorResponse8.component1();
        int int10 = errorResponse8.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        byte[] byteArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray40 = lZ4Compression0.compress(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.compress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        java.lang.String str7 = errorResponse2.component2();
        int int8 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression32.isCompressed(byteArray35);
        org.pin.backend.utils.LZ4Compression lZ4Compression37 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression37.isCompressed(byteArray41);
        byte[] byteArray43 = lZ4Compression32.decompress(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean54 = lZ4Compression50.isCompressed(byteArray53);
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = lZ4Compression55.isCompressed(byteArray59);
        byte[] byteArray61 = lZ4Compression50.decompress(byteArray59);
        byte[] byteArray62 = lZ4Compression44.decompress(byteArray59);
        byte[] byteArray63 = lZ4Compression32.decompress(byteArray62);
        byte[] byteArray64 = lZ4Compression26.decompress(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean82 = lZ4Compression77.isCompressed(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression83 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression83.isCompressed(byteArray86);
        org.pin.backend.utils.LZ4Compression lZ4Compression88 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray92 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean93 = lZ4Compression88.isCompressed(byteArray92);
        byte[] byteArray94 = lZ4Compression83.decompress(byteArray92);
        byte[] byteArray95 = lZ4Compression77.decompress(byteArray92);
        byte[] byteArray96 = lZ4Compression65.decompress(byteArray95);
        byte[] byteArray97 = lZ4Compression26.compress(byteArray96);
        byte[] byteArray98 = lZ4Compression0.decompress(byteArray97);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(lZ4Compression37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(lZ4Compression83);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(lZ4Compression88);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertArrayEquals(byteArray97, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray98);
        org.junit.Assert.assertArrayEquals(byteArray98, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        int int4 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 1, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(errorResponse7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (short) 100, "ErrorResponse(status=100, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression18.isCompressed(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression23 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression23.isCompressed(byteArray27);
        byte[] byteArray29 = lZ4Compression18.decompress(byteArray27);
        byte[] byteArray30 = lZ4Compression12.decompress(byteArray27);
        boolean boolean31 = lZ4Compression0.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression38.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        byte[] byteArray49 = lZ4Compression38.decompress(byteArray47);
        byte[] byteArray50 = lZ4Compression32.decompress(byteArray47);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = lZ4Compression57.isCompressed(byteArray61);
        org.pin.backend.utils.LZ4Compression lZ4Compression63 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression63.isCompressed(byteArray66);
        org.pin.backend.utils.LZ4Compression lZ4Compression68 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean73 = lZ4Compression68.isCompressed(byteArray72);
        byte[] byteArray74 = lZ4Compression63.decompress(byteArray72);
        byte[] byteArray75 = lZ4Compression57.decompress(byteArray72);
        byte[] byteArray76 = lZ4Compression51.decompress(byteArray72);
        byte[] byteArray77 = lZ4Compression32.decompress(byteArray72);
        byte[] byteArray78 = lZ4Compression0.decompress(byteArray77);
        java.lang.Class<?> wildcardClass79 = lZ4Compression0.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lZ4Compression23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(lZ4Compression63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lZ4Compression68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((-1), "ErrorResponse(status=97, message=ErrorResponse(status=0, message=))");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str8 = errorResponse2.toString();
        int int9 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean19 = lZ4Compression15.isCompressed(byteArray18);
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression20.isCompressed(byteArray24);
        byte[] byteArray26 = lZ4Compression15.decompress(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean32 = lZ4Compression27.isCompressed(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression33.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression38.isCompressed(byteArray42);
        byte[] byteArray44 = lZ4Compression33.decompress(byteArray42);
        byte[] byteArray45 = lZ4Compression27.decompress(byteArray42);
        byte[] byteArray46 = lZ4Compression15.decompress(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean63 = lZ4Compression59.isCompressed(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression64.isCompressed(byteArray68);
        byte[] byteArray70 = lZ4Compression59.decompress(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression71 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean76 = lZ4Compression71.isCompressed(byteArray75);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean81 = lZ4Compression77.isCompressed(byteArray80);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression82.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression77.decompress(byteArray86);
        byte[] byteArray89 = lZ4Compression71.decompress(byteArray86);
        byte[] byteArray90 = lZ4Compression59.decompress(byteArray89);
        boolean boolean91 = lZ4Compression47.isCompressed(byteArray90);
        byte[] byteArray92 = lZ4Compression15.compress(byteArray90);
        boolean boolean93 = errorResponse14.equals((java.lang.Object) byteArray90);
        boolean boolean94 = lZ4Compression0.isCompressed(byteArray90);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(32, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str8 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse2.copy((int) (short) 100, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        int int12 = errorResponse11.component1();
        org.pin.backend.exception.ErrorResponse errorResponse15 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression16.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean26 = lZ4Compression21.isCompressed(byteArray25);
        byte[] byteArray27 = lZ4Compression16.decompress(byteArray25);
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean33 = lZ4Compression28.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean38 = lZ4Compression34.isCompressed(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean44 = lZ4Compression39.isCompressed(byteArray43);
        byte[] byteArray45 = lZ4Compression34.decompress(byteArray43);
        byte[] byteArray46 = lZ4Compression28.decompress(byteArray43);
        byte[] byteArray47 = lZ4Compression16.decompress(byteArray46);
        org.pin.backend.utils.LZ4Compression lZ4Compression48 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean52 = lZ4Compression48.isCompressed(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean58 = lZ4Compression53.isCompressed(byteArray57);
        byte[] byteArray59 = lZ4Compression48.decompress(byteArray57);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression60.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean70 = lZ4Compression65.isCompressed(byteArray69);
        byte[] byteArray71 = lZ4Compression60.decompress(byteArray69);
        org.pin.backend.utils.LZ4Compression lZ4Compression72 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean77 = lZ4Compression72.isCompressed(byteArray76);
        org.pin.backend.utils.LZ4Compression lZ4Compression78 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean82 = lZ4Compression78.isCompressed(byteArray81);
        org.pin.backend.utils.LZ4Compression lZ4Compression83 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean88 = lZ4Compression83.isCompressed(byteArray87);
        byte[] byteArray89 = lZ4Compression78.decompress(byteArray87);
        byte[] byteArray90 = lZ4Compression72.decompress(byteArray87);
        byte[] byteArray91 = lZ4Compression60.decompress(byteArray90);
        boolean boolean92 = lZ4Compression48.isCompressed(byteArray91);
        byte[] byteArray93 = lZ4Compression16.compress(byteArray91);
        boolean boolean94 = errorResponse15.equals((java.lang.Object) byteArray91);
        boolean boolean95 = errorResponse11.equals((java.lang.Object) boolean94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(lZ4Compression78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(lZ4Compression83);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse5.copy(35, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse14 = errorResponse11.copy((int) ' ', "ErrorResponse(status=10, message=)");
        boolean boolean15 = errorResponse5.equals((java.lang.Object) errorResponse14);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertNotNull(errorResponse14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=32, message=)");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
        int int6 = errorResponse5.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression18 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression18.isCompressed(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        byte[] byteArray36 = lZ4Compression18.decompress(byteArray33);
        byte[] byteArray37 = lZ4Compression6.decompress(byteArray36);
        byte[] byteArray38 = lZ4Compression0.decompress(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean43 = lZ4Compression39.isCompressed(byteArray42);
        org.pin.backend.utils.LZ4Compression lZ4Compression44 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean49 = lZ4Compression44.isCompressed(byteArray48);
        byte[] byteArray50 = lZ4Compression39.decompress(byteArray48);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression51.isCompressed(byteArray54);
        byte[] byteArray56 = lZ4Compression39.compress(byteArray54);
        byte[] byteArray57 = lZ4Compression0.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean63 = lZ4Compression58.isCompressed(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression64.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean74 = lZ4Compression70.isCompressed(byteArray73);
        org.pin.backend.utils.LZ4Compression lZ4Compression75 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean80 = lZ4Compression75.isCompressed(byteArray79);
        byte[] byteArray81 = lZ4Compression70.decompress(byteArray79);
        byte[] byteArray82 = lZ4Compression64.decompress(byteArray79);
        byte[] byteArray83 = lZ4Compression58.decompress(byteArray79);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray87 = lZ4Compression58.compress(byteArray86);
        byte[] byteArray88 = lZ4Compression0.compress(byteArray86);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(lZ4Compression44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lZ4Compression75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression7 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression7.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = lZ4Compression12.isCompressed(byteArray16);
        byte[] byteArray18 = lZ4Compression7.decompress(byteArray16);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean23 = lZ4Compression19.isCompressed(byteArray22);
        byte[] byteArray24 = lZ4Compression7.compress(byteArray22);
        byte[] byteArray25 = lZ4Compression6.decompress(byteArray22);
        byte[] byteArray26 = lZ4Compression0.compress(byteArray22);
        org.pin.backend.utils.LZ4Compression lZ4Compression27 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean32 = lZ4Compression28.isCompressed(byteArray31);
        org.pin.backend.utils.LZ4Compression lZ4Compression33 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean38 = lZ4Compression33.isCompressed(byteArray37);
        byte[] byteArray39 = lZ4Compression28.decompress(byteArray37);
        boolean boolean40 = lZ4Compression27.isCompressed(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean46 = lZ4Compression42.isCompressed(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean52 = lZ4Compression47.isCompressed(byteArray51);
        byte[] byteArray53 = lZ4Compression42.decompress(byteArray51);
        boolean boolean54 = lZ4Compression41.isCompressed(byteArray53);
        boolean boolean55 = lZ4Compression27.isCompressed(byteArray53);
        byte[] byteArray56 = lZ4Compression0.decompress(byteArray53);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(lZ4Compression7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression27);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(lZ4Compression33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        int int3 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression45 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean50 = lZ4Compression45.isCompressed(byteArray49);
        org.pin.backend.utils.LZ4Compression lZ4Compression51 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean56 = lZ4Compression51.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression57.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean67 = lZ4Compression62.isCompressed(byteArray66);
        byte[] byteArray68 = lZ4Compression57.decompress(byteArray66);
        byte[] byteArray69 = lZ4Compression51.decompress(byteArray66);
        byte[] byteArray70 = lZ4Compression45.decompress(byteArray66);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray74 = lZ4Compression45.compress(byteArray73);
        boolean boolean75 = lZ4Compression19.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression0.compress(byteArray74);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean81 = lZ4Compression77.isCompressed(byteArray80);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean87 = lZ4Compression82.isCompressed(byteArray86);
        byte[] byteArray88 = lZ4Compression77.decompress(byteArray86);
        boolean boolean89 = lZ4Compression0.isCompressed(byteArray86);
        byte[] byteArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray91 = lZ4Compression0.decompress(byteArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter specified as non-null is null: method org.pin.backend.utils.LZ4Compression.decompress, parameter data");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(lZ4Compression51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        java.lang.String str14 = errorResponse8.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str14, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "ErrorResponse(status=32, message=)");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str3, "ErrorResponse(status=32, message=)");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (short) 10, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) 0, "hi!");
        java.lang.String str3 = errorResponse2.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        int int3 = errorResponse2.component1();
        java.lang.String str4 = errorResponse2.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str4, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "hi!");
        int int6 = errorResponse2.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = lZ4Compression6.isCompressed(byteArray10);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        byte[] byteArray24 = lZ4Compression6.decompress(byteArray21);
        byte[] byteArray25 = lZ4Compression0.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        org.pin.backend.utils.LZ4Compression lZ4Compression32 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = lZ4Compression32.isCompressed(byteArray36);
        org.pin.backend.utils.LZ4Compression lZ4Compression38 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean42 = lZ4Compression38.isCompressed(byteArray41);
        org.pin.backend.utils.LZ4Compression lZ4Compression43 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = lZ4Compression43.isCompressed(byteArray47);
        byte[] byteArray49 = lZ4Compression38.decompress(byteArray47);
        byte[] byteArray50 = lZ4Compression32.decompress(byteArray47);
        byte[] byteArray51 = lZ4Compression26.decompress(byteArray47);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray55 = lZ4Compression26.compress(byteArray54);
        boolean boolean56 = lZ4Compression0.isCompressed(byteArray55);
        org.pin.backend.utils.LZ4Compression lZ4Compression57 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = lZ4Compression57.isCompressed(byteArray61);
        byte[] byteArray63 = lZ4Compression0.decompress(byteArray61);
        java.lang.Class<?> wildcardClass64 = byteArray63.getClass();
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lZ4Compression32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(lZ4Compression38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(lZ4Compression43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(lZ4Compression57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 0, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int9 = errorResponse8.getStatus();
        java.lang.String str10 = errorResponse8.component2();
        int int11 = errorResponse8.getStatus();
        boolean boolean12 = errorResponse2.equals((java.lang.Object) int11);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.component2();
        int int8 = errorResponse5.getStatus();
        java.lang.String str9 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '4', "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean8 = lZ4Compression3.isCompressed(byteArray7);
        org.pin.backend.utils.LZ4Compression lZ4Compression9 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression9.isCompressed(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression14 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = lZ4Compression14.isCompressed(byteArray18);
        byte[] byteArray20 = lZ4Compression9.decompress(byteArray18);
        byte[] byteArray21 = lZ4Compression3.decompress(byteArray18);
        org.pin.backend.utils.LZ4Compression lZ4Compression22 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = lZ4Compression22.isCompressed(byteArray26);
        org.pin.backend.utils.LZ4Compression lZ4Compression28 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean33 = lZ4Compression28.isCompressed(byteArray32);
        org.pin.backend.utils.LZ4Compression lZ4Compression34 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean38 = lZ4Compression34.isCompressed(byteArray37);
        org.pin.backend.utils.LZ4Compression lZ4Compression39 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean44 = lZ4Compression39.isCompressed(byteArray43);
        byte[] byteArray45 = lZ4Compression34.decompress(byteArray43);
        byte[] byteArray46 = lZ4Compression28.decompress(byteArray43);
        byte[] byteArray47 = lZ4Compression22.decompress(byteArray43);
        byte[] byteArray48 = lZ4Compression3.decompress(byteArray43);
        boolean boolean49 = errorResponse2.equals((java.lang.Object) byteArray48);
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lZ4Compression9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lZ4Compression14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(lZ4Compression28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lZ4Compression34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lZ4Compression39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.String str9 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        java.lang.String str3 = errorResponse2.toString();
        java.lang.String str4 = errorResponse2.toString();
        int int5 = errorResponse2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str3, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str4, "ErrorResponse(status=10, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        int int7 = errorResponse5.getStatus();
        java.lang.String str8 = errorResponse5.toString();
        java.lang.String str9 = errorResponse5.component2();
        int int10 = errorResponse5.getStatus();
        int int11 = errorResponse5.getStatus();
        int int12 = errorResponse5.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int3 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) ' ', "ErrorResponse(status=10, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse8.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str12 = errorResponse8.toString();
        int int13 = errorResponse8.component1();
        java.lang.String str14 = errorResponse8.toString();
        boolean boolean15 = errorResponse2.equals((java.lang.Object) errorResponse8);
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse8.copy(10, "ErrorResponse(status=10, message=)");
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str12, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str14, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorResponse18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse12 = errorResponse2.copy((int) (short) 1, "hi!");
        int int13 = errorResponse12.component1();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str9, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        int int4 = errorResponse2.component1();
        int int5 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean15 = lZ4Compression11.isCompressed(byteArray14);
        org.pin.backend.utils.LZ4Compression lZ4Compression16 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = lZ4Compression16.isCompressed(byteArray20);
        byte[] byteArray22 = lZ4Compression11.decompress(byteArray20);
        byte[] byteArray23 = lZ4Compression5.decompress(byteArray20);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean29 = lZ4Compression24.isCompressed(byteArray28);
        org.pin.backend.utils.LZ4Compression lZ4Compression30 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression30.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean40 = lZ4Compression36.isCompressed(byteArray39);
        org.pin.backend.utils.LZ4Compression lZ4Compression41 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = lZ4Compression41.isCompressed(byteArray45);
        byte[] byteArray47 = lZ4Compression36.decompress(byteArray45);
        byte[] byteArray48 = lZ4Compression30.decompress(byteArray45);
        byte[] byteArray49 = lZ4Compression24.decompress(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression50 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean55 = lZ4Compression50.isCompressed(byteArray54);
        org.pin.backend.utils.LZ4Compression lZ4Compression56 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean61 = lZ4Compression56.isCompressed(byteArray60);
        org.pin.backend.utils.LZ4Compression lZ4Compression62 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean66 = lZ4Compression62.isCompressed(byteArray65);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = lZ4Compression67.isCompressed(byteArray71);
        byte[] byteArray73 = lZ4Compression62.decompress(byteArray71);
        byte[] byteArray74 = lZ4Compression56.decompress(byteArray71);
        byte[] byteArray75 = lZ4Compression50.decompress(byteArray71);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray79 = lZ4Compression50.compress(byteArray78);
        boolean boolean80 = lZ4Compression24.isCompressed(byteArray79);
        byte[] byteArray81 = lZ4Compression5.compress(byteArray79);
        org.pin.backend.utils.LZ4Compression lZ4Compression82 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray85 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean86 = lZ4Compression82.isCompressed(byteArray85);
        org.pin.backend.utils.LZ4Compression lZ4Compression87 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray91 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean92 = lZ4Compression87.isCompressed(byteArray91);
        byte[] byteArray93 = lZ4Compression82.decompress(byteArray91);
        boolean boolean94 = lZ4Compression5.isCompressed(byteArray91);
        byte[] byteArray95 = lZ4Compression0.decompress(byteArray91);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lZ4Compression16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lZ4Compression30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(lZ4Compression41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(lZ4Compression56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(lZ4Compression62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression82);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(lZ4Compression87);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = lZ4Compression0.isCompressed(byteArray4);
        org.pin.backend.utils.LZ4Compression lZ4Compression6 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression6.isCompressed(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression11 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression11.isCompressed(byteArray15);
        byte[] byteArray17 = lZ4Compression6.decompress(byteArray15);
        byte[] byteArray18 = lZ4Compression0.decompress(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression19 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = lZ4Compression19.isCompressed(byteArray23);
        org.pin.backend.utils.LZ4Compression lZ4Compression25 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression25.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean35 = lZ4Compression31.isCompressed(byteArray34);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        byte[] byteArray42 = lZ4Compression31.decompress(byteArray40);
        byte[] byteArray43 = lZ4Compression25.decompress(byteArray40);
        byte[] byteArray44 = lZ4Compression19.decompress(byteArray40);
        byte[] byteArray45 = lZ4Compression0.decompress(byteArray40);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray52 = lZ4Compression0.compress(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression53 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression54 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression55 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean59 = lZ4Compression55.isCompressed(byteArray58);
        org.pin.backend.utils.LZ4Compression lZ4Compression60 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = lZ4Compression60.isCompressed(byteArray64);
        byte[] byteArray66 = lZ4Compression55.decompress(byteArray64);
        org.pin.backend.utils.LZ4Compression lZ4Compression67 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean71 = lZ4Compression67.isCompressed(byteArray70);
        byte[] byteArray72 = lZ4Compression55.compress(byteArray70);
        byte[] byteArray73 = lZ4Compression54.decompress(byteArray70);
        byte[] byteArray74 = lZ4Compression53.compress(byteArray70);
        byte[] byteArray75 = lZ4Compression0.compress(byteArray74);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lZ4Compression6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lZ4Compression11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lZ4Compression25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 80, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(lZ4Compression53);
        org.junit.Assert.assertNotNull(lZ4Compression54);
        org.junit.Assert.assertNotNull(lZ4Compression55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(lZ4Compression60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) -80, (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy(32, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean12 = lZ4Compression8.isCompressed(byteArray11);
        org.pin.backend.utils.LZ4Compression lZ4Compression13 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = lZ4Compression13.isCompressed(byteArray17);
        byte[] byteArray19 = lZ4Compression8.decompress(byteArray17);
        org.pin.backend.utils.LZ4Compression lZ4Compression20 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression20.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean30 = lZ4Compression26.isCompressed(byteArray29);
        org.pin.backend.utils.LZ4Compression lZ4Compression31 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean36 = lZ4Compression31.isCompressed(byteArray35);
        byte[] byteArray37 = lZ4Compression26.decompress(byteArray35);
        byte[] byteArray38 = lZ4Compression20.decompress(byteArray35);
        boolean boolean39 = lZ4Compression8.isCompressed(byteArray35);
        boolean boolean40 = errorResponse2.equals((java.lang.Object) lZ4Compression8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str3, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lZ4Compression13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lZ4Compression31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) '#', "hi!");
        java.lang.Class<?> wildcardClass3 = errorResponse2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        org.pin.backend.exception.ErrorResponse errorResponse13 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse13.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str17 = errorResponse16.component2();
        java.lang.String str18 = errorResponse16.toString();
        int int19 = errorResponse16.component1();
        boolean boolean20 = errorResponse5.equals((java.lang.Object) errorResponse16);
        org.pin.backend.exception.ErrorResponse errorResponse23 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str24 = errorResponse23.component2();
        org.pin.backend.exception.ErrorResponse errorResponse27 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse30 = errorResponse27.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str31 = errorResponse30.component2();
        java.lang.String str32 = errorResponse30.component2();
        boolean boolean33 = errorResponse23.equals((java.lang.Object) errorResponse30);
        org.pin.backend.exception.ErrorResponse errorResponse36 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        boolean boolean37 = errorResponse23.equals((java.lang.Object) "hi!");
        int int38 = errorResponse23.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse41 = errorResponse23.copy((int) (short) 1, "ErrorResponse(status=1, message=hi!)");
        boolean boolean42 = errorResponse5.equals((java.lang.Object) errorResponse23);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str17, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str18, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(errorResponse30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str31, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str32, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(errorResponse41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (short) -1, "ErrorResponse(status=97, message=ErrorResponse(status=0, message=))");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int3 = errorResponse2.getStatus();
        java.lang.String str4 = errorResponse2.component2();
        java.lang.String str5 = errorResponse2.component2();
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse11 = errorResponse8.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str12 = errorResponse8.toString();
        boolean boolean13 = errorResponse2.equals((java.lang.Object) errorResponse8);
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse2.copy((-1), "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        int int17 = errorResponse16.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(errorResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str12, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.component2();
        java.lang.String str8 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str7, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.pin.backend.utils.LZ4Compression lZ4Compression0 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean4 = lZ4Compression0.isCompressed(byteArray3);
        org.pin.backend.utils.LZ4Compression lZ4Compression5 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean10 = lZ4Compression5.isCompressed(byteArray9);
        byte[] byteArray11 = lZ4Compression0.decompress(byteArray9);
        org.pin.backend.utils.LZ4Compression lZ4Compression12 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean16 = lZ4Compression12.isCompressed(byteArray15);
        org.pin.backend.utils.LZ4Compression lZ4Compression17 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = lZ4Compression17.isCompressed(byteArray21);
        byte[] byteArray23 = lZ4Compression12.decompress(byteArray21);
        org.pin.backend.utils.LZ4Compression lZ4Compression24 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean28 = lZ4Compression24.isCompressed(byteArray27);
        org.pin.backend.utils.LZ4Compression lZ4Compression29 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = lZ4Compression29.isCompressed(byteArray33);
        byte[] byteArray35 = lZ4Compression24.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression36 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = lZ4Compression36.isCompressed(byteArray40);
        org.pin.backend.utils.LZ4Compression lZ4Compression42 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean46 = lZ4Compression42.isCompressed(byteArray45);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean52 = lZ4Compression47.isCompressed(byteArray51);
        byte[] byteArray53 = lZ4Compression42.decompress(byteArray51);
        byte[] byteArray54 = lZ4Compression36.decompress(byteArray51);
        boolean boolean55 = lZ4Compression24.isCompressed(byteArray51);
        boolean boolean56 = lZ4Compression12.isCompressed(byteArray51);
        boolean boolean57 = lZ4Compression0.isCompressed(byteArray51);
        org.pin.backend.utils.LZ4Compression lZ4Compression58 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean63 = lZ4Compression58.isCompressed(byteArray62);
        org.pin.backend.utils.LZ4Compression lZ4Compression64 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        org.pin.backend.utils.LZ4Compression lZ4Compression77 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean81 = lZ4Compression77.isCompressed(byteArray80);
        byte[] byteArray82 = lZ4Compression65.compress(byteArray80);
        byte[] byteArray83 = lZ4Compression64.decompress(byteArray80);
        byte[] byteArray84 = lZ4Compression58.compress(byteArray80);
        byte[] byteArray85 = lZ4Compression0.decompress(byteArray84);
        org.junit.Assert.assertNotNull(lZ4Compression0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lZ4Compression5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lZ4Compression17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lZ4Compression29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(lZ4Compression42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(lZ4Compression58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(lZ4Compression64);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression77);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 32, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int6 = errorResponse2.getStatus();
        int int7 = errorResponse2.getStatus();
        java.lang.String str8 = errorResponse2.toString();
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (short) 100, "ErrorResponse(status=32, message=)");
        java.lang.String str12 = errorResponse11.component2();
        boolean boolean13 = errorResponse2.equals((java.lang.Object) errorResponse11);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str8, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str12, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "");
        org.pin.backend.utils.LZ4Compression lZ4Compression3 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean7 = lZ4Compression3.isCompressed(byteArray6);
        org.pin.backend.utils.LZ4Compression lZ4Compression8 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = lZ4Compression8.isCompressed(byteArray12);
        byte[] byteArray14 = lZ4Compression3.decompress(byteArray12);
        org.pin.backend.utils.LZ4Compression lZ4Compression15 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean20 = lZ4Compression15.isCompressed(byteArray19);
        org.pin.backend.utils.LZ4Compression lZ4Compression21 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean25 = lZ4Compression21.isCompressed(byteArray24);
        org.pin.backend.utils.LZ4Compression lZ4Compression26 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = lZ4Compression26.isCompressed(byteArray30);
        byte[] byteArray32 = lZ4Compression21.decompress(byteArray30);
        byte[] byteArray33 = lZ4Compression15.decompress(byteArray30);
        byte[] byteArray34 = lZ4Compression3.decompress(byteArray33);
        org.pin.backend.utils.LZ4Compression lZ4Compression35 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean39 = lZ4Compression35.isCompressed(byteArray38);
        org.pin.backend.utils.LZ4Compression lZ4Compression40 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = lZ4Compression40.isCompressed(byteArray44);
        byte[] byteArray46 = lZ4Compression35.decompress(byteArray44);
        org.pin.backend.utils.LZ4Compression lZ4Compression47 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean51 = lZ4Compression47.isCompressed(byteArray50);
        org.pin.backend.utils.LZ4Compression lZ4Compression52 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = lZ4Compression52.isCompressed(byteArray56);
        byte[] byteArray58 = lZ4Compression47.decompress(byteArray56);
        org.pin.backend.utils.LZ4Compression lZ4Compression59 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = lZ4Compression59.isCompressed(byteArray63);
        org.pin.backend.utils.LZ4Compression lZ4Compression65 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        boolean boolean69 = lZ4Compression65.isCompressed(byteArray68);
        org.pin.backend.utils.LZ4Compression lZ4Compression70 = org.pin.backend.utils.LZ4Compression.INSTANCE;
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = lZ4Compression70.isCompressed(byteArray74);
        byte[] byteArray76 = lZ4Compression65.decompress(byteArray74);
        byte[] byteArray77 = lZ4Compression59.decompress(byteArray74);
        byte[] byteArray78 = lZ4Compression47.decompress(byteArray77);
        boolean boolean79 = lZ4Compression35.isCompressed(byteArray78);
        byte[] byteArray80 = lZ4Compression3.compress(byteArray78);
        boolean boolean81 = errorResponse2.equals((java.lang.Object) byteArray78);
        int int82 = errorResponse2.component1();
        java.lang.String str83 = errorResponse2.toString();
        org.junit.Assert.assertNotNull(lZ4Compression3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lZ4Compression8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lZ4Compression21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lZ4Compression26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lZ4Compression40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lZ4Compression52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(lZ4Compression59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lZ4Compression65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(lZ4Compression70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 76, (byte) 90, (byte) 52, (byte) 52, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 48, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ErrorResponse(status=100, message=)" + "'", str83, "ErrorResponse(status=100, message=)");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "ErrorResponse(status=32, message=)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) '4', "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        int int6 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse9 = errorResponse2.copy(0, "");
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse12.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse12.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str19 = errorResponse18.toString();
        java.lang.String str20 = errorResponse18.component2();
        org.pin.backend.exception.ErrorResponse errorResponse23 = errorResponse18.copy((int) (byte) 0, "");
        boolean boolean25 = errorResponse18.equals((java.lang.Object) 100.0f);
        int int26 = errorResponse18.component1();
        boolean boolean27 = errorResponse2.equals((java.lang.Object) errorResponse18);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(errorResponse9);
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str19, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str20, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(10, "");
        int int3 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy((int) (byte) 0, "ErrorResponse(status=10, message=)");
        java.lang.String str7 = errorResponse6.component2();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=10, message=)" + "'", str7, "ErrorResponse(status=10, message=)");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=ErrorResponse(status=32, message=))");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) ' ', "ErrorResponse(status=10, message=)");
        java.lang.String str6 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=10, message=)" + "'", str6, "ErrorResponse(status=10, message=)");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        int int8 = errorResponse5.getStatus();
        int int9 = errorResponse5.getStatus();
        java.lang.String str10 = errorResponse5.toString();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str10, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) ' ', "");
        java.lang.String str3 = errorResponse2.toString();
        int int4 = errorResponse2.component1();
        org.pin.backend.exception.ErrorResponse errorResponse7 = errorResponse2.copy(32, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
        java.lang.String str8 = errorResponse7.component2();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ErrorResponse(status=32, message=)" + "'", str3, "ErrorResponse(status=32, message=)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(errorResponse7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))" + "'", str8, "ErrorResponse(status=0, message=ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!)))");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) 100, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.pin.backend.exception.ErrorResponse errorResponse8 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        java.lang.String str9 = errorResponse8.component2();
        boolean boolean10 = errorResponse5.equals((java.lang.Object) str9);
        int int11 = errorResponse5.getStatus();
        int int12 = errorResponse5.getStatus();
        java.lang.String str13 = errorResponse5.component2();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str13, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        int int3 = errorResponse2.getStatus();
        org.pin.backend.exception.ErrorResponse errorResponse6 = errorResponse2.copy(1, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse9 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int10 = errorResponse9.getStatus();
        java.lang.String str11 = errorResponse9.component2();
        org.pin.backend.exception.ErrorResponse errorResponse14 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse17 = errorResponse14.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse20 = errorResponse14.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str21 = errorResponse20.toString();
        java.lang.String str22 = errorResponse20.component2();
        org.pin.backend.exception.ErrorResponse errorResponse25 = errorResponse20.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse28 = errorResponse20.copy((int) (byte) 10, "hi!");
        boolean boolean29 = errorResponse9.equals((java.lang.Object) errorResponse20);
        boolean boolean30 = errorResponse2.equals((java.lang.Object) errorResponse20);
        org.pin.backend.exception.ErrorResponse errorResponse33 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse36 = errorResponse33.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        int int37 = errorResponse33.getStatus();
        java.lang.String str38 = errorResponse33.toString();
        int int39 = errorResponse33.component1();
        boolean boolean40 = errorResponse20.equals((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(errorResponse6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(errorResponse17);
        org.junit.Assert.assertNotNull(errorResponse20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str21, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str22, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse25);
        org.junit.Assert.assertNotNull(errorResponse28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(errorResponse36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str38, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse8 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str9 = errorResponse8.toString();
        java.lang.String str10 = errorResponse8.component2();
        org.pin.backend.exception.ErrorResponse errorResponse13 = errorResponse8.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse16 = errorResponse8.copy((int) (byte) 10, "hi!");
        int int17 = errorResponse8.getStatus();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertNotNull(errorResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str9, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str10, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse13);
        org.junit.Assert.assertNotNull(errorResponse16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        java.lang.String str8 = errorResponse5.toString();
        org.pin.backend.exception.ErrorResponse errorResponse11 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        int int12 = errorResponse11.getStatus();
        boolean boolean13 = errorResponse5.equals((java.lang.Object) int12);
        org.pin.backend.exception.ErrorResponse errorResponse16 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int17 = errorResponse16.getStatus();
        java.lang.String str18 = errorResponse16.component2();
        org.pin.backend.exception.ErrorResponse errorResponse21 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse24 = errorResponse21.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse27 = errorResponse21.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str28 = errorResponse27.toString();
        java.lang.String str29 = errorResponse27.component2();
        org.pin.backend.exception.ErrorResponse errorResponse32 = errorResponse27.copy((int) (byte) 0, "");
        org.pin.backend.exception.ErrorResponse errorResponse35 = errorResponse27.copy((int) (byte) 10, "hi!");
        boolean boolean36 = errorResponse16.equals((java.lang.Object) errorResponse27);
        boolean boolean37 = errorResponse5.equals((java.lang.Object) boolean36);
        org.pin.backend.exception.ErrorResponse errorResponse40 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        int int41 = errorResponse40.getStatus();
        java.lang.String str42 = errorResponse40.component2();
        java.lang.String str43 = errorResponse40.component2();
        org.pin.backend.exception.ErrorResponse errorResponse46 = errorResponse40.copy(10, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse49 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse52 = errorResponse49.copy(0, "ErrorResponse(status=100, message=hi!)");
        java.lang.Class<?> wildcardClass53 = errorResponse52.getClass();
        boolean boolean54 = errorResponse46.equals((java.lang.Object) wildcardClass53);
        boolean boolean55 = errorResponse5.equals((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str8, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(errorResponse24);
        org.junit.Assert.assertNotNull(errorResponse27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str28, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str29, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse32);
        org.junit.Assert.assertNotNull(errorResponse35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(errorResponse46);
        org.junit.Assert.assertNotNull(errorResponse52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(100, "hi!");
        org.pin.backend.exception.ErrorResponse errorResponse5 = errorResponse2.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str6 = errorResponse5.component2();
        java.lang.String str7 = errorResponse5.toString();
        int int8 = errorResponse5.component1();
        int int9 = errorResponse5.component1();
        org.pin.backend.exception.ErrorResponse errorResponse12 = new org.pin.backend.exception.ErrorResponse((int) (byte) 10, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse15 = errorResponse12.copy(0, "ErrorResponse(status=100, message=hi!)");
        org.pin.backend.exception.ErrorResponse errorResponse18 = errorResponse12.copy((int) (byte) -1, "ErrorResponse(status=100, message=hi!)");
        java.lang.String str19 = errorResponse18.toString();
        java.lang.String str20 = errorResponse18.component2();
        org.pin.backend.exception.ErrorResponse errorResponse23 = errorResponse18.copy((int) (byte) 0, "");
        boolean boolean24 = errorResponse5.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass25 = errorResponse5.getClass();
        org.junit.Assert.assertNotNull(errorResponse5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str6, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str7, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(errorResponse15);
        org.junit.Assert.assertNotNull(errorResponse18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))" + "'", str19, "ErrorResponse(status=-1, message=ErrorResponse(status=100, message=hi!))");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ErrorResponse(status=100, message=hi!)" + "'", str20, "ErrorResponse(status=100, message=hi!)");
        org.junit.Assert.assertNotNull(errorResponse23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(32, "");
        int int3 = errorResponse2.component1();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.pin.backend.exception.ErrorResponse errorResponse2 = new org.pin.backend.exception.ErrorResponse(0, "ErrorResponse(status=10, message=ErrorResponse(status=100, message=hi!))");
        int int3 = errorResponse2.component1();
        int int4 = errorResponse2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

