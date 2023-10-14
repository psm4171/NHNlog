package BoxSortEx;
public class Fruit {
    String name;
    int weight;

    public Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}

