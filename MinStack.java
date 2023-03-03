import java.util.*;
import java.io.*;

class MinStack {
	Stack<Integer> stack;
	TreeSet<Integer> tree;
    public MinStack() {
        stack=new Stack<Integer>();
        tree = new TreeSet<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        tree.add(val);
    }
    
    public void pop() {
        int i=stack.pop();
        if(!stack.contains(i))
        tree.remove(i);

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // tree.remove(x);
        int x =tree.first();
        tree.add(x);
        return tree.first();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */