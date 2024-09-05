package classe;

public class plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	public plano(String empresa) {
		this.empresa = empresa;
	}
	
	public double getValorPago() {
		return valorPago;
	}

	public String toString() {
		return "Plano: " + empresa + "ValorPago: " + String.format("%.2f", valorPago);
	}
	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorIss/100;
	}
}
