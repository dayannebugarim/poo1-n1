package n1;

public class Professor extends Pessoa {
    private String siape;
    private String formacao;

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

	@Override
	public void getApresentacao() {
		System.out.println("**** Dados de Professor ****");
        System.out.println("Nome: " + getNome());
        System.out.println("SIAPE: " + getSiape());
        System.out.println("Nivel: " + getFormacao());
	}
}