package questão3;

public class Veiculo {
	private String placa;
	private int ano;
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Veiculo() {
		Veiculo automovel = new Veiculo("", 0);
	}
	public void exibirDados() {
		System.out.println("PLACA: " + placa + "\n Ano" + ano);
	}
}
