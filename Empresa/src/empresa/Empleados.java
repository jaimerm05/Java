package empresa;

import java.util.Date;

import javax.swing.JOptionPane;

public class Empleados {

	private double sal = 0;
	private String nombre = "";
	private Date fecha_alta;
	private int mes, año, dia;

	public Empleados(double sal, String nombre, Date fecha_alta, int mes, int año, int dia) {

		sal = this.sal;
		nombre = this.nombre;
		fecha_alta = this.fecha_alta;
		mes = this.mes;
		año = this.año;
		dia = this.dia;

	}

	public void set_sal(double sal) {
		sal = this.sal;
	}

	public void set_nombre(String nombre) {
		nombre = this.nombre;
	}

	public void set_fecha_alta(Date fecha_alta) {
		fecha_alta = this.fecha_alta;
	}

	public void set_año(int año) {
		año = this.año;
	}

	public void set_mes(int mes) {
		mes = this.mes;
	}

	public void set_dia(int dia) {
		dia = this.dia;
	}

	public double get_sal() {
		return sal;
	}

	public String get_nombre() {
		return nombre;
	}

	public Date get_fecha_alta() {
		return fecha_alta;
	}

	public int get_año() {
		return año;
	}

	public int get_mes() {
		return año;
	}

	public int get_dia() {
		return dia;
	}

	public void sal_porc(double porcentaje) {
		sal = sal * porcentaje / 100;
	}

	public void aum_sal(double aumento) {
		sal = sal + aumento;
	}

	public void dis_sal(double dism) {
		sal = sal - dism;
	}

	public void camb_fecha(String cambio) {

		if (cambio.equalsIgnoreCase("año")) {
			año = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál fue el año de ingreso?"));
		}

		if (cambio.equalsIgnoreCase("mes")) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál fue el mes de ingreso?"));
		}

		if (cambio.equalsIgnoreCase("día") || cambio.equalsIgnoreCase("dia")) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál fue el día de ingreso?"));

		}
	}
}
