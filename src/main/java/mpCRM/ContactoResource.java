package mpCRM;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import mnCRM.Contacto;
import mnCRM.ContactoService;

@Path("/registrarcontacto")
public class ContactoResource {
	@Inject ContactoService service;
	
	
	@GET
	public List<Contacto> mostrarLista(){
		return service.lista();
		
	}
	
	@POST
	public List<Contacto> agregarContacto(Contacto contacto){
		service.agregarContactoABasededatos(contacto);
		return mostrarLista();
	}
	
	
	@PUT
		
	
	
	
}
