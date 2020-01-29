package copas;

import java.util.Scanner;

public class copas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int copas;
		int viaje=0;
		
		do{
			copas=in.nextInt();
			do{
			if(copas>2){
				viaje++;
				copas--;
			}else if(copas==2){
				viaje++;
				copas=0;
			}
			
			}while(copas>0);
			if(viaje!=0){
				System.out.println(viaje);
			}else{
			System.out.println(" ");
			}
			
		}while(copas>0);
		


	}

}
