package pratica_while_e_If;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
     Scanner digite = new Scanner(System.in);
     System.out.println("Sistema de calculo de salario");
     boolean menu = true;
     double soma = 0;
     
     while(menu) {
    	System.out.println("Digite sua opcao");
    	System.out.println("----------------------");
    	System.out.println("1 = calcular salario \n2 = Sair");
        int escolha = digite.nextInt();
        
        if(escolha == 1) {
           System.out.println("Digite a funcao");
           String funcao = digite.next();
           System.out.println("-------------------");
           
           System.out.println("Desconto de funcionario com a empresa");
           double empresa = digite.nextDouble();            
      
           System.out.println("-------------------");
           System.out.println("Digite o salario base sem desconto");
           double salario = digite.nextDouble();
           if(salario >= 2000) {
            soma = (salario - empresa) % 0.75;    	   
        	   
        	   
           }else if(salario >= 2500) {
        	   soma = (salario - empresa) % 0.9;   
        	   
           }else {
        	   soma = (salario - empresa) - 750.50;   
           }
           
           System.out.println("A funcao: " + funcao + "Ganha o salario de R$: " + soma);
           
        }else {
        	  
        		menu = false;
        
        }
         	
        
    	
    	 
     };
     
     
		
		
		
     digite.close();
	}

}
