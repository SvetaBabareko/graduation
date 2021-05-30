package org.babareko.graduation.util;

import org.babareko.graduation.model.User;
import org.babareko.graduation.to.UserTO;

public class UserUtil {
    public static UserTO asTo(User user) {
        return new UserTO(user.getId(), user.getName(), user.getPassword());
    }

}
