class Mobil extends Kendaraan {
    private boolean StatusMesin = true;
    public Mobil(String jenis, String bahanBakar, int jumlahBensin) {
        super(jenis, bahanBakar, jumlahBensin);
    }
    @Override
    public void nyalakanMesin() {
        this.StatusMesin = true;
        if (this.StatusMesin){
            System.out.println("MESIN NYALA BROM BROM");
        }else {
            System.out.println("MESIN SUDAH NYALA BROM BROM");
        }
    }
    @Override
    public void mesinMatikan() {
        this.StatusMesin = false;
        if (this.StatusMesin){
            System.out.println("MESIN MATI");
        }else{
            System.out.println("MESIN SUDAH MATI");
        }
    }
    @Override
    public void isiBensin() {
        jumlahBensin = 100;
        System.out.println("Solar diisi penuh");
    }
    @Override
    public void jalan() {
        if (this.StatusMesin == true && jumlahBensin > 0) {
            System.out.println("Mobil berjalan");
            jumlahBensin -= 10;
            System.out.println("Mobil berjalan, jumlah bensin tersisa: " + jumlahBensin +" Liter");
            if (jumlahBensin == 0) {
                System.out.println("Bensin habis, mobil berhenti");
            }
        }
        if (jumlahBensin <= 0) {
            System.out.println("Mobil belum diisi bensin");

        }
        if (this.StatusMesin == false) {
            System.out.println("Mobil belum dinyalakan");

        }

    }
    @Override
    public void inspect() {
        System.out.println("Jenis mobil: " + jenis);
        System.out.println("Jenis bahan bakar: " + bahanBakar);
        System.out.println("Jumlah Solar: " + jumlahBensin);
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