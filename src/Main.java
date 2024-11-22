import java.util.*;
public class Main {
    public static void main(String[] args) {
        Subscribers maria = new Subscribers();
        maria.setSubscriber("Maria");

        Subscribers juan = new Subscribers();
        juan.setSubscriber("Juan");

        Subscribers oliver = new Subscribers();
        oliver.setSubscriber("Oliver");

        List<Subscribers> subscriberList= new ArrayList<>();
        subscriberList.add(maria);
        subscriberList.add(juan);
        subscriberList.add(oliver);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsHeadline("Breaking news: The world is on fire!");
        newsAgency.setSubscriberList(subscriberList);
        
        System.out.println(newsAgency.notifySubscribers()); 
        
        newsAgency.detach(maria);

        Subscribers jan = new Subscribers();
        jan.setSubscriber("Jan");
        newsAgency.attach(jan);

        System.out.println(newsAgency.notifySubscribers());
    }
}
