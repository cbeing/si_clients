package com.esprit;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2014-05-10T02:40:18.619+01:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://service.esprit.com/", name = "EtudiantService")
@XmlSeeAlso({ObjectFactory.class})
public interface EtudiantService {

    @RequestWrapper(localName = "updateetudiant", targetNamespace = "http://service.esprit.com/", className = "com.esprit.Updateetudiant")
    @WebMethod
    @ResponseWrapper(localName = "updateetudiantResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.UpdateetudiantResponse")
    public void updateetudiant(
        @WebParam(name = "arg0", targetNamespace = "")
        com.esprit.Etudiant arg0
    );

    @RequestWrapper(localName = "addpresence", targetNamespace = "http://service.esprit.com/", className = "com.esprit.Addpresence")
    @WebMethod
    @ResponseWrapper(localName = "addpresenceResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.AddpresenceResponse")
    public void addpresence(
        @WebParam(name = "arg0", targetNamespace = "")
        com.esprit.Presence arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListPres", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetListPres")
    @WebMethod
    @ResponseWrapper(localName = "getListPresResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetListPresResponse")
    public java.util.List<com.esprit.Presence> getListPres(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @RequestWrapper(localName = "updatepresence", targetNamespace = "http://service.esprit.com/", className = "com.esprit.Updatepresence")
    @WebMethod
    @ResponseWrapper(localName = "updatepresenceResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.UpdatepresenceResponse")
    public void updatepresence(
        @WebParam(name = "arg0", targetNamespace = "")
        com.esprit.Presence arg0
    );

    @RequestWrapper(localName = "removepresence", targetNamespace = "http://service.esprit.com/", className = "com.esprit.Removepresence")
    @WebMethod
    @ResponseWrapper(localName = "removepresenceResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.RemovepresenceResponse")
    public void removepresence(
        @WebParam(name = "arg0", targetNamespace = "")
        com.esprit.Presence arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getEtudiantByid", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetEtudiantByid")
    @WebMethod
    @ResponseWrapper(localName = "getEtudiantByidResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetEtudiantByidResponse")
    public com.esprit.Etudiant getEtudiantByid(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getSeanceByDatetime", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetSeanceByDatetime")
    @WebMethod
    @ResponseWrapper(localName = "getSeanceByDatetimeResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetSeanceByDatetimeResponse")
    public java.util.List<com.esprit.Seance> getSeanceByDatetime(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllEtudiants", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetAllEtudiants")
    @WebMethod
    @ResponseWrapper(localName = "getAllEtudiantsResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.GetAllEtudiantsResponse")
    public java.util.List<com.esprit.Etudiant> getAllEtudiants();

    @RequestWrapper(localName = "addetudiant", targetNamespace = "http://service.esprit.com/", className = "com.esprit.Addetudiant")
    @WebMethod
    @ResponseWrapper(localName = "addetudiantResponse", targetNamespace = "http://service.esprit.com/", className = "com.esprit.AddetudiantResponse")
    public void addetudiant(
        @WebParam(name = "arg0", targetNamespace = "")
        com.esprit.Etudiant arg0
    );
}
