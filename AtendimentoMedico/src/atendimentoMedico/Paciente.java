package atendimentoMedico;
import java.time.LocalTime;

public class Paciente {
	private int classificacao = 0;
	private int id = 0;
	private LocalTime horarioChegada = null;
	private LocalTime horarioAtendimento = null;
	private String medico = null;
	
	public Paciente(int classificacao, int id, LocalTime horarioChegada, LocalTime horarioAtendimento, String medico) {
		super();
		this.classificacao = classificacao;
		this.id = id;
		this.horarioChegada = horarioChegada;
		this.horarioAtendimento = horarioAtendimento;
		this.medico = medico;
	}

	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		if(classificacao <=4)
		this.classificacao = classificacao;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id >= 0)
		this.id = id;
	}

	public LocalTime getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(LocalTime horarioChegada) {
		if(horarioChegada != null)
		this.horarioChegada = horarioChegada;
	}

	public LocalTime getHorarioAtendimento() {
		return horarioAtendimento;
	}
	public void setHorarioAtendimento(LocalTime horarioAtendimento) {
		if(horarioAtendimento != null)
		this.horarioAtendimento = horarioAtendimento;
	}
	
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		if(medico != "")
		this.medico = medico;
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
		builder.append(", medico=");
		builder.append(medico);
		builder.append("]");
		return builder.toString();
	}	
}
