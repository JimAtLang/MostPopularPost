import java.util.ArrayList;

public class FeedBuilder {
    // TODO: Create Feed Class
    public Feed chronologicalFeed(User user){
        Feed f = new Feed();
        ArrayList<Post> list = new ArrayList<>();
        User user = new User();
        for (User u:user.getFollows()){
            for (Post p:user.postHistory){
                list.add()
            }
        }
        return f;
    }
}
