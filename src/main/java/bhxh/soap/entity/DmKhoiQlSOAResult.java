
package bhxh.soap.entity;

import bhxh.data.model.CommonDmKhoiQuanLy;
import bhxh.utils.JPAUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

import static bhxh.utils.DateUtils.convertStringToTimestamp;
import static bhxh.utils.DateUtils.yyyyMMdd_T_HHmmssSSS;


@XmlAccessorType(XmlAccessType.FIELD)

public class DmKhoiQlSOAResult {
    @XmlElement(name = "bhyt")
    protected Long bhyt;
    @XmlElement(name = "dmBhxhId")
    protected Long dmBhxhId;
    @XmlElement(name = "dmKhoiKcbId")
    protected Long dmKhoiKcbId;
    @XmlElement(name = "dmKhoiTkId")
    protected Long dmKhoiTkId;
    @XmlElement(name = "id")
    protected Long id;
    @XmlElement(name = "ma")
    protected String ma;
    @XmlElement(name = "status")
    protected Boolean status;
    @XmlElement(name = "ten")
    protected String ten;
    @XmlElement(name = "createdDate")
    protected String createdDate;
    @XmlElement(name = "updatedDate")
    protected String updatedDate;

    /**
     * Gets the value of the bhyt property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public Long getBhyt() {
        return bhyt;
    }

    /**
     * Sets the value of the bhyt property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setBhyt(Long value) {
        this.bhyt = value;
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
     * Gets the value of the dmKhoiTkId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmKhoiTkId() {
        return dmKhoiTkId;
    }

    /**
     * Sets the value of the dmKhoiTkId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmKhoiTkId(Long value) {
        this.dmKhoiTkId = value;
    }

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
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStatus(Boolean value) {
        this.status = value;
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
     * 1.ID             NOT NULL NUMBER(19)
     * 2.CREATED_DATE   NOT NULL DATE
     * 3.UPDATED_DATE            DATE
     * 4.MA             NOT NULL VARCHAR2(2 CHAR)
     * 5.TEN            NOT NULL VARCHAR2(150)
     * 6.DM_BHXH_ID     NOT NULL NUMBER(19)
     * 7.DM_KHOI_KCB_ID          NUMBER(19)
     * 8.DM_KHOI_TK_ID           NUMBER(19)
     * 9.STATUS                  NUMBER(1)
     * 10.BHYT                    NUMBER(1)
     *
     * @return
     */
    public Object[] toObject() {
        Object[] objects = new Object[10];
        objects[0] = id;
        objects[1] = convertStringToTimestamp(createdDate, yyyyMMdd_T_HHmmssSSS);
        objects[2] = convertStringToTimestamp(updatedDate, yyyyMMdd_T_HHmmssSSS);
        objects[3] = ma;
        objects[4] = ten;
        objects[5] = dmBhxhId;
        objects[6] = dmKhoiKcbId;
        objects[7] = dmKhoiTkId;
        objects[8] = status;
        objects[9] = bhyt;
        return objects;
    }

    public String toString() {
        String str = "";
        str += "bhyt=" + bhyt;
        str += ",dmBhxhId=" + dmBhxhId;
        str += ",dmKhoiKcbId=" + dmKhoiKcbId;
        str += ",dmKhoiTkId=" + dmKhoiTkId;
        str += ",id=" + id;
        str += ",ma=" + ma;
        str += ",status=" + status;
        str += ",ten=" + ten;
        str += ",createdDate=" + createdDate;
        str += ",updatedDate=" + updatedDate;
        return str;
    }

    public CommonDmKhoiQuanLy toEntity() {
        CommonDmKhoiQuanLy ql = new CommonDmKhoiQuanLy();
        ql.setId(id);
        ql.setCreatedDate(convertStringToTimestamp(createdDate, yyyyMMdd_T_HHmmssSSS));
        ql.setUpdatedDate(convertStringToTimestamp(updatedDate, yyyyMMdd_T_HHmmssSSS));
        ql.setMa(ma);
        ql.setTen(ten);
        ql.setDmBhxhId(dmBhxhId);
        ql.setDmKhoiKcbId(dmKhoiKcbId);
        ql.setDmKhoiTkId(dmKhoiTkId);
        ql.setStatus(JPAUtils.toLong(status));
        ql.setBhyt(bhyt);

        return ql;
    }
}
