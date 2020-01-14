package yml.rozetka;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "picture")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferPicture {

    @XmlValue
    private String value;

    public OfferPicture() {
    }

    public OfferPicture(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OfferPicture{" +
                "value='" + value + '\'' +
                '}';
    }
}
