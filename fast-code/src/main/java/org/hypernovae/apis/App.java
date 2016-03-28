package org.hypernovae.apis;
import it.unimi.dsi.fastutil.*;
import it.unimi.dsi.fastutil.longs.Long2IntAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMap;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Let's explore the fastutil API..." );
        Long2IntSortedMap map = new 	Long2IntAVLTreeMap();
        
        // We can use the put method with a Long keys and Int values
        map.put(5L, 120);
        map.put(6L,  854);
        map.put(8L,  2450);
        
        // The default Value is zero
        System.out.println(map.get(150));
        
        // We can change the default value:
        map.defaultReturnValue(11);
        System.out.println(map.get(195));
        
        // Obtaining a specific bi - directional iterator
        LongBidirectionalIterator i = map.keySet().iterator();
        
        // Now we sum all values
        int valuesSum = 0;
        while (i.hasNext()) {
        	valuesSum += map.get(i.next());
        }
        
        System.out.println("The sum of all values is ...." + valuesSum);
        
        // We generate a headMap
        Long2IntSortedMap headMap = map.headMap(8L);
        LongBidirectionalIterator iterator  = headMap.keySet().iterator(6);
        
        Long prevKey = iterator.previous();
        System.out.println(headMap.get(prevKey));
        
        // Thread - safety in concurrential access
        Long2IntSortedMap tsMap = Long2IntSortedMaps.synchronize(headMap); 
        
    }
}
