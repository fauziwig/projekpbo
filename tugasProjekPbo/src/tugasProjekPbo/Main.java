package tugasProjekPbo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String isi,pil_string,ulang_string;
        int pil,ulang;
        DataIndukNasabah din;
        Deposit depo= new Deposit();
        din = depo;
        Scanner input = new Scanner(System.in);
        

   do {
            System.out.println("1. Pendaftaran Nasabah Deposit ");
            System.out.println("2. Cetak Data ");
            System.out.println("3. Tambah Saldo ");
            System.out.println("4. Cetak Saldo ");
            System.out.println("5. Daftar Tabungan ");
            System.out.println("6. Keluar ");
            
            System.out.println(" Masukkan pilihan anda : ");
            pil_string = input.nextLine();
        
            pil=Integer.parseInt(pil_string);
            switch(pil) { 
            //perkondisian
                case 1:{
                  din.inputDataNasabah();
                  din.inputJenis();
                  
                  System.out.println(" Input Selesai, klik Ok untuk lanjut ");
                        break;
                }
                case 2:{din.cetak_nasabah();
                        break;}
                case 3: {din.penyetoran();
                break;}
                case 4:{din.cetak_saldo();
                break;}
                case 5: {
                        Tabungan tab1=new Tabungan();
                        din = tab1;
                        din.inputDataNasabah();
                        din.inputJenis();
                        din.cetak_nasabah();
                break;}
                case 6:{
                	System.out.println(" Klik Ok untuk keluar ");
                break;}
                
  
                
            }
            
            System.out.println("Mau transaksi lagi? Jika Ya = 1, Tidak = 0, masukkan pilihan anda : ");
            ulang_string = input.nextLine();
          
            ulang=Integer.parseInt(ulang_string);
        }
        while(ulang==1);   

	}

}
