package cz.cuni.mff.simekjan.postgres.queries;

import cz.cuni.mff.simekjan.postgres.HibernateSessionManager;
import cz.cuni.mff.simekjan.runner.Query;
import org.hibernate.Session;

public interface RelationalQuery<P> extends Query<P> {

    Session session = HibernateSessionManager.getSession();
}
