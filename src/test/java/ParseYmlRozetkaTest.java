import org.junit.jupiter.api.Test;
import processing.TagEngine;
import processing.XmlTagEngine;
import yml.rozetka.CategoryProcessor;
import yml.rozetka.OfferProcessor;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParseYmlRozetkaTest {

    private String filePath = "src/test/resources/yml_rozetka.xml";

    @Test
    void parseAndPrint() throws FileNotFoundException, JAXBException {
        FileInputStream stream = new FileInputStream(filePath);

        TagEngine tagEngine = new XmlTagEngine(stream);

        tagEngine.addProcessor(new OfferProcessor());
        tagEngine.addProcessor(new CategoryProcessor());

        tagEngine.process();
    }
}
