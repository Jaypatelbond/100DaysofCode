import io.reactivex.Observable;

/**
 * Observable emits three types of events, onNext, onComplete, onError event
 * An Observer must implement these events and perform the required operation
 * 
 */

public class main{
public static void public static void main(String[] args) {
    Observable<String> source = Observable.create(emitter ->{
      try {
            emitter.onNext("First");
            emitter.onNext("Second");
            emitter.onComplete();
          }
        } catch (Exception e) {
            emitter.onError(e);
        }
    });
}