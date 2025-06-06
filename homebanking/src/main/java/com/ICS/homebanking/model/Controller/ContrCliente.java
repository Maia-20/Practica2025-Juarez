package com.ICS.homebanking.model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ICS.homebanking.model.Entity.Cliente;
import com.ICS.homebanking.model.Servi.InterfCliente;

@Controller
public class ContrCliente {

	@Autowired
	private InterfCliente clienteService;
	
	@GetMapping("/menu")
	public String Menu() {
		return "ClienteV/menu";
		
	}
	
	@GetMapping("/ListaCliente")
	public String DetalleCliente(Model model) {
		model.addAttribute("listaCliente", clienteService.listarClientes());
		return "clienteV/ListaCliente";
		
	}
	
	@GetMapping("/AltaCliente")
	public String AltaCliente(Model model) {
		Cliente Cli = new Cliente();
		model.addAttribute("cliente", Cli);
		return "ClienteV/AltaCliente";
		
	}
	
	@PostMapping("/guardar")
	public String Guardar(Cliente cliente) {
		clienteService.guardar(cliente);
		return "redirect:/ListaCliente";
		
	}
	
	@GetMapping("/Eliminar{ID}")
	public String Eliminar (@PathVariable("ID") Integer ID, Model model) {
		clienteService.eliminarCliente(ID);	
		return "redirect:/ListaCliente";
		
	}
	
	
	
	@PostMapping("/modificar/cliente")
	public String modifCliente(Cliente cliente) {
		clienteService.modificarCliente(cliente);
		
		return "redirect:/ListaCliente";
	}
	
	@PostMapping("/modificar")
	public String ModificarCliente(@RequestParam("ID")Integer ID, Model model) {
		model.addAttribute("cliente", clienteService.EncontrarCliente(ID));
		return "ClienteV/editarCliente";
		
	}
	

	
}
