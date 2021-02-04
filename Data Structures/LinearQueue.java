public class LinearQueue extends IntegerArray {

    public LinearQueue() {
        front = -1;
        back = -1;
        System.out.print("Enter size for the linear queue: ");
        integerArray = new int[s.nextInt()];
    }

    public void enqueue(int data) {
        if (isFull())
            throw new IndexOutOfBoundsException();
        else if (isEmpty())
            front++;

        integerArray[++back] = data;

    }

    public int dequeue() {
        int temp = integerArray[front];
        if (back == front)
            front = back = -1;
        else
            front++;
        return temp;
    }

    private boolean isFull() {
        return back + 1 == integerArray.length;
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public void showOperations() {
        int choice = -1;
        do {
            System.out.print("\n1. Add\n2. Remove\n3. Show contents\n4. Back\n");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter number to enqueue: ");
                    enqueue(s.nextInt());
                    break;
                case 2:
                    System.out.print("\nDequeued value: " + dequeue());
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
                        if (i == back || i == front)
                            System.out.format("%7s", "^");
                    }

                    System.out.println("\n");

                    for (int i = 0; i < integerArray.length; i++) {
                        if (i == back && i == front)
                            System.out.format("%7s", "   BP/FP");
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

}
