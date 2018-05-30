package mx.uacm.reclutaSoft.persistence;

import org.springframework.data.repository.CrudRepository;

import mx.uacm.reclutaSoft.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
