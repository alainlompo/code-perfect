<h3> Dealing with equals methods </h3>
<p>
When overriding the equals method for a given class, there are obvious cases you can get out of the way by considering them first before dealing with the real equality comaprison logic. For example
null case, reference equality case, etc. Depending on your implementation logic there might be more obvious cases than these few
<br/>
<p>
<pre>

public class Invoice {
	// .... some code logic here
	
	@Override
	public boolean equals (Object invoice2) {

		// null case
		if (invoice2 == null) {
			return false;
		}
		
		// Reference equality case
		if (invoice2 == this) {
			return true;
		}
		
		// different object family case
		if (! invoice2 instanceof Invoice) {
			return false;
		}
		
		// Now that the obvious is out of the way we can
		// Implement the real comparison logic here
		// .....
	}
}

</pre>
</p>
<br/>

This approach may bring a significant gain of performance in some cases.

</p>
