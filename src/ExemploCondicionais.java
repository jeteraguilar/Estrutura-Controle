
public class ExemploCondicionais {
	public static void main(String[] args) {
		
		int idade = 16;
		if(idade >= 16) {
			System.out.println("J� pode votar!");
		}
		
	
		if(idade >= 16) {
			System.out.println("J� pode votar!");
		}else {
			System.out.println("Ainda n�o vota!");
		}
		
		if(idade >= 65) {
			System.out.println("Pode votar, mas n�o precisa!");
		}else if ( (idade < 65) && (idade >= 18))  {
			System.out.println("� obrigado a votar!");
		}else if ( (idade < 18) && (idade >= 16))  {
			System.out.println("Pode votar, mas n�o � obrigat�rio!");
		}else {
			System.out.println("N�o pode votar!");
		}
		
		
		char nota = 'A';
		
		switch (nota) {
		case 'A':
			System.out.println("�timo");
			break;
		case 'B':
			System.out.println("Bom");
			break;
		case 'C':
			System.out.println("Regular");
			break;
		case 'D' :
			System.out.println("Ruim");
			break;
		default:
			System.out.println("Nota inv�lida!");
		}
		
		
		
	}

}


