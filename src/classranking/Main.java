import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array maksimal 20 siswa
        SiswaRanking[] siswa = new SiswaRanking[20];

        int jumlah;

        System.out.print("Masukkan jumlah siswa (maksimal 20): ");
        jumlah = input.nextInt();
        input.nextLine();

        // Seleksi
        if(jumlah > 20){
            jumlah = 20;
            System.out.println("Jumlah dibatasi menjadi 20 siswa.");
        }

        // Perulangan Input
        for(int i=0; i<jumlah; i++){

            System.out.println("\nData Siswa ke-" + (i+1));

            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Nomor Absen : ");
            int absen = input.nextInt();
            input.nextLine();

            // Object
            siswa[i] = new SiswaRanking(nama, absen);
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println("      DAFTAR PERINGKAT ABSEN");
        System.out.println("====================================");

        // Mengurutkan berdasarkan nomor absen (Bubble Sort)

        for(int i=0;i<jumlah-1;i++){

            for(int j=0;j<jumlah-1-i;j++){

                if(siswa[j].getAbsen() > siswa[j+1].getAbsen()){

                    SiswaRanking temp = siswa[j];
                    siswa[j] = siswa[j+1];
                    siswa[j+1] = temp;

                }

            }

        }

        // Menampilkan hasil

        for(int i=0;i<jumlah;i++){

            siswa[i].tampilkanData();

        }

    }

}