package nave_espacial;

public class NaveDeTransporte extends Nave {

	private int capacidade;
	
	NaveDeTransporte( int capacidade ,int id, NaveStatus status) {
		this.capacidade = capacidade;
		this.id = id;
		this.status = status;
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
