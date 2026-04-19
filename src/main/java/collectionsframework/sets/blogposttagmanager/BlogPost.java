package collectionsframework.sets.blogposttagmanager;

import java.util.HashSet;
import java.util.Set;

public class BlogPost {
    
    private String title;
    private Set<String> tags = new HashSet<>();

    public BlogPost(String title){
        this.title = title;
    }

    public void addTag(String tag){
        if(tag == null){
            System.out.println("The tag canot be null!");
            return;
        }
        String newTag = tag.toLowerCase();
        if(tags.add(newTag)){
            System.out.println("Tag "+tag+" added successfully.");
        } else{
            System.out.println("Ignored: The tag "+tag+" is already in this post.");
        }
    }

    public void displayTags(){
        System.out.println("\nPost title: "+title);
        System.out.println("Tags in this post:");
        for(String f: tags){
            System.out.println(f);
        }
    }

}
