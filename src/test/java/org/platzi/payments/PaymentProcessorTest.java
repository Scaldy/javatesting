package org.platzi.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/*
Como apunte adicional, la anotación @BeforeClass se puede utilizar en métodos estáticos para ejecutar instrucciones
al principio de todos los tests de esa clase. Esto puede usarse para operaciones costosas como conexiones a bases de datos
que no quieras ejecutar antes de cada uno de los tests (que en una aplicación escalable pueden ser muchos).
*/

public class PaymentProcessorTest {
    private PaymentProcessor paymentProcessor;
    private PaymentGateway paymentGateway;

    // Con la anotacion Before, este codigo se ejecuta antes de cada Test Unitario,
    // se pone el codigo que prepara el escenario que es comun a todos los Test
    @Before
    public void setup() {
        this.paymentGateway = Mockito.mock(PaymentGateway.class);
        this.paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        // 1 - Preparacion del Escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // 2 - Llamada al metodo que queremos probar
        boolean result = paymentProcessor.makePayment(1000);

        // 3 - Comprobacion del valor esperado
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }
}