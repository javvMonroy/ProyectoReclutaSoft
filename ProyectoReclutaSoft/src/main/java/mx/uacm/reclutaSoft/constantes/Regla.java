package mx.uacm.reclutaSoft.constantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.ListUtils;

import com.google.common.collect.ImmutableMap;

public class Regla {
	public static final String REGEX_NOMBRE = "^[ A-Za-z�����]+$";
	public static final int LONG_MIN_NOMBRE = 4;
	public static final int LONG_MAX_NOMBRE = 20;
	
	public static final String REGEX_AP_PATERNO = "^[A-Za-z�����]+$";
	public static final int LONG_MIN_PATERNO = 4;
	public static final int LONG_MAX_PATERNO = 20;
	
	public static final String REGEX_AP_MATERNO = "^[A-Za-z�����]+$";
	public static final int LONG_MIN_MATERNO = 4;
	public static final int LONG_MAX_MATERNO = 20;
	
	public static final String REGEX_CORREO = "";
	
	public static final int LONG_MIN_CONTRASENIA = 8;
	public static final int LONG_MAX_CONTRASENIA = 12;
	
	public static final String REGEX_TELEFONO = "^[0-9]+$";
	public static final int LONG_TELEFONO = 10;
	
	public static final String REGEX_NOM_HABILIDAD = "^[ 0-9A-Za-z�����]+$";
	public static final int LONG_MIN_HABILIDAD = 3;
	public static final int LONG_MAX_HABILIDAD = 70;
		
	public static final List<String> TIPO_HABILIDAD = ListUtils.
			unmodifiableList(new ArrayList<String>(Arrays.
					asList("Idioma", "Lenguaje de progrmaci�n", "Framework", "otro")
					));
	
	public static final int MIN_PUNTUACION = 0;
	public static final int MAX_PUNTUACION = 5;
	
	public static final int MIN_EDAD = 18;
	public static final int MAX_EDAD = 100;
	
	public static final String REGEX_WEB = "";
	
	public static final int MIN_REPUTACION = 0;
	public static final int MAX_REPUTACION = 5;
		
	public static final List<String> GRADO_ACADEMICO = ListUtils.
			unmodifiableList(new ArrayList<String>(Arrays.
					asList("Estudiante", "Licenciatura", "Ingenier�a", "Posgrado", "Maestr�a", "Doctorado", "otro")
					));
	
	public static final int MIN_NOM_PROYECTO = 1;
	public static final int MAX_NOM_PROYECTO = 80;
			
	public static final int MIN_DES_PROYECTO = 1;
	public static final int MAX_DES_PROYECTO = 300;
	
	public static final List<String> NOMBRE_ROL = ListUtils.
			unmodifiableList(new ArrayList<String>(Arrays.
					asList("Programador", "Lider de proyecto", "Dise�ador", "Analista", "Tester")
					));
}
