import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buat objek mobil
        Mobil mobil = new Mobil("Innova Reborn Diesel", "Solar",0);

        // Tampilkan menu
        System.out.println("Pilih menu:");
        System.out.println("1. Nyalakan Mesin");
        System.out.println("2. Matikan Mesin");
        System.out.println("3. Inspect Mobil");
        System.out.println("4. Jalan");
        System.out.println("5. Isi Bensin");
        System.out.println("6. Keluar");

        // Mulai perulangan
        while (mobil.mesinMenyala()) {

            // Baca input dari pengguna
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            // Lakukan tindakan sesuai pilihan pengguna
            switch (pilihan) {
                case 1:
                    mobil.nyalakanMesin();
                    break;
                case 2:
                    mobil.mesinMatikan();
                    break;
                case 3:
                    mobil.inspect();
                    break;
                case 4:
                    // Cek apakah mesin sudah dinyalakan
                    if (!mobil.mesinMenyala()) {
                        System.out.println("Mobil belum dinyalakan");
                        break;
                    }

                    // Cek apakah mobil sudah diisi bensin
                    if (mobil.jumlahBensin <= 0) {
                        System.out.println("Mobil belum diisi bensin");
                        break;
                    }

                    // Jalankan mobil
                    mobil.jalan();
                    break;

                case 5:
                    mobil.isiBensin();
                    break;
                case 6:
                    if (!mobil.mesinMenyala()) {
                        if (!mobil.mesinMenyala()) {
                            mobil.nyalakanMesin();
                            System.out.println("Mobil belum dimatikan");
                            break;
                        }
                    } else {
                        mobil.mesinMatikan();
                        System.out.println("Keluar dari mobil");
                        break;
                    }

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}