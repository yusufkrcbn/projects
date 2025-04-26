//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Sayı Gir")
    val sayi= readLine()?.toDouble()
    if (sayi != null) {
        val sonuc = calculateFahrenheit(sayi)
        println(sonuc)
    }
    else {
        println("Hatalı")
    }
    
    calculateRectangle(1,2,33,4)
    println(calculateFactorial(5))
    println(findCharacter( "Yusuf" ))
    println(calculateAngle(5))
    println(calculateSalary(21))
    println(calculateFee(51))


    }
    fun calculateFahrenheit(sayi:Double):Double{
        val number= (sayi*1.8+32)
        return number

}

fun calculateRectangle(k1: Int, k2:Int, k3:Int, k4:Int){
    println(k1+k2+k3+k4)


}

fun calculateFactorial(number:Int):Int{

    var factorial=1
    for(i in 1..number){
        factorial*=i


    }
    return factorial
}

fun findCharacter(word:String):Int{
    var myList= mutableListOf<Char>()
    for(i in word.indices){
        myList.add(word[i])

    }
    return myList.size
}

fun calculateAngle(c1:Int):Int{
    return (c1-2)*180
}

fun calculateSalary(day:Int):Int{
    var salary=0

    salary= 20*80 + (day%20)*20


    return salary
}

fun calculateFee(fee:Int):Int{
    var last=0
    last=100+(fee%50)*4

    return last
}
