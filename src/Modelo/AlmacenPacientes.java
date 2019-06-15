package Modelo;

import java.io.File;
import java.util.TreeMap;

public class AlmacenPacientes implements IAlmacen<Paciente, String>{
	private TreeMap <String, String> mapaPacientes;
	private DAO daoPacientes;
	
	public AlmacenPacientes() {
		mapaPacientes=new TreeMap<String, String>();
		daoPacientes=new DAO();
	}
	
	public TreeMap<String, String> obetenerMapa() {
		File file=new File("./FicherosPacientes/MapaPacientes.mapa");
		if(file.canRead()) {
			mapaPacientes= (TreeMap<String,String>) daoPacientes.leer("./FicherosPacientes/MapaPacientes.mapa");
		}
		
		return mapaPacientes;
	}
	
	
	@Override
	public Paciente obtener(String nombre) {
		Paciente paciente=(Paciente) daoPacientes.leer(generarPath(nombre));
		
		if(paciente==null) {
			paciente=(Paciente) daoPacientes.leer(generarPath(nombre));
		}
		
		assert paciente!=null;
		
		return paciente;
	}

	@Override
	public boolean grabar(Paciente paciente) {
		assert paciente!=null;
		boolean grabado=true;
		
		mapaPacientes.put(paciente.getNombre(), paciente.getIdPersona());
		grabarMapa();
		if(!daoPacientes.grabar(generarPath(paciente.getNombre()), paciente)) {
			mapaPacientes.remove(paciente.getNombre());
			grabado=false;
		}
		
		return grabado;
	}

	@Override
	public boolean borrar(String id) {
		assert id!=null;
		mapaPacientes.remove(id);
		grabarMapa();
		return daoPacientes.borrarFile(generarPath(id));
	}
	
	public boolean grabarMapa() {
		return daoPacientes.grabar("./FicherosPacientes/MapaPacientes.mapa", mapaPacientes);
	}

	private String generarPath(String nombre) {
		String path;
		
		if(mapaPacientes.get(nombre)!=null) {
			path="./FicherosPacientes/"+mapaPacientes.get(nombre)+".paciente";
		}else {
			path= "./FicherosPacientes/"+nombre+".paciente";
		}
		
		return path;
	}
}
