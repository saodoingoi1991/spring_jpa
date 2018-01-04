package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMON_DM_CQBH_HUYEN", schema = "CATEGORYUSER", catalog = "")
public class CommonDmCqbhHuyen {
    private long id;
    private String maCqbhHuyen;
    private String tenCqbhHuyen;
    private String maCqbhTinh;
    private String diaChi;
    private String xaPhuong;
    private String quanHuyen;
    private String tinhTp;
    private String soDienThoai;
    private Time ngayHieuLuc;
    private Time ngayHetHieuLuc;
    private Long tstMapId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_CQBH_HUYEN")
    public String getMaCqbhHuyen() {
        return maCqbhHuyen;
    }

    public void setMaCqbhHuyen(String maCqbhHuyen) {
        this.maCqbhHuyen = maCqbhHuyen;
    }

    @Basic
    @Column(name = "TEN_CQBH_HUYEN")
    public String getTenCqbhHuyen() {
        return tenCqbhHuyen;
    }

    public void setTenCqbhHuyen(String tenCqbhHuyen) {
        this.tenCqbhHuyen = tenCqbhHuyen;
    }

    @Basic
    @Column(name = "MA_CQBH_TINH")
    public String getMaCqbhTinh() {
        return maCqbhTinh;
    }

    public void setMaCqbhTinh(String maCqbhTinh) {
        this.maCqbhTinh = maCqbhTinh;
    }

    @Basic
    @Column(name = "DIA_CHI")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "XA_PHUONG")
    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    @Basic
    @Column(name = "QUAN_HUYEN")
    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    @Basic
    @Column(name = "TINH_TP")
    public String getTinhTp() {
        return tinhTp;
    }

    public void setTinhTp(String tinhTp) {
        this.tinhTp = tinhTp;
    }

    @Basic
    @Column(name = "SO_DIEN_THOAI")
    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
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
    @Column(name = "TST_MAP_ID")
    public Long getTstMapId() {
        return tstMapId;
    }

    public void setTstMapId(Long tstMapId) {
        this.tstMapId = tstMapId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmCqbhHuyen that = (CommonDmCqbhHuyen) o;

        if (id != that.id) return false;
        if (maCqbhHuyen != null ? !maCqbhHuyen.equals(that.maCqbhHuyen) : that.maCqbhHuyen != null) return false;
        if (tenCqbhHuyen != null ? !tenCqbhHuyen.equals(that.tenCqbhHuyen) : that.tenCqbhHuyen != null) return false;
        if (maCqbhTinh != null ? !maCqbhTinh.equals(that.maCqbhTinh) : that.maCqbhTinh != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (xaPhuong != null ? !xaPhuong.equals(that.xaPhuong) : that.xaPhuong != null) return false;
        if (quanHuyen != null ? !quanHuyen.equals(that.quanHuyen) : that.quanHuyen != null) return false;
        if (tinhTp != null ? !tinhTp.equals(that.tinhTp) : that.tinhTp != null) return false;
        if (soDienThoai != null ? !soDienThoai.equals(that.soDienThoai) : that.soDienThoai != null) return false;
        if (ngayHieuLuc != null ? !ngayHieuLuc.equals(that.ngayHieuLuc) : that.ngayHieuLuc != null) return false;
        if (ngayHetHieuLuc != null ? !ngayHetHieuLuc.equals(that.ngayHetHieuLuc) : that.ngayHetHieuLuc != null)
            return false;
        if (tstMapId != null ? !tstMapId.equals(that.tstMapId) : that.tstMapId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maCqbhHuyen != null ? maCqbhHuyen.hashCode() : 0);
        result = 31 * result + (tenCqbhHuyen != null ? tenCqbhHuyen.hashCode() : 0);
        result = 31 * result + (maCqbhTinh != null ? maCqbhTinh.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (xaPhuong != null ? xaPhuong.hashCode() : 0);
        result = 31 * result + (quanHuyen != null ? quanHuyen.hashCode() : 0);
        result = 31 * result + (tinhTp != null ? tinhTp.hashCode() : 0);
        result = 31 * result + (soDienThoai != null ? soDienThoai.hashCode() : 0);
        result = 31 * result + (ngayHieuLuc != null ? ngayHieuLuc.hashCode() : 0);
        result = 31 * result + (ngayHetHieuLuc != null ? ngayHetHieuLuc.hashCode() : 0);
        result = 31 * result + (tstMapId != null ? tstMapId.hashCode() : 0);
        return result;
    }
}
