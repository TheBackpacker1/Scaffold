import java.lang.Math.pow
import java.lang.Math.sqrt

//Ex1 q1
//class Point(val x:Double,val y:Double)
//Ex1 q2
class Point(var x:Double,var y:Double)
{
    //Ex1 q4

    override fun toString(): String {
        return "Point(x=$x,y=$y)"
    }

    //Ex1 q5

    fun distance(P1:Point,P2:Point):Double
    {

        return sqrt(pow(P1.x-P2.x,2.0)+pow(P1.y-P2.y,2.0))
    }
}







fun main()
{   //Ex1 q3
    val P1=Point(20.0,20.0)
    val P2=Point(30.0,20.0)

    //Ex1 q4
    println(P1)
    println(P2)
    //Ex1 q5

val distance=P1.distance(P1,P2)
    println("distance:$distance")

    //Ex2 q1

    var listPoint:MutableList<Point>
   // listPoint= arrayListOf(P1,P2)
    listPoint=   mutableListOf(P1,P2)
    //Ex2 q2
    listPoint.add(Point(40.0,50.0))
    //Ex2 q3
    println(listPoint)
    //Ex2 q4
   val listinf30=listPoint.filter { it.x<=30.0 }
   println(listinf30)
    //Ex2 q5
    val any=listPoint.any{it.distance(it,Point(0.0,0.0))>20}
    println(any)


}