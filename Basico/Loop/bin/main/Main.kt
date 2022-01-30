import java.math.BigDecimal

fun main() {
    println("\n========== for ==========\n")
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    var precoTotal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        precoTotal += preco
    }
    println("Preço Total: $precoTotal")

    println("\n========== while ==========\n")
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while (contador < precoDosProdutos.size){
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }
    println("Preço Total: $precoTotal")

    println("\n========== doWhile ==========\n")
    contador = 0
    precoTotal = BigDecimal.ZERO
    do {
        precoTotal += precoDosProdutos[contador]
        contador += 1
    } while (contador < precoDosProdutos.size)
    println("Preço Total: $precoTotal")

    println("\n========== Interrompendo o loop ==========\n")
    println("========== break ==========\n")
    precoTotal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        if(preco > BigDecimal("10")){
            break // Caso encontre uma compra acima de 10, interrompa o loop
        }
        precoTotal += preco
    }
    println("Preço Total: $precoTotal")
    println("\n========== continue ==========\n")
    precoTotal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        if(preco > BigDecimal("10")){
            continue // Caso encontre uma compra acima de 10, vá para o proximo elemento
        }
        precoTotal += preco
    }
    println("Preço Total: $precoTotal")
}
