//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.15 at 01:50:20 PM EDT 
//


package com.fhir.ldm.mapping.beans.gtp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.fhir.ldm.mapping.util.DateTimeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TransmissionSource"/>
 *         &lt;element ref="{}Study" maxOccurs="unbounded"/>
 *         &lt;element ref="{}TransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ModelVersion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="7"/>
 *             &lt;pattern value="\d\d\-\d\-\d\d"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CreationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transmissionSource",
    "study",
    "transactionType"
})
@XmlRootElement(name = "GTP")
public class GTP
    implements Serializable
{

    private final static long serialVersionUID = 5190875983846359311L;
    @XmlElement(name = "TransmissionSource", required = true)
    protected TransmissionSource transmissionSource;
    @XmlElement(name = "Study", required = true)
    protected List<Study> study;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlAttribute(name = "ModelVersion", required = true)
    protected String modelVersion;
    @XmlAttribute(name = "CreationDateTime", required = true)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date creationDateTime;

    /**
     * Gets the value of the transmissionSource property.
     * 
     * @return
     *     possible object is
     *     {@link TransmissionSource }
     *     
     */
    public TransmissionSource getTransmissionSource() {
        return transmissionSource;
    }

    /**
     * Sets the value of the transmissionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionSource }
     *     
     */
    public void setTransmissionSource(TransmissionSource value) {
        this.transmissionSource = value;
    }

    /**
     * Gets the value of the study property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the study property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Study }
     * 
     * 
     */
    public List<Study> getStudy() {
        if (study == null) {
            study = new ArrayList<Study>();
        }
        return this.study;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(Date value) {
        this.creationDateTime = value;
    }

}
