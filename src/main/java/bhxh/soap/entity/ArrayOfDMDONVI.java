
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfDM_DON_VI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDM_DON_VI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DM_DON_VI" type="{http://qlcb.DmDonVi.soa/}DM_DON_VI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "ArrayOfDM_DON_VI", propOrder = {
//    "dmdonvi"
//})
public class ArrayOfDMDONVI {

    @XmlElement(name = "DM_DON_VI", nillable = true)
    protected List<DMDONVI> dmdonvi;

    /**
     * Gets the value of the dmdonvi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdonvi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDMDONVI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DMDONVI }
     * 
     * 
     */
    public List<DMDONVI> getDMDONVI() {
        if (dmdonvi == null) {
            dmdonvi = new ArrayList<DMDONVI>();
        }
        return this.dmdonvi;
    }

}
