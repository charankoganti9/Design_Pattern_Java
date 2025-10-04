public class TextRenderApp {
    public static void main(String[] args) {
      TextView text = new PlainTextView("Hello World!");

      System.out.print("Plain: ");
      text.render();
      System.out.println();

      System.out.print("Bold: ");
      TextView boldText = new BoldDecorator(text);
      boldText.render();
      System.out.println();

      System.out.print("Italic + Underline: ");
      TextView italicUnderlineText = new UnderlineDecorator(new ItalicDecorator(text));
      italicUnderlineText.render();
      System.out.println();


      System.out.print("Bold + Italic + Underline: ");
      TextView boldItalicUnderlineText = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(text)));
      boldItalicUnderlineText.render();
        }
    }