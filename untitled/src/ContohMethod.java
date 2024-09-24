public class ContohMethod {
    // Method untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi; // Menghitung luas persegi
        return luas; // Mengembalikan nilai luas
    }

    public static void main(String[] args) {
        int sisi = 5; // Mendeklarasikan variabel sisi
        int luas = hitungLuasPersegi(sisi); // Memanggil method hitungLuasPersegi
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas); // Mencetak hasil
    }
}
