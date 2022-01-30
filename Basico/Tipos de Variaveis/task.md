# Tipos de Variaveis

Video: https://www.youtube.com/watch?v=vPIGqHrlgWM

Por ser uma linguagem de tipagem estática, o Kotlin não deixa mudarmos o tipo da variavel na execução do código. Dentro do Kotlin a gente tem alguns tipos básicos para se trabalhar. Dentre eles citarei alguns primitivos:

- Tipos Numéricos sem casa decimais:

```kotlin
val byte: Byte = 127
val short: Short = 32767
val int: Int = 2147483647
val long: Long = 9223372036854775807
```

- Tipos Numéricos com casas decimais:

```kotlin
val float: Float = 1.38423f
val double: Double = 1.38423
```

- Tipo Booleano:

```kotlin
val boolean: Boolean = false
val boolean2: Boolean = true
```

- Tipo Caractere:

```kotlin
val char: Char = 'E'
```

- Tipo Texto:

```kotlin
val string: String = "Fernando"
```

- Tipo Array:

```kotlin
val array: Array<Int> = arrayOf(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
```

Kotlin é uma linguagem de tipagem estatica, porém, o compilador é inteligente o suficiente para entender qual é o tipo
da variavel que você está criando a partir do valor que você passou para ela. Observe:

```kotlin
val float1: Float = 1.38423f
val float2 = 1.38423f
```

Essas duas variaveis são do mesmo tipo, mesmo na segunda variavel não termos explicitado o tipo da variavel. 