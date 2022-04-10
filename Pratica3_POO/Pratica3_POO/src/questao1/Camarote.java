package questao1;

public class Camarote extends Ingresso {
    public String locCamarote;
    public double valAdicional;
    
    
	public Camarote(double valor, String locCamarote, double valorAdicional) {
		super(valor);
		this.locCamarote = locCamarote;
		this.valAdicional = valAdicional;
	}
	public void ingressoDoCamarote(){
		double valCamarote = valAdicional+getValor();
		System.out.printf("Ingresso Camarote - R$ %.2f e o seu local é: %s \n", valCamarote, locCamarote);
	}
}
