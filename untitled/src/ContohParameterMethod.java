public class ContohParameterMethod {
    // Method untuk mengalikan angka dengan 2
    public static int kaliDua(int angka){
        return angka * 2;  // Gunakan operator * untuk perkalian
    }

    // Method untuk menghitung luas segitiga
    public static double hitungLuasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        // Memanggil method kaliDua
        int hasilKaliDua = kaliDua(5);
        System.out.println("5 x 2 = " + hasilKaliDua);  // Gunakan System dengan S kapital, dan variabel yang benar

        // Memanggil method hitungLuasSegitiga
        double luasSegitiga = hitungLuasSegitiga(4, 6);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}
