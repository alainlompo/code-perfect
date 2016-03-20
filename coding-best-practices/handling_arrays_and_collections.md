<h3>Handling arrays and collections that have no elements</h3>
<p>
Assuming for example that we have an HR solution that exposes a List<Employee> getEmployesFrom(String department) service
Here is an exemple of implementation
<pre>
public class DepartmentService {
	
	public List<Employee> getEmployesFrom(String department) {
		List<Employee> result = null;
		
		// Obtains an instance of the repository
		Department dep = repository.findByName(department);
		if (dep == null) {
			return result;
		}
		if (dep.hasEmployee) {
			result = dep.allEmployees();
		}		
		return result;		
	}
}
</pre>
</p>
<br/>
We initialize the result list with a null value and change it if and only if
 * The department really exists
 * it has at least one employee
 
If these two conditions are not satisfied the result is null. This approach is not good for many reasons

* Null does not help us to know what really happened
* Null makes it hard to distinguish between not having a department at all or having one with no employee's yet in it
* A client for this service must check a null condition or else might build something that is not robust.

Since collections and arrays are most often used iteratively it is better to return an empty instance of an array or collection
