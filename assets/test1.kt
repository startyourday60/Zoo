fun writeGrid(grid : Array<Array<Int>>){
    var counter=0
    for(x in grid){
        for(y in x){
            if(y == 0) print('O')
            else /*if(y == 1)*/ print('X')
            counter++;
            if(counter < x.size)
             print(' ')
            else
                counter = 0;
        }
        println()
    }
}
fun main() {
    var grid = arrayOf( arrayOf(0,1,1),
            arrayOf(0,1,0),
            arrayOf(1,0,1) ) // there can be class/enum/... etc more useful things but for our is more faster way
    writeGrid(grid)
}
