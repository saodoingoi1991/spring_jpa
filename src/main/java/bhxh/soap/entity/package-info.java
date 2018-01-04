/**
 * Created by tungn on 8/3/2017.
 */
@XmlSchema(
        namespace = Config.VSA_NAMESPACE,
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "ns2", namespaceURI = Config.VSA_NAMESPACE)
        }
)
package bhxh.soap.entity;

import bhxh.utils.Config;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;