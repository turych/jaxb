package yml.rozetka;

import processing.JAXBProcessor;

import javax.xml.bind.JAXBException;

public class CategoryProcessor extends JAXBProcessor<Category> {

    private final static String TAG_NAME = "category";

    public CategoryProcessor() throws JAXBException {
        super(Category.class);
    }

    @Override
    public void workWithElement(Category element) {
        System.out.println(element.toString());
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
