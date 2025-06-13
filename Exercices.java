import java.util.Scanner; // Pour les inputs

public class Exercices{

	public static void main(String[]  args){
		// EXERCICE 1
		System.out.println("Bonjour");



		// EXERCICE 2
		System.out.println("Bienvenue dans la calculatrice Java !!\n");

		System.out.println("Veuillez entrer deux nombres : ");
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
		System.out.println("La division de " + a + " par " + b + " est égale à " + div + "\n");


		// EXERCICE 3
		 System.out.println("Échange de ces deux entiers avec JAVA");
		System.out.println("Vous avez entré a = "+ a + " et b = "+ b + "\n" );
		int x = a;
		int c = b;
		int d = x;
		System.out.println("Ces deux entiers échangés font a = "+ c + " et b = " + d + "\n" );


		// EXERCICE 4
		System.out.println("Regardons si vos entrées sont pairs ou impairs ou divisibles par 3");
		/* parité */
		System.out.println((c % 2 == 0)? c + " est un nombre pair" :c +  " est impair");
		System.out.println((c % 3 == 0)? c + " est divisible par 3": c + " est non divisible par 3");


		//EXERCICE 6
		
	};
}
