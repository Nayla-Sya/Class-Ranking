# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **Class Ranking** menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data siswa berdasarkan nomor absen. Program dapat menerima input nama dan nomor absen siswa, kemudian mengurutkan data berdasarkan nomor absen menggunakan metode Bubble Sort dan menampilkan kategori kedisiplinan siswa berdasarkan nomor absennya.

Aplikasi ini mengimplementasikan konsep-konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, dan Array.

---

# Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

## 1. Class

Class adalah blueprint dari object. Pada program ini terdapat tiga class yaitu:

```java
public class Siswa { ... }

public class SiswaRanking extends Siswa { ... }

public class Main { ... }
```

---

## 2. Object

Object dibuat menggunakan keyword `new`.

```java
siswa[i] = new SiswaRanking(nama, absen);
```

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh class.

```java
private String nama;
private int absen;
```

---

## 4. Constructor

Constructor digunakan ketika object pertama kali dibuat.

```java
public Siswa(String nama, int absen) {
    this.nama = nama;
    this.absen = absen;
}

public SiswaRanking(String nama, int absen) {
    super(nama, absen);
}
```

---

## 5. Mutator (Setter)

Digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setAbsen(int absen) {
    this.absen = absen;
}
```

---

## 6. Accessor (Getter)

Digunakan untuk mengambil nilai atribut.

```java
public String getNama() {
    return nama;
}

public int getAbsen() {
    return absen;
}
```

---

## 7. Encapsulation

Data disembunyikan menggunakan modifier `private`.

```java
private String nama;
private int absen;
```

---

## 8. Inheritance

Class `SiswaRanking` mewarisi class `Siswa`.

```java
public class SiswaRanking extends Siswa {

    public SiswaRanking(String nama, int absen) {
        super(nama, absen);
    }

}
```

---

## 9. Polymorphism (Overriding)

Method `tampilkanData()` dioverride pada class `SiswaRanking`.

```java
@Override
public void tampilkanData() {

    String kategori;

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
```

---

## 10. Seleksi (if-else)

Digunakan untuk menentukan kategori siswa berdasarkan nomor absen dan membatasi jumlah siswa maksimal 20.

```java
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
```

dan

```java
if(jumlah > 20){
    jumlah = 20;
    System.out.println("Jumlah dibatasi menjadi 20 siswa.");
}
```

---

## 11. Perulangan

Digunakan untuk input data, proses Bubble Sort, dan menampilkan hasil.

```java
for(int i=0; i<jumlah; i++){
    ...
}

for(int i=0;i<jumlah-1;i++){
    ...
}

for(int i=0;i<jumlah;i++){
    siswa[i].tampilkanData();
}
```

---

## 12. Input Output Sederhana

Menggunakan Scanner untuk input dan System.out.println() untuk output.

```java
Scanner input = new Scanner(System.in);

System.out.print("Masukkan jumlah siswa (maksimal 20): ");
```

---

## 13. Array

Digunakan untuk menyimpan banyak object siswa.

```java
SiswaRanking[] siswa = new SiswaRanking[20];
```

---

## 14. Error Handling

Pada program ini **belum terdapat Error Handling** menggunakan `try-catch`.

---

# Usulan Nilai

| No | Materi | Nilai |
|----|----------------------|------:|
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 0 |
| **TOTAL** | | **85** |

---

# Pembuat

**Nama:** Nayla Syazana Aziza
**NPM:** 2410010547