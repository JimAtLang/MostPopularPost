public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }
    public App(){
        Feed f = new Feed();
        SocialMediaPostGenerator smpg = new SocialMediaPostGenerator();
        f.addAllPosts(smpg.generatePosts(5));
        f.showFeed();

        //TODO: get the most popular post using the mostPopularPost() method of the Feed and then print it
    }
}
