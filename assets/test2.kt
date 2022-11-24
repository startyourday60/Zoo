
fun main() {
    // put your code here
    var myWords = mutableListOf<String>();
    val need_size = 2;
    while(myWords.size < need_size) myWords.add( readln() );
    for(i:Int in (myWords.size-1) downTo 0 step 1){
	println(i)
        println(myWords[i]);
    }
}

