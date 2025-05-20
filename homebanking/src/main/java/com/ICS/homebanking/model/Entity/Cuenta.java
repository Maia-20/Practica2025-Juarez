package com.ICS.homebanking.model.Entity;

import java.util.Date;

public class Cuenta {

	int IDcuenta;
	int NumeroCuenta;
	Cliente cliente;
	String Estado;
	Date FechaIngreso;
	Double SaldoActual;
	Double LimiteExtraccion;
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuenta(int iDcuenta, int numeroCuenta, Cliente cliente, String estado, Date fechaIngreso, Double saldoActual,
			Double limiteExtraccion) {
		super();
		IDcuenta = iDcuenta;
		NumeroCuenta = numeroCuenta;
		this.cliente = cliente;
		Estado = estado;
		FechaIngreso = fechaIngreso;
		SaldoActual = saldoActual;
		LimiteExtraccion = limiteExtraccion;
	}
	public int getIDcuenta() {
		return IDcuenta;
	}
	public void setIDcuenta(int iDcuenta) {
		IDcuenta = iDcuenta;
	}
	public int getNumeroCuenta() {
		return NumeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Date getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public Double getSaldoActual() {
		return SaldoActual;
	}
	public void setSaldoActual(Double saldoActual) {
		SaldoActual = saldoActual;
	}
	public Double getLimiteExtraccion() {
		return LimiteExtraccion;
	}
	public void setLimiteExtraccion(Double limiteExtraccion) {
		LimiteExtraccion = limiteExtraccion;
	}
	
	
	
}
