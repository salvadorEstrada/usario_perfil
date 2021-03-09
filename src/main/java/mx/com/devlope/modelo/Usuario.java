package mx.com.devlope.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario { 
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id_usuario")
	private Long idUsuario;

	@Column(name="nombre")
	private String nombre; 
	@Column(name="ap_paterno")
	private String apPaterno; 
	@Column(name="ap_materno")
	private String paMaterno; 
	
	@OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name="id")
	private Perfil perfil ;
	
	public Usuario()
	{
		
	}

	public Usuario(Long idUsuario, String nombre, String apPaterno, String paMaterno) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.paMaterno = paMaterno;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getPaMaterno() {
		return paMaterno;
	}

	public void setPaMaterno(String paMaterno) {
		this.paMaterno = paMaterno;
	}  
	
	
	
	
	
	
	

}
