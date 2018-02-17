
class Person {
    String firstName
    String lastName
    Integer age
    Date birthdate
    String sex

    static constraints = {
        sex blank: true
        age blank: true
        birthdate blank: true
    }
}
