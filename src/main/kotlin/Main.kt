fun main() {
    println(addition(arrayOf(1,2,3,4,5,6,7)))
    println(numbers(50,60))








}
//Write a function that takes an array of numbers as input and returns the sum of all the numbers
 fun addition (numbers: Array<Int>): Int{
     return numbers.sum()
 }
//Write a function that takes two numbers as input and returns true if their sum is greater than 100,
fun numbers(num1: Int,num2: Int): Boolean{
    val sum = num1 + num2
    if (sum >= 100)
        return (true)
    else return (false)
}