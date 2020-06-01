package Exercise3;

import javax.annotation.processing.Generated;

@Entity(generationType = GenerationType.SNAKE_CASE)
public class HtwgStudent {
    @Id()
    private int Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;



    public HtwgStudent(String firstName, String lastName, int Id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Id = Id;
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
}
