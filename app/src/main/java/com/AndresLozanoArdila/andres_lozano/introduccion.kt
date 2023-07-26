package com.AndresLozanoArdila.andres_lozano

class introduccion {

}
fun main(){
  //  println("hola mundo")
    var name: String="Andes Lozano"
    var a:Long=123456789101112
    var b:Int=123456789
    var c:Short=12345
    var d:Byte=123
    var e:Double=3.1416
    var f:Float=3.14F
    var g:Char='2'
    var h:Boolean=false
    println("ingrese el primer numero a sumar")
    var num1:Int= readLine()!!.toInt()
    println("ingrese el segundo numero a sumar")
    var num2:Int= readLine()!!.toInt()

   // println("la suma entre $c y $d es ${c+d}")
   // println("$name length es ${name.length}")

    println("Ingrese el primer numero a sumar $num1 ingrese el segundo numero $num2 ")
    println("el resultado de la suma es: ${num1+num2}")
}