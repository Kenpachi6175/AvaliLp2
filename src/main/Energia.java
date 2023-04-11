package main;

public class Energia {
    private int valor;
    private int data;
    private int id;

    public Energia(int valor, int data, int id) {
        
        this.valor = valor;
        this.data = data;
        this.id = id;
    }

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}


