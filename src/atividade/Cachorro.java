package atividade;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super();
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nRa�a: " + getRaca() + "\nColeira: " + getUsaColeira() 
		+ "\nSom do c�o" + somDoAnimal();
	}

	@Override
	public String somDoAnimal() {
		return "Auau";
	}

	public void setUsaColeira(int showConfirmDialog) {
		// TODO Auto-generated method stub
	}
}
