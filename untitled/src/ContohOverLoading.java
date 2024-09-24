public class ContohOverLoading {
    // Method untuk menghitung luas persegi
    public static double hitungLuas(double sisi) {
        return sisi * sisi; // Menghitung luas persegi
    }

    // Method untuk menghitung luas persegi panjang
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar; // Menghitung luas persegi panjang
    }

    // Method untuk menghitung luas lingkaran
    public static double hitungLuas(double jariJari, boolean isLingkaran) { // Parameter tambahan untuk membedakan
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari; // Menghitung luas lingkaran
        } else {
            return 0; // Atau lemparkan exception jika tidak sesuai
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5); // Memanggil method untuk luas persegi
        double luasPersegiPanjang = hitungLuas(5, 10); // Memanggil method untuk luas persegi panjang
        double luasLingkaran = hitungLuas(7, true); // Memanggil method untuk luas lingkaran

        // Mencetak hasil
        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("Luas lingkaran: " + luasLingkaran);
    }
}
