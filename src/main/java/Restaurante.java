import java.util.List;

public class Restaurante {

    private String nombre;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void addReserva(Reserva r) {
        reservas.add(r);
    }

    public Cliente getClientePorDni(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Restaurante{");
        sb.append("reservas=").append(reservas);
        sb.append(", clientes=").append(clientes);
        sb.append('}');
        return sb.toString();
    }
}
