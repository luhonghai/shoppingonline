package uk.ac.gre.cw.shoppingonline.jdo.dao.impl;

import org.junit.Test;
import uk.ac.gre.cw.shoppingonline.jdo.dao.IUserDAO;
import uk.ac.gre.cw.shoppingonline.jdo.dao.exception.DAOException;
import uk.ac.gre.cw.shoppingonline.jdo.entities.User;

/**
 * Created by luhonghai on 12/4/14.
 */
public class TestUserDao {
    @Test
    public void testCreateUser() {
        IUserDAO userDAO = new UserDao();
        User u = new User();
        u.setName("Hai Lu");
        try {
            userDAO.save(u);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteUser() {

    }

    @Test
    public void testListUser() {

    }
}
