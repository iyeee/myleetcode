/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class ListNode{
    int val;
    ListNode next;
    public ListNode(){};
    public ListNode(int val){
        this.val=val;
    }

}
class MyLinkedList {
    int size;
    ListNode dummy;
    ListNode tail;


    public MyLinkedList() {
        this.size=0;
        dummy=new ListNode();
        tail=null;
    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        ListNode cur=dummy;
        for(int i=0;i<=index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
       addAtIndex(0, val);  
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        ListNode node=new ListNode(val);
        ListNode pre=dummy;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        ListNode tmp=pre.next;
        pre.next=node;
        node.next=tmp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        ListNode pre=dummy;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        pre.next=pre.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

// Solution1:
// class ListNode{
//     int val;
//     ListNode next;
//     public ListNode(){};
//     public ListNode(int val){
//         this.val=val;
//     }

// }
// class MyLinkedList {
//     int size;
//     ListNode dummy;
//     ListNode tail;


//     public MyLinkedList() {
//         this.size=0;
//         dummy=new ListNode();
//         tail=null;
//     }
    
//     public int get(int index) {
//         if(index<0||index>=size){
//             return -1;
//         }
//         ListNode cur=dummy;
//         for(int i=0;i<=index;i++){
//             cur=cur.next;
//         }
//         return cur.val;
//     }
    
//     public void addAtHead(int val) {
//         ListNode node=new ListNode(val);
//         ListNode tmp=dummy.next;
//         dummy.next=node;
//         node.next=tmp;
//         if(size==0){
//             tail=node;
//         }
//         size++;        
//     }
    
//     public void addAtTail(int val) {
//         ListNode node=new ListNode(val);
//         if(size==0){
//             dummy.next=node;
//             tail=node;
//             size++;
//             return;
//         }
   
//         tail.next=node;
//         tail=node;
//         size++;
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index>size){
//             return;
//         }
//         ListNode node=new ListNode(val);
//         if(index<=0){
//             addAtHead(val);
//             return;
//         }
//         if(index==size){
//             addAtTail(val);
//             return;
//         }
//         ListNode pre=dummy;
//         for(int i=0;i<index;i++){
//             pre=pre.next;
//         }
//         ListNode tmp=pre.next;
//         pre.next=node;
//         node.next=tmp;
//         size++;
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0||index>=size){
//             return;
//         }
//         ListNode pre=dummy;
//         for(int i=0;i<index;i++){
//             pre=pre.next;
//         }
//         pre.next=pre.next.next;
//         if(index==size-1){
//             tail=pre;
//         }
//         size--;
//     }
// }


// Solution2:
// class ListNode{
//     int val;
//     ListNode next;
//     public ListNode(){};
//     public ListNode(int val){
//         this.val=val;
//     }

// }
// class MyLinkedList {
//     int size;
//     ListNode dummy;
//     ListNode tail;


//     public MyLinkedList() {
//         this.size=0;
//         dummy=new ListNode();
//         tail=null;
//     }
    
//     public int get(int index) {
//         if(index<0||index>=size){
//             return -1;
//         }
//         ListNode cur=dummy;
//         for(int i=0;i<=index;i++){
//             cur=cur.next;
//         }
//         return cur.val;
//     }
    
//     public void addAtHead(int val) {
//         ListNode node=new ListNode(val);
//         ListNode tmp=dummy.next;
//         dummy.next=node;
//         node.next=tmp;
//         if(size==0){
//             tail=node;
//         }
//         size++;        
//     }
    
//     public void addAtTail(int val) {
//         ListNode node=new ListNode(val);
//         if(size==0){
//             dummy.next=node;
//             tail=node;
//             size++;
//             return;
//         }
   
//         tail.next=node;
//         tail=node;
//         size++;
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index>size){
//             return;
//         }
//         ListNode node=new ListNode(val);
//         if(index<=0){
//             addAtHead(val);
//             return;
//         }
//         if(index==size){
//             addAtTail(val);
//             return;
//         }
//         ListNode pre=dummy;
//         for(int i=0;i<index;i++){
//             pre=pre.next;
//         }
//         ListNode tmp=pre.next;
//         pre.next=node;
//         node.next=tmp;
//         size++;
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0||index>=size){
//             return;
//         }
//         ListNode pre=dummy;
//         for(int i=0;i<index;i++){
//             pre=pre.next;
//         }
//         pre.next=pre.next.next;
//         if(index==size-1){
//             tail=pre;
//         }
//         size--;
//     }
// }
