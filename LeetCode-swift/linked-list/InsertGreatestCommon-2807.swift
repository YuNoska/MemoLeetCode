import Foundation

/**
 https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/submissions/1451726272/
 */

public class ListNode {
     public var val: Int
     public var next: ListNode?
     public init() { self.val = 0; self.next = nil; }
     public init(_ val: Int) { self.val = val; self.next = nil; }
    public init(_ val: Int, _ next: ListNode?) {
        self.val = val; self.next = next;
    }
}

class Solution {
    func insertGreatestCommonDivisors(_ head: ListNode?) -> ListNode? {
        guard let _head = head else {
            return .init()
        }
        guard let _next = _head.next else {
            return _head
        }
        
        let result = euclid(_head.val, _next.val)
        return .init(
            _head.val,
            .init(
                euclid(_head.val, _next.val),
                insertGreatestCommonDivisors(_next)
            )
        )
    }

    func euclid(_ node1: Int, _ node2: Int) -> Int {
        var a = node1
        var b = node2
        while b != 0 {
            let r = a % b
            a = b
            b = r
        }
        return a
    }
}
