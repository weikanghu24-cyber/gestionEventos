package gestionEventos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ponente")
public class Ponente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;

	@Column(name = "empresa", nullable = false, length = 200)
	private String empresa;

	@Column(name = "tema_charla", nullable = false, length = 300)
	private String temaCharla;

	public Ponente() {
	}

	public Ponente(String nombre, String apellidos, String empresa, String temaCharla) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.empresa = empresa;
		this.temaCharla = temaCharla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTemaCharla() {
		return temaCharla;
	}

	public void setTemaCharla(String temaCharla) {
		this.temaCharla = temaCharla;
	}
}
