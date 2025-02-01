package Creational.Factory.Creator.Concrete;

import Creational.Factory.Creator.UserFactory;
import Creational.Factory.Permission.PermissionType;
import Creational.Factory.Subscription.UserSubscriptionType;
import Creational.Factory.User.User;

public class PremiumUserFactory implements UserFactory {
    @Override
    public User create() {
        final User user = new User();
        user.setSubscriptionType(UserSubscriptionType.PREMIUM);
        user.addPermissions(PermissionType.CREATE_POST);
        user.addPermissions(PermissionType.UPDATE_POST);
        return user;
    }
}
