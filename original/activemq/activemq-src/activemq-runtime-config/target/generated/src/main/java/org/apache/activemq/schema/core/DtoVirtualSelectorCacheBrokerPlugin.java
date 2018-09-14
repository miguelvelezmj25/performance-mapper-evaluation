//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.14 at 01:47:22 PM EDT 
//


package org.apache.activemq.schema.core;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ignoreWildcardSelectors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="persistFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="singleSelectorPerDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "virtualSelectorCacheBrokerPlugin")
public class DtoVirtualSelectorCacheBrokerPlugin implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "ignoreWildcardSelectors")
    protected Boolean ignoreWildcardSelectors;
    @XmlAttribute(name = "persistFile")
    protected String persistFile;
    @XmlAttribute(name = "persistInterval")
    protected Long persistInterval;
    @XmlAttribute(name = "singleSelectorPerDestination")
    protected Boolean singleSelectorPerDestination;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ignoreWildcardSelectors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreWildcardSelectors() {
        return ignoreWildcardSelectors;
    }

    /**
     * Sets the value of the ignoreWildcardSelectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreWildcardSelectors(Boolean value) {
        this.ignoreWildcardSelectors = value;
    }

    /**
     * Gets the value of the persistFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistFile() {
        return persistFile;
    }

    /**
     * Sets the value of the persistFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistFile(String value) {
        this.persistFile = value;
    }

    /**
     * Gets the value of the persistInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersistInterval() {
        return persistInterval;
    }

    /**
     * Sets the value of the persistInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersistInterval(Long value) {
        this.persistInterval = value;
    }

    /**
     * Gets the value of the singleSelectorPerDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleSelectorPerDestination() {
        return singleSelectorPerDestination;
    }

    /**
     * Sets the value of the singleSelectorPerDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleSelectorPerDestination(Boolean value) {
        this.singleSelectorPerDestination = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Boolean theIgnoreWildcardSelectors;
            theIgnoreWildcardSelectors = this.isIgnoreWildcardSelectors();
            strategy.appendField(locator, this, "ignoreWildcardSelectors", buffer, theIgnoreWildcardSelectors);
        }
        {
            String thePersistFile;
            thePersistFile = this.getPersistFile();
            strategy.appendField(locator, this, "persistFile", buffer, thePersistFile);
        }
        {
            Long thePersistInterval;
            thePersistInterval = this.getPersistInterval();
            strategy.appendField(locator, this, "persistInterval", buffer, thePersistInterval);
        }
        {
            Boolean theSingleSelectorPerDestination;
            theSingleSelectorPerDestination = this.isSingleSelectorPerDestination();
            strategy.appendField(locator, this, "singleSelectorPerDestination", buffer, theSingleSelectorPerDestination);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Boolean theIgnoreWildcardSelectors;
            theIgnoreWildcardSelectors = this.isIgnoreWildcardSelectors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreWildcardSelectors", theIgnoreWildcardSelectors), currentHashCode, theIgnoreWildcardSelectors);
        }
        {
            String thePersistFile;
            thePersistFile = this.getPersistFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistFile", thePersistFile), currentHashCode, thePersistFile);
        }
        {
            Long thePersistInterval;
            thePersistInterval = this.getPersistInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistInterval", thePersistInterval), currentHashCode, thePersistInterval);
        }
        {
            Boolean theSingleSelectorPerDestination;
            theSingleSelectorPerDestination = this.isSingleSelectorPerDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "singleSelectorPerDestination", theSingleSelectorPerDestination), currentHashCode, theSingleSelectorPerDestination);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DtoVirtualSelectorCacheBrokerPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoVirtualSelectorCacheBrokerPlugin that = ((DtoVirtualSelectorCacheBrokerPlugin) object);
        {
            Boolean lhsIgnoreWildcardSelectors;
            lhsIgnoreWildcardSelectors = this.isIgnoreWildcardSelectors();
            Boolean rhsIgnoreWildcardSelectors;
            rhsIgnoreWildcardSelectors = that.isIgnoreWildcardSelectors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreWildcardSelectors", lhsIgnoreWildcardSelectors), LocatorUtils.property(thatLocator, "ignoreWildcardSelectors", rhsIgnoreWildcardSelectors), lhsIgnoreWildcardSelectors, rhsIgnoreWildcardSelectors)) {
                return false;
            }
        }
        {
            String lhsPersistFile;
            lhsPersistFile = this.getPersistFile();
            String rhsPersistFile;
            rhsPersistFile = that.getPersistFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistFile", lhsPersistFile), LocatorUtils.property(thatLocator, "persistFile", rhsPersistFile), lhsPersistFile, rhsPersistFile)) {
                return false;
            }
        }
        {
            Long lhsPersistInterval;
            lhsPersistInterval = this.getPersistInterval();
            Long rhsPersistInterval;
            rhsPersistInterval = that.getPersistInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistInterval", lhsPersistInterval), LocatorUtils.property(thatLocator, "persistInterval", rhsPersistInterval), lhsPersistInterval, rhsPersistInterval)) {
                return false;
            }
        }
        {
            Boolean lhsSingleSelectorPerDestination;
            lhsSingleSelectorPerDestination = this.isSingleSelectorPerDestination();
            Boolean rhsSingleSelectorPerDestination;
            rhsSingleSelectorPerDestination = that.isSingleSelectorPerDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "singleSelectorPerDestination", lhsSingleSelectorPerDestination), LocatorUtils.property(thatLocator, "singleSelectorPerDestination", rhsSingleSelectorPerDestination), lhsSingleSelectorPerDestination, rhsSingleSelectorPerDestination)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = new ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }

}
