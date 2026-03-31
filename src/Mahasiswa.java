public class  Mahasiswa{
    String nama;
    int umur;
    String jurusan;

    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    public static void main(String[] args) throws Exception {
        Mahasiswa mhsBaru = new Mahasiswa("Razqa", 20, "Ilmu Komputer");

        System.out.println("Nama    : " + mhsBaru.nama);
        System.out.println("Umur    : " + mhsBaru.umur);
        System.out.println("Jurusan : " + mhsBaru.jurusan);

    }
}