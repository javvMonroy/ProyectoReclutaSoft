package mx.uacm.reclutaSoft.domain;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnTransformer;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="rol_id")
	private Rol rol;
	
	private String nombre;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private String correo;
	
	@ColumnTransformer(write=" MD5(?) ", read=" MD5(?) ")
	private String contrasenia;
	
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private ArrayList<Proyecto> participaciones;
	
	private String telefono;
	
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private ArrayList<Habilidad> habilidades;
	
	private int edad;
	
	private String web;
	
	private int reputacion;
	
	private String titulo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public ArrayList<Proyecto> getParticipaciones() {
		return participaciones;
	}

	public void setParticipaciones(ArrayList<Proyecto> participaciones) {
		this.participaciones = participaciones;
	}
	
	public void setParticipacion(Proyecto proyecto) {
		participaciones.add(proyecto);
		proyecto.setUsuario(this);
	}
	
	public void removeParticipacion(Proyecto proyecto) {
		participaciones.remove(proyecto);
		proyecto.setUsuario(null);
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void setHabilidad(Habilidad habilidad) {
		habilidades.add(habilidad);
		habilidad.setUsuario(this);
	}
	
	public void removeHabilidad(Habilidad habilidad) {
		habilidades.remove(habilidad);
		habilidad.setUsuario(null);
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getReputacion() {
		return reputacion;
	}

	public void setReputacion(int reputacion) {
		this.reputacion = reputacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
