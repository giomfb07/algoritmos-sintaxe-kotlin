fun main(args: Array<String>) {
    println("Quanto você ganha por hora?")
    var preco = readLine()!!.toInt()
    println("Horas de trabalho")
    var horas = readLine()!!.toInt()
   
   
   var salario= horas*preco
   var mensal = salario*30
   
   
   
   println("$mensal")
}