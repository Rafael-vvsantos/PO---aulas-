package Oat;

import java.util.ArrayList;
import java.util.List;

public class Pokemon extends Status {
    private String name;
    private Tipo tipo;
    private float weight;
    private float size;
    private Move skill;
	private int id;

    Pokemon(String nome, float weight, float size, Tipo tipo, int id, int hp, int atk, int def, int satk, int sdef,
            int speed, int lv , int i) {
        name = nome;
        this.setWeight(weight);
        this.setSize(size);
        this.setTipo(tipo);
        this.setHp(hp);
        this.setAtk(atk);
        this.setDef(def);
        this.setSatk(satk);
        this.setSdef(sdef);
        this.setSpeed(speed);
        this.setLv(lv);
        this.setId(id);

    }

    public List<Move> habilidades = new ArrayList<Move>();

    void criarHabilidade() {
        Move teste = new Move("teste", Tipo.DRAGAO, 1, 1, 1);
    }

    String getName() {
        return name;
    }

    void ensinarHabilidade(Move habilidade) {

        habilidades.add(habilidade);
    }

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public Move getSkill() {
		return skill;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", tipo=" + tipo + ", weight=" + weight + ", size=" + size + ", skill=" + skill
				+ ", id=" + id + ", habilidades=" + habilidades + "]";
	}

	public void setSkill(Move skill) {
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
