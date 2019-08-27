
public class ExemploCondicionais {
	public static void main(String[] args) {
		
		int idade = 16;
		if(idade >= 16) {
			System.out.println("Já pode votar!");
		}
		
	
		if(idade >= 16) {
			System.out.println("Já pode votar!");
		}else {
			System.out.println("Ainda não vota!");
		}
		
		if(idade >= 65) {
			System.out.println("Pode votar, mas não precisa!");
		}else if ( (idade < 65) && (idade >= 18))  {
			System.out.println("É obrigado a votar!");
		}else if ( (idade < 18) && (idade >= 16))  {
			System.out.println("Pode votar, mas não é obrigatório!");
		}else {
			System.out.println("Não pode votar!");
		}
		
		
		char nota = 'A';
		
		switch (nota) {
		case 'A':
			System.out.println("Ótimo");
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
			System.out.println("Nota inválida!");
		}
		
		
		
	}

}


