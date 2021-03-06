/*
 * This file is generated by jOOQ.
 */
package org.anisation.jooqGenerated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabaseEntity implements Serializable {

    private static final long serialVersionUID = -196727861;

    private Long   id;
    private String textField;
    private Long   numberField;

    public DatabaseEntity() {}

    public DatabaseEntity(DatabaseEntity value) {
        this.id = value.id;
        this.textField = value.textField;
        this.numberField = value.numberField;
    }

    public DatabaseEntity(
        Long   id,
        String textField,
        Long   numberField
    ) {
        this.id = id;
        this.textField = textField;
        this.numberField = numberField;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextField() {
        return this.textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public Long getNumberField() {
        return this.numberField;
    }

    public void setNumberField(Long numberField) {
        this.numberField = numberField;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DatabaseEntity (");

        sb.append(id);
        sb.append(", ").append(textField);
        sb.append(", ").append(numberField);

        sb.append(")");
        return sb.toString();
    }
}
