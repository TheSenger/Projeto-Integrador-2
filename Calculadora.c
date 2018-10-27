#include <stdio.h>

main() {         
	 //Criação das variaveis
    
		float Numero1;
	
		float Numero2;
	 
			
	 //inicializar variavel numerica c/ zero
		
		Numero1 = Numero2 = 0;
	
	 //Atribuição de valor
	
		printf ("Digite o valor do primeiro numero:");
	
		scanf ("%f", &Numero1);	
	
		printf ("\nDigite o valor do segundo numero:");
	 
		scanf ("%f", &Numero2);
	 
	 //Mostrar o resultado dos calculos na tela
	 
		printf ("\nO valor da divisão dos dois numeros e: %.2f \n", Numero1 / Numero2);
	 
		printf ("O valor da multiplicacao dos dois numeros e: %.2f \n", Numero1 * Numero2);
	 
		printf ("O valor da soma dos dois numeros e: %.2f \n", Numero1 + Numero2);
	 
		printf ("O valor da subtracao dos dois numeros e: %.2f", Numero1 - Numero2);
		
		if (Numero2=0, printf ( "nao pode" ));
	}
