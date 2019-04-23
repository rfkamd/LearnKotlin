package demo

class SolidClass : AbstractClassOne(), InterfaceOne {

    //abstract class function overridden
    override fun calcSum(a: Int, b: Int): Int {
        return a.plus(b)
    }

    //extension function can add a functionality to an existing class
    fun String.getName(): String{
        return "Rafiq"
    }

    //inner class
    inner class Person{
        var property1: String? = ""
    }

    //interface method overridden
    override fun addition(a: Int, b: Int) = a.plus(b)

}