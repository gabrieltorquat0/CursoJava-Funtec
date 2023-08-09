import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPerguntas {
	public static void main(String args[]) {
		
		//CRIANDO LISTAS PERGUNTAS E RESPOSTAS, CHAMANDO O SCANNER TAMBÉM
		List<Perguntas> listPerg = new ArrayList<>();
		List<Respostas> listResp = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		//ADICIONANDO PERGUNTAS NA LISTA
		listPerg.add(new Perguntas("Telefonou para a vítima?"));		
		listPerg.add(new Perguntas("Esteve no local do crime?"));		
		listPerg.add(new Perguntas("Mora perto da vítima?"));	
		listPerg.add(new Perguntas("Devia para a vítima?"));
		listPerg.add(new Perguntas("Já trabalhou com a vítima?"));
		
		System.out.println("RESPONDA COM (S) ou (N)");
		
		// CRIANDO UM LAÇO DE REPETIÇÃO PARA IMPRIMIR UMA PERGUNTAR POR VEZ E PEGAR A RESPOSTA TAMBÉM
        for (Perguntas perg : listPerg) {
            System.out.println(perg);
            listResp.add(new Respostas(scanner.nextLine()));
        }
        
        // VERIFICANDO A QUANTIDADE DE RESPOSTA "S"
        
        int contador = 0;
        
        for (Respostas resp : listResp) {
            System.out.println(resp);
            
            if(resp.respostaS()) {
            	contador++;
            }
        }
		
        // IMPRIMINDO RESULTADOS ESPECIFICOS PARA A QUANTIDADES DE "S"
        
        switch(contador) 
        {
        case 0:
        case 1: 
        	System.out.println("Inocente");
        	break;
        case 2: 
        	System.out.println("Suspeita");
        	break;
        case 3: 
        case 4: 
        	System.out.println("Cúmplice");
        	break;
        case 5: 
        	System.out.println("Assassina");
        	break;
        }        
	}	
}
