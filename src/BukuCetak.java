public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int getBeratGram() {
        return beratGram;
    }

    // Rp5.000 per 500 gram, sisa dibulatkan ke atas
    private int ongkir() {
        int blok = (beratGram + 499) / 500;
        return blok * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + ongkir();
    }

    @Override
    public String keterangan() {
        return beratGram + " gram, ongkir " + rupiah(ongkir());
    }
}