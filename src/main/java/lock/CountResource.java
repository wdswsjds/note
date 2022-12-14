package lock;

import java.util.concurrent.locks.ReentrantLock;

public class CountResource extends Resource<Integer> {

    public CountResource() { }

    public void apply() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "开始运算：" + data);
            for (int i = 0; i < 500; i++) {
                this.data++;
            }
            System.out.println(threadName + "运算完成，开始休眠");
            Thread.sleep(1000);
            System.out.println(threadName + "结束运算： " + data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
