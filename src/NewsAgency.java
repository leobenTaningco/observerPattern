import java.util.*;
public class NewsAgency implements NewsAgencySubject{
    private String newsHeadline;
    private List<Subscribers> subscriberList;

    public String getNewsHeadline(){
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline){
        this.newsHeadline = newsHeadline;
    }

    public List<Subscribers> getSubscriberList(){
        return subscriberList;
    }

    public void setSubscriberList(List<Subscribers> subscriberList){
        this.subscriberList = subscriberList;
    }   

    public void attach(Subscribers subscriber){
        subscriberList.add(subscriber);
    }

    public void detach(Subscribers subscriber){
        subscriberList.remove(subscriber);
    }   

    public String notifySubscribers(){
        String output = new String();
        for(Subscribers subscriber : subscriberList){
            output += "Hello ," + subscriber.getSubscriber() + "!\nBreaking news: ";
            output += getNewsHeadline() + "\n\n";
        }
        return output;
    }
}
