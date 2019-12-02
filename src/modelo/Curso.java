package modelo;

public class Curso {

	private int id;
	private String nome;
	private String datainicio;
	private String datatermino;

	public Curso() {

	}

	public Curso(String nome) {
		super();
		this.nome = nome;

	}

	public Curso(int id, String nome, String datainicio, String datatermino) {
		this.id = id;
		this.nome = nome;
		this.datainicio = datainicio;
		this.datatermino = datatermino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(String datatermino) {
		this.datatermino = datatermino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInstrutor(Object setNome) {

	}

}
