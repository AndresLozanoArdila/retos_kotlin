package com.AndresLozanoArdila.andres_lozano

import kotlin.random.Random

class Reto2 {
}

fun main() {
    val products = mutableListOf<Product>()
    var totalCost = 0.0

    println("¡Bienvenid@ a la tienda!")
    println("Ingrese los productos que desea comprar. Ingrese '0' para finalizar.")

    while (true) {
        println("Producto:")
        val productName = readLine()!!

        if (productName == "0") {
            break
        }

        println("Precio:")
        val price = readLine()!!.toDouble()

        println("Cantidad:")
        val quantity = readLine()!!.toInt()

        val product = Product(productName, price, quantity)
        products.add(product)

        totalCost += product.calculateCost()
    }

    println("Total a pagar: $totalCost")

    if (totalCost > 50000) {
        println("¡Felicidades! Por realizar una compra mayor a $50.000, puede participar en nuestro sorteo.")

        val random = Random.nextInt(1, 5)
        val discountPercent: Double

        when (random) {
            1 -> {
                println("Ha sacado una bola amarilla. Obtendrá un 50% de descuento.")
                discountPercent = 0.5
            }
            2 -> {
                println("Ha sacado una bola roja. Obtendrá un 10% de descuento.")
                discountPercent = 0.1
            }
            3 -> {
                println("Ha sacado una bola azul. Obtendrá un 30% de descuento.")
                discountPercent = 0.3
            }
            else -> {
                println("Ha sacado una bola blanca. Su compra es GRATIS.")
                discountPercent = 1.0
            }
        }

        val discountedCost = totalCost * (1 - discountPercent)
        println("Total a pagar con descuento: $discountedCost")
    } else {
        println("Realice una compra mayor a $50.000 para participar en nuestro sorteo.")
    }
}

data class Product(val name: String, val price: Double, val quantity: Int) {
    fun calculateCost(): Double {
        return price * quantity
    }
}
