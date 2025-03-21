public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "1234-5678-9012-3456");
        InterPago pago = new PagoConTarjeta();
        Reserva reserva = new ReservaHotel(cliente);
        reserva.realizarReserva(pago);
    }
}
