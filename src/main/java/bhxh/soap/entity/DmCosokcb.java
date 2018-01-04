
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

import static bhxh.utils.DateUtils.convertStringToTimestamp;
import static bhxh.utils.DateUtils.yyyyMMdd_T_HHmmssSSS;


/**
 * <p>Java class for DmCosokcb complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DmCosokcb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mabhyt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DonvihanhchinhId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Diachi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hangbenhvien" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tuyencmkt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Hieuluc" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Mieuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TinhthanhId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuanhuyenId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Matinhthanh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maquanhuyen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DonviId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Macosokcbcha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CosokcbchaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Madonvi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thannhantao" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Thaighep" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Loaihopdong" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Dkkcbbd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HinhthucTT" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Loaibenhvien" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Khamtreem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Ngayngunghd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Mataichinh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pkdakhoa" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Ungthu" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Viemgan" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tebaomautd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Khamt7" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Khamcn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Khamngayle" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Masothue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dienthoai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coquanchuquan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ngaykyhopdong" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Kieubv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CapcskcbMin" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Sohopdong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ttpheduyet" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Lydo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trangthai" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tuchu" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HangdichvuTd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HangthuocTd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HangvattuTd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Byt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SoGphd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kcb" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Ngaycapma" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Ngaydieuchinh" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LoaiDonvichuquan" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ChuaPd43" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Ngaykyhopdonglandau" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GhichuTinhthaydoi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlTheBhDkbd" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SlTheBhDaCap" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LoaiCk" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DmCosokcb {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Ten")
    protected String ten;
    @XmlElement(name = "Ma")
    protected String ma;
    @XmlElement(name = "Mabhyt")
    protected String mabhyt;
    @XmlElement(name = "DonvihanhchinhId", required = true, type = Integer.class, nillable = true)
    protected Integer donvihanhchinhId;
    @XmlElement(name = "Diachi")
    protected String diachi;
    @XmlElement(name = "Hangbenhvien", required = true, type = Short.class, nillable = true)
    protected Short hangbenhvien;
    @XmlElement(name = "Tuyencmkt", required = true, type = Short.class, nillable = true)
    protected Short tuyencmkt;
    @XmlElement(name = "Hieuluc", required = true, type = Short.class, nillable = true)
    protected Short hieuluc;
    @XmlElement(name = "Mieuta")
    protected String mieuta;
    @XmlElement(name = "Stt", required = true, type = Integer.class, nillable = true)
    protected Integer stt;
    @XmlElement(name = "TinhthanhId", required = true, type = Integer.class, nillable = true)
    protected Integer tinhthanhId;
    @XmlElement(name = "QuanhuyenId", required = true, type = Integer.class, nillable = true)
    protected Integer quanhuyenId;
    @XmlElement(name = "Matinhthanh")
    protected String matinhthanh;
    @XmlElement(name = "Maquanhuyen")
    protected String maquanhuyen;
    @XmlElement(name = "DonviId", required = true, type = Integer.class, nillable = true)
    protected Integer donviId;
    @XmlElement(name = "Macosokcbcha")
    protected String macosokcbcha;
    @XmlElement(name = "CosokcbchaId", required = true, type = Integer.class, nillable = true)
    protected Integer cosokcbchaId;
    @XmlElement(name = "Madonvi")
    protected String madonvi;
    @XmlElement(name = "Thannhantao", required = true, type = Short.class, nillable = true)
    protected Short thannhantao;
    @XmlElement(name = "Thaighep", required = true, type = Short.class, nillable = true)
    protected Short thaighep;
    @XmlElement(name = "Loaihopdong", required = true, type = Short.class, nillable = true)
    protected Short loaihopdong;
    @XmlElement(name = "Dkkcbbd", required = true, type = Short.class, nillable = true)
    protected Short dkkcbbd;
    @XmlElement(name = "HinhthucTT", required = true, type = Short.class, nillable = true)
    protected Short hinhthucTT;
    @XmlElement(name = "Loaibenhvien", required = true, type = Short.class, nillable = true)
    protected Short loaibenhvien;
    @XmlElement(name = "Khamtreem", required = true, type = Short.class, nillable = true)
    protected Short khamtreem;
    @XmlElement(name = "Ngayngunghd", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String ngayngunghd;
    @XmlElement(name = "Mataichinh")
    protected String mataichinh;
    @XmlElement(name = "Pkdakhoa", required = true, type = Short.class, nillable = true)
    protected Short pkdakhoa;
    @XmlElement(name = "Ungthu", required = true, type = Short.class, nillable = true)
    protected Short ungthu;
    @XmlElement(name = "Viemgan", required = true, type = Short.class, nillable = true)
    protected Short viemgan;
    @XmlElement(name = "Tebaomautd", required = true, type = Short.class, nillable = true)
    protected Short tebaomautd;
    @XmlElement(name = "Khamt7", required = true, type = Short.class, nillable = true)
    protected Short khamt7;
    @XmlElement(name = "Khamcn", required = true, type = Short.class, nillable = true)
    protected Short khamcn;
    @XmlElement(name = "Khamngayle", required = true, type = Short.class, nillable = true)
    protected Short khamngayle;
    @XmlElement(name = "Masothue")
    protected String masothue;
    @XmlElement(name = "Dienthoai")
    protected String dienthoai;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Coquanchuquan")
    protected String coquanchuquan;
    @XmlElement(name = "Ngaykyhopdong", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String ngaykyhopdong;
    @XmlElement(name = "Kieubv", required = true, type = Short.class, nillable = true)
    protected Short kieubv;
    @XmlElement(name = "CapcskcbMin", required = true, type = Short.class, nillable = true)
    protected Short capcskcbMin;
    @XmlElement(name = "Sohopdong")
    protected String sohopdong;
    @XmlElement(name = "Ttpheduyet", required = true, type = Short.class, nillable = true)
    protected Short ttpheduyet;
    @XmlElement(name = "Lydo")
    protected String lydo;
    @XmlElement(name = "Trangthai", required = true, type = Short.class, nillable = true)
    protected Short trangthai;
    @XmlElement(name = "Tuchu", required = true, type = Short.class, nillable = true)
    protected Short tuchu;
    @XmlElement(name = "HangdichvuTd", required = true, type = Short.class, nillable = true)
    protected Short hangdichvuTd;
    @XmlElement(name = "HangthuocTd", required = true, type = Short.class, nillable = true)
    protected Short hangthuocTd;
    @XmlElement(name = "HangvattuTd", required = true, type = Short.class, nillable = true)
    protected Short hangvattuTd;
    @XmlElement(name = "Byt", required = true, type = Short.class, nillable = true)
    protected Short byt;
    @XmlElement(name = "SoGphd")
    protected String soGphd;
    @XmlElement(name = "Kcb", required = true, type = Short.class, nillable = true)
    protected Short kcb;
    @XmlElement(name = "Ngaycapma", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String ngaycapma;
    @XmlElement(name = "Ngaydieuchinh", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String ngaydieuchinh;
    @XmlElement(name = "LoaiDonvichuquan", required = true, type = Short.class, nillable = true)
    protected Short loaiDonvichuquan;
    @XmlElement(name = "ChuaPd43", required = true, type = Short.class, nillable = true)
    protected Short chuaPd43;
    @XmlElement(name = "Ngaykyhopdonglandau", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected String ngaykyhopdonglandau;
    @XmlElement(name = "GhichuTinhthaydoi")
    protected String ghichuTinhthaydoi;
    @XmlElement(name = "SlTheBhDkbd", required = true, type = Long.class, nillable = true)
    protected Long slTheBhDkbd;
    @XmlElement(name = "SlTheBhDaCap", required = true, type = Long.class, nillable = true)
    protected Long slTheBhDaCap;
    @XmlElement(name = "LoaiCk", required = true, type = Short.class, nillable = true)
    protected Short loaiCk;

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the mabhyt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMabhyt() {
        return mabhyt;
    }

    /**
     * Sets the value of the mabhyt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMabhyt(String value) {
        this.mabhyt = value;
    }

    /**
     * Gets the value of the donvihanhchinhId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDonvihanhchinhId() {
        return donvihanhchinhId;
    }

    /**
     * Sets the value of the donvihanhchinhId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDonvihanhchinhId(Integer value) {
        this.donvihanhchinhId = value;
    }

    /**
     * Gets the value of the diachi property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * Sets the value of the diachi property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDiachi(String value) {
        this.diachi = value;
    }

    /**
     * Gets the value of the hangbenhvien property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHangbenhvien() {
        return hangbenhvien;
    }

    /**
     * Sets the value of the hangbenhvien property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHangbenhvien(Short value) {
        this.hangbenhvien = value;
    }

    /**
     * Gets the value of the tuyencmkt property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getTuyencmkt() {
        return tuyencmkt;
    }

    /**
     * Sets the value of the tuyencmkt property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setTuyencmkt(Short value) {
        this.tuyencmkt = value;
    }

    /**
     * Gets the value of the hieuluc property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHieuluc() {
        return hieuluc;
    }

    /**
     * Sets the value of the hieuluc property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHieuluc(Short value) {
        this.hieuluc = value;
    }

    /**
     * Gets the value of the mieuta property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMieuta() {
        return mieuta;
    }

    /**
     * Sets the value of the mieuta property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMieuta(String value) {
        this.mieuta = value;
    }

    /**
     * Gets the value of the stt property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStt() {
        return stt;
    }

    /**
     * Sets the value of the stt property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStt(Integer value) {
        this.stt = value;
    }

    /**
     * Gets the value of the tinhthanhId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTinhthanhId() {
        return tinhthanhId;
    }

    /**
     * Sets the value of the tinhthanhId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTinhthanhId(Integer value) {
        this.tinhthanhId = value;
    }

    /**
     * Gets the value of the quanhuyenId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getQuanhuyenId() {
        return quanhuyenId;
    }

    /**
     * Sets the value of the quanhuyenId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setQuanhuyenId(Integer value) {
        this.quanhuyenId = value;
    }

    /**
     * Gets the value of the matinhthanh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMatinhthanh() {
        return matinhthanh;
    }

    /**
     * Sets the value of the matinhthanh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMatinhthanh(String value) {
        this.matinhthanh = value;
    }

    /**
     * Gets the value of the maquanhuyen property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaquanhuyen() {
        return maquanhuyen;
    }

    /**
     * Sets the value of the maquanhuyen property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaquanhuyen(String value) {
        this.maquanhuyen = value;
    }

    /**
     * Gets the value of the donviId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDonviId() {
        return donviId;
    }

    /**
     * Sets the value of the donviId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDonviId(Integer value) {
        this.donviId = value;
    }

    /**
     * Gets the value of the macosokcbcha property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMacosokcbcha() {
        return macosokcbcha;
    }

    /**
     * Sets the value of the macosokcbcha property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMacosokcbcha(String value) {
        this.macosokcbcha = value;
    }

    /**
     * Gets the value of the cosokcbchaId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getCosokcbchaId() {
        return cosokcbchaId;
    }

    /**
     * Sets the value of the cosokcbchaId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCosokcbchaId(Integer value) {
        this.cosokcbchaId = value;
    }

    /**
     * Gets the value of the madonvi property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMadonvi() {
        return madonvi;
    }

    /**
     * Sets the value of the madonvi property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMadonvi(String value) {
        this.madonvi = value;
    }

    /**
     * Gets the value of the thannhantao property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getThannhantao() {
        return thannhantao;
    }

    /**
     * Sets the value of the thannhantao property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setThannhantao(Short value) {
        this.thannhantao = value;
    }

    /**
     * Gets the value of the thaighep property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getThaighep() {
        return thaighep;
    }

    /**
     * Sets the value of the thaighep property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setThaighep(Short value) {
        this.thaighep = value;
    }

    /**
     * Gets the value of the loaihopdong property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getLoaihopdong() {
        return loaihopdong;
    }

    /**
     * Sets the value of the loaihopdong property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setLoaihopdong(Short value) {
        this.loaihopdong = value;
    }

    /**
     * Gets the value of the dkkcbbd property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getDkkcbbd() {
        return dkkcbbd;
    }

    /**
     * Sets the value of the dkkcbbd property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setDkkcbbd(Short value) {
        this.dkkcbbd = value;
    }

    /**
     * Gets the value of the hinhthucTT property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHinhthucTT() {
        return hinhthucTT;
    }

    /**
     * Sets the value of the hinhthucTT property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHinhthucTT(Short value) {
        this.hinhthucTT = value;
    }

    /**
     * Gets the value of the loaibenhvien property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getLoaibenhvien() {
        return loaibenhvien;
    }

    /**
     * Sets the value of the loaibenhvien property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setLoaibenhvien(Short value) {
        this.loaibenhvien = value;
    }

    /**
     * Gets the value of the khamtreem property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKhamtreem() {
        return khamtreem;
    }

    /**
     * Sets the value of the khamtreem property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKhamtreem(Short value) {
        this.khamtreem = value;
    }

    /**
     * Gets the value of the ngayngunghd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgayngunghd() {
        return ngayngunghd;
    }

    /**
     * Sets the value of the ngayngunghd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgayngunghd(String value) {
        this.ngayngunghd = value;
    }

    /**
     * Gets the value of the mataichinh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMataichinh() {
        return mataichinh;
    }

    /**
     * Sets the value of the mataichinh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMataichinh(String value) {
        this.mataichinh = value;
    }

    /**
     * Gets the value of the pkdakhoa property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getPkdakhoa() {
        return pkdakhoa;
    }

    /**
     * Sets the value of the pkdakhoa property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setPkdakhoa(Short value) {
        this.pkdakhoa = value;
    }

    /**
     * Gets the value of the ungthu property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getUngthu() {
        return ungthu;
    }

    /**
     * Sets the value of the ungthu property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setUngthu(Short value) {
        this.ungthu = value;
    }

    /**
     * Gets the value of the viemgan property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getViemgan() {
        return viemgan;
    }

    /**
     * Sets the value of the viemgan property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setViemgan(Short value) {
        this.viemgan = value;
    }

    /**
     * Gets the value of the tebaomautd property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getTebaomautd() {
        return tebaomautd;
    }

    /**
     * Sets the value of the tebaomautd property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setTebaomautd(Short value) {
        this.tebaomautd = value;
    }

    /**
     * Gets the value of the khamt7 property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKhamt7() {
        return khamt7;
    }

    /**
     * Sets the value of the khamt7 property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKhamt7(Short value) {
        this.khamt7 = value;
    }

    /**
     * Gets the value of the khamcn property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKhamcn() {
        return khamcn;
    }

    /**
     * Sets the value of the khamcn property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKhamcn(Short value) {
        this.khamcn = value;
    }

    /**
     * Gets the value of the khamngayle property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKhamngayle() {
        return khamngayle;
    }

    /**
     * Sets the value of the khamngayle property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKhamngayle(Short value) {
        this.khamngayle = value;
    }

    /**
     * Gets the value of the masothue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMasothue() {
        return masothue;
    }

    /**
     * Sets the value of the masothue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMasothue(String value) {
        this.masothue = value;
    }

    /**
     * Gets the value of the dienthoai property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDienthoai() {
        return dienthoai;
    }

    /**
     * Sets the value of the dienthoai property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDienthoai(String value) {
        this.dienthoai = value;
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
     * Gets the value of the coquanchuquan property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCoquanchuquan() {
        return coquanchuquan;
    }

    /**
     * Sets the value of the coquanchuquan property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoquanchuquan(String value) {
        this.coquanchuquan = value;
    }

    /**
     * Gets the value of the ngaykyhopdong property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgaykyhopdong() {
        return ngaykyhopdong;
    }

    /**
     * Sets the value of the ngaykyhopdong property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgaykyhopdong(String value) {
        this.ngaykyhopdong = value;
    }

    /**
     * Gets the value of the kieubv property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKieubv() {
        return kieubv;
    }

    /**
     * Sets the value of the kieubv property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKieubv(Short value) {
        this.kieubv = value;
    }

    /**
     * Gets the value of the capcskcbMin property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getCapcskcbMin() {
        return capcskcbMin;
    }

    /**
     * Sets the value of the capcskcbMin property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setCapcskcbMin(Short value) {
        this.capcskcbMin = value;
    }

    /**
     * Gets the value of the sohopdong property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSohopdong() {
        return sohopdong;
    }

    /**
     * Sets the value of the sohopdong property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSohopdong(String value) {
        this.sohopdong = value;
    }

    /**
     * Gets the value of the ttpheduyet property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getTtpheduyet() {
        return ttpheduyet;
    }

    /**
     * Sets the value of the ttpheduyet property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setTtpheduyet(Short value) {
        this.ttpheduyet = value;
    }

    /**
     * Gets the value of the lydo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLydo() {
        return lydo;
    }

    /**
     * Sets the value of the lydo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLydo(String value) {
        this.lydo = value;
    }

    /**
     * Gets the value of the trangthai property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getTrangthai() {
        return trangthai;
    }

    /**
     * Sets the value of the trangthai property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setTrangthai(Short value) {
        this.trangthai = value;
    }

    /**
     * Gets the value of the tuchu property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getTuchu() {
        return tuchu;
    }

    /**
     * Sets the value of the tuchu property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setTuchu(Short value) {
        this.tuchu = value;
    }

    /**
     * Gets the value of the hangdichvuTd property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHangdichvuTd() {
        return hangdichvuTd;
    }

    /**
     * Sets the value of the hangdichvuTd property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHangdichvuTd(Short value) {
        this.hangdichvuTd = value;
    }

    /**
     * Gets the value of the hangthuocTd property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHangthuocTd() {
        return hangthuocTd;
    }

    /**
     * Sets the value of the hangthuocTd property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHangthuocTd(Short value) {
        this.hangthuocTd = value;
    }

    /**
     * Gets the value of the hangvattuTd property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getHangvattuTd() {
        return hangvattuTd;
    }

    /**
     * Sets the value of the hangvattuTd property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setHangvattuTd(Short value) {
        this.hangvattuTd = value;
    }

    /**
     * Gets the value of the byt property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getByt() {
        return byt;
    }

    /**
     * Sets the value of the byt property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setByt(Short value) {
        this.byt = value;
    }

    /**
     * Gets the value of the soGphd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSoGphd() {
        return soGphd;
    }

    /**
     * Sets the value of the soGphd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSoGphd(String value) {
        this.soGphd = value;
    }

    /**
     * Gets the value of the kcb property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getKcb() {
        return kcb;
    }

    /**
     * Sets the value of the kcb property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setKcb(Short value) {
        this.kcb = value;
    }

    /**
     * Gets the value of the ngaycapma property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgaycapma() {
        return ngaycapma;
    }

    /**
     * Sets the value of the ngaycapma property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgaycapma(String value) {
        this.ngaycapma = value;
    }

    /**
     * Gets the value of the ngaydieuchinh property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgaydieuchinh() {
        return ngaydieuchinh;
    }

    /**
     * Sets the value of the ngaydieuchinh property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgaydieuchinh(String value) {
        this.ngaydieuchinh = value;
    }

    /**
     * Gets the value of the loaiDonvichuquan property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getLoaiDonvichuquan() {
        return loaiDonvichuquan;
    }

    /**
     * Sets the value of the loaiDonvichuquan property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setLoaiDonvichuquan(Short value) {
        this.loaiDonvichuquan = value;
    }

    /**
     * Gets the value of the chuaPd43 property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getChuaPd43() {
        return chuaPd43;
    }

    /**
     * Sets the value of the chuaPd43 property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setChuaPd43(Short value) {
        this.chuaPd43 = value;
    }

    /**
     * Gets the value of the ngaykyhopdonglandau property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNgaykyhopdonglandau() {
        return ngaykyhopdonglandau;
    }

    /**
     * Sets the value of the ngaykyhopdonglandau property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNgaykyhopdonglandau(String value) {
        this.ngaykyhopdonglandau = value;
    }

    /**
     * Gets the value of the ghichuTinhthaydoi property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGhichuTinhthaydoi() {
        return ghichuTinhthaydoi;
    }

    /**
     * Sets the value of the ghichuTinhthaydoi property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGhichuTinhthaydoi(String value) {
        this.ghichuTinhthaydoi = value;
    }

    /**
     * Gets the value of the slTheBhDkbd property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSlTheBhDkbd() {
        return slTheBhDkbd;
    }

    /**
     * Sets the value of the slTheBhDkbd property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSlTheBhDkbd(Long value) {
        this.slTheBhDkbd = value;
    }

    /**
     * Gets the value of the slTheBhDaCap property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSlTheBhDaCap() {
        return slTheBhDaCap;
    }

    /**
     * Sets the value of the slTheBhDaCap property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSlTheBhDaCap(Long value) {
        this.slTheBhDaCap = value;
    }

    /**
     * Gets the value of the loaiCk property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getLoaiCk() {
        return loaiCk;
    }

    /**
     * Sets the value of the loaiCk property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setLoaiCk(Short value) {
        this.loaiCk = value;
    }

    /**
     * ID                  NOT NULL NUMBER(9)
     * TEN                 NOT NULL NVARCHAR2(255)
     * MA                           VARCHAR2(50 CHAR)
     * MABHYT                       VARCHAR2(50 CHAR)
     * DONVIHANHCHINH_ID            NUMBER(9)
     * DIACHI                       VARCHAR2(255 CHAR)
     * HANGBENHVIEN                 NUMBER(3)
     * TUYENCMKT                    NUMBER(3)
     * HIEULUC                      NUMBER(1)
     * MIEUTA                       NVARCHAR2(2000)
     * STT                          NUMBER(8)
     * TINHTHANH_ID                 NUMBER(9)
     * QUANHUYEN_ID                 NUMBER(9)
     * MATINHTHANH                  VARCHAR2(50 CHAR)
     * MAQUANHUYEN                  VARCHAR2(50 CHAR)
     * DONVI_ID                     NUMBER(9)
     * MACOSOKCBCHA                 VARCHAR2(50 CHAR)
     * COSOKCBCHA_ID                NUMBER(9)
     * MADONVI                      VARCHAR2(50 CHAR)
     * THANNHANTAO                  NUMBER(1)
     * THAIGHEP                     NUMBER(1)
     * LOAIHOPDONG                  NUMBER(3)
     * DKKCBBD                      NUMBER(3)
     * HINHTHUCTT                   NUMBER(3)
     * LOAIBENHVIEN                 NUMBER(3)
     * KHAMTREEM                    NUMBER(1)
     * NGAYNGUNGHD                  DATE
     * MATAICHINH                   VARCHAR2(50 CHAR)
     * PKDAKHOA                     NUMBER(1)
     * UNGTHU                       NUMBER(1)
     * VIEMGAN                      NUMBER(1)
     * TEBAOMAUTD                   NUMBER(1)
     * KHAMT7                       NUMBER(1)
     * KHAMCN                       NUMBER(1)
     * KHAMNGAYLE                   NUMBER(1)
     * MASOTHUE                     VARCHAR2(15 CHAR)
     * DIENTHOAI                    VARCHAR2(15 CHAR)
     * EMAIL                        VARCHAR2(255 CHAR)
     * FAX                          VARCHAR2(15 CHAR)
     * COQUANCHUQUAN                VARCHAR2(255 CHAR)
     * NGAYKYHOPDONG                DATE
     * KIEUBV                       NUMBER(3)
     * CAPCSKCB_MIN                 NUMBER(3)
     * TTPHEDUYET                   NUMBER(3)
     * SOHOPDONG                    NVARCHAR2(25)
     * LYDO                         NVARCHAR2(1000)
     * TRANGTHAI                    NUMBER(3)
     * TUCHU                        NUMBER(1)
     * HANGDICHVU_TD                NUMBER(3)
     * HANGTHUOC_TD                 NUMBER(3)
     * HANGVATTU_TD                 NUMBER(3)
     * BYT                          NUMBER(1)
     * SO_GPHD                      NVARCHAR2(255)
     * KCB                          NUMBER(1)
     * NGAYCAPMA                    DATE
     * NGAYDIEUCHINH                DATE
     * LOAI_DONVICHUQUAN            NUMBER(1)
     * CHUA_PD43                    NUMBER(1)
     * NGAYKYHOPDONGLANDAU          DATE
     * GHICHU_TINHTHAYDOI           VARCHAR2(2000 CHAR)
     * SL_THE_BH_DKBD               NUMBER(9)
     * SL_THE_BH_DA_CAP             NUMBER(9)
     * LOAI_CK                      NUMBER(9)
     *
     * @return
     */
    public Object[] toObjects() {
        Object[] objects = new Object[63];
        objects[0] = id;               //ID                  NOT NULL NUMBER(9)
        objects[1] = ten;              //TEN                 NOT NULL NVARCHAR2(255)
        objects[2] = ma;               //MA                           VARCHAR2(50 CHAR)
        objects[3] = mabhyt;           //MABHYT                       VARCHAR2(50 CHAR)
        objects[4] = donvihanhchinhId; //DONVIHANHCHINH_ID            NUMBER(9)
        objects[5] = diachi;           //DIACHI                       VARCHAR2(255 CHAR)
        objects[6] = hangbenhvien;     //HANGBENHVIEN                 NUMBER(3)
        objects[7] = tuyencmkt;        //TUYENCMKT                    NUMBER(3)
        objects[8] = hieuluc;          //HIEULUC                      NUMBER(1)
        objects[9] = mieuta;           //MIEUTA                       NVARCHAR2(2000)
        objects[10] = stt;             //STT                          NUMBER(8)
        objects[11] = tinhthanhId;     //
        objects[12] = quanhuyenId;     //QUANHUYEN_ID                 NUMBER(9)
        objects[13] = matinhthanh;     //MATINHTHANH                  VARCHAR2(50 CHAR)
        objects[14] = maquanhuyen;     //MAQUANHUYEN                  VARCHAR2(50 CHAR)
        objects[15] = donviId;         //DONVI_ID                     NUMBER(9)
        objects[16] = macosokcbcha;    //MACOSOKCBCHA                 VARCHAR2(50 CHAR)
        objects[17] = cosokcbchaId;    //COSOKCBCHA_ID                NUMBER(9)
        objects[18] = madonvi;              //MADONVI                      VARCHAR2(50 CHAR)
        objects[19] = thannhantao;              //THANNHANTAO                  NUMBER(1)
        objects[20] = thaighep;              //THAIGHEP                     NUMBER(1)
        objects[21] = loaihopdong;              //LOAIHOPDONG                  NUMBER(3)
        objects[22] = dkkcbbd;              //DKKCBBD                      NUMBER(3)
        objects[23] = hinhthucTT;              //HINHTHUCTT                   NUMBER(3)
        objects[24] = loaibenhvien;              //LOAIBENHVIEN                 NUMBER(3)
        objects[25] = khamtreem;              //KHAMTREEM                    NUMBER(1)
        objects[26] = convertStringToTimestamp(ngayngunghd, yyyyMMdd_T_HHmmssSSS);              //NGAYNGUNGHD                  DATE
        objects[27] = mataichinh;              //MATAICHINH                   VARCHAR2(50 CHAR)
        objects[28] = pkdakhoa;              //PKDAKHOA                     NUMBER(1)
        objects[29] = ungthu;              //UNGTHU                       NUMBER(1)
        objects[30] = viemgan;              //VIEMGAN                      NUMBER(1)
        objects[31] = tebaomautd;              //TEBAOMAUTD                   NUMBER(1)
        objects[32] = khamt7;              //KHAMT7                       NUMBER(1)
        objects[33] = khamcn;              //KHAMCN                       NUMBER(1)
        objects[34] = khamngayle;              //KHAMNGAYLE                   NUMBER(1)
        objects[35] = masothue;              //MASOTHUE                     VARCHAR2(15 CHAR)
        objects[36] = dienthoai;              //DIENTHOAI                    VARCHAR2(15 CHAR)
        objects[37] = email;              //EMAIL                        VARCHAR2(255 CHAR)
        objects[38] = fax;              //FAX                          VARCHAR2(15 CHAR)
        objects[39] = coquanchuquan;              //COQUANCHUQUAN                VARCHAR2(255 CHAR)
        objects[40] = convertStringToTimestamp(ngaykyhopdong, yyyyMMdd_T_HHmmssSSS);              //NGAYKYHOPDONG                DATE
        objects[41] = kieubv;              //KIEUBV                       NUMBER(3)
        objects[42] = capcskcbMin;              //CAPCSKCB_MIN                 NUMBER(3)
        objects[43] = ttpheduyet;              //TTPHEDUYET                   NUMBER(3)
        objects[44] = sohopdong;              //SOHOPDONG                    NVARCHAR2(25)
        objects[45] = lydo;              //LYDO                         NVARCHAR2(1000)
        objects[46] = trangthai;              //TRANGTHAI                    NUMBER(3)
        objects[47] = tuchu;              //TUCHU                        NUMBER(1)
        objects[48] = hangdichvuTd;              //HANGDICHVU_TD                NUMBER(3)
        objects[49] = hangthuocTd;              //HANGTHUOC_TD                 NUMBER(3)
        objects[50] = hangvattuTd;              //HANGVATTU_TD                 NUMBER(3)
        objects[51] = byt;              //BYT                          NUMBER(1)
        objects[52] = soGphd;              //SO_GPHD                      NVARCHAR2(255)
        objects[53] = kcb;              //KCB                          NUMBER(1)
        objects[54] = convertStringToTimestamp(ngaycapma, yyyyMMdd_T_HHmmssSSS);              //NGAYCAPMA                    DATE
        objects[55] = convertStringToTimestamp(ngaydieuchinh, yyyyMMdd_T_HHmmssSSS);              //NGAYDIEUCHINH                DATE
        objects[56] = loaiDonvichuquan;              //LOAI_DONVICHUQUAN            NUMBER(1)
        objects[57] = chuaPd43;              //CHUA_PD43                    NUMBER(1)
        objects[58] = convertStringToTimestamp(ngaykyhopdonglandau, yyyyMMdd_T_HHmmssSSS);              //NGAYKYHOPDONGLANDAU          DATE
        objects[59] = ghichuTinhthaydoi;              //GHICHU_TINHTHAYDOI           VARCHAR2(2000 CHAR)
        objects[60] = slTheBhDkbd;              //SL_THE_BH_DKBD               NUMBER(9)
        objects[61] = slTheBhDaCap;              //SL_THE_BH_DA_CAP             NUMBER(9)
        objects[62] = loaiCk;              //LOAI_CK                      NUMBER(9)
        return objects;
    }

    public String toString() {
        String str = "";
        str += ",id=" + id;
        str += ",ten=" + ten;
        str += ",ma=" + ma;
        str += ",mabhyt=" + mabhyt;
        str += ",donvihanhchinhId=" + donvihanhchinhId;
        str += ",diachi=" + diachi;
        str += ",hangbenhvien=" + hangbenhvien;
        str += ",tuyencmkt=" + tuyencmkt;
        str += ",hieuluc=" + hieuluc;
        str += ",mieuta=" + mieuta;
        str += ",stt=" + stt;
        str += ",tinhthanhId=" + tinhthanhId;
        str += ",quanhuyenId=" + quanhuyenId;
        str += ",matinhthanh=" + matinhthanh;
        str += ",maquanhuyen=" + maquanhuyen;
        str += ",donviId=" + donviId;
        str += ",macosokcbcha=" + macosokcbcha;
        str += ",cosokcbchaId=" + cosokcbchaId;
        str += ",madonvi=" + madonvi;
        str += ",thannhantao=" + thannhantao;
        str += ",thaighep=" + thaighep;
        str += ",loaihopdong=" + loaihopdong;
        str += ",dkkcbbd=" + dkkcbbd;
        str += ",hinhthucTT=" + hinhthucTT;
        str += ",loaibenhvien=" + loaibenhvien;
        str += ",khamtreem=" + khamtreem;
        str += ",ngayngunghd=" + ngayngunghd;
        str += ",mataichinh=" + mataichinh;
        str += ",pkdakhoa=" + pkdakhoa;
        str += ",ungthu=" + ungthu;
        str += ",viemgan=" + viemgan;
        str += ",tebaomautd=" + tebaomautd;
        str += ",khamt7=" + khamt7;
        str += ",khamcn=" + khamcn;
        str += ",khamngayle=" + khamngayle;
        str += ",masothue=" + masothue;
        str += ",dienthoai=" + dienthoai;
        str += ",email=" + email;
        str += ",fax=" + fax;
        str += ",coquanchuquan=" + coquanchuquan;
        str += ",ngaykyhopdong=" + ngaykyhopdong;
        str += ",kieubv=" + kieubv;
        str += ",capcskcbMin=" + capcskcbMin;
        str += ",sohopdong=" + sohopdong;
        str += ",ttpheduyet=" + ttpheduyet;
        str += ",lydo=" + lydo;
        str += ",trangthai=" + trangthai;
        str += ",tuchu=" + tuchu;
        str += ",hangdichvuTd=" + hangdichvuTd;
        str += ",hangthuocTd=" + hangthuocTd;
        str += ",hangvattuTd=" + hangvattuTd;
        str += ",byt=" + byt;
        str += ",soGphd=" + soGphd;
        str += ",kcb=" + kcb;
        str += ",ngaycapma=" + ngaycapma;
        str += ",ngaydieuchinh=" + ngaydieuchinh;
        str += ",loaiDonvichuquan=" + loaiDonvichuquan;
        str += ",chuaPd43=" + chuaPd43;
        str += ",ngaykyhopdonglandau=" + ngaykyhopdonglandau;
        str += ",ghichuTinhthaydoi=" + ghichuTinhthaydoi;
        str += ",slTheBhDkbd=" + slTheBhDkbd;
        str += ",slTheBhDaCap=" + slTheBhDaCap;
        str += ",loaiCk=" + loaiCk;
        return str;
    }
}
