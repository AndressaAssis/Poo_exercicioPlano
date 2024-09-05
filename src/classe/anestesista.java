package classe;

public class anestesista extends medico {

	public anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
	}
		
	private String tipoAnestesia;

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return super.toString() + "anestesista [tipoAnestesia=" + tipoAnestesia + "]";
	}
	
	public double calcularPagamento() {
		return super.calcularPagamento() + 1000;
	}
}
