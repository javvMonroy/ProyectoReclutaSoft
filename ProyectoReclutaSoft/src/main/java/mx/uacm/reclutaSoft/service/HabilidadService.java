package mx.uacm.reclutaSoft.service;

import mx.uacm.reclutaSoft.domain.Habilidad;
import mx.uacm.reclutaSoft.excepcion.AppExcepcion;

public interface HabilidadService {
	public Habilidad alta (String nombre, String tipo, int puntuacion) throws AppExcepcion;
}
