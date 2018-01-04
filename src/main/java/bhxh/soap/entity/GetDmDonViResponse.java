
package bhxh.soap.entity;


import bhxh.utils.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


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
 *         &lt;element name="GetDmDonViResult" type="{http://qlcb.DmDonVi.soa/}ArrayOfDM_DON_VI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "getDmDonViResult"
//})
@XmlRootElement(name = "GetDmDonViResponse", namespace = Config.QLNS_NAMESPACE)
public class GetDmDonViResponse {

    @XmlElement(name = "GetDmDonViResult")
    protected ArrayOfDMDONVI getDmDonViResult;

    /**
     * Gets the value of the getDmDonViResult property.
     *
     * @return possible object is
     * {@link ArrayOfDMDONVI }
     */
    public ArrayOfDMDONVI getGetDmDonViResult() {
        return getDmDonViResult;
    }

    /**
     * Sets the value of the getDmDonViResult property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDMDONVI }
     */
    public void setGetDmDonViResult(ArrayOfDMDONVI value) {
        this.getDmDonViResult = value;
    }

}
