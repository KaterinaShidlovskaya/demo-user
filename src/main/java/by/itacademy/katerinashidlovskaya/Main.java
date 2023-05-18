package by.itacademy.katerinashidlovskaya;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Helen";
        user1.password = "lor136!@";

        User user2 = new User();
        user2.name = "Alex";
        user2.password = "lnnw;ru237af";

        System.out.println(user1);
        System.out.println(user2);



        String[] names = {"Лена", "Ольга", "Алексей"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Товарищ, " + names[i] + " - молодец!");
        }
    }
}
