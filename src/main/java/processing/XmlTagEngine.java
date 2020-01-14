package processing;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XmlTagEngine implements TagEngine {

    InputStream inputStream;

    private Map<String, TagProcessor> processorMap = new HashMap<>();

    public XmlTagEngine(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void addProcessor(TagProcessor tagProcessor) {
        processorMap.put(tagProcessor.getTagName(), tagProcessor);
    }

    public void process() {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader streamReader;
        try {
            streamReader = factory.createXMLStreamReader(this.inputStream);
            while (streamReader.hasNext()) {
                int eventType = streamReader.next();
                if (eventType == XMLStreamConstants.START_ELEMENT) {
                    TagProcessor t = processorMap.get(streamReader.getName().toString());

                    if (t != null) {
                        t.process(streamReader);
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
