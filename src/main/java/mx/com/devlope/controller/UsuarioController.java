package mx.com.devlope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.devlope.modelo.Usuario;
import mx.com.devlope.service.UsuarioService;

@Controller 
@RequestMapping("/usuario")
public class UsuarioController { 
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@PostMapping("/guardar") 
	public void guardarUsuario(@RequestBody Usuario usuario)
	{
		usuarioService.GuardarUsuario(usuario);
	} 
	
	@PostMapping("/lista") 
	public List<Usuario> listarUsuario()
	{
		return usuarioService.listarUsuario();
	} 
	

}
