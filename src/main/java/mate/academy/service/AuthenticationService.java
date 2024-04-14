package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    private UserService userService;

    public AuthenticationService() {
        this.userService = new UserService();
    }

    /**
     * Check if user credentials (login and password) are valid or not.
     * All users are stored in the UserService class.
     * @param email - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    public boolean login(String email, String password) {
        User user = userService.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
