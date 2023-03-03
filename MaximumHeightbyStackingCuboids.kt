import kotlin.math.max

class Solution {
    fun maxHeight(cuboids: Array<IntArray>): Int {
        var maxHeight=0
        for(i in cuboids){
            i.sort()
            
        //     maxHeight+=i[2]
        }
     for (i in 1 until cuboids.size) {
//        println(cuboids[i].last())
        // println("kk" + cuboids[i].last())
        // println("kk" + cuboids[i - 1].last())
        if (cuboids[i][0] <= cuboids[i - 1][0] && cuboids[i][1] <= cuboids[i - 1][1] && cuboids[i][2] <= cuboids[i - 1][2]) {
            // println(cuboids[i].last())
            // println(cuboids[i - 1].last())
            maxHeight += cuboids[i][2]
//            maxHeight += cuboids[i-1][2]
        } else if (cuboids[i][0] > cuboids[i - 1][0] && cuboids[i][1] > cuboids[i - 1][1] && cuboids[i][2] > cuboids[i - 1][2]) {
            // println("d" + cuboids[i].last())
            // println("f" + cuboids[i - 1].last())
            maxHeight += cuboids[i][2]
            maxHeight += cuboids[i-1][2]
        }
        else{
            maxHeight += max(cuboids[i-1][2],cuboids[i][2])
        }
    }

    return maxHeight
    }

}