public class TanpaMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000; // Gaji pokok
        int tunjanganTransport = 500000; // Tunjangan transport
        int tunjanganMakan = 300000; // Tunjangan makan (misalnya)
        int bonus = 1000000; // Bonus

        // Menghitung pajak
        double pajak = (gajiPokok + tunjanganTransport + tunjanganMakan + bonus) * 0.10;

        // Menghitung gaji bersih
        double gajiBersih = (gajiPokok + tunjanganTransport + tunjanganMakan + bonus) - pajak;

        // Menampilkan hasil
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
