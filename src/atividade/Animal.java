package atividade;

public abstract class Animal {
	private String nome;
	private String raca;
	private int usaColeira;
	
	public Animal(String nomeAnimal, String racaAnimal) {
		super();
		this.nome = nomeAnimal;
		this.raca = racaAnimal;
	}
	
	public Animal() {}

	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public String getUsaColeira() {
		if(usaColeira == 1) {
			return "Usa coleira";
		}else {
			return "Não usa coleira";
		}
	}
	
	public void setNome(String nomeAnimal) {
		this.nome = nomeAnimal;
	}
	
	public void setFilo(String filoAnimal) {
		this.raca = filoAnimal;
	}
	
	public void setUsaColeira(int coleira) {
		
		this.usaColeira = coleira;
	}
	
	public abstract String somDoAnimal();
}
