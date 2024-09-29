public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private String jenisMK;

    public MataKuliah(String kodeMK, String namaMK, String jenisMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.jenisMK = jenisMK;
    }

    // Getter and Setter
    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getJenisMK() {
        return jenisMK;
    }

    public void setJenisMK(String jenisMK) {
        this.jenisMK = jenisMK;
    }
}
