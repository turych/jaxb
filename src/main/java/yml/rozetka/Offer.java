package yml.rozetka;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@XmlRootElement(name = "offer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Offer {

    @XmlAttribute(name = "id")
    private Integer id;

    @XmlAttribute(name = "available")
    private String available;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "price")
    private BigDecimal price;

    @XmlElement(name = "currencyId")
    private Currency currencyId;

    @XmlElement(name = "categoryId")
    private Integer categoryId;

    @XmlElement(name = "url")
    private String url;

    private List<OfferParam> param;

    private List<OfferPicture> picture;

    public Offer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getAvailable() {
        return Boolean.parseBoolean(available);
    }

    public void setAvailable(Boolean available) {
        this.available = available.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Currency currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<OfferParam> getParam() {
        return param;
    }

    public void setParam(List<OfferParam> param) {
        this.param = param;
    }

    public List<OfferPicture> getPicture() {
        return picture;
    }

    public void setPicture(List<OfferPicture> picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", available='" + available + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", currencyId=" + currencyId +
                ", categoryId=" + categoryId +
                ", url='" + url + '\'' +
                ", params=" + param +
                ", pictures=" + picture +
                '}';
    }
}
