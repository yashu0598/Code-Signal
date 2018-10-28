/*
Given a singly linked list of integers, determine whether or not it's a palindrome.

Example

For l = [0, 1, 0], the output should be
isListPalindrome(l) = true;
For l = [1, 2, 2, 3], the output should be
isListPalindrome(l) = false
*/

boolean isListPalindrome(ListNode<Integer> l) {
     ListNode<Integer> x = l;

         ListNode<Integer> head = null;
         int index = 0;
         while(x != null) {

            ListNode<Integer> old = head;
            head = new ListNode<Integer>(x.value);
            head.next = old;

            x = x.next;
            index++;
         }

         ListNode<Integer> x2 = head;
         int index2 = 0;
         x = l;
         while(x != null) {
            if(index2 > index / 2) break;
            if(x.value.intValue() != x2.value.intValue()) {
               return false;
            }
            x = x.next;
            x2 = x2.next;
            index2++;
         }
         return true;
}
