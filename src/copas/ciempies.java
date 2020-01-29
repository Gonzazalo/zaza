package copas;

import java.util.Scanner;

public class ciempies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int intentos=in.nextInt();
		
		for(int i=0;i<intentos;i++){
		
		int insect=in.nextInt(),parker=in.nextInt(),crusty=in.nextInt(),escalopendulos=in.nextInt(),anillos=in.nextInt();
		
		int patasanill=anillos*2;
		
		int patasescalopend=patasanill*escalopendulos;
		
		int patasinsect=insect*6+crusty*10+parker*8+patasescalopend;
		
		System.out.println(patasinsect);
		}

	}

}
