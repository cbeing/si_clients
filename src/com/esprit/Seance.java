
package com.esprit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classe" type="{http://service.esprit.com/}classe" minOccurs="0"/>
 *         &lt;element name="date_Se" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enseignant" type="{http://service.esprit.com/}enseignant" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matiere" type="{http://service.esprit.com/}matiere" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seance", propOrder = {
    "classe",
    "dateSe",
    "enseignant",
    "id",
    "matiere"
})
public class Seance {

    protected Classe classe;
    @XmlElement(name = "date_Se")
    protected String dateSe;
    protected Enseignant enseignant;
    protected int id;
    protected Matiere matiere;

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link Classe }
     *     
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classe }
     *     
     */
    public void setClasse(Classe value) {
        this.classe = value;
    }

    /**
     * Gets the value of the dateSe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSe() {
        return dateSe;
    }

    /**
     * Sets the value of the dateSe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSe(String value) {
        this.dateSe = value;
    }

    /**
     * Gets the value of the enseignant property.
     * 
     * @return
     *     possible object is
     *     {@link Enseignant }
     *     
     */
    public Enseignant getEnseignant() {
        return enseignant;
    }

    /**
     * Sets the value of the enseignant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enseignant }
     *     
     */
    public void setEnseignant(Enseignant value) {
        this.enseignant = value;
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
     * Gets the value of the matiere property.
     * 
     * @return
     *     possible object is
     *     {@link Matiere }
     *     
     */
    public Matiere getMatiere() {
        return matiere;
    }

    /**
     * Sets the value of the matiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matiere }
     *     
     */
    public void setMatiere(Matiere value) {
        this.matiere = value;
    }

}
