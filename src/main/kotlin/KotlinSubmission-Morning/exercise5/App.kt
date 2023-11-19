package id.infinitelearning.KotlinSubmission.exercise5

fun main() {



    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Rizky Zakaria Rani", 21, 166)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()


    // Challenge:
    //===============Class A Morning===============
    //Dasa Impi ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x

    //Latihan 4
    //Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
    repeat(1){hero.jalan()}
    repeat(2){hero.lari()}
    repeat(3){hero.makan()}
    repeat(4){hero.minum()}
    repeat(5){hero.lompat()}
    repeat(6){hero.duduk()}

    // * Latihan 5
    //* Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
    //*
    hero.profile()

}

