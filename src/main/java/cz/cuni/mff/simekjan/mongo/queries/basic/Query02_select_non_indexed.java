package cz.cuni.mff.simekjan.mongo.queries.basic;

import com.mongodb.client.MongoCollection;
import cz.cuni.mff.simekjan.mongo.northwind.Employee;
import cz.cuni.mff.simekjan.mongo.queries.DocumentQuery;
import cz.cuni.mff.simekjan.query_params.params.Q2_Params;

import static com.mongodb.client.model.Filters.eq;

/**
 * Get employee by first_name. That is non-indexed column.
 */
public class Query02_select_non_indexed implements DocumentQuery<Q2_Params> {

    @Override
    public void run(Q2_Params params) {

        MongoCollection<Employee> employees = db.getCollection("Employees", Employee.class);

        Employee found = employees.find(eq("firstName", params.firstName())).first();
        assert found != null;

        System.out.println("------------Mongo-Q2-------------");
        System.out.println(found.getFirstName() + " " + found.getLastName());
    }
}
