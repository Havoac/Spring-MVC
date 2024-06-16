package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int SaveUser(User user) {
		System.out.println("User saved");
		int id = 0;
		try {
			id = (Integer) this.hibernateTemplate.save(user);
		} catch (Exception e) {
			e.printStackTrace();
	        // Log the exception
	        throw new RuntimeException("Failed to save user", e);
		}
		return id;
	}
}
