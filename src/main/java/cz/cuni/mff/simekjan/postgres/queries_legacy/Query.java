package cz.cuni.mff.simekjan.postgres.queries_legacy;

import org.hibernate.Session;

public interface Query {
    public void perform(Session session);
}
