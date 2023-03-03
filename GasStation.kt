class Solution {

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

    var tGas = 0
    var tCost = 0
    var m = 0
    var s = 0
    for (i in 0 until gas.size) {
        tGas += gas[i]
        tCost += cost[i]
        m += gas[i] - cost[i];
        if (m < 0) {
            s = i + 1;
            m = 0;
        }

    }
    if (tGas < tCost)
        return -1
    return s

    }
}