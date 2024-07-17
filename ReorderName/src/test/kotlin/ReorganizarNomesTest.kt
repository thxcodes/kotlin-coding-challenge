import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorganizarNomesTest {
    @Test
    fun testReorganizar() {
        val nomes = listOf("John Doe", "Jane Smith", "Alice Johnson")
        val resultadoEsperado = listOf("Doe John", "Johnson Alice", "Smith Jane")
        val resultado = ReorganizarNomes.reorganizar(nomes)
        assertEquals(resultadoEsperado, resultado)
    }
}
