class ReservaHotel extends Reserva {
    public ReservaHotel(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public void realizarReserva(InterPago pago) {
        System.out.println("Reserva realizada para el cliente: " + cliente.getNombre());
        pago.procesarPago(cliente.getTarjetaCredito());
    }
}