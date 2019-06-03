package model;

public class User extends Member{
	public Boolean isAdmin() {
		return false;
	}

	public User(String id, String name, String password) {
		super(id, name, password);
	}

	public User() {
		super();
	}
}
