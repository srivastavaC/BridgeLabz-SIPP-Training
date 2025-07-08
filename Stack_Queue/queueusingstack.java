import java.util.Stack;

public class queueusingstack {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    
    public void enqueue(int value) {
        stackIn.push(value);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.pop();
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.peek();
    }

  
    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    
    public int size() {
        return stackIn.size() + stackOut.size();
    }

    
    public static void main(String[] args) {
        queueusingstack  queue = new queueusingstack ();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    

        queue.enqueue(40);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 

      
    }
}
