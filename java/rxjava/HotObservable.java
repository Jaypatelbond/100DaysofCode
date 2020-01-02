import io.reactivex.Observable;
import io.reactivex.Observer;
import java.util.Arrays;
import java.util.List;
import io.reactivex.disposables.Disposable;

/**
 * 
 * This is not MultiThreading, We Arent doing this at the same time, 
 * both the observers are recieving the same emission.
 * Its done by the Main Thread.
 */

public class main{
public static void public static void main(String[] args) {
    List<String> list = Arrays.asList("Jack", "Maria", "Tom", "Madison");
    
    Observable<String> hot = java.util.Observable.fromIterable(list);
    ConnectableObservable<String> hot = source.publish();
    
    Observable<String> secondSource = Observable.fromIterable(list);
    hot.subscribe(e -> System.out.println("observer 1" +e)); 
    hot.subscribe(e -> System.out.println("observer 2" +e)); 
    hot.connect();
    }     
}