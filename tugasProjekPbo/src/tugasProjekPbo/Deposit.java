package tugasProjekPbo;

import java.util.Scanner;
import java.lang.Override;
public class Deposit extends DataIndukNasabah {

    private String jenisdep, jenistab;
    private double bunga,S_awal,S_akhir,setor,tarik,ambil,ambils;

    Scanner input = new Scanner(System.in);
    
    @Override
    public String getJenistab(){
        switch (jenisdep) {
            case "1":
                jenistab="Deposito";
                break;
         
        }
        return jenistab;
     
    }
    public double getSaldo(){
      return S_akhir;
    }
    public double setBunga(){
        return bunga;
}
    public double setTarik(){
        return tarik;
}
    @Override
    public void penyetoran(){
        if(getNama()==null){
        	System.out.println("Belum ada data ");
        	
        }
        else{
        	System.out.println("Masukkan jumlah deposito : ");
        	String setor_string = input.nextLine();
        	
        setor = Integer.parseInt(setor_string);
        S_awal = S_awal + setor;
        
        switch (jenisdep) {
            case "1":
                bunga=0.01*S_awal;
                break;
            case "2":
                bunga=0.02*S_awal;
                break;
        }
        this.S_akhir=S_awal+bunga;
        }
}
 
    @Override
    public void inputJenis(){
    	System.out.println("Pilih Jenis Tabungan : ");
    	this.jenistab = input.nextLine();
    	
    	System.out.println("Pilih Jenis Deposito (1= Deposito 6 Bulan, 2= Deposito 12 Bulan): ");
    	this.jenisdep = input.nextLine();
    	
}
    @Override
    public void cetak_nasabah(){
        if (getNama()!=null || getNorek()!=null){
            System.out.println("Nomor Rekening "+getNorek());
            System.out.println("Nama "+getNama());
            System.out.println("Jenis Tabungan "+getJenistab());
        }else{
        	System.out.println(" Belum ada data ");
        }
}
    @Override
    public void cetak_saldo(){
        if(getSaldo() == 0){
        	System.out.println(" Belum ada data ");
        	
        }else{
         System.out.println("Deposito "+S_akhir);
         System.out.println("Bunga "+setBunga());
         System.out.println("Saldo Akhir "+getSaldo());
         
         if("1".equals(jenisdep)){
             System.out.println("Deposito 6 Bulan");
         }
         if("2".equals(jenisdep)){
             System.out.println("Deposito 12 Bulan");
         }
        }
}
    @Override
    public void penarikan(){
        if(getSaldo()==0){
        	System.out.println(" Belum ada data ");
        	
        }else{
        System.out.println("PENARIKAN DEPOSITO");
        cetak_nasabah(); 
        cetak_saldo();        
         ambils = S_akhir - S_awal;

         System.out.println(" Jumlah Dana yang bisa diambil adalah Rp. "+ambils);
         
        
         String a = input.nextLine();
         
         
        this.tarik=Double.parseDouble(a);
        
            if(tarik > ambils){
            	System.out.println(" Dana tidak cukup ");
            }
            else{
            this.ambils = ambils - tarik;
            S_akhir = S_akhir - tarik;
            }
     
     
    }
    }
    @Override
    public void cetak_penarikan(){
        System.out.println("DATA PENARIKAN DEPOSITO");
        System.out.println(" Penarikan "+ setTarik() + "\n" + getSaldo() + "\n");
     
    }
 
}