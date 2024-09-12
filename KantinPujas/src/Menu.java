public class Menu {
    private String jenisMenu;
    private String namaMenu;
    private Integer hargaMenu;
    private Integer stokMenu;

    public String getJenisMenu() {
        return jenisMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public Integer getHargaMenu() {
        return hargaMenu;
    }

    public Integer getStokMenu() {
        return stokMenu;
    }

    public void kurangiStok(int kuantitas) {
        this.stokMenu -= kuantitas;
    }

    public String setJenisMenu(String jenisMenu) {
        return this.jenisMenu = jenisMenu;
    }

    public String setNamaMenu(String namaMenu) {
        return this.namaMenu = namaMenu;
    }

    public Integer setHargaMenu(Integer hargaMenu) {
        return this.hargaMenu = hargaMenu;
    }

    public Integer setStokMenu(Integer stokMenu) {
        return this.stokMenu = stokMenu;
    }
}
