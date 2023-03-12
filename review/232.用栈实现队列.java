import java.util.Deque;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        Deque d;
        d.
        stackIn=new Stack<>();
        stackOut=new Stack<>();

    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        dump();
        return stackOut.pop();
    }
    
    public int peek() {
        dump();
        return stackOut.peek();
        
    }
    public boolean empty() {
        return stackIn.empty()&&stackOut.empty();
    }
    void dump(){
        if(!stackOut.empty()) return;
        while(!stackIn.empty()){
            stackOut.push(stackIn.pop());
        }
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end



// Solution1:
// class MyQueue {
//     Stack<Integer> stackIn;
//     Stack<Integer> stackOut;

//     public MyQueue() {
//         stackIn=new Stack<>();
//         stackOut=new Stack<>();

//     }
    
//     public void push(int x) {
//         dump2();
//         stackIn.push(x);
//     }
    
//     public int pop() {
//         dump();
//         return stackOut.pop();
//     }
    
//     public int peek() {
//         dump();
//         return stackOut.peek();
        
//     }
//     public boolean empty() {
//         return stackIn.empty()&&stackOut.empty();
//     }
//     void dump(){
//         while(!stackIn.empty()){
//             stackOut.push(stackIn.pop());
//         }
//     }
//     void dump2(){
//         while(!stackOut.empty()){
//             stackIn.push(stackOut.pop());
//         }
//     }
// }


// class MyQueue {
//     Stack<Integer> stackIn;
//     Stack<Integer> stackOut;

//     public MyQueue() {
//         stackIn=new Stack<>();
//         stackOut=new Stack<>();

//     }
    
//     public void push(int x) {
//         stackIn.push(x);
//     }
    
//     public int pop() {
//         dump();
//         return stackOut.pop();
//     }
    
//     public int peek() {
//         dump();
//         return stackOut.peek();
        
//     }
//     public boolean empty() {
//         return stackIn.empty()&&stackOut.empty();
//     }
//     void dump(){
//         if(!stackOut.empty()) return;
//         while(!stackIn.empty()){
//             stackOut.push(stackIn.pop());
//         }
//     }

// }