public class Main {
    public static void main(String[] args) {
        // Scene 10: Ruang Boss Akhir
        Scene scene10 = new Scene(
            "Anda bertemu Penjaga Terakhir! Makhluk setengah manusia setengah ular siap menyerang!",
            "Gunakan pedang", null, 20, 50, null,
            "Lempar daging", null, 0, 30, null,
            "Kabur", null, 0, 10, null
        );

        // Scene 9: Ruang Harta Karun
        Scene scene9 = new Scene(
            "Peti harta karun terkunci! Tulisan: 'Hanya yang berani yang layak'",
            "Paksa buka", scene10, 30, 20, null,
            "Gunakan kunci emas", null, 0, 100, "Harta Karun",
            "Tinggalkan", null, 0, 10, null
        );

        // Scene 8: Ruang Teka-Teki
        Scene scene8 = new Scene(
            "Dinding batu bertuliskan: 'Aku punya kota tapi tak ada rumah, punya gunung tapi tak ada pohon, punya laut tapi tak ada ikan. Apa aku?'",
            "Jawab 'Peta'", scene9, 0, 30, "Kunci Emas",
            "Jawab 'Mimpi'", scene10, 10, 10, null,
            "Jawab 'Lautan'", scene10, 10, 10, null
        );

        // Scene 7: Jembatan Rapuh
        Scene scene7 = new Scene(
            "Jembatan kayu tua di atas jurang. Beberapa papan sudah lapuk.",
            "Lompati bagian yang rapuh", scene8, 15, 20, null,
            "Berjalan pelan-pelan", scene8, 0, 10, null,
            "Cari jalan lain", scene10, 0, 0, null
        );

        // Scene 6: Ruang Golem
        Scene scene6 = new Scene(
            "Patung batu besar tiba-tiba hidup! Matanya bersinar merah.",
            "Serang dengan pedang", scene7, 10, 30, null,
            "Lempar batu ke cermin", scene7, 0, 20, null,
            "Kabur ke belakang", scene10, 0, 0, null
        );

        // Scene 5: Ruang Cermin Ajaib
        Scene scene5 = new Scene(
            "Ruangan dipenuhi cermin. Bayangan Anda bergerak sendiri!",
            "Pecahkan cermin utama", scene6, 5, 10, "Pedang",
            "Ikuti bayangan", scene8, 0, 20, null,
            "Tutup mata dan jalan", scene7, 0, 10, null
        );

        // Scene 4: Perangkap Batu
        Scene scene4 = new Scene(
            "Batu besar berguling ke arah Anda!",
            "Lari secepatnya", scene5, 15, 10, null,
            "Gunakan tali untuk memanjat", scene5, 0, 20, null,
            "Coba hentikan batu", scene10, 30, 0, null
        );

        // Scene 3: Ruang Tengah
        Scene scene3 = new Scene(
            "Ruangan luas dengan tiga pintu: Merah (kiri), Biru (tengah), Hijau (kanan)",
            "Pintu Merah", scene4, 0, 0, null,
            "Pintu Biru", scene5, 0, 0, null,
            "Pintu Hijau", scene8, 0, 0, null
        );

        // Scene 2: Lorong Gelap
        Scene scene2 = new Scene(
            "Lorong gelap gulita. Ada sesuatu bergerak di kegelapan.",
            "Nyalakan obor", scene3, 0, 10, null,
            "Jalan perlahan", scene3, 10, 0, null,
            "Kembali ke luar", null, 0, 0, null
        );

        // Scene 1: Pintu Masuk
        Scene scene1 = new Scene(
            "Anda berdiri di depan gua kuno. Angin berbisik membawa suara aneh. Patung rusak bertuliskan 'Yang masuk takkan kembali'",
            "Masuk ke gua", scene2, 0, 0, null,
            "Cari benda berguna", scene2, 0, 0, "Obor",
            "Pergi dari sini", null, 0, 0, null
        );

        // Membuat karakter
        Character player = new Character("Pahlawan", 100);

        // Memulai cerita
        Story story = new Story(scene1, player);
        story.start();
    }
}