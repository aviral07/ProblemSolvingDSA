import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentVsSynchronizedMap {

    /*Collections.SynchronizedMap() should be used when data consistency is important and use ConcurrentHashMap on performance-critical systems, where there are far more update operations on the map than the read operations.

    Hashtable is a legacy class, and Java documentation recommends to use ConcurrentHashMap in place of Hashtable for thread-safe highly concurrent implementation.*/

   /* //Hashtable
    Map<String, String> normalMap = new Hashtable<String, String>();

//synchronizedMap
    synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());

//ConcurrentHashMap
    concurrentHashMap = new ConcurrentHashMap<String, String>();*/
}
