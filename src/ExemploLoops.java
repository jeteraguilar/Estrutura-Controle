
public class ExemploLoops {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println("----- Exemplo com while -----");
		while(i > 0) {
			System.out.printf("i:%d \n",i);
			i--;
		}
		
		
		i = 10;
		System.out.println("----- Exemplo com do-while -----");
		do{
			System.out.printf("i:%d \n",i);
			i--;
		}while(i > 0); 
		
		
		System.out.println("---- Exemplo com for ----");
		for(int j=10; j>0; j--) {
			System.out.printf("j:%d \n",j);
		}
	
		System.out.println("---- Exemplo for-each para idades -----");
		int[] idades = { 10, 34, 56, 78, 35, 6, 88, 40 }; //array de idades do tipo int
		for(int idade : idades) {
			System.out.printf("idade: %d anos \n",idade);
		}
		
		System.out.println("---- Teste do uso do break ----- ");
		
		for(int idade : idades) {
			System.out.printf("Testando idade %d... \n",idade);
			if(idade > 40) {
				System.out.printf("Achei a idade maior que 40! : %d anos \n",idade);
				break;
			}
		}

		System.out.println("---- Teste do uso do continue ----- ");
		
		for(int idade : idades) {
			if(idade > 40) {
				System.out.printf("Achei a idade maior que 40! : %d anos ",idade);
				System.out.println("Armazenando a idade encontrada...");
				continue;
			}
			System.out.printf("descartando a idade %d... \n",idade);
		}
		
		
		
		System.out.println("---- Exemplo de labeled Loops ----");
		externo:
		for(int k=0;k<10;k++) {
			for(int m=0;m<10;m++) {
				if(k==m) {
					break externo;
				}
				System.out.printf("k:%d m:%d \n",k,m);
			}
		}
		
		
		
		
		
		
		
		
	}

}


