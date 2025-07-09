class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int totalProcesses = 0;
    private int currentTime = 0;

    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        totalProcesses++;
    }

    public void removeProcess(ProcessNode process) {
        if (head == null || process == null) return;

        if (head == process && head == tail) {
            head = tail = null;
        } else {
            ProcessNode prev = head;
            while (prev.next != process && prev.next != head) {
                prev = prev.next;
            }

            prev.next = process.next;

            if (process == head) head = head.next;
            if (process == tail) tail = prev;
        }

        totalProcesses--;
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = head;
        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                int timeUsed = Math.min(timeQuantum, current.remainingTime);
                currentTime += timeUsed;
                current.remainingTime -= timeUsed;

                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    ProcessNode toRemove = current;
                    current = current.next;
                    removeProcess(toRemove);
                } else {
                    current = current.next;
                }

                displayQueue();
            } else {
                current = current.next;
            }
        }

        calculateAverages();
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.\n");
            return;
        }

        System.out.print("Queue: ");
        ProcessNode temp = head;
        do {
            System.out.print("[P" + temp.processId + " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void calculateAverages() {
        double totalWT = 0, totalTAT = 0;
        System.out.println("\nFinal Results:");
        System.out.println("Process\tBT\tWT\tTAT");

        ProcessNode temp = head;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            System.out.println("P" + temp.processId + "\t" + temp.burstTime + "\t" +
                    temp.waitingTime + "\t" + temp.turnaroundTime);
            temp = temp.next;
        } while (temp != head);

        int count = totalProcesses == 0 ? 1 : totalProcesses;
        System.out.printf("\nAverage Waiting Time: %.2f\n", totalWT / count);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTAT / count);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 5, 2);
        scheduler.addProcess(2, 8, 1);
        scheduler.addProcess(3, 6, 3);
        scheduler.addProcess(4, 4, 2);

        int timeQuantum = 3;
        scheduler.simulate(timeQuantum);
    }
}
