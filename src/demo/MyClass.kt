package demo

class MyClass(val username: String?) : MyParentClass(username) {


    //static variables
    companion object {
        val NAME = "Rafiq Ahmed"
        val COMPANY = "Averos"
    }




    //overriding methods
    override fun method1(){
        super.method1()
        super.method1(username)
        super.method1(username, "Averos")
    }
}