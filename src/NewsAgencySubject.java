public interface NewsAgencySubject {
    public void attach(Subscribers subscribers);
    public void detach(Subscribers subscribers);
    public String notifySubscribers();
}
