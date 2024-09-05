package classe;

public class clinica extends plano {

	public clinica(String empresa, String nome, String cnpj) {
		super(empresa);
	}
	
	private String nome;
	private String cnpj;
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	@Override
	public String toString() {
		return "clinica [nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	
}
