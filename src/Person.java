public class Person {
    private String name;
    private int age;

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metode untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age + " tahun");
    }
}
