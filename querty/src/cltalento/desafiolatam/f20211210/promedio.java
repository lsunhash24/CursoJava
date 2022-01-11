package cltalento.desafiolatam.f20211210;

public class promedio {

	public static void main(String[] args) {
		if (args.length > 1)
		{
			sumar(args);
			
		}else if(args.length==0)
			{
				System.out.println("Infrese número de visitas");
			}
			
			
		}


	public static void sumar(String[] args)
	{
		int suma=0;
		for (int i = 0; i < args.length; i++) 
		{
			System.out.println("paramatro i " + i + "," + args[i]);
			suma = suma + Integer.parseInt(args[i]);
		}
			
		System.out.println("La suma es : " +suma);	
			
		}
		
		
	}
	
	

