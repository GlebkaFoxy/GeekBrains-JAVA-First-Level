public class UserForm {
    private String login;
    private String email;

    public void fillUserForm(String login, String email) throws ValidationException {
        setLogin(login);
        setEmail(email);
    }

    public void setLogin(String login) throws ValidationException {
        if (login.length() < 3) {
            throw new ValidationException("login");
        }
        this.login = login;
    }

    public void setEmail(String email) throws ValidationException {
        if (email.indexOf('@') == -1) {
            throw new ValidationException("email");
        }
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
