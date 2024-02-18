public class PartTime extends Student {

    public PartTime(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Part Time";
    }
}