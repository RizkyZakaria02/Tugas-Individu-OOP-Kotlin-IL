package id.infinitelearning.KotlinSubmission.exercise4

import sun.security.util.Password


class PasswordValidationException(message: String): Exception(message)
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun validatePassword(password: String) {
        val minLength = 8
        if (password.length < minLength) {
            throw PasswordValidationException("Password Minimal Berisi $minLength Karakter")
        }
}
fun main() {
    try {
        val password = "satuduatiga4"
        validatePassword(password)
        println("Password Berhasil Dibuat Silakan Login")
    } catch (error: PasswordValidationException){
        println("Password Gagal Dibuat Silakan Coba Kembali")
    }
}


