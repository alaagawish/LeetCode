class Solution {
    fun climbStairs(n: Int): Int {
        
        var list= mutableListOf<Int>(1,1)
        for (i in 2..n)
            list.add(list[i-1]+list[i-2])
        
        return list.last()
    }

}