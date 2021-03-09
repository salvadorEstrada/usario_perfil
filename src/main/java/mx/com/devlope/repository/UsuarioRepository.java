package mx.com.devlope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.devlope.modelo.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
