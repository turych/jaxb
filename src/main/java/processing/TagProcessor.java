package processing;

import javax.xml.stream.XMLStreamReader;

public interface TagProcessor {
    String getTagName();

    void process(XMLStreamReader streamReader);
}
