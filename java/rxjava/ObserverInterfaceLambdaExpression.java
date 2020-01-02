import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class main{
public static void public static void main(String[] args) {
    Observable<String> source = Observable.just("First", "Second", "Third");
    source.subscribe(System.out::println, Throwable:: printStackTrace, ()-> 
    System.out.println("Operation Completed"));
    }     
}