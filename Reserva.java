public class Reserva {  // "Reserva" con 'v' según el UML
    private int fechaInicio;
    private int fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva(int fechaInicio, int fechaSalida, Cliente cliente, Habitacion habitacion) {
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
        habitacion.setEstado("Ocupada"); // Actualiza el estado al reservar
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }
}