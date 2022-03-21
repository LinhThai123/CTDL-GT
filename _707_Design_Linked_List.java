
public class _707_Design_Linked_List {
      public static void main(String[] args) {
      
      }

       static class ListNode {
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

      static class MyLinkedList {
            private ListNode head;

            public  MyLinkedList() {
                  head = null;
            }

            public  int get(int index) {
                  ListNode temp = head;
                  int count = 0;
                  while (temp != null) {
                        if (count == index) {
                              return temp.val;
                        }
                        count++;
                        temp = temp.next;
                  }
                  return -1;
            }

            public void addAtHead(int val) {
                  ListNode newNode = new ListNode(val);
                  ListNode currentNode = head;
                  newNode.next = currentNode;
                  currentNode = newNode;
            }

            public void addAtTail(int val) {
                  ListNode currentNode = head;
                  while (currentNode != null) {
                        if (currentNode.next == null) {
                              ListNode newNode = new ListNode(val);
                              currentNode.next = newNode;
                              return;
                        }
                        currentNode = currentNode.next;
                  }
            }

            public void addAtIndex(int index, int val) {
                  if (index == 0) {
                        addAtHead(val);
                  } else {
                        ListNode currentNode = head;
                        ListNode newNode = new ListNode(val);
                        int count = 0;
                        while (currentNode != null) {
                              if (count < index - 1) {
                                    newNode.next = currentNode.next;
                                    currentNode.next = newNode;
                                    return;
                              }
                              count++;
                              currentNode = currentNode.next;
                        }
                        if (count == index) {
                              addAtTail(val);
                        }
                  }
            }

            public void deleteAtIndex(int index) {
                  ListNode currentNode = head;
                  ListNode prev = null;
                  int count = 0;
                  while (currentNode != null) {
                        if (count == index) {
                              if (index == 0) {
                                    head = head.next;
                              } else {
                                    prev.next = currentNode.next;
                                    return;
                              }
                        }
                        count++;
                        prev = currentNode;
                        currentNode = currentNode.next;
                  }
            }

            public void printList() {
                  ListNode temp = head;
                  System.out.println("List of empty");
                  while (temp != null) {
                        System.out.printf("%d", temp.val);
                        temp = temp.next;
                  }
                  System.out.println();
            }
      }
}
