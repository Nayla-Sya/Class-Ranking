public class Siswa {
    // Atribut (Encapsulation)
    private String nama;
    private int absen;

    // Constructor
    public Siswa(String nama, int absen) {
        this.nama = nama;
        this.absen = absen;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getAbsen() {
        return absen;
    }

    // Method
    public void tampilkanData() {
        System.out.println(absen + ". " + nama);
    }
}  
