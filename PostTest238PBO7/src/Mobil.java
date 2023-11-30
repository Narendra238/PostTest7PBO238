class Mobil extends Kendaraan {

    public Mobil(String jenis, String bahanBakar, int jumlahBensin) {
        super(jenis, bahanBakar, jumlahBensin);

    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }

    @Override
    public void mesinMatikan() {
        System.out.println("Mesin dimatikan");
    }

    @Override
    public void isiBensin() {
        jumlahBensin = 100;
        System.out.println("Bensin diisi penuh");
    }

    @Override
    public void jalan() {
        if (mesinMenyala()) {
            if (jumlahBensin > 0) {
                System.out.println("Mobil berjalan");
                // Tampilkan output
                jumlahBensin -= 10;
                System.out.println("Mobil berjalan, jumlah bensin tersisa: " + jumlahBensin);
                // Cek apakah mobil kehabisan bensin
            }
            if (jumlahBensin == 0) {
                System.out.println("Bensin habis, mobil berhenti");
            }
            }
        else {
            System.out.println("Mesin belum dinyalakan, mobil tidak bisa berjalan");
        }
    }

    @Override
    public void inspect() {
        System.out.println("Jenis mobil: " + jenis);
        System.out.println("Jenis bahan bakar: " + bahanBakar);
        System.out.println("Jumlah bensin: " + jumlahBensin);
    }

    public boolean mesinMenyala() {
        return true;
    }

}
