/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class PathInfo implements org.apache.thrift.TBase<PathInfo, PathInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PathInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PathInfo");

  private static final org.apache.thrift.protocol.TField CONTENT_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("contentHash", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PathInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PathInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String contentHash; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String path; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTENT_HASH((short)1, "contentHash"),
    PATH((short)2, "path");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONTENT_HASH
          return CONTENT_HASH;
        case 2: // PATH
          return PATH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CONTENT_HASH,_Fields.PATH};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTENT_HASH, new org.apache.thrift.meta_data.FieldMetaData("contentHash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PathInfo.class, metaDataMap);
  }

  public PathInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PathInfo(PathInfo other) {
    if (other.isSetContentHash()) {
      this.contentHash = other.contentHash;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
  }

  public PathInfo deepCopy() {
    return new PathInfo(this);
  }

  @Override
  public void clear() {
    this.contentHash = null;
    this.path = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContentHash() {
    return this.contentHash;
  }

  public PathInfo setContentHash(@org.apache.thrift.annotation.Nullable java.lang.String contentHash) {
    this.contentHash = contentHash;
    return this;
  }

  public void unsetContentHash() {
    this.contentHash = null;
  }

  /** Returns true if field contentHash is set (has been assigned a value) and false otherwise */
  public boolean isSetContentHash() {
    return this.contentHash != null;
  }

  public void setContentHashIsSet(boolean value) {
    if (!value) {
      this.contentHash = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPath() {
    return this.path;
  }

  public PathInfo setPath(@org.apache.thrift.annotation.Nullable java.lang.String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONTENT_HASH:
      if (value == null) {
        unsetContentHash();
      } else {
        setContentHash((java.lang.String)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTENT_HASH:
      return getContentHash();

    case PATH:
      return getPath();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTENT_HASH:
      return isSetContentHash();
    case PATH:
      return isSetPath();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PathInfo)
      return this.equals((PathInfo)that);
    return false;
  }

  public boolean equals(PathInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_contentHash = true && this.isSetContentHash();
    boolean that_present_contentHash = true && that.isSetContentHash();
    if (this_present_contentHash || that_present_contentHash) {
      if (!(this_present_contentHash && that_present_contentHash))
        return false;
      if (!this.contentHash.equals(that.contentHash))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetContentHash()) ? 131071 : 524287);
    if (isSetContentHash())
      hashCode = hashCode * 8191 + contentHash.hashCode();

    hashCode = hashCode * 8191 + ((isSetPath()) ? 131071 : 524287);
    if (isSetPath())
      hashCode = hashCode * 8191 + path.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PathInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetContentHash()).compareTo(other.isSetContentHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentHash, other.contentHash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PathInfo(");
    boolean first = true;

    if (isSetContentHash()) {
      sb.append("contentHash:");
      if (this.contentHash == null) {
        sb.append("null");
      } else {
        sb.append(this.contentHash);
      }
      first = false;
    }
    if (isSetPath()) {
      if (!first) sb.append(", ");
      sb.append("path:");
      if (this.path == null) {
        sb.append("null");
      } else {
        sb.append(this.path);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PathInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PathInfoStandardScheme getScheme() {
      return new PathInfoStandardScheme();
    }
  }

  private static class PathInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<PathInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PathInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTENT_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentHash = iprot.readString();
              struct.setContentHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PathInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contentHash != null) {
        if (struct.isSetContentHash()) {
          oprot.writeFieldBegin(CONTENT_HASH_FIELD_DESC);
          oprot.writeString(struct.contentHash);
          oprot.writeFieldEnd();
        }
      }
      if (struct.path != null) {
        if (struct.isSetPath()) {
          oprot.writeFieldBegin(PATH_FIELD_DESC);
          oprot.writeString(struct.path);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PathInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PathInfoTupleScheme getScheme() {
      return new PathInfoTupleScheme();
    }
  }

  private static class PathInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<PathInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PathInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContentHash()) {
        optionals.set(0);
      }
      if (struct.isSetPath()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetContentHash()) {
        oprot.writeString(struct.contentHash);
      }
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PathInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.contentHash = iprot.readString();
        struct.setContentHashIsSet(true);
      }
      if (incoming.get(1)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

