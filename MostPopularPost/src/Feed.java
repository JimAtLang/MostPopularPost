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

    public Post MostPopularPost(){
        int mostLikes=0;
        Post mostPopularSoFar=null;
        for(Post post:posts){
            if(post.getLikes()>mostLikes){
                mostLikes=post.getLikes();
                mostPopularSoFar=post;
            }
        }
        System.out.println(mostPopularSoFar);
        return mostPopularSoFar;
    }
    // TODO: create a mostPopularPost() method that returns the post with the most likes
}