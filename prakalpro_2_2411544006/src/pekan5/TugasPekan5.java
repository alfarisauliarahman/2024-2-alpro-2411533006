package pekan5;

public class TugasPekan5 {
	
    public static void main(String[] args) {
        baris();
        atas();
        bawah();
        baris();
    }

    //baris di atas untuk cetak di kanan dan kiri, dan "=" yang berjumlah 16
    public static void baris() {
        System.out.print("#");
        for (int i = 0; i < 3 * 4 + 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    // untuk cetak bagian atas (setengah)
    public static void atas() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");

            // cetak spasi agar "<>" di tengah, lalu sejajar
            for (int space = 1; space <= (-2 * line + 8); space++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // titik-titik di dalam "<>" agar diantara "<>" melebar 
            for (int dot = 1; dot <= (4 * line - 4); dot++) {
                System.out.print(".");
            }

            System.out.print("<>");

            // cetak spasi agar "<>" di tengah, lalu sejajar (lagi)
            for (int space = 1; space <= (-2 * line + 8); space++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }

    // untuk cetak bagian bawah (bisa dibilang hasil 'mirror' dari bagian atas)
    public static void bawah() {
        for (int line = 4; line >= 1; line--) {
            System.out.print("|");

            // spasi biar "<>" di tengah, lalu sejajar
            for (int space = 1; space <= (-2 * line + 8); space++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // kebalikan dari atas, titik-titik di antara "<>" mengecil
            for (int dot = 1; dot <= (4 * line - 4); dot++) {
                System.out.print(".");
            }

            System.out.print("<>");

            // spasi biar "<>" di tengah, lalu sejajar (lagi)
            for (int space = 1; space <= (-2 * line + 8); space++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }
}
