package Herancas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classe(quando não tem filho usa o final) ou metodo final(quando o metodo não pode ser sobreposto final) 
		//Pessoa p1 = new Pessoa(); // não pode ser instanciado por ser abstract
		/*Visante v1 = new Visante();
		v1.setNome("Jurema");
		v1.setIdade(22);
		v1.setSexo("F");
		System.out.println(v1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Orindo");
		a1.setMatricula(111111);
		a1.setCurso("Infomática");
		a1.setIdade(16);
		a1.setSexo("H");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(11112);
		b1.setNome("Kaura");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Kaura");
		p1.setSexo("M");
		p1.setIdade(50);
		p1.setEspecialidade("Transeiro");
		p1.setSalario(1500.00f);
		System.out.println("Antes " + p1.getSalario());
	    p1.receberAumento(500.00f);
		System.out.println("Depois " +p1.getSalario());
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Osmar");
		t1.setMatricula(11112);
		t1.setSexo("M");
		t1.pagarMensalidade();
		t1.setRegistroProfissional(123456798);
		
	    t1.pratica(1);
		
		
		
	}

}
