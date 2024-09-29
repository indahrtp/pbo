import java.util.ArrayList;

public class JadwalKuliah {
    private String hari;
    private String waktu;
    private MataKuliah mataKuliah;
    private final ArrayList<Dosen> dosenList;
    private Ruangan ruangan;

    // Konstruktor untuk satu dosen
    public JadwalKuliah(String hari, String waktu, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.waktu = waktu;
        this.mataKuliah = mataKuliah;
        this.dosenList = new ArrayList<>();
        this.dosenList.add(dosen);
        this.ruangan = ruangan;
    }

    // Konstruktor untuk beberapa dosen
    public JadwalKuliah(String hari, String waktu, MataKuliah mataKuliah, ArrayList<Dosen> dosenList, Ruangan ruangan) {
        this.hari = hari;
        this.waktu = waktu;
        this.mataKuliah = mataKuliah;
        this.dosenList = dosenList;
        this.ruangan = ruangan;
    }

    // Getter and Setter
    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<Dosen> getDosenList() {
        return dosenList;
    }


    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }
}
