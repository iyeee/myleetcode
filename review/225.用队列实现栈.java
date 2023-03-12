import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> queue;
    Queue<Integer> queue2;
    public MyStack() {
        queue=new  ArrayDeque<>();
        queue2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
       
        int tmp=0;
        int size=queue.size()-1;
        while(!queue.isEmpty())
        {
            tmp=queue.poll();
            queue2.offer(tmp);
        }
        while(size--!=0){
            queue.offer(queue2.poll());
        }
        queue2.clear();
        return tmp;
    }
    
    public int top() {
        int tmp=0;
        while(!queue.isEmpty())
        {
            tmp=queue.peek();
            queue2.offer(queue.poll());
        }
        while(!queue2.isEmpty()){
            queue.offer(queue2.poll());
        }
        return tmp;

    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end


// Solution1:
// class MyStack {
//     Queue<Integer> queue;
//     Queue<Integer> queue2;
//     public MyStack() {
//         queue=new  ArrayDeque<>();
//         queue2=new ArrayDeque<>();
//     }
    
//     public void push(int x) {
//         queue.offer(x);
//     }
    
//     public int pop() {
       
//         int tmp=0;
//         int size=queue.size()-1;
//         while(!queue.isEmpty())
//         {
//             tmp=queue.poll();
//             queue2.offer(tmp);
//         }
//         while(size--!=0){
//             queue.offer(queue2.poll());
//         }
//         queue2.clear();
//         return tmp;
//     }
    
//     public int top() {
//         int tmp=0;
//         while(!queue.isEmpty())
//         {
//             tmp=queue.peek();
//             queue2.offer(queue.poll());
//         }
//         while(!queue2.isEmpty()){
//             queue.offer(queue2.poll());
//         }
//         return tmp;

//     }
    
//     public boolean empty() {
//         return queue.isEmpty();
//     }
// }
