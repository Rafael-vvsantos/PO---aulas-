package nave_espacial;
import java.util.*;

public class EstacionamentoDeNave {
	private List<Nave> navesEstacionadas = new ArrayList<Nave>();

	public List<Nave> getNavesEstacionadas() {
		return navesEstacionadas;
	}

	public void setNavesEstacionadas(List<Nave> navesEstacionadas) {
		this.navesEstacionadas = navesEstacionadas;
	}
	
	public void recberNave(Nave Nave) {
		if(Nave.pousar() == true) {
			navesEstacionadas.add(Nave);
			System.out.println("Nave" + Nave.getId() + "estacionamento");
		}else {
			System.out.println("Nave" + Nave.getId() + "não pode ser estacionada");
		}
		
	}
	
	public void tamanhoLista () {
		System.out.println(navesEstacionadas.size());
	}
	
	public void imprimiLista() {
		for(int i = 0; i < navesEstacionadas.size(); i++) {
			System.out.println(navesEstacionadas.get(i).getId());
		}
	}
	public void liberarNave(Nave Nave) {
		if(Nave.decolar() == true) {
			navesEstacionadas.remove(Nave);
			System.out.println("Nave" + Nave.getId() + "decolando");
		}else {
			System.out.println("Nave" + Nave.getId() + "não pode ser decolada");
		}
	}
	
}
