import java.util.Scanner; // Pour les inputs

public class Exercices{

	public static void main(String[]  args){
		// EXERCICE 1
		System.out.println("Bonjour\n");



		// EXERCICE 2
		System.out.println("Bienvenue dans la calculatrice Java !!\n Veuillez entrer un premier nombre : \n");

		System.out.println("Veuillez entrer un deux nombres : \n");
		Scanner A = new Scanner(System.in); // premier nombre
		Scanner B = new Scanner(System.in); // deuxième nombre

		/* lecture des deux nombres */
		int a = (int) A.nextInt();
		int b = (int) B.nextInt();

		/* addition */
		int add = a + b;
		/* produit */
		int produit = a * b;
		/* division */
		int div = a / b;

		System.out.println("L'addition de " + a + " et de " + b + " est égale à " + add);
		System.out.println("Le produit de " + a + " et de " + b + " est égal à " + produit);
		System.out.println("La division de " + a + " et de " + b + " est égale à " + div);


		// EXERCICE 3
		 System.out.println("Échange de ces deux entiers avec JAVA \n");
		System.out.println("Vous avez entrer a = "+ a + "et b = "+ b + "\n" );
		int x = a;
		int a = b;
		int b = x;
		System.out.println("Ces deux entiers évhangés font a = "+ a + "et b = " + b + "\n" );


		// EXERCICE 4
		System.out.println("Regardons si vos entrées sont pairs ou impairs ou divisibles par 3");
	};
}
