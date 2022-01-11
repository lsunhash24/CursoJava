package cltalento.desafiolatam.Poo.models;

public class Zoologico2 {
	//atributos 
	private Ave ave;
	private Oso oso;
	private int diasAbiertos;
	private String direccion;
	
	//constructor vacio 
	public Zoologico2() {
		super();
	}
	//constructor con parametros 
	public Zoologico2(Ave ave, Oso oso, int diasAbiertos, String direccion) {
		super();
		this.ave = ave;
		this.oso = oso;
		this.diasAbiertos = diasAbiertos;
		this.direccion = direccion;
	}
	//get y set
	public Ave getAve() {
		return ave;
	}
	public void setAve(Ave ave) {
		this.ave = ave;
	}
	public Oso getOso() {
		return oso;
	}
	public void setOso(Oso oso) {
		this.oso = oso;
	}
	public int getDiasAbiertos() {
		return diasAbiertos;
	}
	public void setDiasAbiertos(int diasAbiertos) {
		this.diasAbiertos = diasAbiertos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//metodos 
	public int agregarDias(int nuevosDias) {
		int diasTotales= this.diasAbiertos+nuevosDias; //se puede usar this.diasAbiertos o get 
		if(diasTotales <= 7 && diasTotales>0 ) {
			this.diasAbiertos=diasTotales;
		}
		return diasAbiertos;
	}
}