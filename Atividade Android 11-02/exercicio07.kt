fun main(args: Array<String>) {
    println("Escreva o lado do quadrado")
    var lado = readLine()!!.toInt()
    var area = lado*lado
    var dobro = area*2
   
   println("$area, $dobro")
}