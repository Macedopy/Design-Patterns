package design.pattern.iterator;

public class MyDefaultIterator implements MyIteratorProtocol<String> {

    MyDefaultIterator(final MyDataStructure dataStructure) {
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'next'");
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'reset'");
	}

    private Object makeValue(String value)
    {
        return Object({value, done});
    }
    
}
