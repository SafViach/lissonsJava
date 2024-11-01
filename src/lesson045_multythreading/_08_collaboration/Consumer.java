package lesson045_multythreading._08_collaboration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Consumer implements Runnable{
    private Queue queue;

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            queue.get();
        }
    }
}
