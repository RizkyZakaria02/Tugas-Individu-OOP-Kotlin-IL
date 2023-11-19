package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val FirstName = "Rizky"
    val LastName = "Zakaria Rani"
    val Umur = 21
    val Status :Boolean = true

   println("Nama Saya $FirstName $LastName Berusia $Umur")
   println("Status Saat Ini")
    if (Status){
        println("Taken")
    }else{
        println("Single")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group Id: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggotaGroup: List<Any> = listOf("Rizky Zakaria Rani", "Agum Pratama", "M Rizko Sefta", "Frida Nurul Azizah",
        "Mira Mulyani")

    return listOf(anggotaGroup)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Hassan Harahap", "Yogi Rafael")
    val countOfGroup = arrayOf<String>("Rizky Zakaria Rani", "Agum Pratama", "M Rizko Sefta", "Mira Mulyani"
    , "Frida Nurul Azizah")
    val totalMentor = mentor.size
    val totalAnggota = countOfGroup.size

    val total = totalMentor + totalAnggota

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Dasa Impi", listOf("Rizky Zakaria Rani", "Agum Pratama", "M Rizko Sefta", "Frida Nurul Azizah",
        "Mira Mulyani"), "Morning A")

}