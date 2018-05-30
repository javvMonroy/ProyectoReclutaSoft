package mx.uacm.reclutaSoft.service.impl;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.uacm.reclutaSoft.constantes.Regla;
import mx.uacm.reclutaSoft.constantes.Error;
import mx.uacm.reclutaSoft.domain.Habilidad;
import mx.uacm.reclutaSoft.domain.Usuario;
import mx.uacm.reclutaSoft.excepcion.AppExcepcion;
import mx.uacm.reclutaSoft.persistence.UsuarioRepository;
import mx.uacm.reclutaSoft.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	private static final Logger log = LogManager.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario alta(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String telefono, 
			ArrayList<Habilidad> habilidades, int edad, String web, String titulo) throws AppExcepcion {
		
		log.debug("Entrando a alta");
			
		Usuario usuario = null;
		
		if (!(nombre.matches(Regla.REGEX_NOMBRE))) {
			throw new AppExcepcion(Error.MAL_NOMBRE, Error.NO_LETRAS_ESPACIOS);
		}
		
		return usuario;
	}
}
