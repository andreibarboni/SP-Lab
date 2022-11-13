public class AlignLeft implements AlignStrategy{
    @Override
    public String render(Paragraph p) {
        return (p.getText() + "##");
    }
}
