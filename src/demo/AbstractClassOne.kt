package demo

abstract class AbstractClassOne {

    abstract fun calcSum(a: Int, b: Int) : Int

    fun square(a :Int?) = a?.times(a)//null safe expression to square

    fun power(a :Int?, b: Int) = a?.times(b)//null safe expression to calculate power
}