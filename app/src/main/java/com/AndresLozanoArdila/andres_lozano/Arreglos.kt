package com.AndresLozanoArdila.andres_lozano

class Arreglos {
}

fun main() {
    // crear array
    val pets = arrayOf("dog", "cat", "canary")
    println(pets[1])

    // cambiar dato de un array
    pets[2]="parrot"
    println(pets[2])

    // array con numero y letras
    val mix = arrayOf("hats",2)
    println(mix.contentToString())

    // recorrer arrays
    for ((index,element) in pets.withIndex()) {
        println(" $index es $element")
    }

    val instrument = listOf("trumpet", "piano","violin")
    println(instrument)

    val  instruments: List<String> =listOf("trumpet", "piano","violin")
    println(instruments)

    val  instruments2 = mutableListOf("trumpet", "piano","violin")
    instruments2[1]="sax"
    println(instruments2)

    println(instruments2[0])

    // 1:obtener primer y ultimo valor
    val primerValor = instruments2.first()
    val ultimoValor = instruments2.last()
    println("Primer valor: $primerValor")
    println("Último valor: $ultimoValor")

    // 2:agregar elemntos a una lista mutable
    instruments2.add(3.toString())
    instruments2.add(4.toString())
    instruments2[3]="sax"
    instruments2[4]="sax"
    println(instruments2)

    //3:quitar elemntos de una lista mutable
    instruments2.removeAt(3)
    println(instruments2)

    // 4: imprime error y no ocurre nada

    // 5:como quitar elementos de una lista a traves del index
    val index = 3
    instruments2.removeAt(index)
    println(instruments2)

    //6:como borrar una lista completa
    instruments2.clear()
    println(instruments2)

}