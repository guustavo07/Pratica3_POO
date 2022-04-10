package questao1;

public class Vip extends Ingresso {
    public double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    
    public void imprimeIngresso(){
    	double valVip = valorAdicional+getValor();
        System.out.printf("Ingresso Vip R$ %.2f \n", valVip);
    }
}
