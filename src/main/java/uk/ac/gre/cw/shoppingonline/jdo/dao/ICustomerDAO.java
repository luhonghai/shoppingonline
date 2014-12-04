package uk.ac.gre.cw.shoppingonline.jdo.dao;

import uk.ac.gre.cw.shoppingonline.jdo.entities.Customer;

/**
 * Created by Long Nguyen on 12/4/14.
 */
public interface ICustomerDAO extends IDAO<Customer, Long> {

    public Customer findByEmail( String email );

    public Customer findByEmailPassword(String email, String password);

}
