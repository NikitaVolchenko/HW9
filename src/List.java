import java.util.Iterator;

public class List<T> {

    private Node head;
    private int count;

    public int size() {
        return count;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        count++;
    }

    public Node remove(Node item) {
        if (isEmpty()) {
            return null;
        }

        Node prev = head;
        Node curr = head;
        while (curr.getNext() != null) {
            if (curr.getValue() == item.getValue()) {
                if (count == 1) {
                    head = null;
                } else if (curr == head) {
                    head = head.getNext();
                } else {
                    prev.setNext(curr.getNext());
                }
                count--;
            }
            prev = curr;
            curr = prev.getNext();
        }
        if (curr.getNext() == null && curr.getValue() == item.getValue()) {
            prev.setNext(null);
            count--;
        }
        return curr;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void reverse() {
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {

            Node next = currNode.getNext();
            currNode.setNext(prevNode);
            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
    }

    public Node getHead() {
        return head;
    }

    public T getINode(int i) {
        Node currentNode = head;
        for (int j = 0; j < count; j++) {
            if (i == j) {
                return (T) currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", count=" + count +
                '}';
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = head;

        public Node getCurrent() {
            return current;
        }

        public T next() {
            if (hasNext()) {
                T element = (T) current.getValue();
                current = current.getNext();
                return element;
            }
            return null;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            List.this.remove(current);
        }

        @Override
        public String toString() {
            return "ListIterator{" +
                    "current=" + current +
                    '}';
        }
    }

    public int[] asIntegerArray() {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int)getINode(i);
        }
        return array;
    }
}
