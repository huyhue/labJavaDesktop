package s17;
public class Object {
    private String title, content;

    public Object() {
    }

    public Object(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    

    @Override
    public String toString() {
        return title;
    }
    
    
    
}
