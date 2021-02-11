package PhantomReference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class MyPhantomReference<T> extends PhantomReference {

    /**
     * Creates a new phantom reference that refers to the given object and
     * is registered with the given queue.
     *
     * <p> It is possible to create a phantom reference with a {@code null}
     * queue, but such a reference is completely useless: Its {@code get}
     * method will always return {@code null} and, since it does not have a queue,
     * it will never be enqueued.
     *
     * @param referent the object the new phantom reference will refer to
     * @param q        the queue with which the reference is to be registered,
     *                 or {@code null} if registration is not required
     */
    public MyPhantomReference(T referent, ReferenceQueue q) {
        super(referent, q);
    }

    public void cleanUp(){
        System.out.println("Удаление");
        clear();
    }
}
