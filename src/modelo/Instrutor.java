package modelo;

public class Instrutor extends Pessoa
{

	private String email;
    private Curso curso;

    public Instrutor() {
        
    }

    public Instrutor(String nome, String email, Curso curso) {
        super(nome);
        this.email = email;
        this.curso = curso;
    }

    //Sobrescrita do m�todo getNome da classe Pessoa(superclasse ou classe m�e ou classe pai)
    public String getNome() {
        return "Nome do instrutor:" + super.getNome();
    }
    
    public void setNome(String nome) {
    	super.setNome(nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
