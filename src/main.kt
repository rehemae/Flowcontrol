fun main(){
    oddNumber(3)
    println(characters(arrayOf("Amina","john","Saraphina","Ephraim")))
    robotServingDrinks(5)
    robotServingDrinks(13)
    robotServingDrinks(26)
    multiplication()
}

fun oddNumber(num:Int) {
    for (num in 1..100) {
        if (num % 2 !== 0) {
            println(num)
        }
    }
}

fun characters(name:Array<String>):Int{
    var num=0
    name.forEach { s->
            if (s.length>5) {
                num++
    }
    }
        return num
}



fun robotServingDrinks(age:Int){
    if (age<=6){
        println("glass of milk")
    }
    else if(age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("cocacola")
    }
}
fun multiplication() {
    for (f in 1..100) {
        if (f % 3 == 0) {
            println("Fizz")
        } else if (f % 5 == 0) {
            println("Buzz")
        }
        if(f%3==0 && f%5==0){
            println("FizzBuzz")

        }
    }
}


