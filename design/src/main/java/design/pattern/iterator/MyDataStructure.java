package design.pattern.iterator;

import java.util.List;

public class MyDataStructure {
    private List<String> items;
    private MyIteratorProtocol<String> iterator;

    MyDataStructure()
    {
        MyIteratorProtocol<String> iterator = new MyIteratorProtocol<String>();
    }

    public void addItem(List<String> item)
    {
        for (String i : item) {
            this.items.add(i);
        }
    }

    public List<String> getItems()
    {
        return this.items;
    }

    public int size()
    {
        return this.items.size();
    }
}
