package min.Thread.state;

public class SharedCount {
    int count = 0;

    public int getCount() {
        return count;
    }

    public SharedCount(){

    }

    public synchronized void increment(){
        count++;
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){

        }
    }

}
