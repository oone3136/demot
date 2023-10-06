import java.math.BigDecimal;

public class Pehitungan extends Pph{
    BigDecimal gaji;

    @Override
    BigDecimal none() {
        System.out.println("dikenakan pajak lebih dari 2%");
        return super.none();
    }

    @Override
    BigDecimal tk0() {

        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal tk0 = new BigDecimal("54000000");
        BigDecimal nett = kali12.subtract(tk0);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO;
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal tk1() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal tk1 = new BigDecimal("58500000");
        BigDecimal nett = kali12.subtract(tk1);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal tk2() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal tk2 = new BigDecimal("63000000");
        BigDecimal nett = kali12.subtract(tk2);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal tk3() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal tk3 = new BigDecimal("67500000");
        BigDecimal nett = kali12.subtract(tk3);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal k1() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal k1 = new BigDecimal("63000000");
        BigDecimal nett = kali12.subtract(k1);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal k2() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal k2 = new BigDecimal("67500000");
        BigDecimal nett = kali12.subtract(k2);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }

    @Override
    BigDecimal k0() {
        BigDecimal persen = new BigDecimal("0.05");
        BigDecimal bruto = gaji.subtract(persen.multiply(gaji));

        BigDecimal kali12 = gaji.multiply(new BigDecimal("12"));

        BigDecimal k0 = new BigDecimal("58500000");
        BigDecimal nett = kali12.subtract(k0);
        BigDecimal pphbulanan;

        if (nett.compareTo(BigDecimal.ZERO) < 0) { // Mengubah pengecekan nett < 0
            System.out.println("Tidak kena pajak");
            pphbulanan = BigDecimal.ZERO; // Atur pphbulanan menjadi 0 jika tidak kena pajak
        } else {
            BigDecimal pph12 = persen.multiply(nett);
            pphbulanan = pph12.divide(new BigDecimal("12"));
            System.out.println(pphbulanan);
        }
        return pphbulanan;
    }
}
