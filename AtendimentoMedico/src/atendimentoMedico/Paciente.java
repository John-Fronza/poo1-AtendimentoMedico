package atendimentoMedico;
import java.time.LocalTime;

public class Paciente {
	private int classificacao = 1;
	private int id;
	private LocalTime horarioChegada;
	private LocalTime horarioAtendimento;
	
	public Paciente(int classificacao, int id, LocalTime horarioChegada, LocalTime horarioAtendimento) {
		super();
		this.classificacao = classificacao;
		this.id = id;
		this.horarioChegada = horarioChegada;
		this.horarioAtendimento = horarioAtendimento;
	}

	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(LocalTime horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public LocalTime getHorarioAtendimento() {
		return horarioAtendimento;
	}
	public void setHorarioAtendimento(LocalTime horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [classificacao=");
		builder.append(classificacao);
		builder.append(", id=");
		builder.append(id);
		builder.append(", horarioChegada=");
		builder.append(horarioChegada);
		builder.append(", horarioAtendimento=");
		builder.append(horarioAtendimento);
		builder.append("]");
		return builder.toString();
	}
	
	
}
