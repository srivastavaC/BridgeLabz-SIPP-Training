class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskSheduler {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;  

    
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode; 
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1 || head == null) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

  
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == taskId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else {
                    prev.next = temp.next;
                    if (temp == head) head = head.next;
                    if (temp == tail) tail = prev;
                }

                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task ID not found.");
    }

    
    public void viewAndMoveNext() {
        if (current == null) {
            current = head;
        }

        if (current == null) {
            System.out.println("No tasks in the scheduler.");
            return;
        }

        System.out.println("Current Task:");
        printTask(current);
        current = current.next;
    }

    
    public void displayAll() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        System.out.println("All Tasks in Circular Order:");
        TaskNode temp = head;

        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    
    private void printTask(TaskNode node) {
        System.out.println("Task ID: " + node.taskId + ", Name: " + node.taskName +
                ", Priority: " + node.priority + ", Due Date: " + node.dueDate);
    }

   
    public static void main(String[] args) {
        TaskSheduler scheduler = new TaskSheduler();

        scheduler.addAtEnd(101, "Write report", 2, "2025-07-10");
        scheduler.addAtBeginning(100, "Fix bug", 1, "2025-07-08");
        scheduler.addAtPosition(2, 102, "Design mockup", 3, "2025-07-12");

        scheduler.displayAll();
        System.out.println();

        scheduler.viewAndMoveNext();  
        scheduler.viewAndMoveNext();  
        System.out.println();

        scheduler.searchByPriority(2);
        System.out.println();

        scheduler.removeByTaskId(101);
        scheduler.displayAll();
    }
}
