class MyQueue {
    private Stack<Integer> m;
    private Stack<Integer> h;
    public MyQueue() {
        m=new Stack<>();
        h=new Stack<>();
    }
    
    public void push(int x) {
        while(m.size()>0){
            h.push(m.pop());
        }
        m.push(x);
        while(h.size()>0){
            m.push(h.pop());
        }
    }
    
    public int pop() {
        return m.pop();
    }
    
    public int peek() {
        return m.peek();
    }
    
    public boolean empty() {
        if(m.size()==0){
            return true;
        }else{
            return false;
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
