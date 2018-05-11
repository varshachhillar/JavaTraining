package JavaBasics.linkedlist;

    class  NodeLR {
        int data;
        NodeLR next;

        public static void LeftRight(NodeLR head, NodeLR mid) {
            while (mid != null) {
                int tmp = head.data;
                head.data = mid.data;
                mid.data = tmp;
                head = head.next;
                mid = mid.next;
            }
        }

        public static NodeLR rever(NodeLR list, int count) {
            NodeLR next = null;
            NodeLR pre = null;
            NodeLR pre1 = null;

            if (count != 0) {
                while (count != 0) {
                    next = list.next;
                    list.next = pre;
                    pre = list;
                    list = next;
                    count = count - 1;
                }
            }
            while (list != null) {
                next = list.next;
                list.next = pre1;
                pre1 = list;
                list = next;
            }
            NodeLR result = pre;
            while (pre.next != null)
                pre=pre.next;
            pre.next=pre1;
            return result;
        }

        public static void main(String[] args) {
            NodeLR n1 = new NodeLR();
            NodeLR n2 = new NodeLR();
            NodeLR n3 = new NodeLR();
            NodeLR n4 = new NodeLR();
            n1.data = 3;
            n2.data = 5;
            n3.data = 4;
            n4.data = 2;
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = null;
            NodeLR mid = n1;
            int count = 0;
            NodeLR head = n1;
            while (n1 != null) {
                System.out.print(n1.data + " ");
                n1 = n1.next;
                count = count + 1;
            }
            int c = count;
            System.out.println();
            while (c != count / 2) {
                mid = mid.next;
                c = c - 1;
            }
            LeftRight(head, mid);
            mid = rever(head, c);
            while (mid != null) {
                System.out.print(mid.data + " ");
                mid = mid.next;
            }
        }
    }

