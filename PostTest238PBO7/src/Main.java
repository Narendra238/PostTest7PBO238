import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil mobil = new Mobil("Innova Reborn Diesel", "Solar",0);

        System.out.println("Pilih menu:");
        System.out.println("1. Nyalakan Mesin");
        System.out.println("2. Matikan Mesin");
        System.out.println("3. Inspect Mobil");
        System.out.println("4. Jalan");
        System.out.println("5. Isi Bensin");
        System.out.println("6. Keluar");

        boolean repeat = true;
        while (repeat) {


            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();


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
                    mobil.jalan();
                    break;

                case 5:
                    mobil.isiBensin();
                    break;
                case 6:
                    if (mobil.keluar()){
                        repeat = false;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}