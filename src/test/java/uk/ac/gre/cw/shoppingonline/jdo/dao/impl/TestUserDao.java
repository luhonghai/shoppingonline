package uk.ac.gre.cw.shoppingonline.jdo.dao.impl;

import org.junit.Test;
import uk.ac.gre.cw.shoppingonline.jdo.dao.ICustomerDAO;
import uk.ac.gre.cw.shoppingonline.jdo.dao.exception.DAOException;
import uk.ac.gre.cw.shoppingonline.jdo.entities.Customer;
import uk.ac.gre.cw.shoppingonline.jdo.entities.Product;
import uk.ac.gre.cw.shoppingonline.service.ProductService;

import java.util.Collection;

/**
 * Created by luhonghai on 12/4/14.
 */
public class TestUserDao {
    @Test
    public void testInitDatabase() {
        ProductService productService = new ProductService();
        if (productService.isEmpty()) {
            for (int i = 1; i <= 6; i++) {
                Product product = new Product();
                product.setName("Easy Polo Black Edition");
                product.setUnitPrice(56 + i);
                product.setImageUrl("images/home/product" + i + ".jpg");
                if (i == 4) product.setNew(true);
                if (i == 5) product.setSale(true);
                product.setFeatured(true);
                productService.create(product);
            }

            for (int i = 1; i <= 3; i++) {
                Product product = new Product();
                product.setName("Easy Polo Black Edition");
                product.setUnitPrice(56 + i);
                product.setImageUrl("images/home/recommend" + i + ".jpg");
                product.setRecommended(true);
                productService.create(product);
            }
        }
    }

}
