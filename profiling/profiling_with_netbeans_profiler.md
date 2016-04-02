<h3>Profiling with netbeans profiler</h3>   
Netbeans is shipped with a very interesting profiler. It's very handy, powerful and simple to use.
In order to display you need to go to the following list of menus and menu items:  Windows ==> Profiling ==> Profiler   
<br/>
<img src="resources/how_to_display_the_profiler.png" alt="Illustration for the netbeans integrated profiler"/>   

You can position it as seems fit to you   
Then you can select a module or a project, open its contextual menu and lunch the profiler   
<br/>
<img src="resources/start_profiling_an_app.png" alt="lunching the profiler" />   
<br/>
The viewing options are threefold:    
<ul>
	<li>The virtual machine's telemetry</li>
	<li>The threads</li>
	<li>The lock contention</li>
</ul>

The names of these categories speak largely by themselves, so I don't see the need to comment more than showing it with pictures   
<br/>

<u>Figure a. vm's heap memory telemetry</u>   
<img src="resources/netbeans_integrated_profiler_sample_001.jpg" />   
<br/>

<u>Figure b. vm's thread telemetry</u>   
<img src="resources/netbeans_integrated_profiler_sample_003_vm_thread_telemetry.jpg" />   
<br/>

<u>Figure c. vm's lock contention's telemetry</u>   
<img src="resources/netbeans_integrated_profiler_sample_003_lock_contention.jpg" />   
<br/>