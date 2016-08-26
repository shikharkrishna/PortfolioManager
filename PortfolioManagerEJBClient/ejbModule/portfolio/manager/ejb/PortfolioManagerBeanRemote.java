package portfolio.manager.ejb;

import java.util.List;

import javax.ejb.Remote;

import portfolio.manager.jpa.User;

@Remote
public interface PortfolioManagerBeanRemote {
	public void addUser();
	public List<User> getAllUsers();
}
