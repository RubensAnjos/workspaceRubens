package TakeoAdoExe;

import java.util.Random;
import java.util.Scanner;

public class TakeoAdo10Exe01 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Random aleatorio = new Random();
	int adivinha = aleatorio.nextInt(101);
	int tentativa=-1,cont=0;
	System.out.println("Voce Tem 5 tentativas para acertar um numero de 0 a 100");
	
	do{System.out.println("Digite um numero para tentar adivinhar");
	 cont++;
	 System.out.println("Tentativa numero: "+cont);
		tentativa=entrada.nextInt();
	if(tentativa == (adivinha-1) || tentativa ==(adivinha +1)) {
		 System.out.println(" Voce está quente");
	  }
	  else if(tentativa > adivinha)
		 System.err.println("Voce digitou um numero MAIOR que o escolhido pelo jogo");
	 else if(tentativa < adivinha)
		 System.err.println("Voce digitou um numero MENOR que o escolhido pelo jogo");
	
	}while(tentativa != adivinha && cont!=5);
	if(tentativa == adivinha)
	System.out.println("Parabens Você acertou \n digite F11 para jogar novamente");
	else
		System.err.println("GAME OVER  O correto era"+adivinha+"\n precione F11 para jogar novamente :)");
	
	

	
}
}
