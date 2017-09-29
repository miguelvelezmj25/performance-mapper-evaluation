/*-
 * Copyright (C) 2002, 2017, Oracle and/or its affiliates. All rights reserved.
 *
 * This file was distributed by Oracle as part of a version of Oracle Berkeley
 * DB Java Edition made available at:
 *
 * http://www.oracle.com/technetwork/database/database-technologies/berkeleydb/downloads/index.html
 *
 * Please see the LICENSE file included in the top-level directory of the
 * appropriate version of Oracle Berkeley DB Java Edition for a copy of the
 * license and additional information.
 */

package berkeley.persist.gettingStarted;

import berkeley.com.sleepycat.persist.model.Entity;
import berkeley.com.sleepycat.persist.model.PrimaryKey;

@Entity
public class Vendor {

    private String repName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String bizPhoneNumber;
    private String repPhoneNumber;

    // Primary key is the vendor's name
    // This assumes that the vendor's name is
    // unique in the database.
    @PrimaryKey
    private String vendor;

    public String getRepName() {
        return repName;
    }

    public void setRepName(String data) {
        repName = data;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String data) {
        address = data;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String data) {
        city = data;
    }

    public String getState() {
        return state;
    }

    public void setState(String data) {
        state = data;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String data) {
        zipcode = data;
    }

    public String getBusinessPhoneNumber() {
        return bizPhoneNumber;
    }

    public void setBusinessPhoneNumber(String data) {
        bizPhoneNumber = data;
    }

    public String getRepPhoneNumber() {
        return repPhoneNumber;
    }

    public void setRepPhoneNumber(String data) {
        repPhoneNumber = data;
    }

    public String getVendorName() {
        return vendor;
    }

    public void setVendorName(String data) {
        vendor = data;
    }

}
