package n1;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private String matricula;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public void getApresentacao() {
        System.out.println("Aluno: " + getNome() + " - Matricula: " + getMatricula());
        System.out.println("************ Disciplinas Cursadas***********");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("Nome: " + disciplina.getNome() + " - Professor: " + disciplina.getProfessor().getNome());
            System.out.println("Notas");
            System.out.println("N1: " + disciplina.getN1() + ", N2: " + disciplina.getN2() + ", Média: " + disciplina.getMedia());
            System.out.println(disciplina.isAprovacao() ? "Aprovado" : "Reprovado");
            System.out.println("--------------------------------");
        }
    }
}
