package bhxh.soap;


import bhxh.utils.Config;
import org.apache.log4j.Logger;

import javax.xml.soap.*;
import java.util.ArrayList;

public class CallSoapService {
    private static final Logger logger = Logger.getLogger(CallSoapService.class);

    public static SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction, ArrayList<String> arrayList) {
        SOAPMessage soapResponse = null;
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            // Send SOAP Message to SOAP Server
            soapResponse = soapConnection.call(createSOAPRequest(soapAction, arrayList), soapEndpointUrl);
            // Print the SOAP Response
//            System.out.println("Response SOAP Message:");
//            soapResponse.writeTo(System.out);
//            System.out.println();
            soapConnection.close();
            return soapResponse;
        } catch (Exception e) {
            logger.error("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n" + e);
        }
        return soapResponse;
    }

    private static SOAPMessage createSOAPRequest(String soapAction, ArrayList<String> listElem) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        switch (soapAction) {
            case Config.SOAPACTION_DM_BHXH_SOA:
                createSoapDmBHXH(soapMessage, listElem.get(0));
                break;
            case Config.SOAPACTION_DM_DON_VI_SOA:
                createSoapDmDonVi(soapMessage, listElem.get(0), listElem.get(1));
                break;
            case Config.SOAPACTION_DM_KHOI_KCB_SOA:
                createSoapDmKhoiKCB(soapMessage);
                break;
            case Config.SOAPACTION_DM_KHOI_QL_SOA:
                createSoapDmKhoiQL(soapMessage);
                break;
            case Config.SOAPACTION_DM_KHOI_TK_SOA:
                createSoapDmKhoiTK(soapMessage);
                break;
            case Config.SOAPACTION_DM_NGHIEP_VU_SOA:
                createSoapDmNghiepVu(soapMessage);
                break;
            case Config.SOAPACTION_DM_CSKCB_SOA:
                createSoapDmCSKCB(soapMessage, listElem.get(0));
                break;
            case Config.SOAPACTION_DM_PHONG_BAN_SOA:
                createSoapDmPhongBan(soapMessage, listElem.get(0));
                break;


        }

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
//        System.out.println("Request SOAP Message:");
//        soapMessage.writeTo(System.out);
//        System.out.println("\n");

        return soapMessage;
    }

    private static void createSoapDmDonVi(SOAPMessage soapMessage, String elem1, String elem2) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
        /**
         <soapenv:Envelope
         xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
         xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
         <soapenv:Header/>
         <soapenv:Body>
         <vsa:getDmDonViSOARequest>
         <vsa:dmBhxhId>261</vsa:dmBhxhId>
         <vsa:updatedDate>201704</vsa:updatedDate>
         </vsa:getDmDonViSOARequest>
         </soapenv:Body>
         </soapenv:Envelope>
         */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmDonViSOARequest", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("dmBhxhId", myNamespace);
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("updatedDate", myNamespace);
        soapBodyElem1.addTextNode(elem1);
        soapBodyElem2.addTextNode(elem2);
    }

    private static void createSoapDmBHXH(SOAPMessage soapMessage, String elem1) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
            <soapenv:Envelope
                xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
                   <soapenv:Header/>
                   <soapenv:Body>
                      <vsa:getDmDonViSOARequest>
                         <vsa:dmBhxhId>261</vsa:dmBhxhId>
                         <vsa:updatedDate>201704</vsa:updatedDate>
                      </vsa:getDmDonViSOARequest>
                   </soapenv:Body>
                </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmBhxhSOARequest", myNamespace);
//        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("matinh", myNamespace);
//        soapBodyElem1.addTextNode(elem1);
    }

    private static void createSoapDmKhoiKCB(SOAPMessage soapMessage) throws Exception {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
               <soapenv:Header/>
               <soapenv:Body>
                  <vsa:getDmKhoiKcbSOARequest/>
               </soapenv:Body>
            </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmKhoiKcbSOARequest", myNamespace);
    }

    private static void createSoapDmKhoiQL(SOAPMessage soapMessage) throws Exception {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
               <soapenv:Header/>
               <soapenv:Body>
                  <vsa:getDmKhoiQlSOARequest/>
               </soapenv:Body>
            </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmKhoiQlSOARequest", myNamespace);
    }

    private static void createSoapDmKhoiTK(SOAPMessage soapMessage) throws Exception {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
               <soapenv:Header/>
               <soapenv:Body>
                  <vsa:getDmKhoiTkSOARequest/>
               </soapenv:Body>
            </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmKhoiTkSOARequest", myNamespace);
    }

    private static void createSoapDmNghiepVu(SOAPMessage soapMessage) throws Exception {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "vsa";
        String myNamespaceURI = Config.VSA_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:vsa="http://teca.com/sms/generated/ws/vsa">
               <soapenv:Header/>
               <soapenv:Body>
                  <vsa:getDmNghiepVuSOARequest/>
               </soapenv:Body>
            </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getDmNghiepVuSOARequest", myNamespace);
    }

    private static void createSoapDmPhongBan(SOAPMessage soapMessage, String elem1) {
        try {
            SOAPPart soapPart = soapMessage.getSOAPPart();
            String myNamespace = "qlcb";
            String myNamespaceURI = Config.QLNS_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
            // SOAP Envelope
            SOAPEnvelope envelope = soapPart.getEnvelope();
            envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
           <soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:qlcb="http://qlcb.DmDonVi.soa/">
               <soap:Header/>
               <soap:Body>
                  <qlcb:GetDmDonVi/>
               </soap:Body>
            </soap:Envelope>
            */
            // SOAP Body
            SOAPBody soapBody = envelope.getBody();
            SOAPElement soapBodyElem = soapBody.addChildElement("GetDmDonVi", myNamespace);
        } catch (SOAPException e) {
            e.printStackTrace();
            logger.error("createSoapDmPhongBan - " + e);
        }
    }


    private static void createSoapDmCSKCB(SOAPMessage soapMessage, String elem1) throws Exception {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "tem";
        String myNamespaceURI = Config.DANHMUC_NAMESPACE;// "http://teca.com/sms/generated/ws/vsa";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
            /*
           <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tem="http://tempuri.org">
               <soapenv:Header/>
               <soapenv:Body>
                  <tem:get_list_cosokcb>
                     <tem:matinh></tem:matinh>
                  </tem:get_list_cosokcb>
               </soapenv:Body>
            </soapenv:Envelope>
            */
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("get_list_cosokcb", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("matinh", myNamespace);
        soapBodyElem1.addTextNode(elem1);
    }
}

