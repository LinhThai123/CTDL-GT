public class _203_Remove_Linked_List_Elements {
      public static void main(String[] args) {      
            
      }

      public static class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                  this.val = val;
            }

            ListNode(int val, ListNode next) {
                  this.val = val;
                  this.next = next;
            }
      }

      public static ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val == val) {
                  head = head.next;
                  if (head == null) {
                        return head;
                  }
            }
            ListNode current = head;
            while (current.next != null) {
                  if (current.next.val == val) {
                        current.next = current.next.next;
                  } else {
                        current = current.next;
                  }
            }
            return head; 
      }
}
