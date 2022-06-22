package Herancas;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa" + this.getNome());
	}
	
	@Override //sobrepor o metedo com ou sem ouverride
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " e bolsista! Pagamento faciltado!");
	}
	
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
