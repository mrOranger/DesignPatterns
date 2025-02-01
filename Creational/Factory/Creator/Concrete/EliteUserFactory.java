package Creational.Factory.Creator.Concrete;

import Creational.Factory.Creator.UserFactory;
import Creational.Factory.Permission.PermissionType;
import Creational.Factory.Subscription.UserSubscriptionType;
import Creational.Factory.User.User;

public class EliteUserFactory implements UserFactory {
    @Override
    public User create() {
        final User user = new User();
        user.setSubscriptionType(UserSubscriptionType.ELITE);
        user.addPermissions(PermissionType.CREATE_POST);
        user.addPermissions(PermissionType.UPDATE_POST);
        user.addPermissions(PermissionType.DELETE_POST);
        return user;
    }
}
