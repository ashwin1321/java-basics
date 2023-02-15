// Multhreading is top achieve multitasking

// threads are shared memory area, threads = faster content switching
// thread is lightweight and process is heavy



// --> To create a thread using the thread class, we need to extend the thread class. Java's multithreading system is based on the thread class.

class MyThread extends Thread{               // inherit thread class and override the run method. The code we want to execute on thread execution goes inside the run() method
    public void run()
    {
        // code
        int i =0;
        while (i<5){
            System.out.println("Thread1");
            i++;
        }
    }
}

class MyThread2 extends Thread{               // inherit thread class and override the run method. The code we want to execute on thread execution goes inside the run() method
    public void run()
    {
        // code
        int i =0;
        while (i<5){
            System.out.println("Thread2");
            i++;
        }
    }
}
public class MultithreadExtendThreadClass {

    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2() ;
        t1.start();               // To execute the thread, start() method is used.  It automatically calls the run() method.
        t2.start();

    }

}
