package mnCRM;

import java.util.Objects;

public class Contacto {
	private String nombres;
	private String apellidos;
	private String email;
	private String celular;
	private String fechadenacimiento;
	private String direccion;
	private String tipodecontacto;
	private String origen;
	
	public Contacto() {
		
	}

	public Contacto(String nombres, String apellidos, String email, String celular, String fechadenacimiento,
			String direccion, String tipoContacto, String origen) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.celular = celular;
		this.fechadenacimiento = fechadenacimiento;
		this.direccion = direccion;
		this.tipodecontacto = tipoContacto;
		this.origen = origen;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFechadenacimiento() {
		return fechadenacimiento;
	}

	public void setFechadenacimiento(String fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoContacto() {
		return tipodecontacto;
	}

	public void setTipoContacto(String tipoContacto) {
		this.tipodecontacto = tipoContacto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipodecontacto, apellidos, celular, direccion, email, fechadenacimiento, nombres, origen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(tipodecontacto, other.tipodecontacto) && Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(celular, other.celular) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(fechadenacimiento, other.fechadenacimiento)
				&& Objects.equals(nombres, other.nombres) && Objects.equals(origen, other.origen);
	}
	
	
	
}
