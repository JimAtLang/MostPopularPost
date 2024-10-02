public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }
    public App(){
        Feed f = new Feed();
        SocialMediaPostGenerator smpg = new SocialMediaPostGenerator();
        f.addAllPosts(smpg.generatePosts(5));
        f.showFeed();
    }
}
