package tugasProjekPbo;

import java.util.Scanner;
import java.util.Random;


public class DataIndukNasabah {
 
    private String nama, alamat, jk, noRek, jenistab;
    private final Random random = new Random();

    Scanner input = new Scanner(System.in);
    
    public  String setNorek(	int length) {
        String code = "";
        for (int i = 0; i < length; i++) {
            code += (char) (random.nextInt(10) + '0');
        }
        return code;
    }
 
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJk(){
        return jk;
    }
    public String getNorek(){
        return noRek;
    }
    public void inputDataNasabah(){
    	
    	
    	System.out.println("Pendataan Nasabah Baru ");
    	System.out.println();
    	System.out.println("Masukkan Nama : ");
    	this.nama = input.nextLine();
    	
    	System.out.println("Masukkan Alamat : ");
    	this.alamat = input.nextLine();
    	
    	System.out.println("Masukkan Jenis Kelamin : ");
    	this.jk = input.nextLine();
    	
    	this.noRek=setNorek(10);
    	
    	System.out.println();
    	System.out.println(" Data baru sudah di input... ");

    }
    public void inputJenis(){
    }
    public void cetak_nasabah(){
    }
    public void cetak_saldo(){
    }
    public void penyetoran(){
    }
    public void penarikan(){
    }
    public void cetak_penarikan(){
            }
    public String getJenistab(){
        return jenistab;
    }

 
}
