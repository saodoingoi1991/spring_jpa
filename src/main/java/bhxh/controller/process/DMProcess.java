package bhxh.controller.process;

import bhxh.data.model.*;
import bhxh.soap.entity.*;
import bhxh.utils.Config;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static bhxh.soap.CallSoapService.callSoapWebService;

public class DMProcess {
    private static final Logger logger = Logger.getLogger(DMProcess.class);

    public static List<CommonDmKhoiKcb> processDmKhoiKCB() {
        ArrayList<String> arrayList = null;
        List<CommonDmKhoiKcb> lstObject = new ArrayList<>();
        try {
            arrayList = new ArrayList<>();
            arrayList.add("");
            SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_KHOI_KCB_SOA, arrayList);
            if (soapMessage != null) {
                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmKhoiKcbSOAResponse.class).createUnmarshaller();
                GetDmKhoiKcbSOAResponse lstKhoiKCB = (GetDmKhoiKcbSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
                for (int j = 0; lstKhoiKCB != null && j < lstKhoiKCB.getDmKhoiKcbSOAResult().size(); j++) {
                    lstObject.add(lstKhoiKCB.getDmKhoiKcbSOAResult().get(j).toEntity());
                }
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstObject;
    }

    public static GetDmBhxhSOAResponse processDmBHXH() {
        GetDmBhxhSOAResponse getDmBhxhSOAResponse = null;
        try {
            logger.info((new Date()).toString() + "Start function getdate : ");
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList = new ArrayList<>();
            arrayList.add("");
            SOAPMessage soapMessageBHXH = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_BHXH_SOA, arrayList);

            if (soapMessageBHXH != null) {
                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmBhxhSOAResponse.class).createUnmarshaller();
                getDmBhxhSOAResponse = (GetDmBhxhSOAResponse) unmarshaller.unmarshal(soapMessageBHXH.getSOAPBody().extractContentAsDocument());
                logger.info(new Date() + " Danh sach ID tinh = " + getDmBhxhSOAResponse.getDmBhxhSOAResult().size());
            }
            return getDmBhxhSOAResponse;
        } catch (JAXBException e) {
            logger.error(" JAXBException - " + e);
        } catch (Exception ex) {
            logger.error(" Exception - " + ex);
        }
        return getDmBhxhSOAResponse;
    }


    public static List<CommonDmDonVi> processDmDonVi(String month, GetDmBhxhSOAResponse getDmBhxhSOAResponse) {
        List<CommonDmDonVi> listDonVi = new ArrayList<>();
        try {
            logger.info((new Date()).toString() + "Start function getdate : ");
            ArrayList<String> arrayList = new ArrayList<>();
            if (getDmBhxhSOAResponse != null) {
                int size = getDmBhxhSOAResponse.getDmBhxhSOAResult().size();
//                size = 100;
                logger.info("Sync Don Vi month =" + month);
                for (int i = 0; i < size; i++) {
                    arrayList = new ArrayList<>();
                    arrayList.add("" + getDmBhxhSOAResponse.getDmBhxhSOAResult().get(i).getId());
                    arrayList.add(month);
                    SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_DON_VI_SOA, arrayList);
                    if (soapMessage != null) {
                        Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmDonViSOAResponse.class).createUnmarshaller();
                        GetDmDonViSOAResponse dmDonViSOAResponse = (GetDmDonViSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
                        for (int j = 0; dmDonViSOAResponse != null && j < dmDonViSOAResponse.getDmDonViSOAResult().size(); j++) {
                            listDonVi.add(dmDonViSOAResponse.getDmDonViSOAResult().get(j).toEntity());
                        }
                    }
                }
                logger.info("--> listDonVi size = " + listDonVi.size());
            }
        } catch (JAXBException e) {
            logger.error(" JAXBException - " + e);
        } catch (Exception ex) {
            logger.error(" Exception - " + ex);
        }
        return listDonVi;
    }

    public static List<CommonDmPhongBan> processDmPhongBan() {
        boolean temp = false;
        ArrayList<String> arrayList = null;
        LinkedList<CommonDmPhongBan> lstObject = new LinkedList<>();
        try {
            arrayList = new ArrayList<>();
            arrayList.add("");
            SOAPMessage soapMessage = callSoapWebService(Config.SERVICE_QLNS_URL, Config.SOAPACTION_DM_PHONG_BAN_SOA, arrayList);
            if (soapMessage != null) {
                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmDonViResponse.class).createUnmarshaller();
                GetDmDonViResponse phongBan = (GetDmDonViResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
                for (int j = 0; phongBan != null && j < phongBan.getGetDmDonViResult().getDMDONVI().size(); j++) {
                    lstObject.add(phongBan.getGetDmDonViResult().getDMDONVI().get(j).toEntity());
                }
            }
            logger.info("========================= END DATA ============");
        } catch (SOAPException e) {
            logger.error("SOAPException:" + e);
        } catch (JAXBException e) {
            logger.error("JAXBException:" + e);
        } catch (Exception e) {
            logger.error("Exception:" + e);
        }
        return lstObject;
    }

    public static List<CommonDmNghiepVu> processDmNghiepVu() {
        boolean temp = false;
        ArrayList<String> arrayList = null;
        LinkedList<CommonDmNghiepVu> lstObject = new LinkedList<>();
        try {
            arrayList = new ArrayList<>();
            arrayList.add("");
            SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_NGHIEP_VU_SOA, arrayList);
            if (soapMessage != null) {
                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmNghiepVuSOAResponse.class).createUnmarshaller();
                GetDmNghiepVuSOAResponse nghiepvu = (GetDmNghiepVuSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
                for (int j = 0; nghiepvu != null && j < nghiepvu.getDmNghiepVuSOAResult().size(); j++) {
                    lstObject.add(nghiepvu.getDmNghiepVuSOAResult().get(j).toEntity());
                }
            }
        } catch (SOAPException e) {
            logger.error("SOAPException:" + e);
        } catch (JAXBException e) {
            logger.error("JAXBException:" + e);
        } catch (Exception e) {
            logger.error("Exception:" + e);
        }
        return lstObject;
    }

    public static List<CommonDmKhoiQuanLy> processDmKhoiQL() {
        ArrayList<String> arrayList = null;
        LinkedList<CommonDmKhoiQuanLy> lstObject = new LinkedList<>();
        try {
            arrayList = new ArrayList<>();
            arrayList.add("");
            SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_KHOI_QL_SOA, arrayList);
            if (soapMessage != null) {
                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmKhoiQlSOAResponse.class).createUnmarshaller();
                GetDmKhoiQlSOAResponse lstKhoiQL = (GetDmKhoiQlSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
                for (int j = 0; lstKhoiQL != null && j < lstKhoiQL.getDmKhoiQlSOAResult().size(); j++) {
                    lstObject.add(lstKhoiQL.getDmKhoiQlSOAResult().get(j).toEntity());
                }
            }
            logger.info("========================= END DATA ============");
        } catch (SOAPException e) {
            logger.error("SOAPException:" + e);
        } catch (JAXBException e) {
            logger.error("JAXBException:" + e);
        } catch (Exception e) {
            logger.error("Exception:" + e);
        }
        return lstObject;
    }


}
