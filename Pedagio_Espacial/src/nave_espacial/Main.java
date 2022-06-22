package nave_espacial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nave nave1 = new NaveDeControle(100, 1 , NaveStatus.Viajando);
		Nave nave2 = new NaveDeTransporte(100, 2 , NaveStatus.Viajando);
		Nave nave3 = new NaveDeTransporte(100, 3 , NaveStatus.Viajando);
		
		Nave nave4 = new NaveDeControle(100, 4 , NaveStatus.Viajando);
		Nave nave6 = new NaveDeTransporte(100, 4 , NaveStatus.Viajando);
		Nave nave7 = new NaveDeTransporte(100, 7 , NaveStatus.Viajando);
		
		System.out.println("Hello, word!");
		
		EstacionamentoDeNave estacionamento = new EstacionamentoDeNave();
		
		estacionamento.recberNave(nave1);
		estacionamento.recberNave(nave2);
		estacionamento.recberNave(nave3);
		estacionamento.tamanhoLista();
		estacionamento.recberNave(nave4);
		estacionamento.recberNave(nave6);
		estacionamento.recberNave(nave7);
		
		estacionamento.tamanhoLista();
		estacionamento.imprimiLista();
	
	}
		
	

}
