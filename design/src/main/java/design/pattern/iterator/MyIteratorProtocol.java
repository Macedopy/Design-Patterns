package design.pattern.iterator;

import java.util.Iterator;

public interface MyIteratorProtocol<T> extends Iterator<T> {
    void reset();
}
