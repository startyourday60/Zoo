val CONST_NEED_SIZE=2;
fun reverseList( toReverse : MutableList<String> ) : MutableList<String> {
    var ret = mutableListOf<String>();
    for(i:Int in (toReverse.size-1) downTo 0 step 1){ // https://kotlinlang.org/docs/control-flow.html#for-loops
        ret.add(toReverse[i]);
    }    
    return ret;
}
fun getWords( r: MutableList<String>, count : Int = CONST_NEED_SIZE ) { 
	while(r.size < count) r.add( readln() ) 
}//get by link. by "memory pointer"
fun main() {
    // put your code here
    val myWords = mutableListOf<String>();
    getWords(myWords)
    for( element in reverseList(myWords) ) println(element);
}

