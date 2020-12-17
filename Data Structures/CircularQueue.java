import java.util.NoSuchElementException;

class CircularQueue extends IntegerArray {

    public CircularQueue() {
        this.front = -1;
        this.back = -1;
        System.out.print("Enter size for the circular queue: ");
        integerArray = new int[s.nextInt()];
    }

    public void enqueue(int data) {
        if (isFull())
            throw new IndexOutOfBoundsException();
        else if (isEmpty())
            front++;

        back = (back + 1) % integerArray.length;
        integerArray[back] = data;

    }

    public int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        int temp = integerArray[front];

        if (front == back)
            front = back = -1;
        else
            front = front + 1 % integerArray.length;

        return temp;
    }

    public void showOperations() {
        int choice = -1;
        do {
            System.out.print("\n1. Enqueue\n2. Dequeue\n3. Show contents\n4. Back\n");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter number to enqueue: ");
                    this.enqueue(s.nextInt());
                    break;
                case 2:
                    System.out.print("\nDequeued value: " + this.dequeue());
                    break;
                case 3:
                    for (int i = 0; i < integerArray.length; i++) {
                        System.out.format("%7d", i);
                    }
                    System.out.println();

                    for (int i : integerArray) {
                        System.out.format("%7d", i);
                    }
                    System.out.println();
                    for (int i = 0; i < integerArray.length; i++) {
                        if (i == back && i == front)
                            System.out.format("%7s", "BP/FP");
                        else if (i == back)
                            System.out.format("%7s", "BP");
                        else if (i == front)
                            System.out.format("%7s", "FP");
                        else
                            System.out.print("     ");

                    }

            }
        } while (choice != 4);

    }

    private boolean isFull() {
        return (back + 1) % integerArray.length == front;
    }

    private boolean isEmpty() {
        return front == -1;
    }

}
