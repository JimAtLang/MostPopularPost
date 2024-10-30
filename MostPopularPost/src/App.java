public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }
    public App(){
        Feed f = new Feed();
        SocialMediaPostGenerator smpg = new SocialMediaPostGenerator();
        f.addAllPosts(smpg.generatePosts(5));
        //f.showFeed();
        Post mp = f.mostPopularPost();
        System.out.println("The most popular post is:");
        mp.printPost();
        //TODO: get the most popular post using the mostPopularPost() method of the Feed and then print it
    }
}
