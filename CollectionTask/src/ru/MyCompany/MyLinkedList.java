package ru.MyCompany;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author AleAlRodionov
 */
public class MyLinkedList<T>{

    int size;
    Node<T> first;
    Node<T> last;

    public class Node<T> {
        private T element;
        private Node nextNode;
        
        public Node(T element,Node nextNode){
            this.element = element;
            this.nextNode = nextNode;
        }
        
         public Node(T element){
            this.element = element;
            this.nextNode = null;
        }
    }
    
    private class MyLinkedListIterator<T> implements Iterator<T> {

        private Node<T> curr;

        public MyLinkedListIterator() {
            this.curr = (Node<T>) first;
        }

        public boolean hasNext() {
            return this.curr != null;
        }

        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.curr.element;
            curr = this.curr.nextNode; 
            return value;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    

    public void add(T element) {
        
        if (size == 0){
            Node<T> newNode = new Node<T>(element);
            first = newNode;
            last = newNode;
            size++;
        } else {
            Node<T> newNode = new Node<T>(element);
            this.last.nextNode = newNode;
            this.last = newNode;
            size++;
        }
    }

    public void add(int index, T  element) {
        
        if (!isPositionIndex(index)){
            throw new IndexOutOfBoundsException("Index: "+Integer.toString(index)+", Size: "+Integer.toString(size));
        }     
       int idx = 0;
       for (Node<T> x = first; x != null; x = x.nextNode) {
           if (idx == index){
                Node<T> newNode = new Node<T>(element);
                if (index == 0){
                    newNode.nextNode = x;
                    this.first = newNode;
                    size++;
                } else{
                newNode.nextNode = x.nextNode;
                x.nextNode = newNode;
                size++;
                }
           }
           idx++;
        }
    }

    public void clear() {
        for (Node<T> x = first; x != null;x = x.nextNode ) {
            x.element = null;
            x.nextNode = null;
        }
        first = last = null;
        size = 0;
    }

    public T get(int index) {
        
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index: "+Integer.toString(index)+", Size: "+Integer.toString(size));
        }
        
       int idx = 0;
       for (Node<T> x = first; x != null; x = x.nextNode) {
           if (idx == index){
                return x.element;
           }
           idx++;
        }
       return null;
    }

    public int indexOf(T element) {
        int index = 0;
        if (element == null) {
            for (Node<T> x = first; x != null; x = x.nextNode) {
                if (x.element == null){
                    return index;
                }
                index++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.nextNode) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

   public T remove(int index) {
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index: "+Integer.toString(index)+", Size: "+Integer.toString(size));
        }
        Node<T> removedNode = null;
        int idx = 0;
        for (Node<T> x = first; x != null; x = x.nextNode) {
            if (index == 0){
                this.first.element = null;
                this.first = this.first.nextNode;
                removedNode = this.first;
                size--;
                break;
            }
            
            if (idx == (index - 1)){
                removedNode = x.nextNode;
                x.nextNode = x.nextNode.nextNode;
                size--;
               break;
            }
            idx++;
        }
 
        return removedNode.element;
    }

    public T set(int index, T element) {
         if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index: "+Integer.toString(index)+", Size: "+Integer.toString(size));
         }
         
        Node<T> x = first;
        for (int i = 0; i < index; i++){
            x = x.nextNode;
        }
        T oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    public int size() {
        return size;
    }

    public T[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<T> x = first; x != null; x = x.nextNode)
            result[i++] = x.element;
        return  (T[]) result;
    }

    public Iterator iterator() {
      return new MyLinkedListIterator();
   }
    
     private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }   
}
