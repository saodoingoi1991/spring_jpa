package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMON_DM_DBHC", schema = "CATEGORYUSER", catalog = "")
public class CommonDmDbhc {
    private long id;
    private String ten;
    private String maCha;
    private String maDbhc;
    private String tinhTrang;
    private String canCu;
    private Time ngayHieuLuc;
    private Time ngayHetHieuLuc;
    private String dbhcId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "MA_CHA")
    public String getMaCha() {
        return maCha;
    }

    public void setMaCha(String maCha) {
        this.maCha = maCha;
    }

    @Basic
    @Column(name = "MA_DBHC")
    public String getMaDbhc() {
        return maDbhc;
    }

    public void setMaDbhc(String maDbhc) {
        this.maDbhc = maDbhc;
    }

    @Basic
    @Column(name = "TINH_TRANG")
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Basic
    @Column(name = "CAN_CU")
    public String getCanCu() {
        return canCu;
    }

    public void setCanCu(String canCu) {
        this.canCu = canCu;
    }

    @Basic
    @Column(name = "NGAY_HIEU_LUC")
    public Time getNgayHieuLuc() {
        return ngayHieuLuc;
    }

    public void setNgayHieuLuc(Time ngayHieuLuc) {
        this.ngayHieuLuc = ngayHieuLuc;
    }

    @Basic
    @Column(name = "NGAY_HET_HIEU_LUC")
    public Time getNgayHetHieuLuc() {
        return ngayHetHieuLuc;
    }

    public void setNgayHetHieuLuc(Time ngayHetHieuLuc) {
        this.ngayHetHieuLuc = ngayHetHieuLuc;
    }

    @Basic
    @Column(name = "DBHC_ID")
    public String getDbhcId() {
        return dbhcId;
    }

    public void setDbhcId(String dbhcId) {
        this.dbhcId = dbhcId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmDbhc that = (CommonDmDbhc) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (maCha != null ? !maCha.equals(that.maCha) : that.maCha != null) return false;
        if (maDbhc != null ? !maDbhc.equals(that.maDbhc) : that.maDbhc != null) return false;
        if (tinhTrang != null ? !tinhTrang.equals(that.tinhTrang) : that.tinhTrang != null) return false;
        if (canCu != null ? !canCu.equals(that.canCu) : that.canCu != null) return false;
        if (ngayHieuLuc != null ? !ngayHieuLuc.equals(that.ngayHieuLuc) : that.ngayHieuLuc != null) return false;
        if (ngayHetHieuLuc != null ? !ngayHetHieuLuc.equals(that.ngayHetHieuLuc) : that.ngayHetHieuLuc != null)
            return false;
        if (dbhcId != null ? !dbhcId.equals(that.dbhcId) : that.dbhcId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (maCha != null ? maCha.hashCode() : 0);
        result = 31 * result + (maDbhc != null ? maDbhc.hashCode() : 0);
        result = 31 * result + (tinhTrang != null ? tinhTrang.hashCode() : 0);
        result = 31 * result + (canCu != null ? canCu.hashCode() : 0);
        result = 31 * result + (ngayHieuLuc != null ? ngayHieuLuc.hashCode() : 0);
        result = 31 * result + (ngayHetHieuLuc != null ? ngayHetHieuLuc.hashCode() : 0);
        result = 31 * result + (dbhcId != null ? dbhcId.hashCode() : 0);
        return result;
    }
}
