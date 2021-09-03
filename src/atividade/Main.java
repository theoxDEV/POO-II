package atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato cat = new Gato();
		
		cat.setNome(JOptionPane.showInputDialog("Qual o nome do seu gatinho? "));
		cat.setFilo(JOptionPane.showInputDialog("Qual é a raça do seu gato? "));
		cat.setUsaColeira(JOptionPane.showConfirmDialog(null, 
				"Seu gato usa coleira ?", "", JOptionPane.YES_NO_OPTION));
		
		Cachorro dog = new Cachorro();
		
		dog.setNome(JOptionPane.showInputDialog("Qual o nome do seu cão? "));
		dog.setFilo(JOptionPane.showInputDialog("Qual é a raça do seu cão ? "));
		dog.setUsaColeira(JOptionPane.showConfirmDialog(null, 
				"Seu cão usa coleira ?", "", JOptionPane.YES_NO_OPTION));
		
		System.out.println(cat.toString());
		System.out.println(dog.toString());
		
	}
}
