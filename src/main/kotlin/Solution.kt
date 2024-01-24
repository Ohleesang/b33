class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        val list = polynomial.split('+')

        val listByX = mutableListOf<Int>()
        val listByC = mutableListOf<Int>()

        for (li in list) {
            val str = li.replace(" ", "")
            if (str.last() == 'x') {
                var i = str.substring(0, str.lastIndex)
                if(i.isBlank()) i="1"
                listByX.add(i.toInt())
            } else listByC.add(str.toInt())

        }
        val sumByX = listByX.sum()
        val sumByC = listByC.sum()

        if(sumByX!=0) {
            if(sumByX == 1 ) answer = "x"
            else answer = sumByX.toString()+"x"
        }
        if(sumByC!=0) {
            if(sumByX==0) answer = sumByC.toString()
            else answer = answer +" + "+sumByC.toString()
        }

        return answer
    }
}

fun main() {
    val s = Solution()
    s.solution("3x + 7 + x")
    s.solution("x + x + x")
    s.solution( "1")
}