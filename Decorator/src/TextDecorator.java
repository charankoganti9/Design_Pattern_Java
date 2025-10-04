abstract class TextDecorator implements TextView {
    protected final TextView inner;

    TextDecorator(TextView inner) {
        this.inner = inner;
    }
}
