package mx.com.devlope.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="perfil")
public class Perfil { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id_perfil")
	private Long perfil; 
	private String nombre;  
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy="perfil")
	private Usuario usuario;
	
	public Perfil()
	{
		
	}

	public Perfil(Long perfil, String nombre) {
		this.perfil = perfil;
		this.nombre = nombre;
	}

	public Long getPerfil() {
		return perfil;
	}

	public void setPerfil(Long perfil) {
		this.perfil = perfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}  
	
	
	
	

}
