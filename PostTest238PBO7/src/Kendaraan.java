abstract class Kendaraan {
    protected String jenis;
    protected String bahanBakar;
    protected int jumlahBensin;

    public Kendaraan(String jenis, String bahanBakar,int jumlahBensin) {
        this.jenis = jenis;
        this.bahanBakar = bahanBakar;
        this.jumlahBensin = jumlahBensin;
    }

    public abstract void nyalakanMesin();

    public abstract void mesinMatikan();

    public abstract void isiBensin();

    public abstract void jalan();

    public abstract void inspect();
    public abstract boolean keluar();
}