import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class main{
public static void public static void main(String[] args) {
    Observable<String> source = Observable.just("First", "Second", "Third");
    Observer<String> Ob = new Observer<String>(){
        @Override
        public void onComplete(){
            System.out.println("The Operation is Completed");
        }

        @Override
        public void onError(Throwable e){
            e.printStackTrace();
        }

        @Override
        public void onNext(String s){
            System.out.println(s);
        }

        @Override
        public void onSubscribe(Disposable args){

        }
    };
    source.subscribe(Ob);
    }     
}