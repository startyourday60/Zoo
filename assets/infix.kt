package infix;
import java.io.*;
//
//private class testClass{
//	public static void runTest(){ System.out.println("TEST"); }
//}
class testClass{
	public fun runTest(){
		System.out.println("TEST");
		println("Test");
	}
}


fun main() {
  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2
  infix fun Int.funny(str: String ) = (str + " is funny :D ").repeat( this )
  
  println( 10 funny "phrases")
    

  val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  sophia likes claudia 
  println( sophia.likedPeople[0].name_ )// 5

//
 var m : testClass = testClass();
 m.runTest();
}

class Person(val name_: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
