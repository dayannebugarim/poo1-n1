package n1;

public class Disciplina {
	private String nome;
    private Professor professor;
    private double n1;
    private double n2;
    private double media;
    private boolean aprovacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public boolean isAprovacao() {
        return aprovacao;
    }
    
    public void calcularMedia(CalcularMedia calcularMedia) {
        this.media = calcularMedia.calc(n1, n2);
        this.aprovacao = this.media >= 6.0;
    }
}
