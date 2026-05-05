package gestionEventos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre_evento", nullable = false, length = 200)
	private String nombreEvento;

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;

	@Column(name = "lugar", nullable = false, length = 200)
	private String lugar;

	@Column(name = "aforo", nullable = false)
	private int aforo;

	public Evento() {
	}

	public Evento(String nombreEvento, LocalDate fecha, String lugar, int aforo) {
		this.nombreEvento = nombreEvento;
		this.fecha = fecha;
		this.lugar = lugar;
		this.aforo = aforo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
}
