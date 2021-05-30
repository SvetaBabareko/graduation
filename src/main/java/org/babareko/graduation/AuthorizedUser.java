package org.babareko.graduation;

import org.babareko.graduation.model.User;
import org.babareko.graduation.to.UserTO;
import org.babareko.graduation.util.UserUtil;

import java.io.Serial;

public class AuthorizedUser extends org.springframework.security.core.userdetails.User {
    @Serial
    private static final long serialVersionUID = 1L;

    private UserTO userTo;

    public AuthorizedUser(User user) {
        super(user.getName(), user.getPassword(), user.isEnabled(), true, true, true, user.getRoles());
        this.userTo = UserUtil.asTo(user);
    }

    public int getId() {
        return userTo.getId();
    }


    public void update(UserTO newTo) {
        userTo = newTo;
    }

    public UserTO getUserTo() {
        return userTo;
    }

    @Override
    public String toString() {
        return userTo.toString();
    }
}