package array

class ContainerWithMostWater {
    class Solution {
        fun maxArea(height: IntArray): Int {

            if (height.isEmpty()) return 0

            var leftPosition = 0
            var rightPosition = height.size - 1
            var maxArea = 0

            while (leftPosition < rightPosition) {
                // 始まりは横が最大なので、高さが変わった時にどのくらい面積が大きくなるか
                maxArea = maxOf(
                    a = maxArea,
                    b = minOf(height[leftPosition], height[rightPosition]) * (rightPosition - leftPosition)
                )
                // 低い方をずらす
                if (height[leftPosition] < height[rightPosition]) leftPosition++ else rightPosition--
            }

            return maxArea
        }
    }
}