public class Post {
    private String title;
    private String content;
    private int likes;
    public Post(String title, String content, int likes) {
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public void addLike(){
        this.likes++;
    }


}
