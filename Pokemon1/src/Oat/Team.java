package Oat;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public List<Pokemon> pokemons = new ArrayList<Pokemon>();

    public void adicionar(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void remover(Pokemon pokemon) {
        pokemons.remove(pokemon);
    }

    public void listarTime() {
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println(pokemons.get(i).getName());
        }
    }
}

