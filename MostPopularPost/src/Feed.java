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
            System.out.println("Title: " + post.getTitle());
            System.out.println("Content:" + post.getContent());
            System.out.println("Likes: " + post.getLikes());
        }
    }
}