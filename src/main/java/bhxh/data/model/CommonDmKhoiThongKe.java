package bhxh.data.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMON_DM_KHOI_THONG_KE", schema = "CATEGORYUSER", catalog = "")
public class CommonDmKhoiThongKe {
    private long id;
    private String ma;
    private String ten;
    private Long nhom;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA")
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "TEN")
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "NHOM")
    public Long getNhom() {
        return nhom;
    }

    public void setNhom(Long nhom) {
        this.nhom = nhom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmKhoiThongKe that = (CommonDmKhoiThongKe) o;

        if (id != that.id) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (nhom != null ? !nhom.equals(that.nhom) : that.nhom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (nhom != null ? nhom.hashCode() : 0);
        return result;
    }
}
