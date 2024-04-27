
// Concrete implementation of Message that stores and returns a simple text content
public class SimpleMessage extends Message {
    
    private String content;

    public SimpleMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
