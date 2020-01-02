import io.reactivex.Observable;
import io.reactivex.Observer;
import java.util.Arrays;
import java.util.List;
import io.reactivex.disposables.Disposable;

public class main{
public static void public static void main(String[] args) {
    Observable<String> source = Observable.just("First", "Second", "Third");
    source.subscribe(e -> System.out.println("observer 1" +e)); 
    source.subscribe(e -> System.out.println("observer 2" +e)); 

    System.out.println("From Iterable Factory");
    List<String> list = Arrays.asList("Jack", "Maria", "Tom", "Madison");
    Observable<String> secondSource = Observable.fromIterable(list);
    secondSource.subscribe(e -> System.out.println("observer 1" +e)); 
    secondSource.subscribe(e -> System.out.println("observer 2" +e)); 

    }     
}