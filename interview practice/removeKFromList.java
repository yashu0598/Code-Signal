/*

Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.

Example

For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
removeKFromList(l, k) = [1, 2, 4, 5];
For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].

*/
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) 
{
     ListNode<Integer> x = l;
         ListNode<Integer> prev = null;
         while(x != null) {
            ListNode<Integer> x_next = x.next;
            if(x.value == k) {
               if(prev != null) {
                  prev.next = x_next;
               } else {
                  l = x_next;
               }
            } else {
               prev = x;
            }
            x = x_next;
         }

         return l;
}
