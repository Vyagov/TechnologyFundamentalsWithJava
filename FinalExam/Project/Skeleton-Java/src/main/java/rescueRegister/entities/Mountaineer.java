package rescueRegister.entities;

import javax.persistence.*;

@Entity
@Table(name = "mountaineers")
public class Mountaineer {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String lastSeenDate;

    public Mountaineer() {
    }

    public Mountaineer(Integer id, String name, Integer age, String gender, String lastSeenDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastSeenDate = lastSeenDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(precision = 16, scale = 2)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(nullable = false)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(nullable = false)
    public String getLastSeenDate() {
        return lastSeenDate;
    }

    public void setLastSeenDate(String lastSeenDate) {
        this.lastSeenDate = lastSeenDate;
    }
}
