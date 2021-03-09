package mx.com.devlope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Perfil extends JpaRepository<Perfil, Long> {

}
