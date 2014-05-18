
package com.esprit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="presence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="etudiant" type="{http://service.esprit.com/}etudiant" minOccurs="0"/>
 *         &lt;element name="h_entree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seance" type="{http://service.esprit.com/}seance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "presence", propOrder = {
    "etat",
    "etudiant",
    "hEntree",
    "id",
    "seance"
})
public class Presence {

    protected Boolean etat;
    protected Etudiant etudiant;
    @XmlElement(name = "h_entree")
    protected String hEntree;
    protected int id;
    protected Seance seance;

    /**
     * Gets the value of the etat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEtat() {
        return etat;
    }

    /**
     * Sets the value of the etat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEtat(Boolean value) {
        this.etat = value;
    }

    /**
     * Gets the value of the etudiant property.
     * 
     * @return
     *     possible object is
     *     {@link Etudiant }
     *     
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * Sets the value of the etudiant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Etudiant }
     *     
     */
    public void setEtudiant(Etudiant value) {
        this.etudiant = value;
    }

    /**
     * Gets the value of the hEntree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEntree() {
        return hEntree;
    }

    /**
     * Sets the value of the hEntree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEntree(String value) {
        this.hEntree = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the seance property.
     * 
     * @return
     *     possible object is
     *     {@link Seance }
     *     
     */
    public Seance getSeance() {
        return seance;
    }

    /**
     * Sets the value of the seance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seance }
     *     
     */
    public void setSeance(Seance value) {
        this.seance = value;
    }

}
