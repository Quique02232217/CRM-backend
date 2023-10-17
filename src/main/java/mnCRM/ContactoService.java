package mnCRM;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ContactoService {
	@Inject MongoClient mongoCliente;
	
	
	public List<Contacto> lista(){
		List<Contacto> listaDeContacto = new ArrayList<>();
		MongoCursor<Document> cursor = obtenerColeccion().find().iterator();
		try {
			while(cursor.hasNext()) {
				Document document = cursor.next();
				Contacto contacto = new Contacto();
				contacto.setNombres(document.getString("nombres"));
				contacto.setApellidos(document.getString("apellidos"));
				contacto.setEmail(document.getString("email"));
				contacto.setCelular(document.getString("celular"));
				contacto.setFechadenacimiento(document.getString("fechadenacimiento"));
				contacto.setDireccion(document.getString("direccion"));
				contacto.setTipoContacto(document.getString("tipodecontacto"));
				contacto.setOrigen(document.getString("origen"));
				listaDeContacto.add(contacto);
			}
			
		}finally {
			cursor.close();
		}
		return listaDeContacto;
		
	}
	
	public void agregarContactoABasededatos(Contacto contacto) {
		Document document = new Document()
				.append("nombres", contacto.getNombres())
				.append("apellidos", contacto.getApellidos())
				.append("email", contacto.getEmail())
				.append("celular", contacto.getCelular())
				.append("fechadenacimiento", contacto.getFechadenacimiento())
				.append("direccion", contacto.getDireccion())
				.append("tipodecontacto", contacto.getTipoContacto())
				.append("origen", contacto.getOrigen());
				
		obtenerColeccion().insertOne(document);
		
	}
	
	public void buscarContacto() {
		MongoCursor<Document> cursor = obtenerColeccion().find().iterator();
		try {
			while(cursor.hasNext()) {
				Document document = cursor.next();
				Contacto contacto = new Contacto();
				contacto.getNombres();
				contacto.getApellidos();
				contacto.getEmail();
				contacto.getCelular();
				contacto.getFechadenacimiento();
				contacto.getDireccion();
				contacto.getTipoContacto();
				contacto.getOrigen();
				
			}
			
		}finally {
			cursor.close();
		}
				
	}
	
	
	private MongoCollection obtenerColeccion() {
		return mongoCliente.getDatabase("CRM").getCollection("RegistroContacto");
		
	}
	
	
}
