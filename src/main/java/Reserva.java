import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Getter
@Setter
@ToString
public class Reserva {

    private long id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private int numPersonas;
    private double importePrevisto;
    private EstadoReserva estado;
    private String zona;

    public Reserva(String zona, EstadoReserva estado, double importePrevisto, int numPersonas, LocalDate fecha, Cliente cliente, LocalTime hora) {
        this.zona = zona;
        this.estado = estado;
        this.importePrevisto = importePrevisto;
        this.numPersonas = numPersonas;
        this.fecha = fecha;
        this.cliente = cliente;
        this.hora = hora;
    }




}
