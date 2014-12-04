package uk.ac.gre.cw.shoppingonline.jdo.dao.impl;

import uk.ac.gre.cw.shoppingonline.jdo.dao.AbstractDAO;
import uk.ac.gre.cw.shoppingonline.jdo.dao.IUserDAO;
import uk.ac.gre.cw.shoppingonline.jdo.entities.User;

import javax.jdo.Query;

/**
 * Created by Long Nguyen on 12/4/14.
 */
public class UserDao extends AbstractDAO<User, Long> implements IUserDAO {

    public UserDao() {
        super(User.class);
    }

    @Override
    public User findByName(String name) {
        Query query = getPM().newQuery(User.class);
        query.setFilter("name.equals(value)");
        query.declareParameters("java.lang.String value");

        return this.processQueryResult(query, name);
    }
}
