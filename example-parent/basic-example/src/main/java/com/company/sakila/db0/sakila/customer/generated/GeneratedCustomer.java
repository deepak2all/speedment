package com.company.sakila.db0.sakila.customer.generated;

import com.company.sakila.db0.sakila.address.Address;
import com.company.sakila.db0.sakila.customer.Customer;
import com.company.sakila.db0.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.company.sakila.db0.sakila.customer.Customer}-interface representing
 * entities of the {@code customer}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCustomer {
    
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getCustomerId()} method.
     */
    IntField<Customer, Integer> CUSTOMER_ID = IntField.create(
        Identifier.CUSTOMER_ID,
        Customer::getCustomerId,
        Customer::setCustomerId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getStoreId()} method.
     */
    ShortForeignKeyField<Customer, Short, Store> STORE_ID = ShortForeignKeyField.create(
        Identifier.STORE_ID,
        Customer::getStoreId,
        Customer::setStoreId,
        Store.STORE_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getFirstName()} method.
     */
    StringField<Customer, String> FIRST_NAME = StringField.create(
        Identifier.FIRST_NAME,
        Customer::getFirstName,
        Customer::setFirstName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getLastName()} method.
     */
    StringField<Customer, String> LAST_NAME = StringField.create(
        Identifier.LAST_NAME,
        Customer::getLastName,
        Customer::setLastName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getEmail()} method.
     */
    StringField<Customer, String> EMAIL = StringField.create(
        Identifier.EMAIL,
        o -> OptionalUtil.unwrap(o.getEmail()),
        Customer::setEmail,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getAddressId()} method.
     */
    IntForeignKeyField<Customer, Integer, Address> ADDRESS_ID = IntForeignKeyField.create(
        Identifier.ADDRESS_ID,
        Customer::getAddressId,
        Customer::setAddressId,
        Address.ADDRESS_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getActive()} method.
     */
    IntField<Customer, Integer> ACTIVE = IntField.create(
        Identifier.ACTIVE,
        Customer::getActive,
        Customer::setActive,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getCreateDate()} method.
     */
    ComparableField<Customer, Timestamp, Timestamp> CREATE_DATE = ComparableField.create(
        Identifier.CREATE_DATE,
        Customer::getCreateDate,
        Customer::setCreateDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Customer} field that can be obtained
     * using the {@link Customer#getLastUpdate()} method.
     */
    ComparableField<Customer, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Customer::getLastUpdate,
        Customer::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the customerId of this Customer. The customerId field corresponds
     * to the database column db0.sakila.customer.customer_id.
     * 
     * @return the customerId of this Customer
     */
    int getCustomerId();
    
    /**
     * Returns the storeId of this Customer. The storeId field corresponds to
     * the database column db0.sakila.customer.store_id.
     * 
     * @return the storeId of this Customer
     */
    short getStoreId();
    
    /**
     * Returns the firstName of this Customer. The firstName field corresponds
     * to the database column db0.sakila.customer.first_name.
     * 
     * @return the firstName of this Customer
     */
    String getFirstName();
    
    /**
     * Returns the lastName of this Customer. The lastName field corresponds to
     * the database column db0.sakila.customer.last_name.
     * 
     * @return the lastName of this Customer
     */
    String getLastName();
    
    /**
     * Returns the email of this Customer. The email field corresponds to the
     * database column db0.sakila.customer.email.
     * 
     * @return the email of this Customer
     */
    Optional<String> getEmail();
    
    /**
     * Returns the addressId of this Customer. The addressId field corresponds
     * to the database column db0.sakila.customer.address_id.
     * 
     * @return the addressId of this Customer
     */
    int getAddressId();
    
    /**
     * Returns the active of this Customer. The active field corresponds to the
     * database column db0.sakila.customer.active.
     * 
     * @return the active of this Customer
     */
    int getActive();
    
    /**
     * Returns the createDate of this Customer. The createDate field corresponds
     * to the database column db0.sakila.customer.create_date.
     * 
     * @return the createDate of this Customer
     */
    Timestamp getCreateDate();
    
    /**
     * Returns the lastUpdate of this Customer. The lastUpdate field corresponds
     * to the database column db0.sakila.customer.last_update.
     * 
     * @return the lastUpdate of this Customer
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the customerId of this Customer. The customerId field corresponds to
     * the database column db0.sakila.customer.customer_id.
     * 
     * @param customerId to set of this Customer
     * @return           this Customer instance
     */
    Customer setCustomerId(int customerId);
    
    /**
     * Sets the storeId of this Customer. The storeId field corresponds to the
     * database column db0.sakila.customer.store_id.
     * 
     * @param storeId to set of this Customer
     * @return        this Customer instance
     */
    Customer setStoreId(short storeId);
    
    /**
     * Sets the firstName of this Customer. The firstName field corresponds to
     * the database column db0.sakila.customer.first_name.
     * 
     * @param firstName to set of this Customer
     * @return          this Customer instance
     */
    Customer setFirstName(String firstName);
    
    /**
     * Sets the lastName of this Customer. The lastName field corresponds to the
     * database column db0.sakila.customer.last_name.
     * 
     * @param lastName to set of this Customer
     * @return         this Customer instance
     */
    Customer setLastName(String lastName);
    
    /**
     * Sets the email of this Customer. The email field corresponds to the
     * database column db0.sakila.customer.email.
     * 
     * @param email to set of this Customer
     * @return      this Customer instance
     */
    Customer setEmail(String email);
    
    /**
     * Sets the addressId of this Customer. The addressId field corresponds to
     * the database column db0.sakila.customer.address_id.
     * 
     * @param addressId to set of this Customer
     * @return          this Customer instance
     */
    Customer setAddressId(int addressId);
    
    /**
     * Sets the active of this Customer. The active field corresponds to the
     * database column db0.sakila.customer.active.
     * 
     * @param active to set of this Customer
     * @return       this Customer instance
     */
    Customer setActive(int active);
    
    /**
     * Sets the createDate of this Customer. The createDate field corresponds to
     * the database column db0.sakila.customer.create_date.
     * 
     * @param createDate to set of this Customer
     * @return           this Customer instance
     */
    Customer setCreateDate(Timestamp createDate);
    
    /**
     * Sets the lastUpdate of this Customer. The lastUpdate field corresponds to
     * the database column db0.sakila.customer.last_update.
     * 
     * @param lastUpdate to set of this Customer
     * @return           this Customer instance
     */
    Customer setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Store. If no such Store
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Store findStoreId(Manager<Store> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Address. If no such
     * Address exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Address findAddressId(Manager<Address> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Customer> {
        
        CUSTOMER_ID ("customer_id"),
        STORE_ID    ("store_id"),
        FIRST_NAME  ("first_name"),
        LAST_NAME   ("last_name"),
        EMAIL       ("email"),
        ADDRESS_ID  ("address_id"),
        ACTIVE      ("active"),
        CREATE_DATE ("create_date"),
        LAST_UPDATE ("last_update");
        
        private final String columnName;
        private final TableIdentifier<Customer> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(),
                getSchemaId(),
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "db0";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "customer";
        }
        
        @Override
        public String getColumnId() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Customer> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}