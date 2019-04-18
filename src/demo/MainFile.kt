package demo

fun main(args: Array<String>){

    //hello world
    val name : String? = "Rafiq Ahmed"
    println("Welcome $name")

    //print static value
    println(MyClass.NAME)

    //making new object
    val myClass = MyClass(name)


    myClass.method1()

}