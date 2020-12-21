package evictionPolicies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUEvictionPolicy implements EvictionPolicyInterface {

    private int size;
    private Map<String, String> keyValuePairs;
    private List<String> keys;

    @Override
    public String write(final String key, final String value) {
        if (keyValuePairs.containsKey(key) && keyValuePairs.get(key).equals(value)) {
            return null;
        }

        if (keys.size() == size) {
            removeDataFromCache();
        }
        keyValuePairs.put(key, value);
        keys.add(0, key);
        return value;
    }

    @Override
    public String read(final String key) {
        if (!keyValuePairs.containsKey(key)) {
            return null;
        } else {
            keys.remove(key);
            keys.add(0, key);
            return keyValuePairs.get(key);
        }
    }

    @Override
    public void init(final int size) {
        keys = new ArrayList<>(size);
        keyValuePairs = new HashMap<>();
        setSize(size);
    }

    private void removeDataFromCache() {
        final int lastIndex = this.getKeys().size() - 1;
        final String key = getKeys().remove(lastIndex);
        this.getKeyValuePairs().remove(key);
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public Map<String, String> getKeyValuePairs() {
        return keyValuePairs;
    }

    public void setKeyValuePairs(final Map<String, String> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(final List<String> keys) {
        this.keys = keys;
    }
}
