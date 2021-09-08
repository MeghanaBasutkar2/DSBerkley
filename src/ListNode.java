public class ListNode {

    private int item;
    private ListNode next;


    public ListNode() {
        System.out.println("Constructor-def");
    }

    public ListNode(int item, ListNode next) {
        this();
        this.item = item;
        this.next = next;
        System.out.println("Constructor-2");
    }

    public void insertAfter(int k) {
        next = new ListNode(k, next);
    }

    public void doSomething(){}


    public ListNode(int item, ListNode next, String param) {
        this(item, next);
        System.out.println("Constructor-3");
    }

    public static void main(String[] args) {
        initialise();
    }

    private static void initialise() {
        ListNode l1 = new ListNode(), l2 = new ListNode(), l3 = new ListNode();
        l1.item = 0;
        l2.item = 4;
        l3.item = 6;

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        l2.insertAfter(50);

//        System.out.println(l2.next);
        System.out.println(l2.next.item);
        System.out.println(l3.item);

        ListNode listNode = new ListNode(99, l1);
    }
}
