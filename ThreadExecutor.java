import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExecutor {
    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            String threadname = Thread.currentThread().getName();
            System.out.println("hello" + threadname);

        });
    }
}