public class Pesan {
    private Integer noPesanan;
    private Integer kuantitasPesan;
    private Integer subHarga;
    private Integer totalHarga;

    public Integer getNoPesan() {
        return noPesanan;
    }

    public Integer getKuantitas() {
        return kuantitasPesan;
    }

    public Integer getSubHarga() {
        return subHarga;
    }

    public Integer getTotalHarga() {
        return totalHarga;
    }

    public Integer setNoPesan(Integer noPesanan) {
        return this.noPesanan = noPesanan;
    }

    public Integer setKuantitas(Integer kuantitasPesan) {
        return this.kuantitasPesan = kuantitasPesan;
    }

    public Integer setSubHarga(Integer subHarga) {
        return this.subHarga = subHarga;
    }

    public Integer setTotalHarga(Integer totalHarga) {
        return this.totalHarga = totalHarga;
    }

}
