package cl.desafiolatam.clases;

public class Tienda {
	
	private Vendedor vendedor;
	private Cliente cliente;
	private int stock;
	// constructor sin párametros
	public Tienda() {
		super();
	}
	// constructor con parámetros
	public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.stock = stock;
	}
	// accesadores y mutadores
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	// métodos
	@Override
	public String toString() {
		return "Tienda [vendedor=" + vendedor + ", cliente=" + cliente + ", stock=" + stock + "]";
	}
	
	public void existeStock() {
		
		if (this.stock > 0) {
			System.out.println("La cantidad de stock es: "+stock);
		}else {
			System.out.println("Stock no disponible");
		}
	
	}	
	
}
