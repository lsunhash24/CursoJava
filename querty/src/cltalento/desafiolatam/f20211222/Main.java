package cltalento.desafiolatam.f20211222;

import java.util.ArrayList;

import cltalento.desafiolatam.f20211222.clases.Cardiologo;
import cltalento.desafiolatam.f20211222.clases.Medico;
import cltalento.desafiolatam.f20211222.clases.Neurologo;

public class Main {
	
	public static void main (String[] args) {
	
	Medico medico = new Medico("House","1-9",55);
	//medico.consulta();
	System.out.println("******************************");
	
	/*
	 * Polimorfismo
	 */
	
	Medico neurologo = new Neurologo("House","1-9",55,"Neurologia");
	//neurologo.consulta();
	System.out.println("******************************");
	
	Medico cardiologo = new Cardiologo("House","1-9",55,"Cardiología");
	//cardiologo.consulta();
	
	ArrayList<Medico> medicos = ArrayList<Medico>();
	
	
	}

}
