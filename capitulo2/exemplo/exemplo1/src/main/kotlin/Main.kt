fun main(args: Array<String>) {
    //Mutaveis e imutaveis
    val nossaPrimeiraVariavel: Boolean = true //imutavel
    var nossaSegundaVariavel: Boolean = false //mutavel

    //dados tipos numéricos
    val inteiro: Int = 0
    val inteiro2 = 0 //inferencia de tipo

    val umByte: Byte = 0 //8bits
    val umShort: Short = 0 //16 bits

    val umLong: Long = 0 //0

    val inteiroInferido = 10
    val longInferido = 10000000000
    val outroLong = 10L

    val double: Double = 5.5
    val float: Float = 5.5

    //tipos dados String
    var char: Char = 'a'
    var char2 = 'b'

    var concatenar = 'a' + 'b'
    var pularlinha = "Jose \n Augusto"
    var raw = """
        >>Varias
        >>linhas
        >>   diferentes
    """.trimMargin(">>")

    //Template String
    //$nomevariavel
    //${expressaovariavel}

    var string = " "
    string.isNotEmpty()
    string.isNotBlank()// se tiver somente em branco retorna falso
    string.contains("teste")

    //Tipos nulos e nao Nulos
    // tipos nulos - representam a ausencia de valor ou um valor nao significante
    var nulo: String? = null
    // o operador ? - nullsafe ?. permite incializar com nullUtilize o operador de chamada segura (?.)
    // para acessar propriedades ou métodos de objetos que podem ser nulos. Isso evita a exceção e retorna null caso a
    // referência seja nula.

    //Operador elvis
    // ?: -> Operador elvis caso a variavel seja null imprima outra coisa
    //Exemplo
    println(string?.length ?: "O valor é nulo")

    //tipos naonulos
    //NullPointerException

}