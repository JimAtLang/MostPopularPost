import java.util.ArrayList;

public class FeedBuilder {
    // TODO: Create Feed Class
    public Feed chronologicalFeed(User user){
        Feed f = new Feed();
<<<<<<< HEAD
        ArrayList<Post> list = new ArrayList<>();
        User user = new User();
        for (User u:user.getFollows()){
            for (Post p:user.postHistory){
                list.add()
            }
        }
=======
        ArrayList<Post> posts = new ArrayList<>();
        for(User fu:user.getFollows()){
            for(Post p:fu.getPostHistory()){
                posts.add(p);
            }
        }
        f.addAllPosts(posts);
>>>>>>> 764c498c31403b251505b888774cc3e71743d1fd
        return f;
    }
}
