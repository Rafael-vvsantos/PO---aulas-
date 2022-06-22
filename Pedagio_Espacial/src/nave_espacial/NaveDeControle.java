package nave_espacial;

public class NaveDeControle extends Nave {
	
	int poderDeFogo;
	
	NaveDeControle( int poderDeFogo ,int id, NaveStatus status) {
		this.poderDeFogo = poderDeFogo;
		this.id = id;
		this.status = status;
	}

	
	public int getPoderDeFogo() {
		return poderDeFogo;
	}

	public void setPoderDeFogo(int poderDeFogo) {
		this.poderDeFogo = poderDeFogo;
	}
}
