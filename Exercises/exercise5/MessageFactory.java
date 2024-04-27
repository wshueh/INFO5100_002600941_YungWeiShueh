//Creating Message objects based on the specified type and content.

class MessageFactory {
    public static Message createMessage(String type, String content) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleMessage(content);
        } else if (type.equalsIgnoreCase("detailed")) {
            return new DetailedMessage(content);
        }
        return null;
    }
}
