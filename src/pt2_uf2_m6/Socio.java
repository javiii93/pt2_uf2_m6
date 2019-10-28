package pt2_uf2_m6;

import java.sql.Date;

public class Socio {
private int cod_soc;
private String nombre,apellidos,direccion,telefono,poblacion,cp,provincia,pais;
private int edad;
private Date fechaAlta;
private float cuota;

public Socio(int cod_soc, String nombre, String apellidos, String direccion, String telefono, String poblacion,
		String cp, String provincia, String pais, int edad, Date fechaAlta, float cuota) {
	super();
	this.cod_soc = cod_soc;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.telefono = telefono;
	this.poblacion = poblacion;
	this.cp = cp;
	this.provincia = provincia;
	this.pais = pais;
	this.edad = edad;
	this.fechaAlta = fechaAlta;
	this.cuota = cuota;
}
public int getCod_soc() {
	return cod_soc;
}
public void setCod_soc(int cod_soc) {
	this.cod_soc = cod_soc;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getPoblacion() {
	return poblacion;
}
public void setPoblacion(String poblacion) {
	this.poblacion = poblacion;
}
public String getCp() {
	return cp;
}
public void setCp(String cp) {
	this.cp = cp;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public Date getFechaAlta() {
	return fechaAlta;
}
public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
}
public float getCuota() {
	return cuota;
}
public void setCuota(float cuota) {
	this.cuota = cuota;
}


}
