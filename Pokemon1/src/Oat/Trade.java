package Oat;

public class Trade {
    public void trocar(Team timeA, Team timeB, Pokemon pokemonA, Pokemon pokemonB) {
        timeA.remover(pokemonA);
        timeB.remover(pokemonB);
        timeA.adicionar(pokemonB);
        timeB.adicionar(pokemonA);
    }

}

