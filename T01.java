// 12S24035_JOSUA SIANTURI
// 12S24058_AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        String judul;
        String penulis;
        int tahun;
        String penerbit;
        String formatbuku;
        double harga;
        double margin;
        int stok;
        double rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
