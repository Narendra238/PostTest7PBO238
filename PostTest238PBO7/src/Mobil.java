class Mobil extends Kendaraan {
    private boolean StatusMesin = true;
    public Mobil(String jenis, String bahanBakar, int jumlahBensin) {
        super(jenis, bahanBakar, jumlahBensin);
    }

    @Override
    public void nyalakanMesin() {
        if (this.StatusMesin){
            this.StatusMesin = true;
            System.out.println("MESIN NYALA BROM BROM");
        }else {
            System.out.println("MESIN SUDAH NYALA BROM BROM");
        }
    }

    @Override
    public void mesinMatikan() {
        if (this.StatusMesin){
            this.StatusMesin = false;
            System.out.println("MESIN MATI");
        }else{
            System.out.println("MESIN SUDAH MATI");
        }
    }

    @Override
    public void isiBensin() {
        jumlahBensin = 100;
        System.out.println("Bensin diisi penuh");
    }

    @Override
    public void jalan() {
        if (this.StatusMesin == true && jumlahBensin > 0) {
            System.out.println("Mobil berjalan");
            // Tampilkan output
            jumlahBensin -= 10;
            System.out.println("Mobil berjalan, jumlah bensin tersisa: " + jumlahBensin +" Liter");
            // Cek apakah mobil kehabisan bensin
            if (jumlahBensin == 0) {
                System.out.println("Bensin habis, mobil berhenti");
            }
        }
        // Cek apakah mobil sudah diisi bensin
        if (jumlahBensin <= 0) {
            System.out.println("Mobil belum diisi bensin");

        }
        // Cek apakah mesin sudah dinyalakan
        if (this.StatusMesin == false) {
            System.out.println("Mobil belum dinyalakan");

        }

        else {
            System.out.println("Mobil tidak bisa berjalan");
        }
    }
//    public void jalan() {
//        // Cek apakah mesin sudah dinyalakan
//        if (this.StatusMesin == false) {
//            System.out.println("Mobil belum dinyalakan");
//
//        }
//
//        // Cek apakah mobil sudah diisi bensin
//        if (jumlahBensin <= 0) {
//            System.out.println("Mobil belum diisi bensin");
//
//        }
//        if (this.StatusMesin == true) {
//            if (jumlahBensin > 0) {
//                System.out.println("Mobil berjalan");
//                // Tampilkan output
//                jumlahBensin -= 10;
//                System.out.println("Mobil berjalan, jumlah bensin tersisa: " + jumlahBensin +" Liter");
//                // Cek apakah mobil kehabisan bensin
//            }
//            if (jumlahBensin == 0) {
//                System.out.println("Bensin habis, mobil berhenti");
//            }
//        }
//        else {
//            System.out.println("Mobil tidak bisa berjalan");
//        }
//    }

    @Override
    public void inspect() {
        System.out.println("Jenis mobil: " + jenis);
        System.out.println("Jenis bahan bakar: " + bahanBakar);
        System.out.println("Jumlah bensin: " + jumlahBensin);
    }

    public boolean keluar() {
        if (this.StatusMesin){
            System.out.println("Mesin Masih Menyala Silakan Matikan");
            return false;
        }

        System.out.println("Anda Silakan Keluar Mobil");
        return true;
    }

}