package Oat;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    public List<Pokemon> pokedex1 = new ArrayList<Pokemon>();

    public void adicionarPokedex(Pokemon pokemon) {
        if (pokemon.getId() != pokemon.getId()) {
            pokedex1.add(pokemon);
        }
        return;
    }

    public void listarPokedex() {
        for (int i = 0; i < pokedex1.size(); i++) {
            System.out.println(pokedex1.get(i).getName());
        }
    }
}