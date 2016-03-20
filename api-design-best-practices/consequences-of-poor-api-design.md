<h3> Consequences of poor API design</h3>

A poorly designed API can cause many important issues<br/>

* It is difficult to program with and will often lead us to create more code than we should had it been well designed
* As a consequence of it, the programs gets larger and monopolize more CPU resources
* It can lead to code that forces unnecessary data copies 
* It is hard to understand, therefore induces a longer learning curve than would a well designed API
* It is generally uselessly complex and will  require to write complex code to interact with
* And as a consequence will increase the potential bugs opportunities
* It will therefore generate more testing effort and yet some of the bugs will still go unnoticed until they reach production field where the [bugs] fixing cost is highest
* If the API is poorly designed in its lower abstractions levels, it is likely that these flaws will propagate in any software that uses that API while making it harder to fix such issues
* A mis-design function in a lower abstraction level of an API may propagate in a "viral" fashion to the [potential] thousands of users of that API and will generate a high cost of fixing
* Designing wrappers around the API that may fix [more likely mask] the flaws will also be very costly
* Such wrapper have an important impact on the application performances and may introduce regressions or new bugs in the application while fixing the initial issues
