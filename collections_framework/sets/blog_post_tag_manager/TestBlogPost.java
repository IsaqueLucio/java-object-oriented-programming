package collections_framework.sets.blog_post_tag_manager;

public class TestBlogPost {
    public static void main(String[] args) {
        
        BlogPost blogPost = new BlogPost("Test");

        blogPost.addTag("STUDIES");
        blogPost.addTag("IA");
        blogPost.addTag("STUDIES");
        blogPost.addTag(null);

        blogPost.displayTags();


    }
}
