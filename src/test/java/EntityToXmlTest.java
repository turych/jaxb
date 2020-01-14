import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import yml.rozetka.Currency;
import yml.rozetka.Offer;
import yml.rozetka.OfferParam;
import yml.rozetka.OfferPicture;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EntityToXmlTest {

    private static Offer offer;

    @BeforeAll
    static void setUp() {
        offer = new Offer();
        offer.setId(101);
        offer.setName("Offer Test junit");
        offer.setDescription("Offer Test junit description");
        offer.setPrice(new BigDecimal("15.15"));
        offer.setAvailable(true);
        offer.setCategoryId(404);
        offer.setCurrencyId(Currency.EUR);
        offer.setUrl("https://google.com");

        List<OfferParam> params = new ArrayList<>();
        params.add(new OfferParam("param name 1", "kg", "51"));
        params.add(new OfferParam("param name 2", "mm", "43"));

        List<OfferPicture> pictures = new ArrayList<>();
        pictures.add(new OfferPicture("some url"));
        pictures.add(new OfferPicture("some url 2"));

        offer.setParam(params);
        offer.setPicture(pictures);
    }

    @AfterAll
    static void afterAll() {
        offer = null;
    }

    @Test
    public void createOfferAndPrint() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Offer.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(offer, System.out);
    }
}