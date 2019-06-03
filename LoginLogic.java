package model;

public class LoginLogic {

	public boolean execute(String id, String password) {
		DAO_LoginLogic db = new DAO_LoginLogic();
		Member user = db.execute(id, password);
		if(user!=null){
			System.out.println(user.getUserName());
			return true;

		}
		return false;
	}
}

