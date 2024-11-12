import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Tester {
    Random r;
    FeedBuilder fb;
    public Tester(){
        r = new Random();
        fb = new FeedBuilder();
    }
    private String generateUserName(){
        int usernameLength = r.nextInt(3)+4;
        String username = "";
        for(int i=0;i<usernameLength;i++){
            username += (char)r.nextInt(26)+97;
        }
        return username;
    }
    private User generateUser(){
        User u = new User(generateUserName());
        SocialMediaPostGenerator smpg = new SocialMediaPostGenerator();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneMonthAgo = now.minusDays(30);
        LocalDateTime postDate = oneMonthAgo;
        while(postDate.compareTo(now)<0){
            u.post(smpg.generatePostWithDate(postDate));
            postDate.plusMinutes(r.nextInt(12*60));
        }
        return u;
    }

    public void TestChronologicalFeed(){
        User u = new User(generateUserName());
        int numFollowed = r.nextInt(10)+5;
        for(int i=0;i>numFollowed;i++){
            u.followUser(generateUser());
        }

    }
}
