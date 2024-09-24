public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000; // Gaji Pokok
        int tunjanganTransport = 500000; // Tunjangan Transport
        int tunjanganMakan = 300000; // Tunjangan Makan (misalnya)
        int bonus = 1000000; // Bonus

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    // Method untuk menghitung total penghasilan
    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
    }

    // Method untuk menghitung pajak
    public static int hitungPajak(int totalPenghasilan) {
        return (int) (totalPenghasilan * 0.10); // Menghitung 10% dari total penghasilan
    }

    // Method untuk menghitung gaji bersih
    public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak;
    }

    // Method untuk menampilkan detail gaji
    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
