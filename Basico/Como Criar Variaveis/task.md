# Como criar variaveis?

Video: https://youtu.be/2gCL2Ol8_ko

Existem duas maneiras de criar variáveis no Kotlin. São as palavras chaves:

- `val`: São variaveis constantes, ou seja, só conseguimos ler os valores das variaveis que criarmos utilizando essa palavra chave.
- `var`: São variaveis que podem mudar seu valor no decorrer da execução do código. 

Exemplos:

```kotlin
val constante = "Olá Mundo"
constante = "Oi sumido" // Isso aqui é impossivel, é um erro em tempo de compilação
println(constante)
```

Para tal exemplo, a palavra chave correta é `var`:

```kotlin
var variavel = "Olá Mundo"
variavel = "Oi sumido" // Agora sim ta certo
println(variavel)
```