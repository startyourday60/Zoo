//import java.io.*;
//import java.util.*;
infix fun Int.times(str : String) = str.repeat(this)
fun main() {
  //  Scanner sc = new Scanner();
    // write your code here
    var line = readLine();
    while( line == null ) line = readLine();
    var word = line.split(" ")[0]
    print(word.length)
    print(" repetitions of the word "+word+": ")
    print(word.length times word)
    println( "2+2="+(2+2).toString() )
}
