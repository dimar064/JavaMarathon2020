package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как у тебя дела?");

        user2.sendMessage(user1, "Привет, user1");
        user2.sendMessage(user1, "Все ок, спасибо :");
        user2.sendMessage(user1, "Пока, user1");

        user3.sendMessage(user1, "Привет, user1");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Что нового?");

        user1.sendMessage(user3, "Привет, user3");
        user1.sendMessage(user3, "Все ок, новостей нет.");
        user1.sendMessage(user3, "Пока, user3");

        user3.sendMessage(user1, "Пока, user1");

        MessageDatabase.showDialog(user1, user3);
    }
}
