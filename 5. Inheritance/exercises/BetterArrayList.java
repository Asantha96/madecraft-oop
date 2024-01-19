import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E> {
    public BetterArrayList(){
        super();
    }
    public E pop(){
        if(this.isEmpty()) throw new IllegalArgumentException("List is empty!");
        int lastIndex = this.size()-1;
        E poppedElement = get(lastIndex);
        remove(lastIndex);
        return poppedElement;
    }
    public void insert(E e, int index){
        if(index < 0 || index > this.size()) throw new IllegalArgumentException("Index is outOf bound");
        this.remove(index);
        this.add(index, e);
    }

    public static void main(String[] args) {
        BetterArrayList<Integer> betterArrayList = new BetterArrayList<>();

        betterArrayList.add(1);
        betterArrayList.add(30);
        betterArrayList.add(11);

        System.out.println("Original List: " + betterArrayList);
        int poppedElement = betterArrayList.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Updated List " + betterArrayList);

        betterArrayList.insert(55,1);
        System.out.println("Updated List: " + betterArrayList);
    }

}
