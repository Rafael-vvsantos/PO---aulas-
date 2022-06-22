package Herancas;
// herança para diferença tem tudo que pessoa tem porém a uma especialização(novos atributos ou metodo)
public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando Mensalidade" + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
