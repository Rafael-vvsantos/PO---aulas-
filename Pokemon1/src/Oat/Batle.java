package Oat;

public class Batle {
	protected int dano;
	
	public void luta(Pokemon poke1 , Pokemon poke2) {
		System.out.println(poke1.getName() + "X" + poke2.getName() );
	}
	
	public void Ataque(Pokemon pokeRecebe) {
		dano = pokeRecebe.getHp();
		pokeRecebe.setHp(dano - 2);
	}
}
