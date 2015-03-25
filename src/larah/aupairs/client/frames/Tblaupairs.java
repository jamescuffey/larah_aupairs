/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larah.aupairs.client.frames;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author James
 */
@Entity
@Table(name = "tblaupairs", catalog = "larah aupairs", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tblaupairs.findAll", query = "SELECT t FROM Tblaupairs t"),
    @NamedQuery(name = "Tblaupairs.findByName", query = "SELECT t FROM Tblaupairs t WHERE t.name = :name"),
    @NamedQuery(name = "Tblaupairs.findBySurname", query = "SELECT t FROM Tblaupairs t WHERE t.surname = :surname"),
    @NamedQuery(name = "Tblaupairs.findById", query = "SELECT t FROM Tblaupairs t WHERE t.id = :id")})
public class Tblaupairs implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Surname")
    private String surname;
    @Basic(optional = false)
    @Lob
    @Column(name = "Nationality")
    private String nationality;
    @Basic(optional = false)
    @Lob
    @Column(name = "Telephone")
    private String telephone;
    @Basic(optional = false)
    @Lob
    @Column(name = "Religion")
    private String religion;
    @Basic(optional = false)
    @Lob
    @Column(name = "Profession")
    private String profession;
    @Basic(optional = false)
    @Lob
    @Column(name = "Experience")
    private String experience;
    @Basic(optional = false)
    @Lob
    @Column(name = "Smoke")
    private String smoke;
    @Basic(optional = false)
    @Lob
    @Column(name = "Drive")
    private String drive;
    @Basic(optional = false)
    @Lob
    @Column(name = "Convictions")
    private String convictions;
    @Basic(optional = false)
    @Lob
    @Column(name = "SpokenAbility")
    private String spokenAbility;
    @Basic(optional = false)
    @Lob
    @Column(name = "Swim")
    private String swim;
    @Basic(optional = false)
    @Lob
    @Column(name = "Animals")
    private String animals;
    @Basic(optional = false)
    @Lob
    @Column(name = "Vegetarian")
    private String vegetarian;
    @Basic(optional = false)
    @Lob
    @Column(name = "Children")
    private String children;
    @Basic(optional = false)
    @Lob
    @Column(name = "Medication")
    private String medication;
    @Basic(optional = false)
    @Lob
    @Column(name = "Housework")
    private String housework;
    @Basic(optional = false)
    @Lob
    @Column(name = "Confident")
    private String confident;
    @Basic(optional = false)
    @Lob
    @Column(name = "FirstAid")
    private String firstAid;
    @Basic(optional = false)
    @Lob
    @Column(name = "Flexible")
    private String flexible;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;

    public Tblaupairs() {
    }

    public Tblaupairs(Integer id) {
        this.id = id;
    }

    public Tblaupairs(Integer id, String name, String surname, String nationality, String telephone, String religion, String profession, String experience, String smoke, String drive, String convictions, String spokenAbility, String swim, String animals, String vegetarian, String children, String medication, String housework, String confident, String firstAid, String flexible) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.telephone = telephone;
        this.religion = religion;
        this.profession = profession;
        this.experience = experience;
        this.smoke = smoke;
        this.drive = drive;
        this.convictions = convictions;
        this.spokenAbility = spokenAbility;
        this.swim = swim;
        this.animals = animals;
        this.vegetarian = vegetarian;
        this.children = children;
        this.medication = medication;
        this.housework = housework;
        this.confident = confident;
        this.firstAid = firstAid;
        this.flexible = flexible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        String oldNationality = this.nationality;
        this.nationality = nationality;
        changeSupport.firePropertyChange("nationality", oldNationality, nationality);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        String oldTelephone = this.telephone;
        this.telephone = telephone;
        changeSupport.firePropertyChange("telephone", oldTelephone, telephone);
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        String oldReligion = this.religion;
        this.religion = religion;
        changeSupport.firePropertyChange("religion", oldReligion, religion);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        String oldProfession = this.profession;
        this.profession = profession;
        changeSupport.firePropertyChange("profession", oldProfession, profession);
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        String oldExperience = this.experience;
        this.experience = experience;
        changeSupport.firePropertyChange("experience", oldExperience, experience);
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        String oldSmoke = this.smoke;
        this.smoke = smoke;
        changeSupport.firePropertyChange("smoke", oldSmoke, smoke);
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        String oldDrive = this.drive;
        this.drive = drive;
        changeSupport.firePropertyChange("drive", oldDrive, drive);
    }

    public String getConvictions() {
        return convictions;
    }

    public void setConvictions(String convictions) {
        String oldConvictions = this.convictions;
        this.convictions = convictions;
        changeSupport.firePropertyChange("convictions", oldConvictions, convictions);
    }

    public String getSpokenAbility() {
        return spokenAbility;
    }

    public void setSpokenAbility(String spokenAbility) {
        String oldSpokenAbility = this.spokenAbility;
        this.spokenAbility = spokenAbility;
        changeSupport.firePropertyChange("spokenAbility", oldSpokenAbility, spokenAbility);
    }

    public String getSwim() {
        return swim;
    }

    public void setSwim(String swim) {
        String oldSwim = this.swim;
        this.swim = swim;
        changeSupport.firePropertyChange("swim", oldSwim, swim);
    }

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        String oldAnimals = this.animals;
        this.animals = animals;
        changeSupport.firePropertyChange("animals", oldAnimals, animals);
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        String oldVegetarian = this.vegetarian;
        this.vegetarian = vegetarian;
        changeSupport.firePropertyChange("vegetarian", oldVegetarian, vegetarian);
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        String oldChildren = this.children;
        this.children = children;
        changeSupport.firePropertyChange("children", oldChildren, children);
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        String oldMedication = this.medication;
        this.medication = medication;
        changeSupport.firePropertyChange("medication", oldMedication, medication);
    }

    public String getHousework() {
        return housework;
    }

    public void setHousework(String housework) {
        String oldHousework = this.housework;
        this.housework = housework;
        changeSupport.firePropertyChange("housework", oldHousework, housework);
    }

    public String getConfident() {
        return confident;
    }

    public void setConfident(String confident) {
        String oldConfident = this.confident;
        this.confident = confident;
        changeSupport.firePropertyChange("confident", oldConfident, confident);
    }

    public String getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(String firstAid) {
        String oldFirstAid = this.firstAid;
        this.firstAid = firstAid;
        changeSupport.firePropertyChange("firstAid", oldFirstAid, firstAid);
    }

    public String getFlexible() {
        return flexible;
    }

    public void setFlexible(String flexible) {
        String oldFlexible = this.flexible;
        this.flexible = flexible;
        changeSupport.firePropertyChange("flexible", oldFlexible, flexible);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblaupairs)) {
            return false;
        }
        Tblaupairs other = (Tblaupairs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "larah.aupairs.client.frames.Tblaupairs[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
