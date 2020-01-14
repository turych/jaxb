package yml.rozetka;

import processing.JAXBProcessor;

import javax.xml.bind.JAXBException;

public class OfferProcessor extends JAXBProcessor<Offer> {

    private final static String TAG_NAME = "offer";

    public OfferProcessor() throws JAXBException {
        super(Offer.class);
    }

    @Override
    public void workWithElement(Offer element) {
        System.out.println(element.toString());
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
