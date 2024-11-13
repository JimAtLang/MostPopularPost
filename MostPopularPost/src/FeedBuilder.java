import java.util.ArrayList;
import java.util.Collections;

public class FeedBuilder {
    public Feed chronologicalFeed(User user){
        Feed f = new Feed();
        // write code for chronological feed here
        ArrayList<Post> followedPosts = new ArrayList<>();
        for(User followedUser:user.getFollows()){
            for(Post p:followedUser.getPostHistory()){
                followedPosts.add(p);
            }
        }
        Collections.sort(followedPosts, new SortPostByDateDescending());
        f.addAllPosts(followedPosts);
        // TODO: sort list followedPosts chronologically
        // TODO: add the list followedPosts to Feed
        return f;
    }
}
