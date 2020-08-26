/*fun main() {
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
}*/



// Branch else

/*fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
}*/



// Untuk mengembalikan nilai (harus ada branch else nya jika tidak maka error)

/*fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
        }

    println(stringOfValue)
}*/



// Curly Branch

/*fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}*/



// Memeriksa instance menggunakan is atau !is

/*fun main() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}*/



//

/*fun main() {
    val value = 27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}*/



// Menangkap subjeck dari when expression didalam sebuah variable

/*fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)*/