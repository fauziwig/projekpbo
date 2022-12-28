/**
 * MENCOBA PROGRAM BANK SEDERHANA
 */
package tugasProjekPbo;

import java.util.Scanner;

/**
 * @author User
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pil;
		
		Scanner masuk = new Scanner(System.in);
		
		DataIndukNasabah in = new DataIndukNasabah();
		
		System.out.println("--- MENU ---");
		System.out.println("1. Pendaftaran Nasabah ");
		
		System.out.println(" Masukkan pilihan anda : ");
		pil = masuk.nextInt();
		
		switch(pil){
		case 1 : {
			in.inputDataNasabah();
		}
		}
		
		
		
		

	}

}
