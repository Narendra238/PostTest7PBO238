class Mobil extends Kendaraan {
    private boolean StatusMesin = false;
    public Mobil(String jenis, String bahanBakar, int jumlahBensin) {
        super(jenis, bahanBakar, jumlahBensin);
        this.StatusMesin = StatusMesin;
    }

    @Override
    public void nyalakanMesin() {
        if (this.StatusMesin){
            this.StatusMesin = true;
            System.out.println("MESIN NYALA BROM BROM");
        }
        else {
            System.out.println("MESIN SUDAH MATI");
        }
    }

    @Override
    public void mesinMatikan() {
        if (this.StatusMesin){
            this.StatusMesin = false;
            System.out.println("MESIN MATI");
        }
        else{
            System.out.println("MESIN MASIH MENYALA");
        }
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
                System.out.println("Mobil berjalan, jumlah bensin tersisa: " + jumlahBensin +" Liter");
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

    public boolean keluar() {
        if (this.StatusMesin){
            System.out.println("Mesin Masih Menyala Silakan Matikan");
            return false;
        }

        System.out.println("Anda Silakan Keluar Mobil");
        return true;
    }
    public boolean mesinMenyala(){
        return true;
    }

}