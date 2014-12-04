package uk.ac.gre.cw.shoppingonline.service;

import uk.ac.gre.cw.shoppingonline.jdo.dao.IProductDAO;
import uk.ac.gre.cw.shoppingonline.jdo.dao.exception.DAOException;
import uk.ac.gre.cw.shoppingonline.jdo.dao.impl.ProductDao;
import uk.ac.gre.cw.shoppingonline.jdo.entities.Product;

import java.util.Collection;

/**
 * Created by Long Nguyen on 12/4/14.
 */
public class ProductService {

    private IProductDAO productDAO = new ProductDao();

    public Collection<Product> listAll() {
        return productDAO.findAll();
    }

    public boolean create(Product product) {
        // Do something with product object
        try {
            productDAO.save(product);
            return true;
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
