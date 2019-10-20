package com.project.megusta.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "unit_name")
    private String name;

    private String abbreviation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unit")
    private List<Contains> contents;

    public Unit() {

    }

    public Unit(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    /**
     * @return the abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * @return the contents
     */
    public List<Contains> getContents() {
        return contents;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the unitId
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * @param abbreviation the abbreviation to set
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(List<Contains> contents) {
        this.contents = contents;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param unitId the unitId to set
     */
    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass()) && unitId.equals(((Unit) obj).unitId)
                && name.equals(((Unit) obj).name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
