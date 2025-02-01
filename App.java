// Person.java
public class Person {
      // Atributos (encapsulados usando private)
      private String name;
      private int age;
    
    // Construtor
      public Person(String name, int age) {
        this.name = name;
        this.age = age;
      }
    
    // Getter para nome
      public String getName() {
        return name;
      }
    
    // Setter para nome
      public void setName(String name) {
        this.name = name;
      }
    
    // Getter para idade
      public int getAge() {
        return age;
      }
    
    // Setter para idade
      public void setAge(int age) {
        if (age > 0) { // Validação
          this.age = age;
        }
      }
    
    // Método para exibir detalhes da pessoa
      public void displayDetails() {
        System.out.println("Nome: " + name + ", Idade: " + age);
      }
    }










    
    // Main.java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.displayDetails();

        // Update age using setter
        person.setAge(30);
        person.displayDetails();
    }
}