public class PlainTextView implements TextView {
     private final String text;

    public PlainTextView(String text) {
        this.text = text;
    }

    public void render()
    {
        System.out.println(text);
    }
}
