<h3>Illustrating Thread safety using Atomic types</h3>
<p>
	A stateless object (that has no field and that references no field from another class) is thread - safe
	Therefore when evolving such an object, it will be as thread - safe as the thread-safety of any field that is added to it
	or any object it references. (just like a chain that is as strong as its weakest link).
	For illustration, in the below example declaring the counter variable as a classic private long will make that servlet [thread-] unsafe
	But the servlet will become thread-safe again when using the thread-safe AtomicLong type.
</p>
<pre>
	public class ThreadSafeCountingServlet implements Servlet {
		private final AtomicLong counter = new AtomicLong(0);
		// Avoid the thread-unsafe following approach
		// private long counter = 0;
		
		public long getCount() { return counter.get(); }
		
		public void service(ServletRequest request, ServletResponse response) {
			String aParamFromRequest = getAParamFromRequest(request);
</pre>	 <b>counter.incrementAndGet();</b>
<pre>
			// Avoid something like counter++;
			// More processing and preparation of response
		}
	}
</pre>
