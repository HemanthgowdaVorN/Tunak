package part1;

public class Ex_4 {
    int id;
    String name;

    Ex_4(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Id: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Ex_4 s1 = new Ex_4(111, "Karan");
        Ex_4 s2 = new Ex_4(222, "Aryan");
        s1.display();
        s2.display();
    }
}