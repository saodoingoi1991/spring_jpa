package bhxh.data.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMON_DM_NGHIEP_VU", schema = "CATEGORYUSER", catalog = "")
public class CommonDmNghiepVu {
    private long id;
    private Long bhxh;
    private Long bhyt;
    private Long grp1;
    private Long grp2;
    private String ma;
    private Long qt;
    private String ten;
    private Long tg;
    private Long trangThai;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BHXH")
    public Long getBhxh() {
        return bhxh;
    }

    public void setBhxh(Long bhxh) {
        this.bhxh = bhxh;
    }

    @Basic
    @Column(name = "BHYT")
    public Long getBhyt() {
        return bhyt;
    }

    public void setBhyt(Long bhyt) {
        this.bhyt = bhyt;
    }

    @Basic
    @Column(name = "GRP1")
    public Long getGrp1() {
        return grp1;
    }

    public void setGrp1(Long grp1) {
        this.grp1 = grp1;
    }

    @Basic
    @Column(name = "GRP2")
    public Long getGrp2() {
        return grp2;
    }

    public void setGrp2(Long grp2) {
        this.grp2 = grp2;
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
    @Column(name = "QT")
    public Long getQt() {
        return qt;
    }

    public void setQt(Long qt) {
        this.qt = qt;
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
    @Column(name = "TG")
    public Long getTg() {
        return tg;
    }

    public void setTg(Long tg) {
        this.tg = tg;
    }

    @Basic
    @Column(name = "TRANG_THAI")
    public Long getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Long trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmNghiepVu that = (CommonDmNghiepVu) o;

        if (id != that.id) return false;
        if (bhxh != null ? !bhxh.equals(that.bhxh) : that.bhxh != null) return false;
        if (bhyt != null ? !bhyt.equals(that.bhyt) : that.bhyt != null) return false;
        if (grp1 != null ? !grp1.equals(that.grp1) : that.grp1 != null) return false;
        if (grp2 != null ? !grp2.equals(that.grp2) : that.grp2 != null) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (qt != null ? !qt.equals(that.qt) : that.qt != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (tg != null ? !tg.equals(that.tg) : that.tg != null) return false;
        if (trangThai != null ? !trangThai.equals(that.trangThai) : that.trangThai != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (bhxh != null ? bhxh.hashCode() : 0);
        result = 31 * result + (bhyt != null ? bhyt.hashCode() : 0);
        result = 31 * result + (grp1 != null ? grp1.hashCode() : 0);
        result = 31 * result + (grp2 != null ? grp2.hashCode() : 0);
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (qt != null ? qt.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (tg != null ? tg.hashCode() : 0);
        result = 31 * result + (trangThai != null ? trangThai.hashCode() : 0);
        return result;
    }
}
