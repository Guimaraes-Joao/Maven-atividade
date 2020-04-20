package guimaraes.joao.mavenatividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenatividadeApplication {

	public static void main(String[] args) {

		SpringApplication.run(MavenatividadeApplication.class, args);

		Caixa caixaeletronico=new Caixa();

		caixaeletronico.setValorDeposito(10000);
		caixaeletronico.setValorDeSaque(5);

		System.out.println("\f Valor atual do saldo: R$"+caixaeletronico.verificarSaldo()
				+"\nValor á depósito: R$"+caixaeletronico.depositarValor()
				+"\nValor á sacar: R$"+caixaeletronico.sacarValor()
				+"\nValor atual do saldo: R$"+caixaeletronico.verificarSaldo());

	}

}
