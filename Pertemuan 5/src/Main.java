import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Daftar Mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Ahmad Fauzan Aji", "231511033"));
        mahasiswaList.add(new Mahasiswa("Alanna Tanisya Anwar", "231511034"));
        mahasiswaList.add(new Mahasiswa("Alya Gustiani Nur Afifah", "231511035"));
        mahasiswaList.add(new Mahasiswa("Azka Darajat", "231511036"));
        mahasiswaList.add(new Mahasiswa("Bandyaga Ardiansyah Sugandi", "231511037"));
        mahasiswaList.add(new Mahasiswa("Daffa Al Ghifari", "231511038"));
        mahasiswaList.add(new Mahasiswa("Daiva Raditya Pradipa", "231511039"));
        mahasiswaList.add(new Mahasiswa("Dhea Dria Spralia", "231511040"));
        mahasiswaList.add(new Mahasiswa("Dhira Ramadini", "231511041"));
        mahasiswaList.add(new Mahasiswa("Dwika Ali Ramdhan", "231511042"));

        // Daftar Dosen
        ArrayList<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Yudi Widhiyasana", "KO013N"));
        dosenList.add(new Dosen("Santi Sundari", "KO009N"));
        dosenList.add(new Dosen("Trisna Gelar A", "KO078N"));
        dosenList.add(new Dosen("Ade Hodijah", "KO060N"));
        dosenList.add(new Dosen("Muhammad Rizqi S", "KO074N"));
        dosenList.add(new Dosen("Bambang Wisnuadhi", "KO003N"));
        dosenList.add(new Dosen("Wendi Wirasta", "KO079N"));
        dosenList.add(new Dosen("Didik Suwito Pribadi", "KO005N"));
        dosenList.add(new Dosen("Ade Chandra Nugraha", "KO001N"));
        dosenList.add(new Dosen("Zulkifli Arsyad", "KO061N"));
        dosenList.add(new Dosen("Siti Dwi Setiarini", "KO075N"));
        dosenList.add(new Dosen("Yadhi Aditya P.", "KO052N"));

        ArrayList<Dosen> dosenProyek = new ArrayList<>();
        dosenProyek.add(new Dosen("Bambang Wisnuadhi", "KO003N"));
        dosenProyek.add(new Dosen("Wendi Wirasta", "KO079N"));
        dosenProyek.add(new Dosen("Didik Suwito Pribadi", "KO005N"));

        // Daftar Mata Kuliah
        MataKuliah mk1 = new MataKuliah("21IF2010", "Matematika Diskrit II", "Teori");
        MataKuliah mk2 = new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek", "Teori");
        MataKuliah mk3 = new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek", "Praktek");
        MataKuliah mk4 = new MataKuliah("21IF2012", "Basis Data", "Teori");
        MataKuliah mk5 = new MataKuliah("21IF2012", "Basis Data", "Praktek");
        MataKuliah mk6 = new MataKuliah("21IF2013", "Rekayasa Perangkat Lunak", "Teori");
        MataKuliah mk7 = new MataKuliah("21IF2013", "Rekayasa Perangkat Lunak", "Praktek");
        MataKuliah mk8 = new MataKuliah("21IF2014", "Aljabar Linear", "Teori");
        MataKuliah mk9 = new MataKuliah("21IF2015", "Komputer Grafik", "Teori");
        MataKuliah mk10 = new MataKuliah("21IF2015", "Komputer Grafik", "Praktek");
        MataKuliah mk11 = new MataKuliah("21IF2016", "Proyek 3", "Teori");
        MataKuliah mk12 = new MataKuliah("21IF2016", "Proyek 3", "Praktek");

        // Daftar Ruangan
        Ruangan r1 = new Ruangan("D101", "Kelas");
        Ruangan r2 = new Ruangan("D102", "Lab. MT");
        Ruangan r3 = new Ruangan("D105", "Kelas");
        Ruangan r4 = new Ruangan("D106", "Lab. SDB");
        Ruangan r5 = new Ruangan("D108", "Kelas");
        Ruangan r6 = new Ruangan("D116", "Lab. PJBL2");

        // Daftar Jadwal Kuliah
        ArrayList<JadwalKuliah> jadwalList = new ArrayList<>();
        jadwalList.add(new JadwalKuliah("Senin","08.40-10.40", mk9, dosenList.get(0), r3));
        jadwalList.add(new JadwalKuliah("Senin","10.40-12.20", mk6, dosenList.get(1), r3));
        jadwalList.add(new JadwalKuliah("Senin","13.00-15.30", mk10, dosenList.get(2), r2));
        jadwalList.add(new JadwalKuliah("Selasa","07.00-12.20", mk5, dosenList.get(3), r4));
        jadwalList.add(new JadwalKuliah("Selasa","13.00-14.40", mk8, dosenList.get(4), r1));
        jadwalList.add(new JadwalKuliah("Rabu","07.00-09.30", mk11, dosenProyek, r6));
        jadwalList.add(new JadwalKuliah("Rabu","13.00-16.40", mk12, dosenProyek, r6));
        jadwalList.add(new JadwalKuliah("Kamis","07.00-08.40", mk4, dosenList.get(8), r3));
        jadwalList.add(new JadwalKuliah("Kamis","08.40-10.20", mk2, dosenList.get(9), r3));
        jadwalList.add(new JadwalKuliah("Kamis","10.40-13.50", mk3, dosenList.get(9), r6));
        jadwalList.add(new JadwalKuliah("Kamis","13.50-16.40", mk1, dosenList.get(10), r5));
        jadwalList.add(new JadwalKuliah("Jumat","07.50-14.40", mk7, dosenList.get(11), r1));

        // Menampilkan Data Mahasiswa
        System.out.println("Daftar Mahasiswa 2B-D3:");
        System.out.printf("%-5s %-30s %-15s\n", "No", "Nama", "NIM"); // Header tabel
        int noMahasiswa = 1;
        for (Mahasiswa m : mahasiswaList) {
            System.out.printf("%-5d %-30s %-15s\n", noMahasiswa++, m.getNama(), m.getKode());
        }

        // Menampilkan Data Dosen
        System.out.println("\nDaftar Dosen Pengajar 2B-D3:");
        System.out.printf("%-5s %-25s %-15s\n", "No", "Nama", "Kode Dosen");
        int noDosen = 1;
        for (Dosen d : dosenList) {
            System.out.printf("%-5d %-25s %-15s\n", noDosen++, d.getNama(), d.getKode());
        }

        // Menampilkan Jadwal Kuliah
        System.out.println("\nJadwal Kuliah Kelas 2B-D3");
        System.out.printf("%-10s %-15s %-10s %-30s %-10s %-23s %-55s %-10s\n",
                "Hari", "Waktu", "Kode MK", "Nama MK", "Jenis MK", "Kode Dosen", "Nama Dosen", "Ruangan");

        for (JadwalKuliah j : jadwalList) {
            // Mendapatkan informasi dosen
            StringBuilder kodeDosen = new StringBuilder();
            StringBuilder namaDosen = new StringBuilder();

            // Iterasi melalui dosenList
            for (Dosen d : j.getDosenList()) {
                kodeDosen.append(d.getKode()).append(", ");
                namaDosen.append(d.getNama()).append(", ");
            }

            // Menghapus koma dan spasi terakhir
            if (!kodeDosen.isEmpty()) kodeDosen.setLength(kodeDosen.length() - 2);
            if (!namaDosen.isEmpty()) namaDosen.setLength(namaDosen.length() - 2);

            // Menampilkan informasi jadwal kuliah
            System.out.printf("%-10s %-15s %-10s %-30s %-10s %-23s %-55s %-10s\n",
                    j.getHari(), j.getWaktu(),
                    j.getMataKuliah().getKodeMK(), j.getMataKuliah().getNamaMK(),
                    j.getMataKuliah().getJenisMK(), kodeDosen,
                    namaDosen, j.getRuangan().getKodeRuangan() + "-" + j.getRuangan().getNamaRuangan());
        }
    }
}
