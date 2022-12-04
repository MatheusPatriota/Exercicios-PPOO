public interface ScreenObservable {
    Observer observers[] = new Observer[0];
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void publish();

}
