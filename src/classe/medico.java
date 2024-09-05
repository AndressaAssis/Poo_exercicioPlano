package classe;

public class medico extends plano {
	
	public medico (String empresa, String nome, int crm) {
		super(empresa);
	}

	protected String nome;
	protected int crm;
	
	public String getNome() {
		return nome;
	}
	public int getCrm() {
		return crm;
	}
	@Override
	public String toString() {
		return "medico [nome=" + nome + ", crm=" + crm + "]" + super.toString();
	}
	
	public double calcularPagamento() {
		return super.calcularPagamento() * 1.10;
	}
}
