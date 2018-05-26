package io.hrkt.lombokjacocosample.domain;

public class SampleEntity {
    private SampleId id;
    private int intField;
    private long longField;
    private String stringField;
    private char charField;
    private byte byteField;
    /**
     * @return the id
     */
    public SampleId getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(SampleId id) {
        this.id = id;
    }
    /**
     * @return the intField
     */
    public int getIntField() {
        return intField;
    }
    /**
     * @param intField the intField to set
     */
    public void setIntField(int intField) {
        this.intField = intField;
    }
    /**
     * @return the longField
     */
    public long getLongField() {
        return longField;
    }
    /**
     * @param longField the longField to set
     */
    public void setLongField(long longField) {
        this.longField = longField;
    }
    /**
     * @return the stringField
     */
    public String getStringField() {
        return stringField;
    }
    /**
     * @param stringField the stringField to set
     */
    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
    /**
     * @return the charField
     */
    public char getCharField() {
        return charField;
    }
    /**
     * @param charField the charField to set
     */
    public void setCharField(char charField) {
        this.charField = charField;
    }
    /**
     * @return the byteField
     */
    public byte getByteField() {
        return byteField;
    }
    /**
     * @param byteField the byteField to set
     */
    public void setByteField(byte byteField) {
        this.byteField = byteField;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + byteField;
        result = prime * result + charField;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + intField;
        result = prime * result + (int) (longField ^ (longField >>> 32));
        result = prime * result
                + ((stringField == null) ? 0 : stringField.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SampleEntity other = (SampleEntity) obj;
        if (byteField != other.byteField)
            return false;
        if (charField != other.charField)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (intField != other.intField)
            return false;
        if (longField != other.longField)
            return false;
        if (stringField == null) {
            if (other.stringField != null)
                return false;
        } else if (!stringField.equals(other.stringField))
            return false;
        return true;
    }
    /**
     * @param id
     * @param intField
     * @param longField
     * @param stringField
     * @param charField
     * @param byteField
     */
    public SampleEntity(SampleId id, int intField, long longField,
            String stringField, char charField, byte byteField) {
        super();
        this.id = id;
        this.intField = intField;
        this.longField = longField;
        this.stringField = stringField;
        this.charField = charField;
        this.byteField = byteField;
    }

    public SampleEntity() {
        super();
    };

}
