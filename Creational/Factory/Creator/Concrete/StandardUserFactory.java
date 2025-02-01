package Creational.Factory.Creator.Concrete;

import Creational.Factory.Creator.UserFactory;
import Creational.Factory.Permission.PermissionType;
import Creational.Factory.Subscription.UserSubscriptionType;
import Creational.Factory.User.User;

public class StandardUserFactory implements UserFactory {
    @Override
    public User create() {
        final User user = new User();
        user.setSubscriptionType(UserSubscriptionType.STANDARD);
        user.addPermissions(PermissionType.CREATE_POST);
        return user;
    }
}
