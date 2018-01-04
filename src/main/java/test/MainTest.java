package test;

import bhxh.soap.entity.GetDmKhoiKcbSOAResponse;
import bhxh.utils.Config;
import test.generic.Class1;
import test.generic.Class2;
import test.generic.GenericTest;
import test.generic.InterfaceClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.util.ArrayList;
import java.util.LinkedList;

import static bhxh.soap.CallSoapService.callSoapWebService;
import static bhxh.utils.Config.OBJECT_CM_DM_KHOI_KCB;
import static bhxh.utils.Config.TABLE_CM_DM_KHOI_KCB;


public class MainTest {
    public static void main(String[] args) {
//        verifyOrSyncDataDmKhoiKCB(1);
//        Boolean tem = Boolean.parseBoolean("");
//        if (tem) System.out.println("dfasdf");
        testGeneric();
    }

//    private static boolean verifyOrSyncDataDmKhoiKCB() {
//        boolean temp = false;
//        ArrayList<String> arrayList = null;
//        LinkedList<Object[]> lstObject = new LinkedList<>();
//        try {
//            arrayList = new ArrayList<>();
//            arrayList.add("");
//            SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_KHOI_KCB_SOA, arrayList);
//            if (soapMessage != null) {
//                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmKhoiKcbSOAResponse.class).createUnmarshaller();
//                GetDmKhoiKcbSOAResponse lstKhoiKCB = (GetDmKhoiKcbSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
//                for (int j = 0; lstKhoiKCB != null && j < lstKhoiKCB.getDmKhoiKcbSOAResult().size(); j++) {
//                    lstObject.add(lstKhoiKCB.getDmKhoiKcbSOAResult().get(j).toObject());
//                }
//            }
//        } catch (SOAPException e) {
//            e.printStackTrace();
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return temp;
//    }

    public static void testGeneric() {
        GenericTest<InterfaceClass> tem = new GenericTest<>();
        Class2 c = new Class2();
        c.setFullname("abc fullname");
        tem.setObject(c);
        testGeneric2(tem);
    }

    public static void testGeneric2(GenericTest<? extends InterfaceClass> tem) {
        Class c = tem.getObject().getClass();
        System.out.println(c.getName());
        Class2 c1 = convertInstanceOfObject(tem.getObject(), Class2.class);
        System.out.println(c1.getFullname());
    }

    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }
}
