/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterPackage;

import java.util.Scanner;

/**
 *
 * @author teguh
 */
public class DataNilai extends MainPenilaian{
    
    
    public void logicHitungNilai() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------PENILAIAN MAHASISWA----------");
        //scanner input nama
        System.out.print  ("-- Masukkan nama    : ");
        nama = input.nextLine();
        
        //scanner input NPM
        System.out.print  ("-- Masukkan NPM     : ");
        npm = input.nextInt();
        
        System.out.println("*daftar nilai isi dengan range 1-100 ");
        System.out.print  ("-- nilai kehadiran  : ");
        nilai_kehadiran = input.nextInt();
        
        System.out.print  ("-- nilai tugas      : ");
        nilai_tugas = input.nextInt();
        
        System.out.print  ("-- nilai uts        : ");
        nilai_uts = input.nextInt();
        
        System.out.print  ("-- nilai uas        : ");
        nilai_uas = input.nextInt();
        
        System.out.println("---------------------------------------");
        
        //logic nilai akhir
        nilai_akhir = (0.15*nilai_kehadiran+0.35*nilai_tugas+0.25*nilai_uts+0.25*nilai_uas);
        
        
        
        //output
        System.out.println();
        System.out.println();
        System.out.println("=====Cetak Nilai Mahasiswa=====--");
        System.out.println("nama anda       : "+nama);
        System.out.println("NPM anda        : "+npm);
        System.out.println("nilai absen     : "+nilai_kehadiran);
        System.out.println("nilai tugas     : "+nilai_tugas);
        System.out.println("nilai uts       : "+nilai_uts);
        System.out.println("nilai uas       : "+nilai_uas);
        System.out.println("---------------------------------");
        System.out.println("nilai akhir     : "+nilai_akhir);
        System.out.println("---------------------------------");
        System.out.println();
        alpha();
        System.out.println("=================================");
    }
    
    public void alpha() {
        //logic nilai convert alphabet
        if (nilai_akhir <=50) {
            System.out.println("indeks nilai akhir : E ");
            System.out.println("Mahasiswa dengan nama   :"+nama);
            System.out.println("dengan NPM              :"+npm);
            System.out.println();
            System.out.println("------Dinyatakan TIDAK LULUS-----");
        } else if (nilai_akhir >= 51 && nilai_akhir <=60 ) {
            System.out.println("indeks nilai akhir : D");
            System.out.println("Mahasiswa dengan nama   :"+nama);
            System.out.println("dengan NPM              :"+npm);
            System.out.println();
            System.out.println("---Dinyatakan LULUS PERBAIKAN----");
        } else if (nilai_akhir >= 61 && nilai_akhir <=75 ) {
            System.out.println("indeks nilai akhir : C");
            System.out.println("Mahasiswa dengan nama   :"+nama);
            System.out.println("dengan NPM              :"+npm);
            System.out.println();
            System.out.println("---------Dinyatakan LULUS--------");
        } else if (nilai_akhir >= 76 && nilai_akhir <=85 ) {
            System.out.println("indeks nilai akhir : B");
            System.out.println("Mahasiswa dengan nama   :"+nama);
            System.out.println("dengan NPM              :"+npm);
            System.out.println();
            System.out.println("---------Dinyatakan LULUS--------");
        } else if (nilai_akhir >=86 && nilai_akhir <=100) {
            System.out.println("indeks nilai akhir : A");
            System.out.println("Mahasiswa dengan nama   :"+nama);
            System.out.println("dengan NPM              :"+npm);
            System.out.println();
            System.out.println("---------Dinyatakan LULUS--------");
        }
    }
}
