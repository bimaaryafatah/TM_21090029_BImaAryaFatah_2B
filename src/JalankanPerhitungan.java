import model.Perhitungan;

public class JalankanPerhitungan {
    private static int HitungKali;

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        System.out.println("Hasilnya " + HitungKali);
    }
    public static int Perhitungan(int a, int b, int hasil){
        int Hitung;
        Hitung = a*b;
        return Hitung;
        //tugas / tm
        //tampilkan hasil perhitungan dengan memanggil method yang ada pada perhitungan.java. method dibuat, menerima
        //parameter dan mengembalikkan nilai(method with reurn).
        //dikumpulkan hari sabru 30 april 2022
        //aisl dikirim ke email ke aherijanto@mimoapps.xyz berupa github repo masing2 siswa
        //Subject email: TM_NIM_NAMALENGKAP_KELAS
    }
}
