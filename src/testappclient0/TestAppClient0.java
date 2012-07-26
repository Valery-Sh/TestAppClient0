/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testappclient0;

import com.caucho.hessian.client.HessianProxyFactory;
import org.vnstest.domain.service.UserService;

/**
 *
 * @author Valery
 */
public class TestAppClient0 {

    /**
     * @param args the command line arguments
     */
//update cdms_users set version=10, firstname='Olga' where id=10    
    public static void main(String[] args) {
       //UserService0 service = new UserService0();
       //service.printUser();

        String url = "http://127.0.0.1:8084/Test0/services/UserService";

        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            UserService user = (UserService) factory.create(UserService.class, url);
            System.out.println("FirstName=" + user.findById(2).getLastName());
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }

    }
}
