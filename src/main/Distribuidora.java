package main;
import java.util.List;



public class Distribuidora {
	  private List<Consumidor> consumidores;

	    public Distribuidora(List<Consumidor> consumidores) {
	        this.consumidores = consumidores;
	    }

	    public void distribuirEnergia(Energia energia) {
	        int energiaDistribuida = energia.getValor() / consumidores.size();
	        for (Consumidor consumidor : consumidores) {
	            consumidor.adicionarEnergia(energiaDistribuida);
	        }
	    }
	}