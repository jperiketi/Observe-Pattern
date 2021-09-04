import java.util.ArrayList;
import java.util.List;

public class FrontEnd {

private List<Subscriber> users = new ArrayList<Subscriber>();

private String title;

public void Subscribe(Subscriber subscriber){

    users.add(subscriber);
}

public void unSubscribe(Subscriber subscriber){

    users.add(subscriber);
}

public void notifysubscriber(){

    for (Subscriber sub: users){
        sub.update();
    }
}

public void upload(String title){

    this.title = title;
    notifysubscriber();

}

}
