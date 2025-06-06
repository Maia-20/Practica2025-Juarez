package com.ICS.homebanking.model.Servi.Implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ICS.homebanking.model.Entity.Cliente;
import com.ICS.homebanking.model.Servi.InterfCliente;

@Service
public class ImplCliente implements  InterfCliente{
	
	List <Cliente> clientes = new ArrayList <>();

	@Override
	public void guardar(Cliente cliente) {
		clientes.add(cliente);
		
	}

	@Override
	public List<Cliente> listarClientes() {

		return clientes;
	}

	@Override
	public Cliente BuscarDNI(String DNI) {

		return null;
	}

	@Override
	public void eliminarCliente(int ID) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i).getID() == ID) {
				clientes.remove(i);
				break;
			}
		}
	}

	@Override
	public void modificarCliente(Cliente cliente) {
		for(int i=0; i< clientes.size();i++) {
			if(clientes.get(i).getID() == cliente.getID()){
				clientes.set(i, cliente);
			}
		}
		
	}

	@Override
	public void actualizarCliente(Cliente cliente) {

		for(Cliente c : clientes) {
			if(c.getID() == cliente.getID()) {
				c.setDNI(cliente.getDNI());
				c.setUsername(cliente.getUsername());
				c.setClave(cliente.getClave());
				c.setNombre(cliente.getNombre());
				c.setCorreoElectronico(cliente.getCorreoElectronico());
				c.setEstado(cliente.getEstado());
				break;
			}
		}
	}

}
