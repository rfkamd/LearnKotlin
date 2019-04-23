package demo

fun main(args: Array<String>){

//    basicKotlin()
    basicKotlin2()

}


fun basicKotlin2(){
    val solidClass = SolidClass()

    println("Sum ${solidClass.addition(1, 2)}")
}


fun basicKotlin(){
    //hello world
    val name : String? = "Rafiq Ahmed"
    println("Welcome $name")

    //print static value
    println(MyClass.NAME)

    //making new object
    val myClass = MyClass(name)
    myClass.method1()
}