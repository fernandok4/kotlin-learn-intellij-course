# Funcao

Video: https://youtu.be/Vl_FmGrLs6c

Afim de organizar o código em tarefas e não somente regra pura de código, a gente tem as funções que nos ajudam a segregar o código de maneira a executar uma função como o próprio nome sugere. A ideia é que cada função faça somente o que ela foi designada a fazer e assim construimos um código muito mais entendivel para nós humanos. 

Além disso, imagine uma situação em que precisamos fazer a mesma lógica em momentos diferente do código. Ao invés de replicar o código em N momentos, será que não conseguimos centralizar a lógica em uma função e chamar a função onde é necessário. Essa é a ideia por trás das funções.

Um exemplo:

```kotlin
val precoDosProdutos = arrayOf(
    BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
    BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
)
val precoDosProdutos2 = arrayOf(
    BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
    BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
)
var precoTotal = BigDecimal.ZERO
for(preco in precoDosProdutos){
    precoTotal += preco
}
var precoTotal2 = BigDecimal.ZERO
for(preco in precoDosProdutos2){
    precoTotal2 += preco
}
```

É um código bem simples de entender, ta calculando o preço total de duas listas de preços. Porém, repare em dois pontos:

- Ele faz duas vezes o calculo.
- Pode ser simples, porém, olha como começa a ficar extenso a regra. Imagina em regras mais complexas se fosse tudo junto, um monte de regra, começa a ficar confuso pra quem le.

Ao usarmos funções resolvemos esses problemas:

```kotlin
val precoDosProdutos = arrayOf(
    BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
    BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
)
val precoDosProdutos2 = arrayOf(
    BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
    BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
)
var precoTotal = somePrecos(precoDosProdutos)
var precoTotal2 = somePrecos(precoDosProdutos2)
```

Repare que torna bem mais explicito as intenções do codigo e também removemos a duplicidade do calculo. Esse é só um exemplo. Mas como criamos uma função?

## Sintaxe

A sintaxe para uma função que recebe argumentos e tem retorno, é a seguinte:

```kotlin
fun nomeDaFuncao(nomeArgumento: TipoArgumento): TipoRetorno {
    // Faça o que tem que fazer
    return variavelDoTipoRetorno
}
```

Porém, as vezes, a função não tem um retorno, ou não precisa receber argumentos, então, podemos simplesmente omitirmos algumas coisas, por exemplo:

- Em funções que não tem retorno, não precisamos usar a palavra chave `return` e nem precisamos estabelecer o tipo do retorno.
- Em funções que não tem argumentos, não precisamos passar nada entre os parenteses depois do nome da função.
- Enquanto funções que tem mais de um argumento, podemos receber N argumentos, divididos por virgula.

Exemplos de funções:

```kotlin
fun somePrecos(listaPrecos: List<BigDecimal>): BigDecimal {
    var totalPreco = BigDecimal.ZERO
    for(preco in listaPrecos){
        totalPreco += preco
    }
    return totalPreco
}
```

```kotlin
fun someDoisNumeros(a: Number, b: Number): Number {
    return a + b
}
```

```kotlin
fun facaAlgumaCoisa() {
    println("O que esse método está fazendo? o.O")
}
```