package atendimentoMedico;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Paciente paciente = new Paciente(0, 0, null, null);
		Scanner scanner = new Scanner(System.in);
		
		paciente = new Paciente(0, 0, null, null);
		paciente.setId(0);
		paciente.setClassificacao(2);
		paciente.setHorarioAtendimento(LocalTime.of(6, 30));
		paciente.setHorarioChegada(LocalTime.of(8, 0));
		fila.Adicionar(paciente);
		
		paciente = new Paciente(0, 0, null, null);
		paciente.setId(1);
		paciente.setClassificacao(3);
		paciente.setHorarioAtendimento(LocalTime.of(13, 0));
		paciente.setHorarioChegada(LocalTime.of(14, 0));
		fila.Adicionar(paciente);
		
		paciente = new Paciente(0, 0, null, null);
		paciente.setId(2);
		paciente.setClassificacao(4);
		paciente.setHorarioAtendimento(LocalTime.of(4, 30));
		paciente.setHorarioChegada(LocalTime.of(5, 0));
		fila.Adicionar(paciente);
		
		System.out.println("Selecione uma das opções: ");
		System.out.println("1) Mostrar lista de pacientes na fila");
		System.out.println("2) Adicionar paciente na fila");
		System.out.println("3) Remover paciente da fila");
		System.out.println();
		System.out.print("Opção: ");
		int opcao = scanner.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("Lista de pacientes na fila:");
				System.out.println();
				fila.mostrarFila();
				break;
			case 2:
				System.out.println("Adicionar paciente na fila:");
				System.out.println();
				break;
			case 3:
				System.out.println("Remover paciente da fila:");
				System.out.println();
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		scanner.close();
	}

}
