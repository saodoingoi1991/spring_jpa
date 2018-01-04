
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class ArrayOfDmCosokcb {

    @XmlElement(name = "DmCosokcb")
    protected List<DmCosokcb> dmCosokcb;


    public List<DmCosokcb> getDmCosokcb() {
        if (dmCosokcb == null) {
            dmCosokcb = new ArrayList<DmCosokcb>();
        }
        return this.dmCosokcb;
    }

    public void setDmCosokcb(List<DmCosokcb> dmCosokcb) {
        this.dmCosokcb = dmCosokcb;
    }
}
