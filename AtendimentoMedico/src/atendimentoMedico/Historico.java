package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	List<Paciente> historico = new ArrayList<Paciente>();
	
	public void historicoAdicionar(Paciente paciente) {
		historico.add(paciente);
	}
	
	public void mostrarHistorico() {
		for(Paciente paciente : historico) {
			System.out.println(paciente);
		}
	}
}
