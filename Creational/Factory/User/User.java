package Creational.Factory.User;

import Creational.Factory.Permission.PermissionType;
import Creational.Factory.Subscription.UserSubscriptionType;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private UserSubscriptionType subscriptionType;
    private final List<PermissionType> permissions;

    public User() {
        this.subscriptionType = UserSubscriptionType.STANDARD;
        this.permissions = new ArrayList<PermissionType>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserSubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(UserSubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public List<PermissionType> getPermissions() {
        return permissions;
    }

    public void addPermissions(PermissionType permission) {
        this.permissions.add(permission);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subscriptionType=" + subscriptionType +
                '}';
    }
}
