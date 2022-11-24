fun main(){
	val magic = 2_000_000_000
	val giant = 3_000_000_000

	val x1 = (magic + giant) % 10
	val x2 = giant - magic
	val x3 = magic + magic + 1
	val x4 = 100L - magic
	
	println(x1 is Long)
	println(x2 is Long)
	//println(x3 is Long )
	println(x4 is Long )
}
