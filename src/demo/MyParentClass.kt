package demo

open class MyParentClass(val name: String?) {


    //constructor overloading
    constructor( name : String?, company: String?) : this(name) {

    }




     open fun method1(){
        println("Hello $name")
    }

    //method overloading
    open fun method1(username : String?){

        println("Hello $username")
    }

    open fun method1(username : String?, company : String?){

        println("Hello $username @ $company")
    }

}