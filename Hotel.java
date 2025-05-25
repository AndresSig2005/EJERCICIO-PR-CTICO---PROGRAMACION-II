import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Método para agregar habitaciones al hotel
    public void agregarHabitacion(Habitacion hab) {
        habitaciones.add(hab);
    }

    // Funcionalidad 1: Crear reserva
    public void crearReserva(Cliente cliente, Habitacion habitacion, int fechaInicio, int fechaSalida) {
        if (habitacion.getEstado().equals("Disponible")) {
            Reserva nuevaReserva = new Reserva(fechaInicio, fechaSalida, cliente, habitacion);
            reservas.add(nuevaReserva);
            System.out.println("Reserva creada para " + cliente.getNombre());
        } else {
            System.out.println("Habitación no disponible");
        }
    }

    // Funcionalidad 2: Buscar disponibilidad
    public boolean buscarDisponibilidad(int fecha, Habitacion habitacion) {
        return habitacion.getEstado().equals("Disponible");
    }

    // Método CORREGIDO para obtener reservas
    public List<Reserva> getReservas() {
        return reservas;  // Devuelve directamente la lista de reservas
    }
}
