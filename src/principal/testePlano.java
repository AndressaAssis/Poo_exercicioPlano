package principal;

import classe.anestesista;
import classe.clinica;
import classe.medico;

public class testePlano {

	public static void main(String[] args) {
		
		clinica clinica = new clinica("SulAmerica" , "SulAmerica" , "00.000.000/0001");	
		medico medico = new medico("Empresa X" , "Dr. Socorro DEVS" , 123456);
		anestesista anestesista = new anestesista("Empresa" , "Ricardo" , 1234 , "Geral");
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		System.out.println("O valor do pagamento da clinica por plano é: " + clinica.calcularPagamento());
		System.out.println("O valor do pagamento do médico por plano é: " + medico.calcularPagamento());
		System.out.println("O valor do pagamento do(a) anestesista(o) por plano é: " + anestesista.calcularPagamento());
	}

}
