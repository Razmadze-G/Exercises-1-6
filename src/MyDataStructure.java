import java.util.*;

public class MyDataStructure {
    ArrayList<Integer> arr;
    HashMap<Integer, Integer> hash;
    public MyDataStructure()
    {
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
    }

    void add(int x) {
        if (hash.get(x) != null)
            return;
        int s = arr.size();
        arr.add(x);
        hash.put(x, s);
    }

    void remove(int x)
    {
        Integer index = hash.get(x);
        if (index == null)
            return;
        hash.remove(x);
        int size = arr.size();
        Integer last = arr.get(size-1);
        Collections.swap(arr, index, size-1);
        arr.remove(size-1);
        hash.put(last, index);
    }
    int get(int x) {
        return arr.get(x);
    }
}

