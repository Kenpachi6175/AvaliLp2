package main;
public class Consumidor {
	    private int id;
		private int demanda;
	    private int energiaConsumida;

	    public Consumidor(int id, int demanda) {
	        
	        this.id = id;
	        this.demanda = demanda;
	    }

	
	    
	    public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public int getDemanda() {
			return demanda;
		}



		public void setDemanda(int demanda) {
			this.demanda = demanda;
		}



		public int getEnergiaConsumida() {
			return energiaConsumida;
		}



		public void setEnergiaConsumida(int energiaConsumida) {
			this.energiaConsumida = energiaConsumida;
		}



		public void adicionarEnergia(int energia) {
	        if (energia < 0) {
	        
	        }
	        energiaConsumida += energia;
	    }


	 
}