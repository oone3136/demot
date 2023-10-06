import java.math.BigDecimal;
import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            try {
                System.out.println("berapa gajih kamu ??");
                Pehitungan pehitungan = new Pehitungan();
                pehitungan.gaji = input.nextBigDecimal();
                System.out.println("masukan golongan kamu");
                String pilihan = input.next();
                if (pilihan.equalsIgnoreCase("TK0")){
                    BigDecimal hasil = pehitungan.tk0();
                    System.out.println("PPH pebulan nya adalah " + hasil);
                } else if (pilihan.equalsIgnoreCase("NONE")) {
                    BigDecimal hasil = pehitungan.none();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("TK1")) {
                    BigDecimal hasil = pehitungan.tk1();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("TK2")) {
                    BigDecimal hasil = pehitungan.tk2();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("TK3")) {
                    BigDecimal hasil = pehitungan.tk3();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("K1")) {
                    BigDecimal hasil = pehitungan.k1();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("K2")) {
                    BigDecimal hasil = pehitungan.k2();
                    System.out.println(hasil);
                }else if (pilihan.equalsIgnoreCase("K0")) {
                    BigDecimal hasil = pehitungan.k0();
                    System.out.println(hasil);
                }
            }catch (Exception e){
                System.out.println("tejadi kesalahan : " + e.getMessage());
            }
            System.out.println("apakah anda ingin mengulanginya ??? ");
            String ulangi = input.next();

            if (!ulangi.equalsIgnoreCase("ya")){
                break;
            }
        }
        input.close();

    }
}
