public class ContohVarargs {
    // Method varargs untuk menjumlahkan sejumlah bilangan
    public static int jumlahkan(int... angka) {
        int total = 0; // Inisialisasi total
        for (int nilai : angka) {
            total += nilai; // Menambahkan nilai ke total
        }
        return total; // Mengembalikan total
    }

    public static void main(String[] args) {
        int hasil1 = jumlahkan(1, 2, 3); // Menghitung jumlah 1, 2, dan 3
        System.out.println("Hasil 1: " + hasil1); // Output: Hasil 1: 6

        int hasil2 = jumlahkan(4, 5); // Menghitung jumlah 4 dan 5
        System.out.println("Hasil 2: " + hasil2); // Output: Hasil 2: 9

        int hasil3 = jumlahkan(); // Menghitung jumlah tanpa argumen
        System.out.println("Hasil 3: " + hasil3); // Output: Hasil 3: 0
    }
}
