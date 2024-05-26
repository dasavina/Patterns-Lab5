package Part1;

import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<User> users;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());

        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        int adminCount = 0;
        for (User user : users) {
            if (user.isAdmin()) {
                adminCount++;
            }
        }
        return adminCount;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(User user) {
        // Sending email...
        System.out.println("Sending email to: " + user.getEmail());
    }
}
