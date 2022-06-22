package Oat;

public class Move {
    private String name;
    private Tipo tipo;
    private int power;
    private int acc;
    private int pp;

    Move(String mname, Tipo htipo, int hpower, int hacc, int hpp) {
        name = mname;
        setTipo(htipo);
        setPower(hpower);
        setAcc(hacc);
        setPp(hpp);
    }

    public String getName() {
        return name;
    }

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

}
