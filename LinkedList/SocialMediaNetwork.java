import java.util.*;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaNetwork {
    private UserNode head = null;

    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int id1, int id2) {
        UserNode user1 = findUserById(id1);
        UserNode user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
        if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);
    }

    public void removeFriendConnection(int id1, int id2) {
        UserNode user1 = findUserById(id1);
        UserNode user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove((Integer) id2);
        user2.friendIds.remove((Integer) id1);
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int fid : user.friendIds) {
            UserNode friend = findUserById(fid);
            if (friend != null) {
                System.out.println("ID: " + friend.userId + ", Name: " + friend.name + ", Age: " + friend.age);
            }
        }
    }

    public void searchUser(String keyword) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(keyword) || Integer.toString(temp.userId).equals(keyword)) {
                System.out.println("User Found - ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("User not found.");
    }

    public void findMutualFriends(int id1, int id2) {
        UserNode user1 = findUserById(id1);
        UserNode user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> mutuals = new HashSet<>(user1.friendIds);
        mutuals.retainAll(user2.friendIds);

        if (mutuals.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            System.out.println("Mutual friends:");
            for (int fid : mutuals) {
                UserNode friend = findUserById(fid);
                if (friend != null)
                    System.out.println("ID: " + friend.userId + ", Name: " + friend.name);
            }
        }
    }

    public void countFriendsForAll() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaNetwork network = new SocialMediaNetwork();

        network.addUser(1, "Aditya", 25);
        network.addUser(2, "Babli", 30);
        network.addUser(3, "Chandan", 22);
        network.addUser(4, "Devansh", 28);
        network.addUser(5, "Anvesha", 27);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 4);
        network.addFriendConnection(3, 4);
        network.addFriendConnection(2, 3);

        System.out.println("\nFriend Lists:");
        network.displayFriends(1);
        network.displayFriends(2);
        network.displayFriends(4);

        System.out.println("\nMutual Friends between Bob and Charlie:");
        network.findMutualFriends(2, 3);

        System.out.println("\nFriend Counts:");
        network.countFriendsForAll();

        System.out.println("\nRemoving friendship between Alice and Bob:");
        network.removeFriendConnection(1, 2);
        network.displayFriends(1);
        network.displayFriends(2);

        System.out.println("\nSearching for user by name:");
        network.searchUser("Eve");

        System.out.println("\nSearching for user by ID:");
        network.searchUser("4");
    }
}
