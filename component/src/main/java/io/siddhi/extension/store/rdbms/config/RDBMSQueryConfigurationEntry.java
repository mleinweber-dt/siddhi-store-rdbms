/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package io.siddhi.extension.store.rdbms.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class contains all the Siddhi RDBMS Event Table SQL query configuration mappings.
 */
@XmlRootElement(name = "database")
public class RDBMSQueryConfigurationEntry {

    private String databaseName;
    private String category;
    private double minVersion;
    private double maxVersion;
    private String tableCheckQuery;
    private String tableCreateQuery;
    private String indexCreateQuery;
    private String recordSelectQuery;
    private String recordExistsQuery;
    private String recordInsertQuery;
    private String recordUpdateQuery;
    private String recordDeleteQuery;
    private boolean keyExplicitNotNull = false;
    private String stringSize;
    private int fieldSizeLimit;
    private RDBMSTypeMapping rdbmsTypeMapping;
    private RDBMSSelectQueryTemplate rdbmsSelectQueryTemplate;
    private int batchSize;
    private boolean batchEnable = false;
    private String collation;
    private boolean transactionSupported = true;
    private String recordContainsCondition;

    @XmlAttribute(name = "name", required = true)
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @XmlAttribute(name = "minVersion")
    public double getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(double minVersion) {
        this.minVersion = minVersion;
    }

    @XmlAttribute(name = "maxVersion")
    public double getMaxVersion() {
        return maxVersion;
    }

    public void setMaxVersion(double maxVersion) {
        this.maxVersion = maxVersion;
    }

    @XmlAttribute(name = "category")
    public String getCategory() {
        return category;
    }

    @XmlElement(name = "batchEnable")
    public boolean getBatchEnable() {
        return batchEnable;
    }

    public void setBatchEnable(boolean batchEnable) {
        this.batchEnable = batchEnable;
    }

    @XmlElement(name = "collation")
    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement(required = true)
    public String getTableCheckQuery() {
        return tableCheckQuery;
    }

    public void setTableCheckQuery(String tableCheckQuery) {
        this.tableCheckQuery = tableCheckQuery;
    }

    @XmlElement(required = true)
    public String getTableCreateQuery() {
        return tableCreateQuery;
    }

    public void setTableCreateQuery(String tableCreateQuery) {
        this.tableCreateQuery = tableCreateQuery;
    }

    @XmlElement(required = true)
    public String getIndexCreateQuery() {
        return indexCreateQuery;
    }

    public void setIndexCreateQuery(String indexCreateQuery) {
        this.indexCreateQuery = indexCreateQuery;
    }

    @XmlElement(required = true)
    public String getRecordInsertQuery() {
        return recordInsertQuery;
    }

    public void setRecordInsertQuery(String recordInsertQuery) {
        this.recordInsertQuery = recordInsertQuery;
    }

    @XmlElement(required = true)
    public String getRecordUpdateQuery() {
        return recordUpdateQuery;
    }

    public void setRecordUpdateQuery(String recordUpdateQuery) {
        this.recordUpdateQuery = recordUpdateQuery;
    }

    @XmlElement(required = true)
    public String getRecordSelectQuery() {
        return recordSelectQuery;
    }

    public void setRecordSelectQuery(String recordSelectQuery) {
        this.recordSelectQuery = recordSelectQuery;
    }

    @XmlElement(required = true)
    public String getRecordExistsQuery() {
        return recordExistsQuery;
    }

    public void setRecordExistsQuery(String recordExistsQuery) {
        this.recordExistsQuery = recordExistsQuery;
    }

    @XmlElement(required = true)
    public String getRecordDeleteQuery() {
        return recordDeleteQuery;
    }

    public String getRecordContainsCondition() {
        return recordContainsCondition;
    }

    public void setRecordContainsCondition(String recordContainsCondition) {
        this.recordContainsCondition = recordContainsCondition;
    }

    public void setRecordDeleteQuery(String recordDeleteQuery) {
        this.recordDeleteQuery = recordDeleteQuery;
    }

    public boolean isKeyExplicitNotNull() {
        return keyExplicitNotNull;
    }

    public void setKeyExplicitNotNull(boolean keyExplicitNotNull) {
        this.keyExplicitNotNull = keyExplicitNotNull;
    }

    public String getStringSize() {
        return stringSize;
    }

    public void setStringSize(String stringSize) {
        this.stringSize = stringSize;
    }

    public boolean isTransactionSupported() {
        return transactionSupported;
    }

    public void setTransactionSupported(boolean transactionSupported) {
        this.transactionSupported = transactionSupported;
    }

    @XmlElement(name = "typeMapping", required = true)
    public RDBMSTypeMapping getRdbmsTypeMapping() {
        return rdbmsTypeMapping;
    }

    public void setRdbmsTypeMapping(RDBMSTypeMapping rdbmsTypeMapping) {
        this.rdbmsTypeMapping = rdbmsTypeMapping;
    }

    @XmlElement(name = "selectQueryTemplate")
    public RDBMSSelectQueryTemplate getRdbmsSelectQueryTemplate() {
        return rdbmsSelectQueryTemplate;
    }

    public void setRdbmsSelectQueryTemplate(RDBMSSelectQueryTemplate rdbmsSelectQueryTemplate) {
        this.rdbmsSelectQueryTemplate = rdbmsSelectQueryTemplate;
    }

    @XmlElement(name = "batchSize", required = true)
    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    @XmlElement(name = "fieldSizeLimit", required = false)
    public int getFieldSizeLimit() {
        return fieldSizeLimit;
    }

    public void setFieldSizeLimit(int fieldSizeLimit) {
        this.fieldSizeLimit = fieldSizeLimit;
    }
}
