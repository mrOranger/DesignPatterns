package Behavioural.Observer;

import Behavioural.Observer.Notifications.Email;
import Behavioural.Observer.Observers.TelevisionShowObserver;
import Behavioural.Observer.Observers.UserObserver;
import Behavioural.Observer.Subjects.BlogSubject;
import Behavioural.Observer.Subjects.NewspaperSubject;

public class Client {
    public static void main(String[] args) {
        final var blogSubject = new BlogSubject();
        final var newsPaperSubject = new NewspaperSubject();

        final var aFirstUserObserver = new UserObserver();
        final var aSecondUserObserver = new UserObserver();

        final var channelOne = new TelevisionShowObserver();
        final var channelEight = new TelevisionShowObserver();

        blogSubject.subscribe(aFirstUserObserver);
        blogSubject.subscribe(aSecondUserObserver);
        blogSubject.next(new Email("blog_amazing@example.com", "Discounts", "Use ABCD code for 10% of discount"));
        blogSubject.unsubscribe((aFirstUserObserver));
        blogSubject.next(new Email("blog_amazing@example.com", "Discounts", "Use EFG code for 5% of discount"));

        newsPaperSubject.subscribe(channelOne);
        newsPaperSubject.subscribe(channelEight);
        newsPaperSubject.next("Italy Won 2026 FIFA World Cup");
    }
}
