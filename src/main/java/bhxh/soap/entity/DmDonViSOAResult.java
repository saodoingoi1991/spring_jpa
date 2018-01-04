
package bhxh.soap.entity;

import bhxh.data.model.CommonDmDonVi;
import bhxh.utils.JPAUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

import static bhxh.utils.DateUtils.convertStringToTimestamp;
import static bhxh.utils.DateUtils.yyyyMMddHHmmssSSS;
import static bhxh.utils.ParseUltil.parseToLong;


@XmlAccessorType(XmlAccessType.FIELD)

public class DmDonViSOAResult {
    @XmlElement(name = "id")
    protected Long id;
    @XmlElement(name = "createdDate")
    protected String createdDate;
    @XmlElement(name = "updatedDate")
    protected String updatedDate;
    @XmlElement(name = "chon")
    protected Boolean chon;
    @XmlElement(name = "cmtHoChieu")
    protected String cmtHoChieu;
    @XmlElement(name = "dcLh")
    protected String dcLh;
    @XmlElement(name = "dcTruSo")
    protected String dcTruSo;
    @XmlElement(name = "denSo")
    protected Integer denSo;
    @XmlElement(name = "dienThoai")
    protected String dienThoai;
    @XmlElement(name = "dnNhaNuoc")
    protected Boolean dnNhaNuoc;
    @XmlElement(name = "dungTl")
    protected Boolean dungTl;
    @XmlElement(name = "dvTu")
    protected Boolean dvTu;
    @XmlElement(name = "fax")
    protected String fax;
    @XmlElement(name = "ghiChu")
    protected String ghiChu;
    @XmlElement(name = "gtinhNdd")
    protected Boolean gtinhNdd;
    @XmlElement(name = "inTenDvi")
    protected Boolean inTenDvi;
    @XmlElement(name = "ldGiam")
    protected String ldGiam;
    @XmlElement(name = "matTich")
    protected Boolean matTich;
    @XmlElement(name = "phaSan")
    protected Boolean phaSan;
    @XmlElement(name = "lyDoKhac")
    protected Boolean lyDoKhac;
    @XmlElement(name = "ldTang")
    protected String ldTang;
    @XmlElement(name = "loaiDn")
    protected String loaiDn;
    @XmlElement(name = "ltHsl")
    protected Boolean ltHsl;
    @XmlElement(name = "ltNt")
    protected Boolean ltNt;
    @XmlElement(name = "ltVnd")
    protected Boolean ltVnd;
    @XmlElement(name = "ma")
    protected String ma;
    @XmlElement(name = "maDvt")
    protected String maDvt;
    @XmlElement(name = "msThue")
    protected String msThue;
    @XmlElement(name = "ngayDkkd")
    protected String ngayDkkd;
    @XmlElement(name = "ngayGiam")
    protected String ngayGiam;
    @XmlElement(name = "ngayTang")
    protected String ngayTang;
    @XmlElement(name = "nguoiDd")
    protected String nguoiDd;
    @XmlElement(name = "nsHt")
    protected Boolean nsHt;
    @XmlElement(name = "nsinhNdd")
    protected String nsinhNdd;
    @XmlElement(name = "phuongThuc")
    protected String phuongThuc;
    @XmlElement(name = "quyDoi")
    protected Boolean quyDoi;
    @XmlElement(name = "soDinhDanh")
    protected String soDinhDanh;
    @XmlElement(name = "soDkkd")
    protected String soDkkd;
    @XmlElement(name = "tatToan")
    protected Boolean tatToan;
    @XmlElement(name = "tdSo")
    protected Boolean tdSo;
    @XmlElement(name = "tdThe")
    protected Boolean tdThe;
    @XmlElement(name = "ten")
    protected String ten;
    @XmlElement(name = "tenDvcq")
    protected String tenDvcq;
    @XmlElement(name = "tenTa")
    protected String tenTa;
    @XmlElement(name = "tenTat")
    protected String tenTat;
    @XmlElement(name = "tkGd")
    protected String tkGd;
    @XmlElement(name = "tlKemTheo")
    protected String tlKemTheo;
    @XmlElement(name = "dmBhxhId")
    protected Long dmBhxhId;
    @XmlElement(name = "ytMl")
    protected Boolean ytMl;
    @XmlElement(name = "dmDbhcId")
    protected Long dmDbhcId;
    @XmlElement(name = "nsHtroKhac")
    protected Boolean nsHtroKhac;
    @XmlElement(name = "dmDtKcbId")
    protected Long dmDtKcbId;
    @XmlElement(name = "ngayDungTl")
    protected String ngayDungTl;
    @XmlElement(name = "dmKhoiKcbId")
    protected Long dmKhoiKcbId;
    @XmlElement(name = "donViDong")
    protected String donViDong;
    @XmlElement(name = "dmKhoiQlId")
    protected Long dmKhoiQlId;
    @XmlElement(name = "email")
    protected String email;
    @XmlElement(name = "dmNgoaiTeId")
    protected Long dmNgoaiTeId;
    @XmlElement(name = "nguoiLh")
    protected String nguoiLh;
    @XmlElement(name = "dmVungId")
    protected Long dmVungId;
    @XmlElement(name = "sdtNguoiLh")
    protected String sdtNguoiLh;
    @XmlElement(name = "emailNguoiLh")
    protected String emailNguoiLh;
    @XmlElement(name = "maHuyenKcbId")
    protected Long maHuyenKcbId;
    @XmlElement(name = "maTinhKcbId")
    protected Long maTinhKcbId;
    @XmlElement(name = "ngayTatToan")
    protected String ngayTatToan;
    @XmlElement(name = "huuTri")
    protected String huuTri;
    @XmlElement(name = "maXaKcbId")
    protected Long maXaKcbId;
    @XmlElement(name = "qtichNddId")
    protected Long qtichNddId;
    @XmlElement(name = "userId")
    protected Long userId;
    @XmlElement(name = "maDvtCu")
    protected String maDvtCu;
    @XmlElement(name = "thangTl")
    protected String thangTl;
    @XmlElement(name = "tyLeNsnn")
    protected Long tyLeNsnn;
    @XmlElement(name = "isDviNo")
    protected Boolean isDviNo;
    @XmlElement(name = "ngayDviNo")
    protected String ngayDviNo;
    @XmlElement(name = "userDviNoId")
    protected Long userDviNoId;


    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the chon property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isChon() {
        return chon;
    }

    /**
     * Sets the value of the chon property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setChon(Boolean value) {
        this.chon = value;
    }

    /**
     * Gets the value of the cmtHoChieu property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCmtHoChieu() {
        return cmtHoChieu;
    }

    /**
     * Sets the value of the cmtHoChieu property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCmtHoChieu(String value) {
        this.cmtHoChieu = value;
    }

    /**
     * Gets the value of the dcLh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDcLh() {
        return dcLh;
    }

    /**
     * Sets the value of the dcLh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDcLh(String value) {
        this.dcLh = value;
    }

    /**
     * Gets the value of the dcTruSo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDcTruSo() {
        return dcTruSo;
    }

    /**
     * Sets the value of the dcTruSo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDcTruSo(String value) {
        this.dcTruSo = value;
    }

    /**
     * Gets the value of the denSo property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDenSo() {
        return denSo;
    }

    /**
     * Sets the value of the denSo property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDenSo(Integer value) {
        this.denSo = value;
    }

    /**
     * Gets the value of the dienThoai property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDienThoai() {
        return dienThoai;
    }

    /**
     * Sets the value of the dienThoai property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDienThoai(String value) {
        this.dienThoai = value;
    }

    /**
     * Gets the value of the dnNhaNuoc property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDnNhaNuoc() {
        return dnNhaNuoc;
    }

    /**
     * Sets the value of the dnNhaNuoc property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDnNhaNuoc(Boolean value) {
        this.dnNhaNuoc = value;
    }

    /**
     * Gets the value of the dungTl property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDungTl() {
        return dungTl;
    }

    /**
     * Sets the value of the dungTl property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDungTl(Boolean value) {
        this.dungTl = value;
    }

    /**
     * Gets the value of the dvTu property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDvTu() {
        return dvTu;
    }

    /**
     * Sets the value of the dvTu property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDvTu(Boolean value) {
        this.dvTu = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the ghiChu property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Sets the value of the ghiChu property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGhiChu(String value) {
        this.ghiChu = value;
    }

    /**
     * Gets the value of the gtinhNdd property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGtinhNdd() {
        return gtinhNdd;
    }

    /**
     * Sets the value of the gtinhNdd property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGtinhNdd(Boolean value) {
        this.gtinhNdd = value;
    }

    /**
     * Gets the value of the inTenDvi property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isInTenDvi() {
        return inTenDvi;
    }

    /**
     * Sets the value of the inTenDvi property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInTenDvi(Boolean value) {
        this.inTenDvi = value;
    }

    /**
     * Gets the value of the ldGiam property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLdGiam() {
        return ldGiam;
    }

    /**
     * Sets the value of the ldGiam property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLdGiam(String value) {
        this.ldGiam = value;
    }

    /**
     * Gets the value of the matTich property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatTich() {
        return matTich;
    }

    /**
     * Sets the value of the matTich property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatTich(Boolean value) {
        this.matTich = value;
    }

    /**
     * Gets the value of the phaSan property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPhaSan() {
        return phaSan;
    }

    /**
     * Sets the value of the phaSan property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPhaSan(Boolean value) {
        this.phaSan = value;
    }

    /**
     * Gets the value of the lyDoKhac property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLyDoKhac() {
        return lyDoKhac;
    }

    /**
     * Sets the value of the lyDoKhac property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLyDoKhac(Boolean value) {
        this.lyDoKhac = value;
    }

    /**
     * Gets the value of the ldTang property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLdTang() {
        return ldTang;
    }

    /**
     * Sets the value of the ldTang property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLdTang(String value) {
        this.ldTang = value;
    }

    /**
     * Gets the value of the loaiDn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoaiDn() {
        return loaiDn;
    }

    /**
     * Sets the value of the loaiDn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoaiDn(String value) {
        this.loaiDn = value;
    }

    /**
     * Gets the value of the ltHsl property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLtHsl() {
        return ltHsl;
    }

    /**
     * Sets the value of the ltHsl property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLtHsl(Boolean value) {
        this.ltHsl = value;
    }

    /**
     * Gets the value of the ltNt property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLtNt() {
        return ltNt;
    }

    /**
     * Sets the value of the ltNt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLtNt(Boolean value) {
        this.ltNt = value;
    }

    /**
     * Gets the value of the ltVnd property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLtVnd() {
        return ltVnd;
    }

    /**
     * Sets the value of the ltVnd property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLtVnd(Boolean value) {
        this.ltVnd = value;
    }

    /**
     * Gets the value of the ma property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMa() {
        return ma;
    }

    /**
     * Sets the value of the ma property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMa(String value) {
        this.ma = value;
    }

    /**
     * Gets the value of the maDvt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaDvt() {
        return maDvt;
    }

    /**
     * Sets the value of the maDvt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaDvt(String value) {
        this.maDvt = value;
    }

    /**
     * Gets the value of the msThue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsThue() {
        return msThue;
    }

    /**
     * Sets the value of the msThue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsThue(String value) {
        this.msThue = value;
    }

    /**
     * Gets the value of the ngayDkkd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayDkkd() {
        return ngayDkkd;
    }

    /**
     * Sets the value of the ngayDkkd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayDkkd(String value) {
        this.ngayDkkd = value;
    }

    /**
     * Gets the value of the ngayGiam property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayGiam() {
        return ngayGiam;
    }

    /**
     * Sets the value of the ngayGiam property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayGiam(String value) {
        this.ngayGiam = value;
    }

    /**
     * Gets the value of the ngayTang property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayTang() {
        return ngayTang;
    }

    /**
     * Sets the value of the ngayTang property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayTang(String value) {
        this.ngayTang = value;
    }

    /**
     * Gets the value of the nguoiDd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNguoiDd() {
        return nguoiDd;
    }

    /**
     * Sets the value of the nguoiDd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNguoiDd(String value) {
        this.nguoiDd = value;
    }

    /**
     * Gets the value of the nsHt property.
     *
     * @return possible object is
     * {@link String }
     */
    public Boolean getNsHt() {
        return nsHt;
    }

    /**
     * Sets the value of the nsHt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNsHt(Boolean value) {
        this.nsHt = value;
    }

    /**
     * Gets the value of the nsinhNdd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNsinhNdd() {
        return nsinhNdd;
    }

    /**
     * Sets the value of the nsinhNdd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNsinhNdd(String value) {
        this.nsinhNdd = value;
    }

    /**
     * Gets the value of the phuongThuc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhuongThuc() {
        return phuongThuc;
    }

    /**
     * Sets the value of the phuongThuc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhuongThuc(String value) {
        this.phuongThuc = value;
    }

    /**
     * Gets the value of the quyDoi property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isQuyDoi() {
        return quyDoi;
    }

    /**
     * Sets the value of the quyDoi property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setQuyDoi(Boolean value) {
        this.quyDoi = value;
    }

    /**
     * Gets the value of the soDinhDanh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSoDinhDanh() {
        return soDinhDanh;
    }

    /**
     * Sets the value of the soDinhDanh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSoDinhDanh(String value) {
        this.soDinhDanh = value;
    }

    /**
     * Gets the value of the soDkkd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSoDkkd() {
        return soDkkd;
    }

    /**
     * Sets the value of the soDkkd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSoDkkd(String value) {
        this.soDkkd = value;
    }

    /**
     * Gets the value of the tatToan property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTatToan() {
        return tatToan;
    }

    /**
     * Sets the value of the tatToan property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTatToan(Boolean value) {
        this.tatToan = value;
    }

    /**
     * Gets the value of the tdSo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTdSo() {
        return tdSo;
    }

    /**
     * Sets the value of the tdSo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTdSo(Boolean value) {
        this.tdSo = value;
    }

    /**
     * Gets the value of the tdThe property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTdThe() {
        return tdThe;
    }

    /**
     * Sets the value of the tdThe property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTdThe(Boolean value) {
        this.tdThe = value;
    }

    /**
     * Gets the value of the ten property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTen() {
        return ten;
    }

    /**
     * Sets the value of the ten property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTen(String value) {
        this.ten = value;
    }

    /**
     * Gets the value of the tenDvcq property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTenDvcq() {
        return tenDvcq;
    }

    /**
     * Sets the value of the tenDvcq property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTenDvcq(String value) {
        this.tenDvcq = value;
    }

    /**
     * Gets the value of the tenTa property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTenTa() {
        return tenTa;
    }

    /**
     * Sets the value of the tenTa property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTenTa(String value) {
        this.tenTa = value;
    }

    /**
     * Gets the value of the tenTat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTenTat() {
        return tenTat;
    }

    /**
     * Sets the value of the tenTat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTenTat(String value) {
        this.tenTat = value;
    }

    /**
     * Gets the value of the tkGd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTkGd() {
        return tkGd;
    }

    /**
     * Sets the value of the tkGd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTkGd(String value) {
        this.tkGd = value;
    }

    /**
     * Gets the value of the tlKemTheo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTlKemTheo() {
        return tlKemTheo;
    }

    /**
     * Sets the value of the tlKemTheo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTlKemTheo(String value) {
        this.tlKemTheo = value;
    }

    /**
     * Gets the value of the dmBhxhId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmBhxhId() {
        return dmBhxhId;
    }

    /**
     * Sets the value of the dmBhxhId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmBhxhId(Long value) {
        this.dmBhxhId = value;
    }

    /**
     * Gets the value of the ytMl property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isYtMl() {
        return ytMl;
    }

    /**
     * Sets the value of the ytMl property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setYtMl(Boolean value) {
        this.ytMl = value;
    }

    /**
     * Gets the value of the dmDbhcId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmDbhcId() {
        return dmDbhcId;
    }

    /**
     * Sets the value of the dmDbhcId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmDbhcId(Long value) {
        this.dmDbhcId = value;
    }

    /**
     * Gets the value of the nsHtroKhac property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNsHtroKhac() {
        return nsHtroKhac;
    }

    /**
     * Sets the value of the nsHtroKhac property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNsHtroKhac(Boolean value) {
        this.nsHtroKhac = value;
    }

    /**
     * Gets the value of the dmDtKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmDtKcbId() {
        return dmDtKcbId;
    }

    /**
     * Sets the value of the dmDtKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmDtKcbId(Long value) {
        this.dmDtKcbId = value;
    }

    /**
     * Gets the value of the ngayDungTl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayDungTl() {
        return ngayDungTl;
    }

    /**
     * Sets the value of the ngayDungTl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayDungTl(String value) {
        this.ngayDungTl = value;
    }

    /**
     * Gets the value of the dmKhoiKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmKhoiKcbId() {
        return dmKhoiKcbId;
    }

    /**
     * Sets the value of the dmKhoiKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmKhoiKcbId(Long value) {
        this.dmKhoiKcbId = value;
    }

    /**
     * Gets the value of the donViDong property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDonViDong() {
        return donViDong;
    }

    /**
     * Sets the value of the donViDong property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDonViDong(String value) {
        this.donViDong = value;
    }

    /**
     * Gets the value of the dmKhoiQlId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmKhoiQlId() {
        return dmKhoiQlId;
    }

    /**
     * Sets the value of the dmKhoiQlId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmKhoiQlId(Long value) {
        this.dmKhoiQlId = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the dmNgoaiTeId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmNgoaiTeId() {
        return dmNgoaiTeId;
    }

    /**
     * Sets the value of the dmNgoaiTeId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmNgoaiTeId(Long value) {
        this.dmNgoaiTeId = value;
    }

    /**
     * Gets the value of the nguoiLh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNguoiLh() {
        return nguoiLh;
    }

    /**
     * Sets the value of the nguoiLh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNguoiLh(String value) {
        this.nguoiLh = value;
    }

    /**
     * Gets the value of the dmVungId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmVungId() {
        return dmVungId;
    }

    /**
     * Sets the value of the dmVungId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmVungId(Long value) {
        this.dmVungId = value;
    }

    /**
     * Gets the value of the sdtNguoiLh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSdtNguoiLh() {
        return sdtNguoiLh;
    }

    /**
     * Sets the value of the sdtNguoiLh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSdtNguoiLh(String value) {
        this.sdtNguoiLh = value;
    }

    /**
     * Gets the value of the emailNguoiLh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmailNguoiLh() {
        return emailNguoiLh;
    }

    /**
     * Sets the value of the emailNguoiLh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmailNguoiLh(String value) {
        this.emailNguoiLh = value;
    }

    /**
     * Gets the value of the maHuyenKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMaHuyenKcbId() {
        return maHuyenKcbId;
    }

    /**
     * Sets the value of the maHuyenKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMaHuyenKcbId(Long value) {
        this.maHuyenKcbId = value;
    }

    /**
     * Gets the value of the maTinhKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMaTinhKcbId() {
        return maTinhKcbId;
    }

    /**
     * Sets the value of the maTinhKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMaTinhKcbId(Long value) {
        this.maTinhKcbId = value;
    }

    /**
     * Gets the value of the ngayTatToan property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayTatToan() {
        return ngayTatToan;
    }

    /**
     * Sets the value of the ngayTatToan property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayTatToan(String value) {
        this.ngayTatToan = value;
    }

    /**
     * Gets the value of the huuTri property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHuuTri() {
        return huuTri;
    }

    /**
     * Sets the value of the huuTri property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHuuTri(String value) {
        this.huuTri = value;
    }

    /**
     * Gets the value of the maXaKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMaXaKcbId() {
        return maXaKcbId;
    }

    /**
     * Sets the value of the maXaKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMaXaKcbId(Long value) {
        this.maXaKcbId = value;
    }

    /**
     * Gets the value of the qtichNddId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getQtichNddId() {
        return qtichNddId;
    }

    /**
     * Sets the value of the qtichNddId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setQtichNddId(Long value) {
        this.qtichNddId = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the maDvtCu property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaDvtCu() {
        return maDvtCu;
    }

    /**
     * Sets the value of the maDvtCu property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaDvtCu(String value) {
        this.maDvtCu = value;
    }

    /**
     * Gets the value of the thangTl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getThangTl() {
        return thangTl;
    }

    /**
     * Sets the value of the thangTl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setThangTl(String value) {
        this.thangTl = value;
    }

    /**
     * Gets the value of the tyLeNsnn property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public Long getTyLeNsnn() {
        return tyLeNsnn;
    }

    /**
     * Sets the value of the tyLeNsnn property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setTyLeNsnn(Long value) {
        this.tyLeNsnn = value;
    }

    /**
     * Gets the value of the isDviNo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsDviNo() {
        return isDviNo;
    }

    /**
     * Sets the value of the isDviNo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsDviNo(Boolean value) {
        this.isDviNo = value;
    }

    /**
     * Gets the value of the ngayDviNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayDviNo() {
        return ngayDviNo;
    }

    /**
     * Sets the value of the ngayDviNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayDviNo(String value) {
        this.ngayDviNo = value;
    }

    /**
     * Gets the value of the userDviNoId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getUserDviNoId() {
        return userDviNoId;
    }

    /**
     * Sets the value of the userDviNoId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setUserDviNoId(Long value) {
        this.userDviNoId = value;
    }

    /**
     * ID              NOT NULL NUMBER(19)
     * CREATED_DATE    NOT NULL DATE
     * UPDATED_DATE             DATE
     * CHON                     NUMBER(1)
     * CMT_HO_CHIEU             VARCHAR2(1000)
     * DC_LH                    VARCHAR2(1000)
     * DC_TRU_SO                VARCHAR2(1000)
     * DEN_SO                   NUMBER(10)
     * DIEN_THOAI               VARCHAR2(1000)
     * DN_NHA_NUOC              NUMBER(1)
     * DUNG_TL                  NUMBER(1)
     * DV_TU                    NUMBER(1)
     * FAX                      VARCHAR2(1000)
     * GHI_CHU                  VARCHAR2(1000)
     * GTINH_NDD                NUMBER(1)
     * IN_TEN_DVI               NUMBER(1)
     * LD_GIAM                  VARCHAR2(1000)
     * MAT_TICH                 NUMBER(1)
     * PHA_SAN                  NUMBER(1)
     * LY_DO_KHAC               NUMBER(1)
     * LD_TANG                  VARCHAR2(1000)
     * LOAI_DN                  VARCHAR2(1000)
     * LT_HSL                   NUMBER(1)
     * LT_NT                    NUMBER(1)
     * LT_VND                   NUMBER(1)
     * MA              NOT NULL VARCHAR2(1000)
     * MA_DVT                   VARCHAR2(1000)
     * MS_THUE                  VARCHAR2(1000)
     * NGAY_DKKD                DATE
     * NGAY_GIAM                DATE
     * NGAY_TANG                DATE
     * NGUOI_DD                 VARCHAR2(1000)
     * NS_HT                    NUMBER(1)
     * NSINH_NDD                DATE
     * PHUONG_THUC              VARCHAR2(1000)
     * QUY_DOI                  NUMBER(1)
     * SO_DINH_DANH             VARCHAR2(1000)
     * SO_DKKD                  VARCHAR2(1000)
     * TAT_TOAN                 NUMBER(1)
     * TD_SO                    NUMBER(1)
     * TD_THE                   NUMBER(1)
     * TEN             NOT NULL VARCHAR2(1000)
     * TEN_DVCQ                 VARCHAR2(1000)
     * TEN_TA                   VARCHAR2(1000)
     * TEN_TAT                  VARCHAR2(1000)
     * TK_GD                    VARCHAR2(1000)
     * TL_KEM_THEO              VARCHAR2(1000)
     * YT_ML                    NUMBER(1)
     * NS_HTRO_KHAC             NUMBER(1)
     * NGAY_DUNG_TL             DATE
     * DON_VI_DONG              NVARCHAR2(1000)
     * EMAIL                    NVARCHAR2(1000)
     * NGUOI_LH                 NVARCHAR2(1000)
     * SDT_NGUOI_LH             NVARCHAR2(1000)
     * EMAIL_NGUOI_LH           NVARCHAR2(1000)
     * NGAY_TATTOAN             DATE
     * HUU_TRI                  VARCHAR2(1000)
     * DM_BHXH_ID      NOT NULL NUMBER(19)
     * DM_DBHC_ID               NUMBER(19)
     * DM_DT_KCB_ID             NUMBER(19)
     * DM_KHOI_KCB_ID           NUMBER(19)
     * DM_KHOI_QL_ID            NUMBER(19)
     * DM_NGOAI_TE_ID           NUMBER(19)
     * DM_VUNG_ID               NUMBER(19)
     * MA_HUYEN_KCB_ID          NUMBER(19)
     * MA_TINH_KCB_ID           NUMBER(19)
     * MA_XA_KCB_ID             NUMBER(19)
     * QTICH_NDD_ID             NUMBER(19)
     * USER_ID                  NUMBER(19)
     * MA_DVT_CU                VARCHAR2(1000)
     * THANG_TL                 VARCHAR2(1000)
     * TY_LE_NSNN               NUMBER(6,3)
     * IS_DVI_NO                NUMBER(1)
     * NGAY_DVI_NO              DATE
     * USER_DVI_NO_ID           NUMBER(19)
     *
     * @return
     */
    public Object[] toObjects() {
        Object[] objects = new Object[75];
        objects[0] = id;                                                          // ID               NUMBER(19)
        objects[1] = convertStringToTimestamp(createdDate, yyyyMMddHHmmssSSS);// CREATED_DATE     DATE
        objects[2] = convertStringToTimestamp(updatedDate, yyyyMMddHHmmssSSS);// UPDATED_DATE     DATE
        objects[3] = chon;         // CHON             NUMBER(1)
        objects[4] = cmtHoChieu;   // CMT_HO_CHIEU     VARCHAR2(1000)
        objects[5] = dcLh;         // DC_LH            VARCHAR2(1000)
        objects[6] = dcTruSo;      // DC_TRU_SO        VARCHAR2(1000)
        objects[7] = denSo;        // DEN_SO           NUMBER(10)
        objects[8] = dienThoai;    // DIEN_THOAI       VARCHAR2(1000)
        objects[9] = dnNhaNuoc;    // DN_NHA_NUOC      NUMBER(1)
        objects[10] = dungTl;      // DUNG_TL          NUMBER(1)
        objects[11] = dvTu;        // DV_TU            NUMBER(1)
        objects[12] = fax;         // FAX              VARCHAR2(1000)
        objects[13] = ghiChu;      // GHI_CHU          VARCHAR2(1000)
        objects[14] = gtinhNdd;    // GTINH_NDD        NUMBER(1)
        objects[15] = inTenDvi;    // IN_TEN_DVI       NUMBER(1)
        objects[16] = ldGiam;      // LD_GIAM          VARCHAR2(1000)
        objects[17] = matTich;     // MAT_TICH         NUMBER(1)
        objects[18] = phaSan;      // PHA_SAN          NUMBER(1)
        objects[19] = lyDoKhac;    // LY_DO_KHAC       NUMBER(1)
        objects[20] = ldTang;      // LD_TANG          VARCHAR2(1000)
        objects[21] = loaiDn;      // LOAI_DN          VARCHAR2(1000)
        objects[22] = ltHsl;       // LT_HSL           NUMBER(1)
        objects[23] = ltNt;        // LT_NT            NUMBER(1)
        objects[24] = ltVnd;       // LT_VND           NUMBER(1)
        objects[25] = ma;          // MA               VARCHAR2(1000)
        objects[26] = maDvt;       // MA_DVT           VARCHAR2(1000)
        objects[27] = msThue;      // MS_THUE          VARCHAR2(1000)
        objects[28] = convertStringToTimestamp(ngayDkkd, yyyyMMddHHmmssSSS);// NGAY_DKKD        DATE
        objects[29] = convertStringToTimestamp(ngayGiam, yyyyMMddHHmmssSSS);// NGAY_GIAM        DATE
        objects[30] = convertStringToTimestamp(ngayTang, yyyyMMddHHmmssSSS);// NGAY_TANG        DATE
        objects[31] = nguoiDd;     // NGUOI_DD         VARCHAR2(1000)
        objects[32] = nsHt;        // NS_HT            NUMBER(1)
        objects[33] = convertStringToTimestamp(nsinhNdd, yyyyMMddHHmmssSSS);// NSINH_NDD        DATE
        objects[34] = phuongThuc;  // PHUONG_THUC      VARCHAR2(1000)
        objects[35] = quyDoi;      // QUY_DOI          NUMBER(1)
        objects[36] = soDinhDanh;  // SO_DINH_DANH     VARCHAR2(1000)
        objects[37] = soDkkd;      // SO_DKKD          VARCHAR2(1000)
        objects[38] = tatToan;     // TAT_TOAN         NUMBER(1)
        objects[39] = tdSo;        // TD_SO            NUMBER(1)
        objects[40] = tdThe;       // TD_THE           NUMBER(1)
        objects[41] = ten;         // TEN              VARCHAR2(1000)
        objects[42] = tenDvcq;     // TEN_DVCQ         VARCHAR2(1000)
        objects[43] = tenTa;       // TEN_TA           VARCHAR2(1000)
        objects[44] = tenTat;      // TEN_TAT          VARCHAR2(1000)
        objects[45] = tkGd;        // TK_GD            VARCHAR2(1000)
        objects[46] = tlKemTheo;   // TL_KEM_THEO      VARCHAR2(1000)
        objects[47] = ytMl;        // YT_ML            NUMBER(1)
        objects[48] = nsHtroKhac;  // NS_HTRO_KHAC     NUMBER(1)
        objects[49] = convertStringToTimestamp(ngayDungTl, yyyyMMddHHmmssSSS);// NGAY_DUNG_TL     DATE
        objects[50] = donViDong;   // DON_VI_DONG      NVARCHAR2(1000)
        objects[51] = email;       // EMAIL            NVARCHAR2(1000)
        objects[52] = nguoiLh;     // NGUOI_LH         NVARCHAR2(1000)
        objects[53] = sdtNguoiLh;  // SDT_NGUOI_LH     NVARCHAR2(1000)
        objects[54] = emailNguoiLh;// EMAIL_NGUOI_LH   NVARCHAR2(1000)
        objects[55] = convertStringToTimestamp(ngayTatToan, yyyyMMddHHmmssSSS);// NGAY_TATTOAN     DATE
        objects[56] = huuTri;      // HUU_TRI          VARCHAR2(1000)
        objects[57] = dmBhxhId;    // DM_BHXH_ID       NUMBER(19)
        objects[58] = dmDbhcId;    // DM_DBHC_ID       NUMBER(19)
        objects[59] = dmDtKcbId;   // DM_DT_KCB_ID     NUMBER(19)
        objects[60] = dmKhoiKcbId; // DM_KHOI_KCB_ID   NUMBER(19)
        objects[61] = dmKhoiQlId;  // DM_KHOI_QL_ID    NUMBER(19)
        objects[62] = dmNgoaiTeId; // DM_NGOAI_TE_ID   NUMBER(19)
        objects[63] = dmVungId;    // DM_VUNG_ID       NUMBER(19)
        objects[64] = maHuyenKcbId;// MA_HUYEN_KCB_ID  NUMBER(19)
        objects[65] = maTinhKcbId; // MA_TINH_KCB_ID   NUMBER(19)
        objects[66] = maXaKcbId;   // MA_XA_KCB_ID     NUMBER(19)
        objects[67] = qtichNddId;  // QTICH_NDD_ID     NUMBER(19)
        objects[68] = userId;      // USER_ID          NUMBER(19)
        objects[69] = maDvtCu;     // MA_DVT_CU        VARCHAR2(1000)
        objects[70] = thangTl;     // THANG_TL         VARCHAR2(1000)
        objects[71] = tyLeNsnn;    // TY_LE_NSNN       NUMBER(6,3)
        objects[72] = isDviNo;     // IS_DVI_NO        NUMBER(1)
        objects[73] = convertStringToTimestamp(ngayDviNo, yyyyMMddHHmmssSSS);// NGAY_DVI_NO      DATE
        objects[74] = userDviNoId; // USER_DVI_NO_ID   NUMBER(19)
        return objects;
    }

    public static void objectToString(Object[] objects) {
        String str = "";
        str += objects[0] + "=id,";
        str += objects[1] + "=convertStringToTimestamp(createdDate),";
        str += objects[2] + "=convertStringToTimestamp(updatedDate),";
        str += objects[3] + "=chon,";
        str += objects[4] + "=cmtHoChieu,";
        str += objects[5] + "=dcLh,";
        str += objects[6] + "=dcTruSo,";
        str += objects[7] + "=denSo,";
        str += objects[8] + "=dienThoai,";
        str += objects[9] + "=dnNhaNuoc,";
        str += objects[10] + "=dungTl,";
        str += objects[11] + "=dvTu,";
        str += objects[12] + "=fax,";
        str += objects[13] + "=ghiChu,";
        str += objects[14] + "=gtinhNdd,";
        str += objects[15] + "=inTenDvi,";
        str += objects[16] + "=ldGiam,";
        str += objects[17] + "=matTich,";
        str += objects[18] + "=phaSan,";
        str += objects[19] + "=lyDoKhac,";
        str += objects[20] + "=ldTang,";
        str += objects[21] + "=loaiDn,";
        str += objects[22] + "=ltHsl,";
        str += objects[23] + "=ltNt,";
        str += objects[24] + "=ltVnd,";
        str += objects[25] + "=ma,";
        str += objects[26] + "=maDvt,";
        str += objects[27] + "=msThue,";
        str += objects[28] + "=convertStringToTimestamp(ngayDkkd),";
        str += objects[29] + "=convertStringToTimestamp(ngayGiam),";
        str += objects[30] + "=convertStringToTimestamp(ngayTang),";
        str += objects[31] + "=nguoiDd,";
        str += objects[32] + "=nsHt,";
        str += objects[33] + "=convertStringToTimestamp(nsinhNdd),";
        str += objects[34] + "=phuongThuc,";
        str += objects[35] + "=quyDoi,";
        str += objects[36] + "=soDinhDanh,";
        str += objects[37] + "=soDkkd,";
        str += objects[38] + "=tatToan,";
        str += objects[39] + "=tdSo,";
        str += objects[40] + "=tdThe,";
        str += objects[41] + "=ten,";
        str += objects[42] + "=tenDvcq,";
        str += objects[43] + "=tenTa,";
        str += objects[44] + "=tenTat,";
        str += objects[45] + "=tkGd,";
        str += objects[46] + "=tlKemTheo,";
        str += objects[47] + "=ytMl,";
        str += objects[48] + "=nsHtroKhac,";
        str += objects[49] + "=convertStringToTimestamp(ngayDungTl),";
        str += objects[50] + "=donViDong,";
        str += objects[51] + "=email,";
        str += objects[52] + "=nguoiLh,";
        str += objects[53] + "=sdtNguoiLh,";
        str += objects[54] + "=emailNguoiLh,";
        str += objects[55] + "=convertStringToTimestamp(ngayTatToan),";
        str += objects[56] + "=huuTri,";
        str += objects[57] + "=dmBhxhId,";
        str += objects[58] + "=dmDbhcId,";
        str += objects[59] + "=dmDtKcbId,";
        str += objects[60] + "=dmKhoiKcbId,";
        str += objects[61] + "=dmKhoiQlId,";
        str += objects[62] + "=dmNgoaiTeId,";
        str += objects[63] + "=dmVungId,";
        str += objects[64] + "=maHuyenKcbId,";
        str += objects[65] + "=maTinhKcbId,";
        str += objects[66] + "=maXaKcbId,";
        str += objects[67] + "=qtichNddId,";
        str += objects[68] + "=userId,";
        str += objects[69] + "=maDvtCu,";
        str += objects[70] + "=thangTl,";
        str += objects[71] + "=tyLeNsnn,";
        str += objects[72] + "=isDviNo,";
        str += objects[73] + "=convertStringToTimestamp(ngayDviNo),";
        str += objects[74] + "=userDviNoId,";
        System.out.println(str);
    }

    public String toString() {
        String str = "";
        str += "id=" + id;
        str += ",createdDate=" + createdDate;
        str += ",updatedDate=" + updatedDate;
        str += ",chon=" + chon;
        str += ",cmtHoChieu=" + cmtHoChieu;
        str += ",dcLh=" + dcLh;
        str += ",dcTruSo=" + dcTruSo;
        str += ",denSo=" + denSo;
        str += ",dienThoai=" + dienThoai;
        str += ",dnNhaNuoc=" + dnNhaNuoc;
        str += ",dungTl=" + dungTl;
        str += ",dvTu=" + dvTu;
        str += ",fax=" + fax;
        str += ",ghiChu=" + ghiChu;
        str += ",gtinhNdd=" + gtinhNdd;
        str += ",inTenDvi=" + inTenDvi;
        str += ",ldGiam=" + ldGiam;
        str += ",matTich=" + matTich;
        str += ",phaSan=" + phaSan;
        str += ",lyDoKhac=" + lyDoKhac;
        str += ",ldTang=" + ldTang;
        str += ",loaiDn=" + loaiDn;
        str += ",ltHsl=" + ltHsl;
        str += ",ltNt=" + ltNt;
        str += ",ltVnd=" + ltVnd;
        str += ",ma=" + ma;
        str += ",maDvt=" + maDvt;
        str += ",msThue=" + msThue;
        str += ",ngayDkkd=" + ngayDkkd;
        str += ",ngayGiam=" + ngayGiam;
        str += ",ngayTang=" + ngayTang;
        str += ",nguoiDd=" + nguoiDd;
        str += ",nsHt=" + nsHt;
        str += ",nsinhNdd=" + nsinhNdd;
        str += ",phuongThuc=" + phuongThuc;
        str += ",quyDoi=" + quyDoi;
        str += ",soDinhDanh=" + soDinhDanh;
        str += ",soDkkd=" + soDkkd;
        str += ",tatToan=" + tatToan;
        str += ",tdSo=" + tdSo;
        str += ",tdThe=" + tdThe;
        str += ",ten=" + ten;
        str += ",tenDvcq=" + tenDvcq;
        str += ",tenTa=" + tenTa;
        str += ",tenTat=" + tenTat;
        str += ",tkGd=" + tkGd;
        str += ",tlKemTheo=" + tlKemTheo;
        str += ",dmBhxhId=" + dmBhxhId;
        str += ",ytMl=" + ytMl;
        str += ",dmDbhcId=" + dmDbhcId;
        str += ",nsHtroKhac=" + nsHtroKhac;
        str += ",dmDtKcbId=" + dmDtKcbId;
        str += ",ngayDungTl=" + ngayDungTl;
        str += ",dmKhoiKcbId=" + dmKhoiKcbId;
        str += ",donViDong=" + donViDong;
        str += ",dmKhoiQlId=" + dmKhoiQlId;
        str += ",email=" + email;
        str += ",dmNgoaiTeId=" + dmNgoaiTeId;
        str += ",nguoiLh=" + nguoiLh;
        str += ",dmVungId=" + dmVungId;
        str += ",sdtNguoiLh=" + sdtNguoiLh;
        str += ",emailNguoiLh=" + emailNguoiLh;
        str += ",maHuyenKcbId=" + maHuyenKcbId;
        str += ",maTinhKcbId=" + maTinhKcbId;
        str += ",ngayTatToan=" + ngayTatToan;
        str += ",huuTri=" + huuTri;
        str += ",maXaKcbId=" + maXaKcbId;
        str += ",qtichNddId=" + qtichNddId;
        str += ",userId=" + userId;
        str += ",maDvtCu=" + maDvtCu;
        str += ",thangTl=" + thangTl;
        str += ",tyLeNsnn=" + tyLeNsnn;
        str += ",isDviNo=" + isDviNo;
        str += ",ngayDviNo=" + ngayDviNo;
        str += ",userDviNoId=" + userDviNoId;

        return str;
    }

    public CommonDmDonVi toEntity() {
        CommonDmDonVi donvi = new CommonDmDonVi();
        donvi.setId(id);
        donvi.setCreatedDate(convertStringToTimestamp(createdDate, yyyyMMddHHmmssSSS));
        donvi.setUpdatedDate(convertStringToTimestamp(updatedDate, yyyyMMddHHmmssSSS));
        donvi.setChon(JPAUtils.toLong(chon));
        donvi.setCmtHoChieu(cmtHoChieu);
        donvi.setDcLh(dcLh);
        donvi.setDcTruSo(dcTruSo);
        donvi.setDenSo(denSo);
        donvi.setDienThoai(dienThoai);
        donvi.setDnNhaNuoc(JPAUtils.toLong(dnNhaNuoc));
        donvi.setDungTl(JPAUtils.toLong(dungTl));
        donvi.setDvTu(JPAUtils.toLong(dvTu));
        donvi.setFax(fax);
        donvi.setGhiChu(ghiChu);
        donvi.setGtinhNdd(JPAUtils.toLong(gtinhNdd));
        donvi.setInTenDvi(JPAUtils.toLong(inTenDvi));
        donvi.setLdGiam(ldGiam);
        donvi.setMatTich(JPAUtils.toLong(matTich));
        donvi.setPhaSan(JPAUtils.toLong(phaSan));
        donvi.setLyDoKhac(JPAUtils.toLong(lyDoKhac));
        donvi.setLdTang(ldTang);
        donvi.setLoaiDn(loaiDn);
        donvi.setLtHsl(JPAUtils.toLong(ltHsl));
        donvi.setLtNt(JPAUtils.toLong(ltNt));
        donvi.setLtVnd(JPAUtils.toLong(ltVnd));
        donvi.setMa(ma);
        donvi.setMaDvt(maDvt);
        donvi.setMsThue(msThue);
        donvi.setNgayDkkd(convertStringToTimestamp(ngayDkkd, yyyyMMddHHmmssSSS));
        donvi.setNgayGiam(convertStringToTimestamp(ngayGiam, yyyyMMddHHmmssSSS));
        donvi.setNgayTang(convertStringToTimestamp(ngayTang, yyyyMMddHHmmssSSS));
        donvi.setNguoiDd(nguoiDd);
        donvi.setNsHt(JPAUtils.toLong(nsHt));
        donvi.setNsinhNdd(convertStringToTimestamp(nsinhNdd, yyyyMMddHHmmssSSS));
        donvi.setPhuongThuc(phuongThuc);
        donvi.setQuyDoi(JPAUtils.toLong(quyDoi));
        donvi.setSoDinhDanh(soDinhDanh);
        donvi.setSoDkkd(soDkkd);
        donvi.setTatToan(JPAUtils.toLong(tatToan));
        donvi.setTdSo(JPAUtils.toLong(tdSo));
        donvi.setTdThe(JPAUtils.toLong(tdThe));
        donvi.setTen(ten);
        donvi.setTenDvcq(tenDvcq);
        donvi.setTenTa(tenTa);
        donvi.setTenTat(tenTat);
        donvi.setTkGd(tkGd);
        donvi.setTlKemTheo(tlKemTheo);
        donvi.setYtMl(JPAUtils.toLong(ytMl));
        donvi.setNsHtroKhac(JPAUtils.toLong(nsHtroKhac));
        donvi.setNgayDungTl(convertStringToTimestamp(ngayDungTl, yyyyMMddHHmmssSSS));
        donvi.setDonViDong(donViDong);
        donvi.setEmail(email);
        donvi.setNguoiLh(nguoiLh);
        donvi.setSdtNguoiLh(sdtNguoiLh);
        donvi.setEmailNguoiLh(emailNguoiLh);
        donvi.setNgayTattoan(convertStringToTimestamp(ngayTatToan, yyyyMMddHHmmssSSS));
        donvi.setHuuTri(huuTri);
        donvi.setDmBhxhId(dmBhxhId);
        donvi.setDmDbhcId(dmDbhcId);
        donvi.setDmDtKcbId(dmDtKcbId);
        donvi.setDmKhoiKcbId(dmKhoiKcbId);
        donvi.setDmKhoiQlId(dmKhoiQlId);
        donvi.setDmNgoaiTeId(dmNgoaiTeId);
        donvi.setDmVungId(dmVungId);
        donvi.setMaHuyenKcbId(maHuyenKcbId);
        donvi.setMaTinhKcbId(maTinhKcbId);
        donvi.setMaXaKcbId(maXaKcbId);
        donvi.setQtichNddId(qtichNddId);
        donvi.setUserId(userId);
        donvi.setMaDvtCu(maDvtCu);
        donvi.setThangTl(thangTl);
        donvi.setTyLeNsnn(tyLeNsnn);
        donvi.setDviNo(JPAUtils.toLong(isDviNo));
        donvi.setNgayDviNo(convertStringToTimestamp(ngayDviNo, yyyyMMddHHmmssSSS));
        donvi.setUserDviNoId(userDviNoId);

        return donvi;
    }
}
