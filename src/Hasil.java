public class Hasil {
    public static void main(String[] args) {
        Identitas identitas = new Identitas();
          identitas.pegawai();
    
    Karyawan diah = new Karyawan();
    diah.setnama("diah");
    diah.cetak();
    
    Karyawan posisi = new Karyawan();
    posisi.pegawai("admin");
    
    HitungGaji hitung = new HitungGaji();
    hitung.gaji(1200000);
    hitung.gaji(1200000, 2);
}
}
