# Loop

Video: https://youtu.be/oAK6sSBpfC0

Para fazer tarefas repetitivas entre diversos elementos, muitas vezes a gente precisa recorrer a uma estrutura de Loop.

## for

Percorre cada elemento da lista que for passada (Resolve 99% dos casos em que você precisa de loop):

```kotlin
for(atualItemDaLista in variavelDoTipoLista){
    // Para cada item dentro da lista, execute o código
}
```

## while

Executa o código enquanto a condicao que for solicitada for verdadeira.

```kotlin
while (condicao){
    // Enquanto a condicao for verdadeira, execute o código
}
```

## doWhile

Executa o código primeiro, se a condicao for verdadeira, o código irá executar novamente. 

`OBS: A diferença para o while está somente na ordem, o while valida antes de executar e o doWhile executa antes e depois valida se é pra continuar.`

```kotlin
do {
    // Execute o código e enquanto a condicao for verdadeira, execute novamente
} while (condicao)
```

## Tem como interromper o loop de outras maneiras?

Sim, existem três palavras chaves que podem interromper o loop: `break`, `continue` e `return`.

- `break`: Quando o código executa o comando break ele simplesmente interrompe o loop e segue para as proximas etapas do código.
- `continue`: Quando o código executa o comando continue, ele já vai direto para o proximo elemento da lista no caso do for.
- `return`: O return é comum quando temos uma função que retorna algo. Porém, quando utilizado dentro de um loop ele interrompe o loop e sai da função.