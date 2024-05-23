package com.examen.entornos;

public class Empleado {
  //Instantanea 1
  private String nombre;
  //Instantanea 2
  private String apellido;
  //Instantanea 3
  private Double salario;
  //Instantanea 4
  public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String apellido, Double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
