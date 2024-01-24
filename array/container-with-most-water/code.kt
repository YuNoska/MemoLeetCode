class Solution {
    fun maxArea(height: IntArray): Int {
        var ans: Int = 0
        height.forEachIndexed { index, element ->
            height.forEachIndexed { _index, _element ->
                if(index != index) {
                    val vertical: Int = if(element < _element) element else _element
                    val side: Int = abs(index - _index)
                    val result: Int = vertical * side
                    if(ans < result) {
                        ans = result
                    }
                }
            }
        }
        return ans
    }
}