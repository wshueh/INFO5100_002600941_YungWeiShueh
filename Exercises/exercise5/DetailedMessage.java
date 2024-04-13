public class DetailedMessage extends Message {
    
    private String content;

    public DetailedMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
