package atividade;

public class Gato extends Animal {
	
	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nRaça: " + getRaca() + "\nColeira: " + getUsaColeira() 
		+ "\nSom do gato" + somDoAnimal();
	}

	public Gato() {
		super();
	}

	@Override
	public String somDoAnimal() {
		return "Miau";		
	}
	

	public void setUsaColeira(int showConfirmDialog) {
		// TODO Auto-generated method stub
	}
}
