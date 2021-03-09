package mx.com.devlope.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.devlope.modelo.Usuario;
import mx.com.devlope.repository.UsuarioRepository;

@Service
public class UsuarioService { 
	
	@Autowired 
	public UsuarioRepository usuarioRepository;
	public void GuardarUsuario(Usuario usuario)
	{
		usuarioRepository.save(usuario);
	} 
	
	public List<Usuario> listarUsuario()
	{
		return usuarioRepository.findAll();
	}

}
