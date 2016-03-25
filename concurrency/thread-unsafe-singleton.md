<h3>A [thread] unsafe singleton</h3>
<p>
The singleton pattern is very usefull especially when we are dealing with an object that takes a long time to construct or take consumes an important amount of resources 
while being constructed. The general approach used in such a case is one of a lazy initialization. That way if the object is already created, the following request
to the object will all receive the same instance. Here is a typical implementation

<pre>
public class HeavyAndTimeConsummingSingleton {

	private HeavyAndTimeConsummingSingleton() {
		// Heavy stuff going on here
		// .....
		// Important amount of time being used here
		// ......		
	}
	
	private HeavyAndTimeConsummingSingleton instance = null;
	
	public static HeavyAndTimeConsummingSingleton getInstance() {
		if (instance == null) {
			instance = new HeavyAndTimeConsummingSingleton();
		}
		return instance;
	}
}
</pre>

In a case of a race condition, two thread T1 and T2 may invoke the method getInstance() simultaneously. It might be that T1 being just a little bit faster
may check the if condition first and trigger the building of the instance. But since it takes a long time to build, T2 comes along and check the if condition,
only to find that instance is null and therefore it will trigger the construction of [another] instance.
</p>