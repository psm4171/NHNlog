package min.Thread.daemon;

public class WorkerDaemon extends RunnableCounter{
    RunnableCounter runnableCounter;

    public WorkerDaemon(String name, int maxCount){
        super(name, maxCount);
        runnableCounter = new RunnableCounter("internal Worker Daemon Thread", maxCount);
        runnableCounter.setDaemon(true); // daemon thread 설정
    }

    @Override
    public void run(){
        runnableCounter.start();

        super.run();
    }
}
