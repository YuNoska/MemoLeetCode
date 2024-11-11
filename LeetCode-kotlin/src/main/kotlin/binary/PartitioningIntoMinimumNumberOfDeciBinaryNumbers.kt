package binary

class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    class Solution {
        fun minPartitions(n: String): Int {
            var ans = "1"
            val str = n.map {
                it.toString()
            }
            str.forEach {
                if (ans < it) ans = it
                if (ans == "9") return@forEach
            }
            return ans.toInt()
        }
    }

    fun interestingSolution(n: String): Int {
        /*
         - '0' について
         Unicodeコードポイントの差を返している
         '0' のUnicodeコードポイントは 48 で
         '1' のUnicodeコードポイントは 49 で
         → '1' - '0' の計算結果は 1
         */
        return n.max() - '0'
    }
}