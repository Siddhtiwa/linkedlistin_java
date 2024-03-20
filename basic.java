public class basic {
    public static class node{
           int data ;
           node  next;
           node(int data){
               this.data = data;
               this.next = next;
           }
    }
    public static void display(node head){
        if(head == null) return;
        display(head.next);
        System.out.println(head.data+" ");
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(7);
        node c = new node(12);
        node d = new node(32);
        node e = new node(54);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
    }
}
