/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan52.siapakamu;

/**
 *
 * @author User
 */
public class dosen extends manusia{
    private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("“Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO”");
    }
    @Override
    public void siapaKamu(){
        System.out.println("“Saya Dosen”");
    }
}
