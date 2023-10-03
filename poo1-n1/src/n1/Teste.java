package n1;

public class Teste {
	public static void apresentacao(Pessoa p) {
        p.getApresentacao();
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setMatricula("123456789");

        Professor professor = new Professor();
        professor.setNome("Leonardo");
        professor.setSiape("666");
        professor.setFormacao("Doutor");

        Disciplina matematica = new Disciplina();
        matematica.setNome("Matemática");
        matematica.setProfessor(professor);
        matematica.setN1(5.0);
        matematica.setN2(8.0);
        matematica.calcularMedia(new MediaAritmetica());

        Disciplina quimica = new Disciplina();
        quimica.setNome("Química");
        quimica.setProfessor(professor);
        quimica.setN1(9.0);
        quimica.setN2(9.5);
        quimica.calcularMedia(new MediaPonderada());

        aluno.adicionarDisciplina(matematica);
        aluno.adicionarDisciplina(quimica);

        apresentacao(aluno);
        apresentacao(professor);
    }
}
