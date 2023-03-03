class Solution {
   
fun customSortString(order: String, s: String): String {
//    var count = mutableListOf<Int>()
    var count = arrayOfNulls<Int>(28)
    for (i in 0 until  count.size){
        count[i]=0
    }
    for (i in s) {
        count[i - 'a'] = count[i - 'a']!! + 1
    }
    var m = StringBuilder()
    for (i in order) {

        while (count[i - 'a']!! > 0) {
            count[i - 'a'] = count[i - 'a']!! - 1
            m.append(i)
        }
    }
    for (i in 'a'..'z') {

        while (count[i - 'a']!! > 0) {
            count[i - 'a'] = count[i - 'a']!! - 1
            m.append(i)
        }
    }
    return m.toString()

}


}