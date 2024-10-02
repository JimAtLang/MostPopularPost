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

    public void showFeed(){
        for(Post post:posts){
            post.printPost();
        }
    }
}