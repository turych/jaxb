package processing;

public interface TagEngine {
    void addProcessor(TagProcessor tagProcessor);

    void process();
}
