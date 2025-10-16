package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	List<Paciente> fila = new ArrayList<Paciente>();

	public void Adicionar(Paciente paciente) {
		fila.add(paciente);
	}
	public void Remover(Paciente paciente) {
		fila.remove(paciente);
	}
	public void mostrarFila() {
		for(Paciente paciente : fila) {
			System.out.println(paciente);
		}
	}
	
}

