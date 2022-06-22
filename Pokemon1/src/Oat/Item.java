package Oat;

public class Item {

    public enum ItemTipo {
        Escape,
        Evolution,
        Valuable,
        Flutes,
        Fossil,
        Mulch,
        Repels,
        Scents,
        Held
    }

    private int id;
    private float valor;
    private ItemTipo itemTipo;

    Item(int codigo, float valor, ItemTipo itemtipo) {
        this.setValor(valor);
        setId(codigo);
        setItemTipo(itemtipo);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public ItemTipo getItemTipo() {
		return itemTipo;
	}

	public void setItemTipo(ItemTipo itemTipo) {
		this.itemTipo = itemTipo;
	}
}
