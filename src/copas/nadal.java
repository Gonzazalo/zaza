package copas;

import java.util.Scanner;

public class nadal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int intentos=in.nextInt();
		
		for(int i =0;i<intentos;i++){
		int dia=in.nextInt();
		int mes=in.nextInt();
		if(dia==25 && mes==12){
			System.out.println("SI");
		}else{
			System.out.println("NO");
		}
		}
		
	}

}
