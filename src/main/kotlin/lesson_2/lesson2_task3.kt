package org.example.lesson_2

fun main() {

    val startHours = 9
    val startMinute = 39
    val travelTimeMinutes = 457
    val totalStartMinutes = startHours * 60 + startMinute
    val arrivalMinutes = totalStartMinutes + travelTimeMinutes
    val endHours = arrivalMinutes / 60
    val endMinutes = arrivalMinutes % 60

    println("$endHours:$endMinutes")
}