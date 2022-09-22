package designpatterns.structural.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivTest {
    @Test
    void testDraw() {
        Div c1 = new Div();
        c1.add(new Span());
        c1.add(new Paragraph());

        Div c2 = new Div();
        c2.add(new Paragraph());
        c2.add(new Paragraph());
        c2.add(c1);

        assertEquals("<div><p></p><p></p><div><span></span><p></p></div></div>", c2.toString());
    }
}
