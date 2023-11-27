package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           Bem vindos! World Games Brasil!           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Computadores                         ");
			System.out.println("            2 - Televisões                           ");
			System.out.println("            3 - Monitores                            ");
			System.out.println("            4 - Playstation                          ");
			System.out.println("            5 - Xbox                                 ");
			System.out.println("            6 - Nitendo                              ");
			System.out.println("            7 - Sair                                  ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("Seja bem vindo a loja! Volte sempre :) ");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Computadores\n\n");

					break;
				case 2:
					System.out.println("Televisões\n\n");

					break;
				case 3:
					System.out.println("Monitores\n\n");

					break;
				case 4:
					System.out.println("Playstation\n\n");

					break;
				case 5:
					System.out.println("Xbox\n\n");

					break;
				case 6:
					System.out.println("Nitendo\n\n");				

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Rafael Cabral ");
		System.out.println("Generation Brasil - rafaelnc22@gmail.com");
		System.out.println("https://github.com/Raafa22");
		System.out.println("*********************************************************");
	}
}

		
		

