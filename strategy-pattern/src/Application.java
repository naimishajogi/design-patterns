import evictionPolicies.EvictionPolicyInterface;
import evictionPolicies.LRUEvictionPolicy;
import evictionPolicies.MRUEvictionPolicy;

public class Application {

    public static void main(String[] args) {
        EvictionPolicyInterface lruEvictionPolicy = new LRUEvictionPolicy();
        System.out.println("=======Cache with LRU eviction policy======");

        Cache lruCache = new Cache(lruEvictionPolicy, 2);
        lruCache.write("key1","val1");
        System.out.println("Key1:"+lruCache.read("key1"));
        lruCache.write("key2", "val2");
        System.out.println("Key2:"+lruCache.read("key2"));

        lruCache.write("key3","val3");
        System.out.println("Key1:"+lruCache.read("key1"));

        EvictionPolicyInterface mruEvictionPolicy = new MRUEvictionPolicy();
        System.out.println("=======Cache with MRU eviction policy======");

        Cache mruCache = new Cache(mruEvictionPolicy, 2);
        mruCache.write("key1","val1");
        System.out.println("Key1:"+mruCache.read("key1"));
        mruCache.write("key2", "val2");
        System.out.println("Key2:"+mruCache.read("key2"));

        mruCache.write("key3","val3");
        System.out.println("Key2:"+mruCache.read("key2"));
    }
}
