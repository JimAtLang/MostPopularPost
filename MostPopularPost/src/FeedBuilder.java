import java.util.ArrayList;

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
        // TODO: sort list followedPosts chronologically
        // TODO: add the list followedPosts to Feed
        return f;
    }
}
