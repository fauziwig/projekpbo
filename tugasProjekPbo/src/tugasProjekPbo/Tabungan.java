package tugasProjekPbo;

import java.util.Scanner;

public class Tabungan extends DataIndukNasabah{
    private double s_awal,s_akhir,setor, tarik;
    private String jenistab,jentab;
    
    Scanner input = new Scanner(System.in);
    
    public double getSaldoAwal(){
        return s_awal;
    }
    public double getSaldo(){
        s_akhir=getSaldoAwal()+setor;
      return s_akhir;
    }
    public double getSetor(){
        return setor;
    }
    @Override
    public String getJenistab(){
        switch (jentab) {
            case "1":
                jenistab="SIMPEDES";
                break;
            case "2":
                jenistab="SIMPEDA";
                break;
        }
        return jenistab;
    }
    
    @Override
    public void inputJenis(){
    	System.out.println(" Pilih Jenis Tabungan : \n1. Simpedes\n2. Simpeda ");
    	this.jentab = input.nextLine();
    	
    	
}
    
    @Override
    public void penyetoran(){
    	System.out.println("Masukkan jumlah setoran : ");
    	String setor_string = input.nextLine();
    	
        
    	this.setor=Integer.parseInt(setor_string);
        this.s_awal=s_awal+setor;
        
    }
    @Override
    public void cetak_nasabah(){
        System.out.println("DATA NASABAH TABUNGAN "+getJenistab());
        System.out.println("NAMA NASABAH : "+getNama());
        System.out.println("ALAMAT : "+getAlamat());
        System.out.println("JENIS KELAMIN : "+getJk());
        System.out.println("NOMOR REKENING : "+getNorek());
        
    }
    public void cetak_saldo(){
         System.out.println("NOMOR REKENING : "+getNorek());
         System.out.println("NAMA NASABAH : "+getNama());
         System.out.println("Saldo  "+getSaldo());
        
}
    
    
}