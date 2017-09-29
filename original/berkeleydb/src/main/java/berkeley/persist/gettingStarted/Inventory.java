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
import berkeley.com.sleepycat.persist.model.SecondaryKey;

import static berkeley.com.sleepycat.persist.model.Relationship.MANY_TO_ONE;

@Entity
public class Inventory {

    // Primary key is sku
    @PrimaryKey
    private String sku;

    @SecondaryKey(relate = MANY_TO_ONE)
    private String itemName;

    private String category;
    private String vendor;
    private int vendorInventory;
    private float vendorPrice;

    public String getSku() {
        return sku;
    }

    public void setSku(String data) {
        sku = data;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String data) {
        itemName = data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String data) {
        category = data;
    }

    public int getVendorInventory() {
        return vendorInventory;
    }

    public void setVendorInventory(int data) {
        vendorInventory = data;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String data) {
        vendor = data;
    }

    public float getVendorPrice() {
        return vendorPrice;
    }

    public void setVendorPrice(float data) {
        vendorPrice = data;
    }

}
