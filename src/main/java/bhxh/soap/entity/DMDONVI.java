
package bhxh.soap.entity;


import bhxh.data.model.CommonDmPhongBan;
import bhxh.utils.DateUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)

public class DMDONVI {
    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "TEN_TIENG_VIET")
    protected String tentiengviet;
    @XmlElement(name = "TEN_TIENG_ANH")
    protected String tentienganh;
    @XmlElement(name = "TEN_VIET_TAT")
    protected String tenviettat;
    @XmlElement(name = "TINH_THANH_ID", required = true, type = Long.class, nillable = true)
    protected Long tinhthanhid;
    @XmlElement(name = "DIA_CHI")
    protected String diachi;
    @XmlElement(name = "DIEN_THOAI")
    protected String dienthoai;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "MA_SO_THUE")
    protected String masothue;
    @XmlElement(name = "DB_NAME")
    protected String dbname;
    @XmlElement(name = "LAST_UPDATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String lastupdate;
    @XmlElement(name = "MA_DON_VI")
    protected String madonvi;
    @XmlElement(name = "DONVI_CHA_ID", required = true, type = Long.class, nillable = true)
    protected Long donvichaid;
    @XmlElement(name = "CAP_DON_VI", required = true, nillable = true)
    protected Long capdonvi;
    @XmlElement(name = "LOAI_HINH", required = true, nillable = true)
    protected Long loaihinh;
    @XmlElement(name = "MA_KCB")
    protected String makcb;
    @XmlElement(name = "SO_TAI_KHOAN")
    protected String sotaikhoan;
    @XmlElement(name = "NGAN_HANG")
    protected String nganhang;
    @XmlElement(name = "LOAI_HINH_DON_VI", required = true, nillable = true)
    protected Long loaihinhdonvi;
    @XmlElement(name = "SL_DIEM_KHO", required = true, nillable = true)
    protected Long sldiemkho;
    @XmlElement(name = "CO_QUAN_TONG_CUC", required = true, nillable = true)
    protected Long coquantongcuc;
    @XmlElement(name = "STT_CAP", required = true, type = Long.class, nillable = true)
    protected Long sttcap;
    @XmlElement(name = "PC_KHU_VUC", required = true, nillable = true)
    protected Long pckhuvuc;

    /**
     * Gets the value of the id property.
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the tentiengviet property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTENTIENGVIET() {
        return tentiengviet;
    }

    /**
     * Sets the value of the tentiengviet property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTENTIENGVIET(String value) {
        this.tentiengviet = value;
    }

    /**
     * Gets the value of the tentienganh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTENTIENGANH() {
        return tentienganh;
    }

    /**
     * Sets the value of the tentienganh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTENTIENGANH(String value) {
        this.tentienganh = value;
    }

    /**
     * Gets the value of the tenviettat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTENVIETTAT() {
        return tenviettat;
    }

    /**
     * Sets the value of the tenviettat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTENVIETTAT(String value) {
        this.tenviettat = value;
    }

    /**
     * Gets the value of the tinhthanhid property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getTINHTHANHID() {
        return tinhthanhid;
    }

    /**
     * Sets the value of the tinhthanhid property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setTINHTHANHID(Long value) {
        this.tinhthanhid = value;
    }

    /**
     * Gets the value of the diachi property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDIACHI() {
        return diachi;
    }

    /**
     * Sets the value of the diachi property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDIACHI(String value) {
        this.diachi = value;
    }

    /**
     * Gets the value of the dienthoai property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDIENTHOAI() {
        return dienthoai;
    }

    /**
     * Sets the value of the dienthoai property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDIENTHOAI(String value) {
        this.dienthoai = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the masothue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMASOTHUE() {
        return masothue;
    }

    /**
     * Sets the value of the masothue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMASOTHUE(String value) {
        this.masothue = value;
    }

    /**
     * Gets the value of the dbname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDBNAME() {
        return dbname;
    }

    /**
     * Sets the value of the dbname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDBNAME(String value) {
        this.dbname = value;
    }

    /**
     * Gets the value of the lastupdate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public String getLASTUPDATE() {
        return lastupdate;
    }

    /**
     * Sets the value of the lastupdate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLASTUPDATE(String value) {
        this.lastupdate = value;
    }

    /**
     * Gets the value of the madonvi property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMADONVI() {
        return madonvi;
    }

    /**
     * Sets the value of the madonvi property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMADONVI(String value) {
        this.madonvi = value;
    }

    /**
     * Gets the value of the donvichaid property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDONVICHAID() {
        return donvichaid;
    }

    /**
     * Sets the value of the donvichaid property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDONVICHAID(Long value) {
        this.donvichaid = value;
    }

    /**
     * Gets the value of the capdonvi property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCAPDONVI() {
        return capdonvi;
    }

    /**
     * Sets the value of the capdonvi property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCAPDONVI(Long value) {
        this.capdonvi = value;
    }

    /**
     * Gets the value of the loaihinh property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLOAIHINH() {
        return loaihinh;
    }

    /**
     * Sets the value of the loaihinh property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLOAIHINH(Long value) {
        this.loaihinh = value;
    }

    /**
     * Gets the value of the makcb property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMAKCB() {
        return makcb;
    }

    /**
     * Sets the value of the makcb property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMAKCB(String value) {
        this.makcb = value;
    }

    /**
     * Gets the value of the sotaikhoan property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSOTAIKHOAN() {
        return sotaikhoan;
    }

    /**
     * Sets the value of the sotaikhoan property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSOTAIKHOAN(String value) {
        this.sotaikhoan = value;
    }

    /**
     * Gets the value of the nganhang property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNGANHANG() {
        return nganhang;
    }

    /**
     * Sets the value of the nganhang property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNGANHANG(String value) {
        this.nganhang = value;
    }

    /**
     * Gets the value of the loaihinhdonvi property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLOAIHINHDONVI() {
        return loaihinhdonvi;
    }

    /**
     * Sets the value of the loaihinhdonvi property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLOAIHINHDONVI(Long value) {
        this.loaihinhdonvi = value;
    }

    /**
     * Gets the value of the sldiemkho property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSLDIEMKHO() {
        return sldiemkho;
    }

    /**
     * Sets the value of the sldiemkho property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSLDIEMKHO(Long value) {
        this.sldiemkho = value;
    }

    /**
     * Gets the value of the coquantongcuc property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCOQUANTONGCUC() {
        return coquantongcuc;
    }

    /**
     * Sets the value of the coquantongcuc property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCOQUANTONGCUC(Long value) {
        this.coquantongcuc = value;
    }

    /**
     * Gets the value of the sttcap property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSTTCAP() {
        return sttcap;
    }

    /**
     * Sets the value of the sttcap property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSTTCAP(Long value) {
        this.sttcap = value;
    }

    /**
     * Gets the value of the pckhuvuc property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPCKHUVUC() {
        return pckhuvuc;
    }

    /**
     * Sets the value of the pckhuvuc property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPCKHUVUC(Long value) {
        this.pckhuvuc = value;
    }

    public Object[] toObjects() {
        Object[] objects = new Object[25];
        objects[0] = id;
        objects[1] = tentiengviet;
        objects[2] = tentienganh;
        objects[3] = tenviettat;
        objects[4] = tinhthanhid;
        objects[5] = diachi;
        objects[6] = dienthoai;
        objects[7] = email;
        objects[8] = fax;
        objects[9] = masothue;
        objects[10] = dbname;
        objects[11] = DateUtils.convertStringToTimestamp(lastupdate, DateUtils.yyyyMMdd_T_HHmmssSSS);
        objects[12] = madonvi;
        objects[13] = donvichaid;
        objects[14] = capdonvi;
        objects[15] = loaihinh;
        objects[16] = makcb;
        objects[17] = sotaikhoan;
        objects[18] = nganhang;
        objects[19] = loaihinhdonvi;
        objects[20] = sldiemkho;
        objects[21] = coquantongcuc;
        objects[22] = null;
        objects[23] = sttcap;
        objects[24] = pckhuvuc;
        return objects;
    }

    public CommonDmPhongBan toEntity() {
        CommonDmPhongBan pb = new CommonDmPhongBan();
        pb.setId(id);
        pb.setTenTiengViet(tentiengviet);
        pb.setTenTiengAnh(tentienganh);
        pb.setTenVietTat(tenviettat);
        pb.setTinhThanhId(tinhthanhid);
        pb.setDiaChi(diachi);
        pb.setDienThoai(dienthoai);
        pb.setEmail(email);
        pb.setFax(fax);
        pb.setMaSoThue(masothue);
        pb.setDbName(dbname);
        pb.setLastUpdate(DateUtils.convertStringToTimestamp(lastupdate, DateUtils.yyyyMMdd_T_HHmmssSSS));
        pb.setMaDonVi(madonvi);
        pb.setDonviChaId(donvichaid);
        pb.setCapDonVi(capdonvi);
        pb.setLoaiHinh(loaihinh);
        pb.setMaKcb(makcb);
        pb.setSoTaiKhoan(sotaikhoan);
        pb.setNganHang(nganhang);
        pb.setLoaiHinhDonVi(loaihinhdonvi);
        pb.setSlDiemKho(sldiemkho);
        pb.setCoQuanTongCuc(coquantongcuc);
        pb.setXaPhuongId(null);
        pb.setSttCap(sttcap);
        pb.setPcKhuVuc(pckhuvuc);
        return pb;
    }

}
