package day14;

class InvalidCountryException extends Exception {
	@Override
	public String toString() {
		return "User outside India cannot be registered";
	}
	
}

class UserRegistration {
	void registerUser(String userName, String userCountry) throws InvalidCountryException {
		if (userCountry.equalsIgnoreCase("India")) {
			System.out.println("User Registration done Successfully");
		}
		else
			throw new InvalidCountryException();
	}
}

public class Test3 {

	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		try {
			ur.registerUser("kevibk", "usa");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
