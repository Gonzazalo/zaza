package copas;

import java.util.Scanner;

public class meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int tmeses[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int dia=in.nextInt();
		int mes=in.nextInt();
		int diasfaltan=dia-tmeses[mes];
		int mesesfaltan=tmeses[mes]-tmeses.length;
		int diaas=0,total=0;
		
		
		if(diasfaltan<0){
			diasfaltan=diasfaltan*(-1);
		}else{}
		
		
		for(int i=1;i<mesesfaltan;i++){
			
			diaas+=tmeses[i+mes];	
			
			
			
		}
		total=diaas+diasfaltan;
		System.out.println(total);
	}

}