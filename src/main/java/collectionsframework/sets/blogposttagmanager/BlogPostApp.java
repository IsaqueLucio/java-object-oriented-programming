package collectionsframework.sets.blogposttagmanager;

public class BlogPostApp {
    public static void main(String[] args) {
        
        BlogPost blogPost = new BlogPost("Test");

        blogPost.addTag("STUDIES");
        blogPost.addTag("IA");
        blogPost.addTag("STUDIES");
        blogPost.addTag(null);

        blogPost.displayTags();


    }
}
