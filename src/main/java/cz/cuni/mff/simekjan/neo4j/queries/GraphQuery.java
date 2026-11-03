package cz.cuni.mff.simekjan.neo4j.queries;

import cz.cuni.mff.simekjan.neo4j.Neo4jSessionManager;
import cz.cuni.mff.simekjan.runner.Query;
import org.neo4j.ogm.session.Session;

public interface GraphQuery<P> extends Query<P> {

    Session session = Neo4jSessionManager.getSession();
}
