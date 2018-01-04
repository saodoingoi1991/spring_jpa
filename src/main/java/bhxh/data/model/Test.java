package bhxh.data.model;

import bhxh.utils.JPAUtils;
import org.hibernate.annotations.Type;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    private long id;
    private Long chon;
    private String name;

    public Test() {
    }

    public Test(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CHON")
//    @Type(type = Object)
    public Long getChon() {
        return chon;
    }

    public void setChon(Long chon) {
        this.chon = chon;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (id != test.id) return false;
        if (chon != null ? !chon.equals(test.chon) : test.chon != null) return false;
        if (name != null ? !name.equals(test.name) : test.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (chon != null ? chon.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
