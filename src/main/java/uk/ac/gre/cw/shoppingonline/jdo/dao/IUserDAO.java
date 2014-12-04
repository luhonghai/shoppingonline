package uk.ac.gre.cw.shoppingonline.jdo.dao;

import uk.ac.gre.cw.shoppingonline.jdo.dao.IDAO;
import uk.ac.gre.cw.shoppingonline.jdo.entities.User;

/**
 * Created by Long Nguyen on 12/4/14.
 */
public interface IUserDAO extends IDAO<User, Long> {

    public User findByName( String name );

}
