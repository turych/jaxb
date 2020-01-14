package processing;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

public abstract class JAXBProcessor<T> implements TagProcessor {

    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public JAXBProcessor(Class<T> tClass) throws JAXBException {
        jaxbContext = JAXBContext.newInstance(tClass);
        unmarshaller = jaxbContext.createUnmarshaller();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void process(XMLStreamReader streamReader) {
        try {
            T element = (T) unmarshaller.unmarshal(streamReader);
            workWithElement(element);
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public abstract void workWithElement(T element);
}
