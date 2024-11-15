import java.util.ArrayList;

public class FeedBuilder {
<<<<<<< HEAD

=======
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
>>>>>>> e787e18962592f305ee29aa2cb4d1b2c74e16a8d
}
