class MultithreadMain{
    public static void main (String[] args){
        Multithreading obj = new Multithreading();

        // for(int i = 0; i< 3;i++){
        //     Multithreading obj = new Multithreading(i);
        //     //Thread t1 = new Thread(obj);
        //     obj.start();
      
        // }

        // Thread t1 = new Thread(new Multithreading() {
        //     public void run(){
        //         try{
        //             obj.func1();
        //             Thread.sleep(1000);
        //         }
        //         catch(InterruptedException e){
        
        //         }
        //     }
        // });

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);



        // Thread t2 = new Thread(new Multithreading() {
        //     public void run(){
        //         try{
        //             obj.func2();
        //             Thread.sleep(1000);
        //         }
        //         catch(InterruptedException e){
        
        //         }
        //     }
        // });
        t1.start();
        t2.start();




        // thread1.start();
        // thread2.start();
    }


}
