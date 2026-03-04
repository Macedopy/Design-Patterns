package design.pattern.iterator;

public class MyDefaultIterator implements MyIteratorProtocol<IteratorResult> {
    private int index = 0;
    private final MyDataStructure dataStructure;

    MyDefaultIterator(final MyDataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.dataStructure.size();
    }

    @Override
    public void reset() {
        this.index = 0;
    }

    @Override
    public IteratorResult next() {
        String currentValue = this.hasNext() ? this.dataStructure.getItems().get(this.index) : null;
        
        this.index++;
        
        boolean isDone = this.index >= this.dataStructure.size();

        return this.makeValue(currentValue, isDone);
    }

    private IteratorResult makeValue(String value, boolean done) {
        return new IteratorResult(value, done);
    }
}