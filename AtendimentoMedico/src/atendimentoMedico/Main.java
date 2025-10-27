package atendimentoMedico;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Historico historico = new Historico();
		Fila fila = new Fila();
		Paciente paciente = new Paciente(0, 0, null, null, null);
		Scanner scanner = new Scanner(System.in);
		
		paciente = new Paciente(1, 0, LocalTime.of(1, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(2, 1, LocalTime.of(2, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(3, 2, LocalTime.of(3, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(4, 3, LocalTime.of(4, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(1, 4, LocalTime.of(5, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(2, 5, LocalTime.of(6, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(3, 6, LocalTime.of(7, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(4, 7, LocalTime.of(8, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(1, 8, LocalTime.of(9, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(2, 9, LocalTime.of(10, 30), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(3, 10, LocalTime.of(1, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(4, 11, LocalTime.of(2, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(1, 12, LocalTime.of(3, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(2, 13, LocalTime.of(4, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(3, 14, LocalTime.of(5, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(4, 15, LocalTime.of(6, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(1, 16, LocalTime.of(7, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(2, 17, LocalTime.of(8, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(3, 18, LocalTime.of(9, 0), null, "null");
		fila.filaAdicionar(paciente);
		paciente = new Paciente(4, 19, LocalTime.of(10, 0), null, "null");
		fila.filaAdicionar(paciente);
		
		boolean loop = true;
		while(loop) {
			System.out.println();
			System.out.println("Digite um número paea selecionar uma das opções: ");
			System.out.println("1) Mostrar lista de pacientes na fila");
			System.out.println("2) Mostrar lista de pacientes no histórico");
			System.out.println("3) Adicionar paciente na fila");
			System.out.println("4) Remover paciente da fila");
			System.out.println("5) Incerrar programa");
			System.out.println();
			
			int opcao = 0;
			System.out.print("Opção: ");
			if (scanner.hasNextInt()) {
				opcao = scanner.nextInt();
			} else {
				scanner.nextLine();
			}
			System.out.println();
			
			switch(opcao) {
			case 1:
				System.out.println("Lista de pacientes na fila:");
				System.out.println();
				fila.mostrarFila();
				break;
				
			case 2:
				System.out.println("Lista de pacientes no histórico:");
				System.out.println();
				historico.mostrarHistorico();
				break;
				
			case 3:
				try {
					System.out.println("Adicionar paciente na fila:");
					paciente = new Paciente(0, 0, null, null, null);
					
					System.out.print("Insira um id:");
					paciente.setId(scanner.nextInt());
					
					System.out.print("Insira um horario de chegada:");
					paciente.setHorarioChegada(LocalTime.parse(scanner.next()));
					
					System.out.println("Classificação do paciente, responda com S ou N:");
					System.out.print("O paciente está com dificuldade intensa para respirar ou sensação de falta de ar?: ");
					if(scanner.next().equalsIgnoreCase("S")) {
						paciente.setClassificacao(paciente.getClassificacao() + 1);
					}
					System.out.print("O paciente está sentindo dor forte e repentina no peito, ou essa dor se irradia para braço, pescoço ou costas?: ");
					if(scanner.next().equalsIgnoreCase("S")) {
						paciente.setClassificacao(paciente.getClassificacao() + 1);
					}
					System.out.print("O paciente apresenta sangramento intenso, desmaio recente ou alteração do nível de consciência?: ");
					if(scanner.next().equalsIgnoreCase("S")) {
						paciente.setClassificacao(paciente.getClassificacao() + 1);
					}
					System.out.print("O paciente teve febre alta persistente (acima de 39ºC) acompanhada de confusão, fraqueza extrema ou convulsão?: ");
					if(scanner.next().equalsIgnoreCase("S")) {
						paciente.setClassificacao(paciente.getClassificacao() + 1);
					}
					
					fila.filaAdicionar(paciente);
					
					System.out.println();
				} catch (Exception e) {
					System.out.println();
					System.out.println("Informação inválida!");
				}
				
				break;
				
			case 4:
				try {
					System.out.print("Qual o id do paciente que você deseja remover da fila: ");
					Paciente pacienteAtual = fila.getPaciente(scanner.nextInt());
					
					System.out.print("Qual o horario de atendimento do paciente: ");
					pacienteAtual.setHorarioAtendimento(LocalTime.parse(scanner.next()));

					System.out.print("Que médico atendeu o paciente: ");
					pacienteAtual.setMedico(scanner.next());
					
					historico.historicoAdicionar(pacienteAtual);
					fila.remover(pacienteAtual);
				} catch (Exception e) {
					System.out.println();
					System.out.println("Informação inválida!");
				}
				break;
				
			case 5:
				loop = false;
				System.out.println("Programa incerrado!");
				break;
				
			default:
				System.out.println("Opção inválida");
			}
		}
		
		scanner.close();
	}

}
