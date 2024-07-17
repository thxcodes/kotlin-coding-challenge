object ReorganizarNomes {
    fun reorganizar(nomes: List<String>): List<String> {
        val nomesReorganizados = nomes.map { nome ->
            val partes = nome.split(" ")
            val primeiroNome = partes[0]
            val sobrenome = partes[1]
            "$sobrenome $primeiroNome"
        }
        return nomesReorganizados.sorted()
    }
}