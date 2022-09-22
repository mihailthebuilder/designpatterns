package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface HtmlElement {
    public String toString();
}

class Paragraph implements HtmlElement {
    // leaf
    public String toString() {
        return "<p></p>";
    }
}

class Span implements HtmlElement {
    // leaf
    public String toString() {
        return "<span></span>";
    }
}

public class Div implements HtmlElement {
    // composite
    private List<HtmlElement> elements = new ArrayList<HtmlElement>();

    public void add(HtmlElement h) {
        elements.add(h);
    }

    public String toString() {
        String output = "<div>";
        for (HtmlElement s : elements) {
            output = output + s.toString();
        }
        output = output + "</div>";
        return output;
    }
}