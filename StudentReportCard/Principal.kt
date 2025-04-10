data class Principal(val username: String, val password: String) {
    fun login(inputUsername: String, inputPassword: String): Boolean {
        return username == inputUsername && password == inputPassword
    }
}