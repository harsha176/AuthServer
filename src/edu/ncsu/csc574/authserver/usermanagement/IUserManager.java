package edu.ncsu.csc574.authserver.usermanagement;

public interface IUserManager {
	/**
	 * Allows to add user
	 * 
	 * @param user
	 */
	public abstract void createUser(IUser user);

	/**
	 * Allows to getUser details
	 * 
	 * @return
	 */
	public abstract boolean isUserPresent(String username);

	/**
	 * allows user to login to the system
	 * 
	 * @param user_id
	 */
	public abstract boolean userAuthenticate(String username, String password);

	/**
	 * This method updates password.
	 * 
	 * @param username
	 * @param oldPassword
	 * @param newPassword
	 */
	public abstract void forgotPassword(String username, String ans1,
			String ans2, String newPassword);

	public abstract void resetPassword(String username, String oldPassword,
			String newPassword);

}
