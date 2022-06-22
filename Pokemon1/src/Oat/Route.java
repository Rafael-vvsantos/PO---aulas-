package Oat;

public class Route {
    private String rota;
    private int id;

    Route(String rota, int idRota) {
        this.rota = rota;
        setId(idRota);
    }

    public String getName() {
        return rota;
    }

    public void setName(String rota) {
        this.rota = rota;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}


