public class Factura {
    private int total;
    private Reserva reserva;

    public Factura(Reserva reserva) {
        this.reserva = reserva;
        this.total = calcularTotal();
    }

    public int calcularTotal() {
        // Lógica de cálculo (ej: días * precio por tipo de habitación)
        return 1000; // Valor de ejemplo
    }

    // Getter
    public int getTotal() {
        return total;
    }
}