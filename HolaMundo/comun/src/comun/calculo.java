package comun;

import java.util.Scanner;



public class calculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculo kalculo = new calculo();
		
		while(true){
			
			System.out.println("-------------------");
			System.out.println("1 = MCD - 2 = MCM - 3 = Primo");
			System.out.println("-------------------");
			
			Scanner scan = new Scanner(System.in);
			int modo= scan.nextInt();
			
			switch (modo)
			{
			case 1:
				System.out.println("introduce numero");
				int num1= scan.nextInt();
				System.out.println("introduce otro numero");
				int num2= scan.nextInt();
				
				System.out.println (kalculo.calmcd(num1, num2));
			break;
			
			case 2:
				System.out.println("introduce numero");
				int num3= scan.nextInt();
				System.out.println("introduce otro numero");
				int num4= scan.nextInt();
				
				System.out.println (kalculo.calmcm(num3, num4));	
			break;
			case 3:
				System.out.println("introduce un numero");
				int num5= scan.nextInt();
				System.out.println(kalculo.calPrimo(num5));
			break;
			}
			
			
			
	
		}
	
	}
	public int calmcd(int a, int b){
		int t,x,t1;
		
		t=1; //constante inicializada para evitar la multiplicidad x cero
		x=2; //constante inicial

		while (x<=a && x<=b)
		{
		while (a%x==0 && b%x==0)
		{
		a=a/x;
		b=b/x;
		t=t*x;
		}
		x++;
		}
		t1=t;
		t=t*a*b;
	return t1;	
	}
		
	

	public int calmcm(int a, int b){
		int t,x,t1;
		
		t=1; //constante inicializada para evitar la multiplicidad x cero
		x=2; //constante inicial

		while (x<=a && x<=b)
		{
		while (a%x==0 && b%x==0)
		{
		a=a/x;
		b=b/x;
		t=t*x;
		}
		x++;
		}
		t1=t;
		t=t*a*b;
		
		return t;
		}
	

	public boolean calPrimo(int numero){
		
			int aux;
			
			for(int cont=2;cont<numero;cont++)
			
			{
			
			aux=numero%cont;
			
			if(aux==0)
			
			return false;
		
			}
			
			return true;

		
	}

}
