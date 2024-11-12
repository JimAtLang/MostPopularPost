import java.util.ArrayList;

public class FeedBuilder {
    public Feed chronologicalFeed(User user){
        Feed f = new Feed();
        ArrayList<Post> posts = new ArrayList<>();
        for(User fu:user.getFollows()){
            for(Post p:fu.getPostHistory()){
                posts.add(p);
            }
        }
        f.addAllPosts(posts);
        return f;
    }
}
