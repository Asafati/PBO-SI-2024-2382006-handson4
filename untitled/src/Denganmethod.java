public class Denganmethod {
    public static void main(String[] args) {
        int gajihPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }
    public static int hitungTotalPengghasilan(int gajihPokok, int tunjanganTransport, int tunjanganMakan, int bonus){
        return gajihPokok + tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;
    }
    public static int
}
