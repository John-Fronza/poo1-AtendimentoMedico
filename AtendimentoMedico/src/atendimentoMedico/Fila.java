package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	List<Paciente> fila = new ArrayList<Paciente>();

	public void filaAdicionar(Paciente paciente) {
		fila.add(paciente);
	}
	public void remover(Paciente paciente) {
		fila.remove(paciente);
	}
	public void mostrarFila() {
		for(Paciente paciente : fila) {
			System.out.println(paciente);
		}
	}
	
	public Paciente getPaciente(int id) {
		for(Paciente paciente : fila) {
			if(paciente.getId() == id) {
				return paciente;
			}
		}
		return null;
	}
	
}

