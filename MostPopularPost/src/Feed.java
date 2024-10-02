import java.util.ArrayList;
import java.util.List;

public class Feed {
    private List<Post> posts;
    public Feed(){
        this.posts = new ArrayList<>();
    }
    public void addAllPosts(List<Post> posts){
        this.posts.addAll(posts);
    }

    // TODO: make the mostPopularPost return the post with the most likes
    public Post  mostPopularPost(){
        throw new UnsupportedOperationException("Method not implemented yet");
    }
    


    public void showFeed(){
        for(Post post:posts){
            post.printPost();
        }
    }
}