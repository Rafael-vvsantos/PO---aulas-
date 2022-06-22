package Herancas;

public class Tecnico extends Aluno {
	private int registroProfissional;
	
	public void pratica(int status) {
		if (status == 1 ) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
