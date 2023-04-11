package main;
import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.List;
	
	public class Programador {
		public static void main(String[] args) {
			
			
	        Scanner scanner = new Scanner(System.in);

	       
	        List<Consumidor> consumidores = new ArrayList<>();
	        for (int i = 1; i <= 3; i++) {
	            System.out.println("Informe o numero de registro do consumidor " + i + ":");
	            int id = scanner.nextInt();
	            
	            System.out.println("Informe a energia inicial do consumidor " + i + ":");
	            int energiaInicial = scanner.nextInt();
	            
	            consumidores.add(new Consumidor(id, energiaInicial));
	        }

	       
	        Distribuidora distribuidora = new Distribuidora(consumidores);

	       
	        System.out.println("Informe a quantidade de energia a ser distribuída:");
	        int quantidadeEnergia = scanner.nextInt();
	    
	        System.out.println("Informe o ano da energia a ser distribuída:");
	        int anoEnergia = scanner.nextInt();
	        
	        System.out.println("Informe o mês da energia a ser distribuída (1 a 12):");
	        int mesEnergia = scanner.nextInt();
	        
	        Energia energia = new Energia (quantidadeEnergia, anoEnergia, mesEnergia);
	        
	        distribuidora.distribuirEnergia(energia);
	       
	        System.out.println("------------------------");
	        for (Consumidor consumidor : consumidores) {
	            System.out.println("Consumidor " + consumidor.getId() + ": " + consumidor.getEnergiaConsumida());
	        }
	        System.out.println("------------------------");
	        
	        scanner.close();
	    }
	}