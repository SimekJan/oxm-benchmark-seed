package cz.cuni.mff.simekjan.mongo.queries;

import com.mongodb.client.MongoDatabase;
import cz.cuni.mff.simekjan.mongo.MongoDbManager;
import cz.cuni.mff.simekjan.runner.Query;

public interface DocumentQuery<P> extends Query<P> {

    MongoDatabase db = MongoDbManager.getDb();
}
