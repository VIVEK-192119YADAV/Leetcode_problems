// Last updated: 4/9/2026, 10:45:00 PM
1class MyStack {
2    private Queue<Integer> q;
3
4
5    public MyStack() {
6        q=new LinkedList<>();
7
8        
9    }
10    
11    public void push(int x) {
12        q.add(x);
13        for(int i=0;i<q.size()-1;i++){
14            q.add(q.poll());
15        }
16
17        
18    }
19    
20    public int pop() {
21        return q.poll();
22        
23    }
24    
25    public int top() {
26         return q.peek();
27    }
28    
29    public boolean empty() {
30        return q.isEmpty();
31        
32    }
33}
34
35/**
36 * Your MyStack object will be instantiated and called as such:
37 * MyStack obj = new MyStack();
38 * obj.push(x);
39 * int param_2 = obj.pop();
40 * int param_3 = obj.top();
41 * boolean param_4 = obj.empty();
42 */