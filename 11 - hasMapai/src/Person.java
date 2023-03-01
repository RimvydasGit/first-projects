import java.util.Objects;
//DTO - Data Transfer Object
public class Person {
    private String vardas;
    private int ak;
    public Person(String vardas, int ak) {
        this.vardas = vardas;
        this.ak = ak;
    }
    public int getAk() {
        return ak;
    }
    @Override
    public String toString() {
        return "["+vardas + " " + ak+"]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(ak, vardas);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return ak == other.ak && Objects.equals(vardas, other.vardas);
    }
}