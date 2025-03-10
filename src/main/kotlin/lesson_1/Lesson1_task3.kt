package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    println("Информация о взлете:")
    println(year)
    println(hour)
    println(minute)

    hour = 10
    minute = 55

    println("Информация о посадке:")
    //Первый способ:
    print("$hour:$minute")
    println()
    //Второй способ:
    print(hour)
    print(":")
    print(minute)
}