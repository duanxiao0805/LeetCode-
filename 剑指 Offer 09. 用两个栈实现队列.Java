class CQueue {
    LinkedList<Integer>A,B;
    public CQueue() {
        A=new LinkedList<Integer>();
        B=new LinkedList<Integer>();
    }
    //添加
    public void appendTail(int value) {
        A.addLast(value);
    }
    //删除
    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty())     return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
