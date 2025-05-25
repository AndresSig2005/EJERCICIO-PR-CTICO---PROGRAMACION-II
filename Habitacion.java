public class Habitacion {
    private int numero;
    private String tipo;
    private String estado; // "Disponible", "Ocupada", "Mantenimiento"

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "Disponible"; // Estado inicial
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}