import java.util.concurrent.locks.ReentrantLock;

public class Multithreading extends Thread {

    public int threadNum;
    public int counter = 0;
    private ReentrantLock lock = new ReentrantLock();


    public Multithreading(){
        
    }
    public Multithreading(int threadNum){
        this.threadNum = threadNum;

    }
    @Override
    public void run(){
        
        for(int i = 0;i< 5;i++){
            System.out.println("Printing: " + i + " from thread " + threadNum);
        }

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
    }

    public void increment(){
        for(int i = 0; i< 10000;i++){
            counter++;
        }
    }
    
    public void func1(){
        lock.lock();
        try{
            increment();
        }
        finally{
            lock.unlock();
        }
        
    }
    public void func2() throws InterruptedException{
        Thread.sleep(1000);
        lock.lock();
        try{
            increment();
        }
        finally{
            lock.unlock();
        }
    }
    public void getCounter(){
        System.out.println("Counter is " + counter);
    }
    

    
}
