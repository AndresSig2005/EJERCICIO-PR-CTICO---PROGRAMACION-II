public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        // Creamos 4 clientes
        Cliente cliente1 = new Cliente("Ana Garcia");
        Cliente cliente2 = new Cliente("Carlos Mendoza");
        Cliente cliente3 = new Cliente("Luisa Fernandez");
        Cliente cliente4 = new Cliente("Pedro Lopez"); // Nuevo cliente
        
        // Creamos 3 habitaciones
        Habitacion hab101 = new Habitacion(101, "Doble");
        Habitacion hab202 = new Habitacion(202, "Individual");
        Habitacion hab303 = new Habitacion(303, "Suite");
        
        hotel.agregarHabitacion(hab101);
        hotel.agregarHabitacion(hab202);
        hotel.agregarHabitacion(hab303);

        // Ver disponibilidad inicial
        System.out.println("\nEstado inicial:");
        System.out.println("¿Está disponible hab101? " + hotel.buscarDisponibilidad(20240525, hab101));
        System.out.println("¿Está disponible hab202? " + hotel.buscarDisponibilidad(20240525, hab202));
        
        // Crear reservas para los primeros 3 clientes
        System.out.println("\nCreando reservas:");
        hotel.crearReserva(cliente1, hab101, 20240525, 20240530);
        hotel.crearReserva(cliente2, hab202, 20240526, 20240528);
        hotel.crearReserva(cliente3, hab303, 20240527, 20240602);
        
        // Intentar reservar una habitación ya ocupada (nuevo caso)
        System.out.println("\nIntentando reservar habitación ocupada:");
        hotel.crearReserva(cliente4, hab101, 20240528, 20240531); // hab101 ya está ocupada
        
        // Generar facturas para las reservas exitosas
        System.out.println("\nFacturas de reservas exitosas:");
        for (Reserva reserva : hotel.getReservas()) {
            Factura factura = new Factura(reserva);
            System.out.println("Cliente: " + reserva.getCliente().getNombre() + 
                             " | Habitación: #" + reserva.getHabitacion().getNumero() + 
                             " | Total a pagar: $" + factura.getTotal());
        }
    }
}
