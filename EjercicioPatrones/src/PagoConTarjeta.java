class PagoConTarjeta implements InterPago {
    @Override
    public void procesarPago(String tarjetaCredito) {
        System.out.println("Procesando pago con tarjeta: " + tarjetaCredito);
    }
}