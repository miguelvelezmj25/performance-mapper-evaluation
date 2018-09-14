//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.14 at 01:47:22 PM EDT 
//


package org.apache.activemq.schema.core;

import java.math.BigInteger;
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
 *       &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="durableTopicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumPendingMessageLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="optimizeDurableTopicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="queueBrowserPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="queuePrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="topicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlRootElement(name = "prefetchPolicy")
public class DtoPrefetchPolicy
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "all")
    protected BigInteger all;
    @XmlAttribute(name = "durableTopicPrefetch")
    protected BigInteger durableTopicPrefetch;
    @XmlAttribute(name = "maximumPendingMessageLimit")
    protected BigInteger maximumPendingMessageLimit;
    @XmlAttribute(name = "optimizeDurableTopicPrefetch")
    protected BigInteger optimizeDurableTopicPrefetch;
    @XmlAttribute(name = "queueBrowserPrefetch")
    protected BigInteger queueBrowserPrefetch;
    @XmlAttribute(name = "queuePrefetch")
    protected BigInteger queuePrefetch;
    @XmlAttribute(name = "topicPrefetch")
    protected BigInteger topicPrefetch;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAll(BigInteger value) {
        this.all = value;
    }

    /**
     * Gets the value of the durableTopicPrefetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurableTopicPrefetch() {
        return durableTopicPrefetch;
    }

    /**
     * Sets the value of the durableTopicPrefetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurableTopicPrefetch(BigInteger value) {
        this.durableTopicPrefetch = value;
    }

    /**
     * Gets the value of the maximumPendingMessageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPendingMessageLimit() {
        return maximumPendingMessageLimit;
    }

    /**
     * Sets the value of the maximumPendingMessageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPendingMessageLimit(BigInteger value) {
        this.maximumPendingMessageLimit = value;
    }

    /**
     * Gets the value of the optimizeDurableTopicPrefetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimizeDurableTopicPrefetch() {
        return optimizeDurableTopicPrefetch;
    }

    /**
     * Sets the value of the optimizeDurableTopicPrefetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimizeDurableTopicPrefetch(BigInteger value) {
        this.optimizeDurableTopicPrefetch = value;
    }

    /**
     * Gets the value of the queueBrowserPrefetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueBrowserPrefetch() {
        return queueBrowserPrefetch;
    }

    /**
     * Sets the value of the queueBrowserPrefetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueBrowserPrefetch(BigInteger value) {
        this.queueBrowserPrefetch = value;
    }

    /**
     * Gets the value of the queuePrefetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueuePrefetch() {
        return queuePrefetch;
    }

    /**
     * Sets the value of the queuePrefetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueuePrefetch(BigInteger value) {
        this.queuePrefetch = value;
    }

    /**
     * Gets the value of the topicPrefetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopicPrefetch() {
        return topicPrefetch;
    }

    /**
     * Sets the value of the topicPrefetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopicPrefetch(BigInteger value) {
        this.topicPrefetch = value;
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
            BigInteger theAll;
            theAll = this.getAll();
            strategy.appendField(locator, this, "all", buffer, theAll);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            strategy.appendField(locator, this, "durableTopicPrefetch", buffer, theDurableTopicPrefetch);
        }
        {
            BigInteger theMaximumPendingMessageLimit;
            theMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            strategy.appendField(locator, this, "maximumPendingMessageLimit", buffer, theMaximumPendingMessageLimit);
        }
        {
            BigInteger theOptimizeDurableTopicPrefetch;
            theOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            strategy.appendField(locator, this, "optimizeDurableTopicPrefetch", buffer, theOptimizeDurableTopicPrefetch);
        }
        {
            BigInteger theQueueBrowserPrefetch;
            theQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            strategy.appendField(locator, this, "queueBrowserPrefetch", buffer, theQueueBrowserPrefetch);
        }
        {
            BigInteger theQueuePrefetch;
            theQueuePrefetch = this.getQueuePrefetch();
            strategy.appendField(locator, this, "queuePrefetch", buffer, theQueuePrefetch);
        }
        {
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            strategy.appendField(locator, this, "topicPrefetch", buffer, theTopicPrefetch);
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
            BigInteger theAll;
            theAll = this.getAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "all", theAll), currentHashCode, theAll);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableTopicPrefetch", theDurableTopicPrefetch), currentHashCode, theDurableTopicPrefetch);
        }
        {
            BigInteger theMaximumPendingMessageLimit;
            theMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumPendingMessageLimit", theMaximumPendingMessageLimit), currentHashCode, theMaximumPendingMessageLimit);
        }
        {
            BigInteger theOptimizeDurableTopicPrefetch;
            theOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizeDurableTopicPrefetch", theOptimizeDurableTopicPrefetch), currentHashCode, theOptimizeDurableTopicPrefetch);
        }
        {
            BigInteger theQueueBrowserPrefetch;
            theQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueBrowserPrefetch", theQueueBrowserPrefetch), currentHashCode, theQueueBrowserPrefetch);
        }
        {
            BigInteger theQueuePrefetch;
            theQueuePrefetch = this.getQueuePrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queuePrefetch", theQueuePrefetch), currentHashCode, theQueuePrefetch);
        }
        {
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicPrefetch", theTopicPrefetch), currentHashCode, theTopicPrefetch);
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
        if (!(object instanceof DtoPrefetchPolicy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPrefetchPolicy that = ((DtoPrefetchPolicy) object);
        {
            BigInteger lhsAll;
            lhsAll = this.getAll();
            BigInteger rhsAll;
            rhsAll = that.getAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "all", lhsAll), LocatorUtils.property(thatLocator, "all", rhsAll), lhsAll, rhsAll)) {
                return false;
            }
        }
        {
            BigInteger lhsDurableTopicPrefetch;
            lhsDurableTopicPrefetch = this.getDurableTopicPrefetch();
            BigInteger rhsDurableTopicPrefetch;
            rhsDurableTopicPrefetch = that.getDurableTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durableTopicPrefetch", lhsDurableTopicPrefetch), LocatorUtils.property(thatLocator, "durableTopicPrefetch", rhsDurableTopicPrefetch), lhsDurableTopicPrefetch, rhsDurableTopicPrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumPendingMessageLimit;
            lhsMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            BigInteger rhsMaximumPendingMessageLimit;
            rhsMaximumPendingMessageLimit = that.getMaximumPendingMessageLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumPendingMessageLimit", lhsMaximumPendingMessageLimit), LocatorUtils.property(thatLocator, "maximumPendingMessageLimit", rhsMaximumPendingMessageLimit), lhsMaximumPendingMessageLimit, rhsMaximumPendingMessageLimit)) {
                return false;
            }
        }
        {
            BigInteger lhsOptimizeDurableTopicPrefetch;
            lhsOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            BigInteger rhsOptimizeDurableTopicPrefetch;
            rhsOptimizeDurableTopicPrefetch = that.getOptimizeDurableTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizeDurableTopicPrefetch", lhsOptimizeDurableTopicPrefetch), LocatorUtils.property(thatLocator, "optimizeDurableTopicPrefetch", rhsOptimizeDurableTopicPrefetch), lhsOptimizeDurableTopicPrefetch, rhsOptimizeDurableTopicPrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsQueueBrowserPrefetch;
            lhsQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            BigInteger rhsQueueBrowserPrefetch;
            rhsQueueBrowserPrefetch = that.getQueueBrowserPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueBrowserPrefetch", lhsQueueBrowserPrefetch), LocatorUtils.property(thatLocator, "queueBrowserPrefetch", rhsQueueBrowserPrefetch), lhsQueueBrowserPrefetch, rhsQueueBrowserPrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsQueuePrefetch;
            lhsQueuePrefetch = this.getQueuePrefetch();
            BigInteger rhsQueuePrefetch;
            rhsQueuePrefetch = that.getQueuePrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queuePrefetch", lhsQueuePrefetch), LocatorUtils.property(thatLocator, "queuePrefetch", rhsQueuePrefetch), lhsQueuePrefetch, rhsQueuePrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsTopicPrefetch;
            lhsTopicPrefetch = this.getTopicPrefetch();
            BigInteger rhsTopicPrefetch;
            rhsTopicPrefetch = that.getTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicPrefetch", lhsTopicPrefetch), LocatorUtils.property(thatLocator, "topicPrefetch", rhsTopicPrefetch), lhsTopicPrefetch, rhsTopicPrefetch)) {
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
