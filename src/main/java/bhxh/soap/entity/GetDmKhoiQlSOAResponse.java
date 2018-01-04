
package bhxh.soap.entity;


import bhxh.utils.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmKhoiQlSOAResult" type="{http://teca.com/sms/generated/ws/vsa}dmKhoiQlSOAResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "getDmKhoiQlSOAResponse", namespace = Config.VSA_NAMESPACE)
public class GetDmKhoiQlSOAResponse {
    @XmlElement(name = "dmKhoiQlSOAResult")
    protected List<DmKhoiQlSOAResult> dmKhoiQlSOAResult;

    /**
     * Gets the value of the dmKhoiQlSOAResult property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmKhoiQlSOAResult property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmKhoiQlSOAResult().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmKhoiQlSOAResult }
     */
    public List<DmKhoiQlSOAResult> getDmKhoiQlSOAResult() {
        if (dmKhoiQlSOAResult == null) {
            dmKhoiQlSOAResult = new ArrayList<DmKhoiQlSOAResult>();
        }
        return this.dmKhoiQlSOAResult;
    }

    public void setDmKhoiQlSOAResult(List<DmKhoiQlSOAResult> dmKhoiQlSOAResult) {
        this.dmKhoiQlSOAResult = dmKhoiQlSOAResult;
    }
}
