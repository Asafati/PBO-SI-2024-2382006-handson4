public class ContohRekursi {
    public static int faktorial(int n) {
        // Kasus dasar
        if (n == 0) {
            return 1; // Faktorial dari 0 adalah 1
        } else {
            // Panggilan rekursif
            return n * faktorial(n - 1); // Mengalikan n dengan faktorial(n-1)
        }
    }

    public static void main(String[] args) {
        int angka = 5; // Contoh angka untuk dihitung faktorialnya
        int hasil = faktorial(angka); // Memanggil method faktorial
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil); // Menampilkan hasil
    }
}
