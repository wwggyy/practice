package com.valor.practice.learn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sf.itdd.inf.itms.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateIterDefect_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "createIterDefect");
    private final static QName _CreateIterDefectResponse_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "createIterDefectResponse");
    private final static QName _GetIterDefectsBySyscodeAndVersion_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "getIterDefectsBySyscodeAndVersion");
    private final static QName _GetIterDefectsBySyscodeAndVersionResponse_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "getIterDefectsBySyscodeAndVersionResponse");
    private final static QName _GetLabels_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "getLabels");
    private final static QName _GetLabelsResponse_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "getLabelsResponse");
    private final static QName _QuerySysReqsBySystemCode_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "querySysReqsBySystemCode");
    private final static QName _QuerySysReqsBySystemCodeResponse_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "querySysReqsBySystemCodeResponse");
    private final static QName _UploadIssueAttachments_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "uploadIssueAttachments");
    private final static QName _UploadIssueAttachmentsResponse_QNAME = new QName("http://server.itms.inf.itdd.sf.com/", "uploadIssueAttachmentsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sf.itdd.inf.itms.server
     * 
     */
    public ObjectFactory() {
    }

//    /**
//     * Create an instance of {@link CreateIterDefect }
//     *
//     */
//    public CreateIterDefect createCreateIterDefect() {
//        return new CreateIterDefect();
//    }
//
//    /**
//     * Create an instance of {@link CreateIterDefectResponse }
//     *
//     */
//    public CreateIterDefectResponse createCreateIterDefectResponse() {
//        return new CreateIterDefectResponse();
//    }
//
//    /**
//     * Create an instance of {@link GetIterDefectsBySyscodeAndVersion }
//     *
//     */
//    public GetIterDefectsBySyscodeAndVersion createGetIterDefectsBySyscodeAndVersion() {
//        return new GetIterDefectsBySyscodeAndVersion();
//    }
//
//    /**
//     * Create an instance of {@link GetIterDefectsBySyscodeAndVersionResponse }
//     *
//     */
//    public GetIterDefectsBySyscodeAndVersionResponse createGetIterDefectsBySyscodeAndVersionResponse() {
//        return new GetIterDefectsBySyscodeAndVersionResponse();
//    }
//
//    /**
//     * Create an instance of {@link GetLabels }
//     *
//     */
//    public GetLabels createGetLabels() {
//        return new GetLabels();
//    }
//
//    /**
//     * Create an instance of {@link GetLabelsResponse }
//     *
//     */
//    public GetLabelsResponse createGetLabelsResponse() {
//        return new GetLabelsResponse();
//    }
//
//    /**
//     * Create an instance of {@link QuerySysReqsBySystemCode }
//     *
//     */
//    public QuerySysReqsBySystemCode createQuerySysReqsBySystemCode() {
//        return new QuerySysReqsBySystemCode();
//    }
//
//    /**
//     * Create an instance of {@link QuerySysReqsBySystemCodeResponse }
//     *
//     */
//    public QuerySysReqsBySystemCodeResponse createQuerySysReqsBySystemCodeResponse() {
//        return new QuerySysReqsBySystemCodeResponse();
//    }
//
//    /**
//     * Create an instance of {@link UploadIssueAttachments }
//     *
//     */
//    public UploadIssueAttachments createUploadIssueAttachments() {
//        return new UploadIssueAttachments();
//    }
//
//    /**
//     * Create an instance of {@link UploadIssueAttachmentsResponse }
//     *
//     */
//    public UploadIssueAttachmentsResponse createUploadIssueAttachmentsResponse() {
//        return new UploadIssueAttachmentsResponse();
//    }

    /**
     * Create an instance of {@link CxfFileHandler }
     * 
     */
    public CxfFileHandler createCxfFileHandler() {
        return new CxfFileHandler();
    }

    /**
     * Create an instance of {@link SyncJIRADataResult }
     * 
     */
//    public SyncJIRADataResult createSyncJIRADataResult() {
//        return new SyncJIRADataResult();
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIterDefect }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIterDefect }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "createIterDefect")
//    public JAXBElement<CreateIterDefect> createCreateIterDefect(CreateIterDefect value) {
//        return new JAXBElement<CreateIterDefect>(_CreateIterDefect_QNAME, CreateIterDefect.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIterDefectResponse }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIterDefectResponse }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "createIterDefectResponse")
//    public JAXBElement<CreateIterDefectResponse> createCreateIterDefectResponse(CreateIterDefectResponse value) {
//        return new JAXBElement<CreateIterDefectResponse>(_CreateIterDefectResponse_QNAME, CreateIterDefectResponse.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link GetIterDefectsBySyscodeAndVersion }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link GetIterDefectsBySyscodeAndVersion }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "getIterDefectsBySyscodeAndVersion")
//    public JAXBElement<GetIterDefectsBySyscodeAndVersion> createGetIterDefectsBySyscodeAndVersion(GetIterDefectsBySyscodeAndVersion value) {
//        return new JAXBElement<GetIterDefectsBySyscodeAndVersion>(_GetIterDefectsBySyscodeAndVersion_QNAME, GetIterDefectsBySyscodeAndVersion.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link GetIterDefectsBySyscodeAndVersionResponse }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link GetIterDefectsBySyscodeAndVersionResponse }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "getIterDefectsBySyscodeAndVersionResponse")
//    public JAXBElement<GetIterDefectsBySyscodeAndVersionResponse> createGetIterDefectsBySyscodeAndVersionResponse(GetIterDefectsBySyscodeAndVersionResponse value) {
//        return new JAXBElement<GetIterDefectsBySyscodeAndVersionResponse>(_GetIterDefectsBySyscodeAndVersionResponse_QNAME, GetIterDefectsBySyscodeAndVersionResponse.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link GetLabels }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link GetLabels }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "getLabels")
//    public JAXBElement<GetLabels> createGetLabels(GetLabels value) {
//        return new JAXBElement<GetLabels>(_GetLabels_QNAME, GetLabels.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link GetLabelsResponse }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link GetLabelsResponse }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "getLabelsResponse")
//    public JAXBElement<GetLabelsResponse> createGetLabelsResponse(GetLabelsResponse value) {
//        return new JAXBElement<GetLabelsResponse>(_GetLabelsResponse_QNAME, GetLabelsResponse.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySysReqsBySystemCode }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link QuerySysReqsBySystemCode }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "querySysReqsBySystemCode")
//    public JAXBElement<QuerySysReqsBySystemCode> createQuerySysReqsBySystemCode(QuerySysReqsBySystemCode value) {
//        return new JAXBElement<QuerySysReqsBySystemCode>(_QuerySysReqsBySystemCode_QNAME, QuerySysReqsBySystemCode.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySysReqsBySystemCodeResponse }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link QuerySysReqsBySystemCodeResponse }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "querySysReqsBySystemCodeResponse")
//    public JAXBElement<QuerySysReqsBySystemCodeResponse> createQuerySysReqsBySystemCodeResponse(QuerySysReqsBySystemCodeResponse value) {
//        return new JAXBElement<QuerySysReqsBySystemCodeResponse>(_QuerySysReqsBySystemCodeResponse_QNAME, QuerySysReqsBySystemCodeResponse.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link UploadIssueAttachments }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link UploadIssueAttachments }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "uploadIssueAttachments")
//    public JAXBElement<UploadIssueAttachments> createUploadIssueAttachments(UploadIssueAttachments value) {
//        return new JAXBElement<UploadIssueAttachments>(_UploadIssueAttachments_QNAME, UploadIssueAttachments.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link UploadIssueAttachmentsResponse }{@code >}
//     *
//     * @param value
//     *     Java instance representing xml element's value.
//     * @return
//     *     the new instance of {@link JAXBElement }{@code <}{@link UploadIssueAttachmentsResponse }{@code >}
//     */
//    @XmlElementDecl(namespace = "http://server.itms.inf.itdd.sf.com/", name = "uploadIssueAttachmentsResponse")
//    public JAXBElement<UploadIssueAttachmentsResponse> createUploadIssueAttachmentsResponse(UploadIssueAttachmentsResponse value) {
//        return new JAXBElement<UploadIssueAttachmentsResponse>(_UploadIssueAttachmentsResponse_QNAME, UploadIssueAttachmentsResponse.class, null, value);
//    }

}
