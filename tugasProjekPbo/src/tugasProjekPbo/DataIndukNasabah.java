package tugasProjekPbo;

import java.util.*;

public class DataIndukNasabah {

	private String nama, alamat, noRek, jenisTab, jenisKel;
	private final Random acak = new Random();
	
	Scanner input = new Scanner(System.in);
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoRek() {
		return noRek;
	}
	
	public String getJenisKel() {
		return jenisKel;
	}

	public void setJenisKel(String jenisKel) {
		this.jenisKel = jenisKel;
	}

	/* MENCETAK NO REK SECARA ACAK SEBANYAK 10 BIL*/
	public String setNoRek(int panjang) {
		String kode = " ";
		
		for(int i=0; i<panjang; i++)
		{
			kode += (char)(acak.nextInt(10)+'0');
		}
		
		return kode;
	}

	public String getJenisTab() {
		return jenisTab;
	}

	public void setJenisTab(String jenisTab) {
		this.jenisTab = jenisTab;
	}
	
	public void inputDataNasabah() {
		System.out.println("--- TAMBAH DATA NASABAH BARU ---");
		System.out.println();
		System.out.println(" Masukkan nama : ");
		this.nama = input.nextLine();
		
		System.out.println(" Masukkan alamat : ");
		this.alamat = input.nextLine();
		
		System.out.println(" Masukkan jenis kelamin : ");
		this.jenisKel = input.nextLine();
		
		this.noRek = setNoRek(10);
		
		System.out.println();
		System.out.println(" Data baru telah di input ");
	}
	
}
