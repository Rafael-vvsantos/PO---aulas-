package nave_espacial;

public abstract class Nave {
	
	protected int id;
	protected NaveStatus status;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean pousar() {
		if(this.status == NaveStatus.Viajando) {
			this.status = NaveStatus.Viajando;
			return true;
		}
		return false;
	}
	
	public boolean decolar() {
		if(this.status == NaveStatus.Parada) {
			this.status = NaveStatus.Parada;
			return true;
		}
		return false;
	}
	
}
