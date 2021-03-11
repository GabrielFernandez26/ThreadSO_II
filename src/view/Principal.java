package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int vet [] = new int [5];
		
		for (int i = 0; i < vet.length; i++) {
			Thread t = new ThreadController(i);
			t.start();
		}
	}

}
