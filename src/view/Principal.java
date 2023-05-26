package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		Arvore arvore = new Arvore();
		for (int i : vetor) {
			arvore.insert(i);
		}
		try {
			arvore.remove(7);
			System.out.println("Infixo: (Após remover 7)");
			arvore.infixSearch();
			System.out.println();
			arvore.remove(6);
			System.out.println("Infixo: (Após remover 6)");
			arvore.infixSearch();
			System.out.println();
			System.out.println("-------------------");
			System.out.println("Prefixo: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.println("Infixo: ");
			arvore.infixSearch();
			System.out.println();
			System.out.println("Pósfixo");
			arvore.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

