package tugaspengganti;

import java.util.Scanner;

public class Manusia {
    Scanner fahmi = new Scanner(System.in);
    String Nama, Kelamin, TemLah, TangLah, BulLah, TahLah;
    void Identitas (){
        System.out.print("Nama : ");
        Nama = fahmi.next();
        System.out.print("Jenis Kelamin : ");
        Kelamin = fahmi.next();
    }
     protected void Kelahiran(){
        System.out.print("Tempat Lahir : ");
        TemLah = fahmi.next();
        System.out.print("Tanggal Lahir : ");
        TangLah = fahmi.next();
        System.out.print("Bulan Lahir : ");
        BulLah = fahmi.next();
        System.out.print("Tahun Lahir : ");
        TahLah = fahmi.next();
    }
}
