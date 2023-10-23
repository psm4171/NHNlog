package min.Thread.synchronization.exam05;

public class Data {
    private String packet;

    private boolean transfer = true;

    public synchronized String receive(){
        while(transfer){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");

            }
        }
        transfer = true;

        String returnPacket = packet;
        notifyAll(); // (wait)기다리고 있는 모든 쓰레드들을 깨운다
        return returnPacket;
    }

    public synchronized void send(String packet){
        while(!transfer){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }
}
