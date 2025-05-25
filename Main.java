public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Cliente cliente = new Cliente("Ana Garcia"); // Sin "nombre:"
        Habitacion hab101 = new Habitacion(101, "Doble"); // Sin "numero:" y "tipo:"

        hotel.agregarHabitacion(hab101);

        // Ver disponibilidad
        System.out.println("¿Está disponible? " + hotel.buscarDisponibilidad(20240525, hab101)); // Sin "fecha:"

        // Crear reserva
        hotel.crearReserva(cliente, hab101, 20240525, 20240530); // Sin "fechalnicio:" y "fechaSalida:"

        // Generar factura
        Reserva reserva = hotel.getReservas().get(0); // Obtener la primera reserva
        Factura factura = new Factura(reserva);
        System.out.println("Total a pagar: $" + factura.getTotal());
    }
}