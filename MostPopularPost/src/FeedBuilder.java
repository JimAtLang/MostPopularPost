public class FeedBuilder {
    public Feed chronologicalFeed(User user){
        Feed f = new Feed();
        // write code for chronological feed here
        ArrayList<Post> FollowedPosts posts;
        for(User u:user.getFollows()){

        }
        return f;
    }
}
