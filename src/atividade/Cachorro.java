package atividade;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super();
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nRaça: " + getRaca() + "\nColeira: " + getUsaColeira() 
		+ "\nSom do cão" + somDoAnimal();
	}

	@Override
	public String somDoAnimal() {
		return "Auau";
	}

	public void setUsaColeira(int showConfirmDialog) {
		// TODO Auto-generated method stub
	}
}
