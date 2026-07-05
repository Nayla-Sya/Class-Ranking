public class SiswaRanking extends Siswa {

    // Constructor
    public SiswaRanking(String nama, int absen) {
        super(nama, absen);
    }

    // Polymorphism (Override)
    @Override
    public void tampilkanData() {

        String kategori;

        // Seleksi (if)
        if(getAbsen() <= 5){
            kategori = "Sangat Rajin";
        }
        else if(getAbsen() <=10){
            kategori = "Rajin";
        }
        else if(getAbsen() <=15){
            kategori = "Cukup";
        }
        else{
            kategori = "Perlu Disiplin";
        }

        System.out.println(
                getAbsen() + ". " +
                getNama() +
                " --> " + kategori);
    }

}