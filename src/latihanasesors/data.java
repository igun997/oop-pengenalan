/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanasesors;

/**
 *
 * @author SystemFive
 */
public class data {
    String nama;
    String nim;
    String kelas;
    double nilai;
    public double getNilai()
    {
        return nilai;
    }
    public String getNama()
    {
        return nama;
    }
    public String getNim()
    {
        return nim;
    }
    public String getKelas()
    {
        return kelas;
    }
    public void setNama(String nama)
    {
      this.nama = nama;  
    }
    public void setNilai(double nilai)
    {
      this.nilai = nilai;  
    }
    public void setNim(String nim)
    {
      this.nim = nim;
    }
    public void setKelas(String kelas)
    {
      this.kelas = kelas;
    }
    public String  getIndex()
    {
        String Rank="";
        if(getNilai() >= 50 && getNilai() < 60)
        {
            Rank = "D";
        }else if(getNilai() >= 60 && getNilai() < 70)
        {
            Rank = "C";
        }else if(getNilai() >= 70 && getNilai() < 80)
        {
            Rank = "B";
        }else if(getNilai() >= 80)
        {
            Rank = "A";
        }else if(getNilai() < 50)
        {
            Rank = "E";
        }
        return Rank;
    }
}
