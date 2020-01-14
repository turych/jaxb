package yml.rozetka;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "param")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferParam {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "unit")
    private String unit;

    @XmlValue
    private String value;

    public OfferParam() {
    }

    public OfferParam(String name, String unit, String value) {
        this.name = name;
        this.unit = unit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OfferParam{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
