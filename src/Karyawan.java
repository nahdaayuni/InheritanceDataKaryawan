public class Karyawan extends Identitas {
    String nama;
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void cetak(){
        System.out.println("nama = "+nama);
        System.out.println("jenis kelamin = "+super.jeniskelamin);
        System.out.println("nomor pegawai "+super.nomorpegawai);
    }
    public void pegawai(String bagian){
        System.out.println("Bekerja di bagian "+bagian);
    }
    
    
}
