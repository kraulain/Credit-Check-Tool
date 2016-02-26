package cct_fx.dao;

import cct_fx.entities.Users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsersDao {

    public boolean authenticate(String userName, String password) {
        String hql = "from Users u where u.username= '" + userName + "' and u.password ='" + password + "'";
        List resultList = new ArrayList();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            resultList = q.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        Users user = new Users();
        if(resultList.isEmpty()){
            return false;
        }else{
            user = (Users)resultList.get(0);
        }

        if(user.getUsername().equals(userName) && user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
