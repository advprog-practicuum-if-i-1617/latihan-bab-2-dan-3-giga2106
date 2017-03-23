package latihan;
public class swap {
    public int angka;
    public String huruf;
    public void ubah(int a) {
        String b = "", c = "", d = "", e = "";
        int a1, a2, a3;
        if (a == 1000) {
            System.out.println("Hasil = seribu");
        } else if (a == 100) {
            System.out.println("Hasil = seratus");
        } else if (a == 11) {
            System.out.println("Hasil = sebelas");
        } else if (a == 10) {
            System.out.println("Hadil = sepuluh");
        } else {
            a1 = a / 100;
            if (a1 == 0) {
            } else if (a1 == 1) {
                b = "seratus";
            } else {
                b = satuan(a1)+" ratus";
            }
            a2 = a / 10 - ((a / 100) * 10);
            a3 = a % 10;
            if (a2 == 0) {
                d = satuan(a3);
            } else if (a2 == 1) {
                if (a3==0) {
                    c=" sepuluh";
                }
                else if (a3 == 1) {
                    c = " sebelas";
                }
                else {
                    c = satuan(a3) + " belas";
                }
                
            } else {
                    c = satuan(a2)+" puluh";
                    d = satuan(a3);
            }
        System.out.println("Hasil = " + b + " " + c + " " + d);
        }
    }
    public String satuan(int b) {
        String c = "";
        if (b == 9) {
            c = "sembilan";
        } else if (b == 8) {
            c = "delapan";
        } else if (b == 7) {
            c = "tujuh";
        } else if (b == 6) {
            c = "enam";
        } else if (b == 5) {
            c = "lima";
        } else if (b == 4) {
            c = "empat";
        } else if (b == 3) {
            c = "tiga";
        } else if (b == 2) {
            c = "dua";
        } else if (b == 1) {
            c = "satu";
        } else {
            c = "";
        }
        return c;
    }
    public void ubah(String a) {
        int pindah = 0;
        int bil = 0;
        int x = hitungSpasi(a) + 1;
        String l[] = new String[x];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                pindah++;
            } else {
                l[pindah] += a.charAt(i);
            }
        }
        for (int i = 0; i < x; i++) {
            if (l[i].equalsIgnoreCase(null + "ratus")) {
                bil += (100 * konv(l[i - 1])) - konv(l[i - 1]);
            }
            if (l[i].equalsIgnoreCase(null + "puluh")) {
                bil += (10 * konv(l[i - 1])) - konv(l[i - 1]);
            }
            if (l[i].equalsIgnoreCase(null + "belas")) {
                bil += 10;
            }
            if (l[i].equalsIgnoreCase(null + "seribu")) {
                bil = 1000;
            } else {
                bil += konv(l[i]);
            }
        }
        System.out.println("Hasilnya = " + bil);
    }
    public int konv(String a) {
        int b = 0;
        if (a.equalsIgnoreCase(null + "satu")) {
            b = 1;
        } else if (a.equalsIgnoreCase(null + "dua")) {
            b = 2;
        } else if (a.equalsIgnoreCase(null + "tiga")) {
            b = 3;
        } else if (a.equalsIgnoreCase(null + "empat")) {
            b = 4;
        } else if (a.equalsIgnoreCase(null + "lima")) {
            b = 5;
        } else if (a.equalsIgnoreCase(null + "enam")) {
            b = 6;
        } else if (a.equalsIgnoreCase(null + "tujuh")) {
            b = 7;
        } else if (a.equalsIgnoreCase(null + "delapan")) {
            b = 8;
        } else if (a.equalsIgnoreCase(null + "sembilan")) {
            b = 9;
        } else if (a.equalsIgnoreCase(null + "sepuluh")) {
            b = 10;
        } else if (a.equalsIgnoreCase(null + "seratus")) {
            b = 100;
        } else if (a.equalsIgnoreCase(null + "sebelas")) {
            b = 11;
        }
        return b;
    }
    public int hitungSpasi(String a) {
        int x = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                x++;
            }
        }
        return x;
    }
}
