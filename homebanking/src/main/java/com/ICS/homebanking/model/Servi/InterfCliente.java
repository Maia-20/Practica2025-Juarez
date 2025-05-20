package com.ICS.homebanking.model.Servi;

import java.util.List;

import com.ICS.homebanking.model.Entity.Cliente;

public interface InterfCliente {

	void guardar(Cliente cliente);
	List <Cliente> listarClientes();
	Cliente BuscarDNI(String DNI);
	void eliminarCliente(int ID);
	void modificarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	
	
}
