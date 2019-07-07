/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.spring.aw.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John
 */
@Entity
@Table(name = "DatabaseLog", catalog = "AdventureWorks2017", schema = "dbo")
@XmlRootElement
public class DatabaseLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DatabaseLogID")
    private Integer databaseLogID;
    @Basic(optional = false)
    @Column(name = "PostTime")
    private Date postTime;
    @Basic(optional = false)
    @Column(name = "DatabaseUser")
    private String databaseUser;
    @Basic(optional = false)
    @Column(name = "Event")
    private String event;
    @Basic(optional = true)
    @Column(name = "Schema")
    private String schema;
    @Basic(optional = true)
    @Column(name = "Object")
    private String dbObject;
    @Lob
    @Basic(optional = false)
    @Column(name = "TSQL")
    private String tSQL;
    @Basic(optional = true)
    @Column(name = "XML")
    private String xML;

    public DatabaseLog() {
    }

    public DatabaseLog(Integer databaseLogID) {
        this.databaseLogID = databaseLogID;
    }

    public DatabaseLog(Integer databaseLogID, 
                        Date postTime, 
                        String databaseUser, 
                        String event, 
                        String schema, 
                        String dbObject, 
                        String tSQL, 
                        String xML) {
        this.databaseLogID = databaseLogID;
        this.postTime = postTime;
        this.databaseUser = databaseUser;
        this.event = event;
        this.schema = schema;
        this.dbObject = dbObject;
        this.tSQL = tSQL;
        this.xML = xML;
    }

    public Integer getDatabaseLogID() {
        return databaseLogID;
    }

    public void setDatabaseLogID(Integer databaseLogID) {
        this.databaseLogID = databaseLogID;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getDbObject() {
        return dbObject;
    }

    public void setDbObject(String dbObject) {
        this.dbObject = dbObject;
    }

    public String getTSQL() {
        return tSQL;
    }

    public void setTSQL(String tSQL) {
        this.tSQL = tSQL;
    }

    public String getXML() {
        return xML;
    }

    public void setXML(String xML) {
        this.xML = xML;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.databaseLogID);
        hash = 37 * hash + Objects.hashCode(this.postTime);
        hash = 37 * hash + Objects.hashCode(this.databaseUser);
        hash = 37 * hash + Objects.hashCode(this.event);
        hash = 37 * hash + Objects.hashCode(this.schema);
        hash = 37 * hash + Objects.hashCode(this.dbObject);
        hash = 37 * hash + Objects.hashCode(this.tSQL);
        hash = 37 * hash + Objects.hashCode(this.xML);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatabaseLog other = (DatabaseLog) obj;
        if (!Objects.equals(this.databaseUser, other.databaseUser)) {
            return false;
        }
        if (!Objects.equals(this.event, other.event)) {
            return false;
        }
        if (!Objects.equals(this.schema, other.schema)) {
            return false;
        }
        if (!Objects.equals(this.dbObject, other.dbObject)) {
            return false;
        }
        if (!Objects.equals(this.tSQL, other.tSQL)) {
            return false;
        }
        if (!Objects.equals(this.xML, other.xML)) {
            return false;
        }
        if (!Objects.equals(this.databaseLogID, other.databaseLogID)) {
            return false;
        }
        if (!Objects.equals(this.postTime, other.postTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseLog{" + "databaseLogID=" + databaseLogID + ", postTime=" + postTime + ", databaseUser=" + databaseUser + ", event=" + event + ", schema=" + schema + ", dbObject=" + dbObject + ", tSQL=" + tSQL + ", xML=" + xML + '}';
    }
}
