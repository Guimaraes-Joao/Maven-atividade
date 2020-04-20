package guimaraes.joao.mavenatividade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * @Author João Pedro
 * @version 1.0
 */
public class Caixa {

    private double saldo;
    private double valorDeSaque;
    private double valorDeposito;

    public double sacarValor(){
        this.saldo = this.saldo - valorDeSaque;
        return this.saldo;
    }
    public double depositarValor(){
        this.saldo = this.saldo + valorDeposito;
        return this.saldo;
    }
    public double verificarSaldo(){
        return this.saldo;
    }

}
