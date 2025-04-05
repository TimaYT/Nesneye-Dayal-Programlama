import java.util.Scanner;

public class SinemaMusteriKayitSistemi {
    
    static int maxF = 10;
    static int maxM = 20;

    static String[] filmAdi = new String[maxF];
    static int[] filmSure = new int[maxF];
    static String[] filmTur = new String[maxF];

    static String[] musteriAdi = new String[maxM];
    static String[] musteriEmail = new String[maxM];

    static String[][] biletler = new String[maxM][maxF];

    static int filmler = 0;
    static int musteriler = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\nLutfen yapmak istediginiz islemi girin");
            System.out.println("1-Film Ekle");
            System.out.println("2-Musteri Ekle");
            System.out.println("3-Bilet Kaydi");
            System.out.println("4-Biletleri Listele");
            System.out.println("5-Cikis");
            System.out.print("Hangi islemi yapmak istersiniz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    filmEkle(scanner);
                    break;
                case 2:
                    musteriEkle(scanner);
                    break;
                case 3:
                    biletKayit(scanner);
                    break;
                case 4:
                    biletListele();
                    break;
                case 5:
                    System.out.println("Iyi gunler dileriz");
                    break;
                default:
                    System.out.println("Gecersiz secim, lutfen tekrar deneyin.");
            }
        } while (secim != 5);

        scanner.close();
    }

    static void filmEkle(Scanner scanner) {
        if (filmler < maxF) {
            System.out.print("\nFilm adi: ");
            filmAdi[filmler] = scanner.nextLine();
            System.out.print("Film suresi (dakika): ");
            filmSure[filmler] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Film turu: ");
            filmTur[filmler] = scanner.nextLine();

            filmler++;
            System.out.println("\nFilm basariyla eklendi");
        } else {
            System.out.println("\nDaha fazla film ekleyemezsiniz");
        }
    }

    static void musteriEkle(Scanner scanner) {
        if (musteriler < maxM) {
            System.out.print("\nMusteri adi: ");
            musteriAdi[musteriler] = scanner.nextLine();
            
            System.out.print("Musteri email adresi: ");
            musteriEmail[musteriler] = scanner.nextLine();
            musteriler++;
            
            System.out.println("\nMusteri basariyla eklendi");
        } else {
            System.out.println("\nDaha fazla musteri ekleyemezsiniz");
        }
    }

    static void biletKayit(Scanner scanner) {
        if (musteriler == 0 || filmler == 0) {
            System.out.println("\nMusteri ve film ekleyiniz");
            return;
        }

        System.out.println("\nMevcut musteriler:");
        for (int i = 0; i < musteriler; i++) {
            System.out.println(i + 1 + ". " + musteriAdi[i] + " - " + musteriEmail[i]);
        }

        System.out.print("\nBir musteri seciniz (1-" + musteriler + "): ");
        int musteriSecimi = scanner.nextInt() - 1;
        scanner.nextLine();

        if (musteriSecimi < 0 || musteriSecimi >= musteriler) {
            System.out.println("\nLutfen duzgun secim yapiniz");
            return;
        }

        System.out.println("\nMevcut filmler:");
        for (int i = 0; i < filmler; i++) {
            System.out.println(i + 1 + ". " + filmAdi[i] + " - " + filmSure[i] + " dakika - Tur: " + filmTur[i]);
        }

        System.out.print("\nBir film secin (1-" + filmler + "): ");
        int filmSecimi = scanner.nextInt() - 1;
        scanner.nextLine();

        if (filmSecimi < 0 || filmSecimi >= filmler) {
            System.out.println("\nLutfen duzgun secim yapiniz");
            return;
        }

        biletler[musteriSecimi][filmSecimi] = filmAdi[filmSecimi];
        System.out.println("\nBiletiniz onaylanmistir");
    }

    static void biletListele() {
        for (int i = 0; i < musteriler; i++) {
            System.out.println("\nMusteri: " + musteriAdi[i]);
            System.out.println("Email: " + musteriEmail[i]);
            System.out.println("Izledigi filmler:");

            int sayac = 0;

            for (int j = 0; j < filmler; j++) {
                if (biletler[i][j] != null) {
                    System.out.println("- " + biletler[i][j]);
                    sayac++;
                }
            }

            if (sayac == 0) {
                System.out.println("Hic film yok");
            }
        }
    }
}
