import evictionPolicies.EvictionPolicyInterface;

public class Cache {

    private EvictionPolicyInterface evictionPolicyInterface;
    private int size;

    public Cache(final EvictionPolicyInterface evictionPolicyInterface, final int size) {
        this.evictionPolicyInterface = evictionPolicyInterface;
        this.size = size;
        evictionPolicyInterface.init(size);
    }

    public String read(final String key) {
        return evictionPolicyInterface.read(key);
    }

    public String write(final String key, final String value) {
        return evictionPolicyInterface.write(key, value);
    }
}
