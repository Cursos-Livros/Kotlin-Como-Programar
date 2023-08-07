//5.22 (Conversões de temperatura) Implemente os seguintes métodos inteiros:
//a) Método Kelvin retorna o equivalente Kelvin de uma temperatura Celsius, usando o cálculo
//Kelvin = Celsius + 273,15;
//b) O método Celsius retorna o equivalente Celsius de uma temperatura Kelvin, usando o cálculo
//Celsius = Kelvin - 273,15;
//c) Use os métodos das partes (a) e (b) para escrever um aplicativo que permita ao usuário
//insira uma temperatura Kelvin e exiba o equivalente em Celsius, ou, para inserir um Celsius
//temperatura e exibir o equivalente Kelvin.
fun main() {
    println("Digite a temperatura")
    val temperatura = leTemperatura()

    println("Digite 1 para converter Kelvin -> Celsius e 2 Celsius -> Kelvin")
    val opcao = leInput8()

    var kelvinCelsius = 0.0
    var celsiusKelvin = 0.0

    when (opcao) {
        1 -> kelvinCelsius = converteKelvinCelsius(temperatura)
        2 -> celsiusKelvin = converteCelsiusKelvin(temperatura)
        else -> println("Opcao Inválida")
    }

    println("Temperatura $temperatura convertida Celsius $kelvinCelsius")
    println("Temperatura $temperatura convertida Kelvin $celsiusKelvin")
}

fun leInput8(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun leTemperatura(): Double {
    println("Digite a temperatura")
    val inputTemperatura = readLine() ?: "0.0"
    return inputTemperatura.toDouble()
}

fun converteKelvinCelsius(temperatura: Double): Double {
    val temperaturaKelvin = temperatura - 273.15
    return temperaturaKelvin
}

fun converteCelsiusKelvin(temperatura: Double): Double {
    val temperaturaCelsius = temperatura + 273.15
    return temperaturaCelsius
}