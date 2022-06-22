package Oat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pikachu = new Pokemon("Pikachu", 1, 1, Tipo.ELETRICO, 01, 100, 40, 1, 1, 1, 1, 1, 0);
        Pokemon charmander = new Pokemon("teste", 1, 1, Tipo.FOGO, 02, 100, 1, 1, 1, 1, 1, 1, 0);
        Team time1 = new Team();
        Team time2 = new Team();
        
        System.out.println(pikachu.toString());
       Trainer treinador = new Trainer("teste", 12, 1, 111, time1);
       Trainer bola = new Trainer("Bola", 27, 1, 0, time2);

        time1.adicionar(pikachu);

        time2.adicionar(charmander);

        Trade troca = new Trade();
        troca.trocar(time1, time2, pikachu, charmander);
        
	}

}
