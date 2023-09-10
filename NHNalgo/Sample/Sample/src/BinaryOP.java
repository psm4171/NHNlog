package Sample.src;

public interface BinaryOP {
    int apply(int i, int j);
}

class Adder implements BinaryOP {
    public int apply(int i, int j){
        return i+j;
    }

    class Multi implements BinaryOP {
        public int apply(int i, int j){
            return i * j;
        }
    }
}
