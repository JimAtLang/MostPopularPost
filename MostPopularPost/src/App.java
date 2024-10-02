public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }
    public App(){
        Feed f = new Feed();
        SocialMediaPostGenerator smpg = new SocialMediaPostGenerator();
        f.addAllPosts(smpg.generatePosts(5));
        f.showFeed();
        System.out.println("Here is the most popular post: ");
        Post mpp = f.mostPopularPost(); //this will throw an exception because the method isn't implemented yet
        mpp.printPost();
    }
}
