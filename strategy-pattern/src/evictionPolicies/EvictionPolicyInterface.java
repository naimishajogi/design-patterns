package evictionPolicies;

public interface EvictionPolicyInterface {

    String write(String key, String value);

    String read(String key);

    void init(int size);
}
