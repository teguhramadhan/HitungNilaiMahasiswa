/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterPackage;

/**
 *
 * @author teguh
 */
public class MainPenilaian {
    
    String nama;
    int npm;
    double nilai_kehadiran, nilai_tugas, nilai_uts, nilai_uas, nilai_akhir;
    
    public static void main(String[] args) {
        DataNilai data_nilai = new DataNilai();
        data_nilai.logicHitungNilai();
    }
}
