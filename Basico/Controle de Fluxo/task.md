# Controle de Fluxo

Video: https://youtu.be/F8zbZs_8KUA

Afim de começarmos a escrever algumas regras, definir comportamentos diferentes com base em condições, ou seja, se isso for verdade faça isso, se não faça outra coisa, então precisamos conhecer a palavra chave if dentro do Kotlin. 

Para fazer uso do if dentro do Kotlin devemos seguir a seguinte sintax:

```kotlin
if(condicao){
    // Se for verdade a condição, executa o código
}
```

Para executarmos um código quando a condicao não é atendida, podemos utilizar a palavra chave `else`:

```kotlin
if(condicao){
    // Se for verdade a condição, executa o código
} else {
    // Se for falso a condição, executa o código
}
```

Podemos fazer ifs encadeados também para atender N regras, exemplo:

```kotlin
if(condicao1){
    // Se for verdade a condição, executa o código
} else {
    if(condicao2){
        // Se for verdade a condição, executa o código
    } else {
        // Se for falso a condição, executa o código
    }
}
```

Porém, muitos ifs encadeados pode ficar um pouco estranho e muito verboso, portanto, temos a possibilidade de usar o `when` em alguns cenários, veja só:

```kotlin
when(variavel){
    VALOR1 -> println("Se variavel for VALOR1, executa o codigo")
    VALOR2 -> println("Se variavel for VALOR2, executa o codigo")
    VALOR3 -> println("Se variavel for VALOR3, executa o codigo")
}
```

ou:

```kotlin
when {
    variavel == "teste" -> println("Se variavel for variavel == teste, executa o codigo")
    variavel2 > 0 -> println("Se variavel for variavel2 > 0, executa o codigo")
    variavel3 <= 0 -> println("Se variavel for variavel3 <= 0, executa o codigo")
}
```