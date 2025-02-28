/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class RemoteExecutionContainsResponse implements org.apache.thrift.TBase<RemoteExecutionContainsResponse, RemoteExecutionContainsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RemoteExecutionContainsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteExecutionContainsResponse");

  private static final org.apache.thrift.protocol.TField CONTAINED_DIGESTS_FIELD_DESC = new org.apache.thrift.protocol.TField("containedDigests", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField MISSING_DIGESTS_FIELD_DESC = new org.apache.thrift.protocol.TField("missingDigests", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RemoteExecutionContainsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RemoteExecutionContainsResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<Digest> containedDigests; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<Digest> missingDigests; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTAINED_DIGESTS((short)1, "containedDigests"),
    MISSING_DIGESTS((short)2, "missingDigests");

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
        case 1: // CONTAINED_DIGESTS
          return CONTAINED_DIGESTS;
        case 2: // MISSING_DIGESTS
          return MISSING_DIGESTS;
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
  private static final _Fields optionals[] = {_Fields.CONTAINED_DIGESTS,_Fields.MISSING_DIGESTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTAINED_DIGESTS, new org.apache.thrift.meta_data.FieldMetaData("containedDigests", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Digest.class))));
    tmpMap.put(_Fields.MISSING_DIGESTS, new org.apache.thrift.meta_data.FieldMetaData("missingDigests", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Digest.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteExecutionContainsResponse.class, metaDataMap);
  }

  public RemoteExecutionContainsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteExecutionContainsResponse(RemoteExecutionContainsResponse other) {
    if (other.isSetContainedDigests()) {
      java.util.List<Digest> __this__containedDigests = new java.util.ArrayList<Digest>(other.containedDigests.size());
      for (Digest other_element : other.containedDigests) {
        __this__containedDigests.add(new Digest(other_element));
      }
      this.containedDigests = __this__containedDigests;
    }
    if (other.isSetMissingDigests()) {
      java.util.List<Digest> __this__missingDigests = new java.util.ArrayList<Digest>(other.missingDigests.size());
      for (Digest other_element : other.missingDigests) {
        __this__missingDigests.add(new Digest(other_element));
      }
      this.missingDigests = __this__missingDigests;
    }
  }

  public RemoteExecutionContainsResponse deepCopy() {
    return new RemoteExecutionContainsResponse(this);
  }

  @Override
  public void clear() {
    this.containedDigests = null;
    this.missingDigests = null;
  }

  public int getContainedDigestsSize() {
    return (this.containedDigests == null) ? 0 : this.containedDigests.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Digest> getContainedDigestsIterator() {
    return (this.containedDigests == null) ? null : this.containedDigests.iterator();
  }

  public void addToContainedDigests(Digest elem) {
    if (this.containedDigests == null) {
      this.containedDigests = new java.util.ArrayList<Digest>();
    }
    this.containedDigests.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Digest> getContainedDigests() {
    return this.containedDigests;
  }

  public RemoteExecutionContainsResponse setContainedDigests(@org.apache.thrift.annotation.Nullable java.util.List<Digest> containedDigests) {
    this.containedDigests = containedDigests;
    return this;
  }

  public void unsetContainedDigests() {
    this.containedDigests = null;
  }

  /** Returns true if field containedDigests is set (has been assigned a value) and false otherwise */
  public boolean isSetContainedDigests() {
    return this.containedDigests != null;
  }

  public void setContainedDigestsIsSet(boolean value) {
    if (!value) {
      this.containedDigests = null;
    }
  }

  public int getMissingDigestsSize() {
    return (this.missingDigests == null) ? 0 : this.missingDigests.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Digest> getMissingDigestsIterator() {
    return (this.missingDigests == null) ? null : this.missingDigests.iterator();
  }

  public void addToMissingDigests(Digest elem) {
    if (this.missingDigests == null) {
      this.missingDigests = new java.util.ArrayList<Digest>();
    }
    this.missingDigests.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Digest> getMissingDigests() {
    return this.missingDigests;
  }

  public RemoteExecutionContainsResponse setMissingDigests(@org.apache.thrift.annotation.Nullable java.util.List<Digest> missingDigests) {
    this.missingDigests = missingDigests;
    return this;
  }

  public void unsetMissingDigests() {
    this.missingDigests = null;
  }

  /** Returns true if field missingDigests is set (has been assigned a value) and false otherwise */
  public boolean isSetMissingDigests() {
    return this.missingDigests != null;
  }

  public void setMissingDigestsIsSet(boolean value) {
    if (!value) {
      this.missingDigests = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONTAINED_DIGESTS:
      if (value == null) {
        unsetContainedDigests();
      } else {
        setContainedDigests((java.util.List<Digest>)value);
      }
      break;

    case MISSING_DIGESTS:
      if (value == null) {
        unsetMissingDigests();
      } else {
        setMissingDigests((java.util.List<Digest>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTAINED_DIGESTS:
      return getContainedDigests();

    case MISSING_DIGESTS:
      return getMissingDigests();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTAINED_DIGESTS:
      return isSetContainedDigests();
    case MISSING_DIGESTS:
      return isSetMissingDigests();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteExecutionContainsResponse)
      return this.equals((RemoteExecutionContainsResponse)that);
    return false;
  }

  public boolean equals(RemoteExecutionContainsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_containedDigests = true && this.isSetContainedDigests();
    boolean that_present_containedDigests = true && that.isSetContainedDigests();
    if (this_present_containedDigests || that_present_containedDigests) {
      if (!(this_present_containedDigests && that_present_containedDigests))
        return false;
      if (!this.containedDigests.equals(that.containedDigests))
        return false;
    }

    boolean this_present_missingDigests = true && this.isSetMissingDigests();
    boolean that_present_missingDigests = true && that.isSetMissingDigests();
    if (this_present_missingDigests || that_present_missingDigests) {
      if (!(this_present_missingDigests && that_present_missingDigests))
        return false;
      if (!this.missingDigests.equals(that.missingDigests))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetContainedDigests()) ? 131071 : 524287);
    if (isSetContainedDigests())
      hashCode = hashCode * 8191 + containedDigests.hashCode();

    hashCode = hashCode * 8191 + ((isSetMissingDigests()) ? 131071 : 524287);
    if (isSetMissingDigests())
      hashCode = hashCode * 8191 + missingDigests.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RemoteExecutionContainsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetContainedDigests()).compareTo(other.isSetContainedDigests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContainedDigests()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.containedDigests, other.containedDigests);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMissingDigests()).compareTo(other.isSetMissingDigests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMissingDigests()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.missingDigests, other.missingDigests);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteExecutionContainsResponse(");
    boolean first = true;

    if (isSetContainedDigests()) {
      sb.append("containedDigests:");
      if (this.containedDigests == null) {
        sb.append("null");
      } else {
        sb.append(this.containedDigests);
      }
      first = false;
    }
    if (isSetMissingDigests()) {
      if (!first) sb.append(", ");
      sb.append("missingDigests:");
      if (this.missingDigests == null) {
        sb.append("null");
      } else {
        sb.append(this.missingDigests);
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

  private static class RemoteExecutionContainsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RemoteExecutionContainsResponseStandardScheme getScheme() {
      return new RemoteExecutionContainsResponseStandardScheme();
    }
  }

  private static class RemoteExecutionContainsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<RemoteExecutionContainsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteExecutionContainsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTAINED_DIGESTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list240 = iprot.readListBegin();
                struct.containedDigests = new java.util.ArrayList<Digest>(_list240.size);
                @org.apache.thrift.annotation.Nullable Digest _elem241;
                for (int _i242 = 0; _i242 < _list240.size; ++_i242)
                {
                  _elem241 = new Digest();
                  _elem241.read(iprot);
                  struct.containedDigests.add(_elem241);
                }
                iprot.readListEnd();
              }
              struct.setContainedDigestsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MISSING_DIGESTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list243 = iprot.readListBegin();
                struct.missingDigests = new java.util.ArrayList<Digest>(_list243.size);
                @org.apache.thrift.annotation.Nullable Digest _elem244;
                for (int _i245 = 0; _i245 < _list243.size; ++_i245)
                {
                  _elem244 = new Digest();
                  _elem244.read(iprot);
                  struct.missingDigests.add(_elem244);
                }
                iprot.readListEnd();
              }
              struct.setMissingDigestsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteExecutionContainsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.containedDigests != null) {
        if (struct.isSetContainedDigests()) {
          oprot.writeFieldBegin(CONTAINED_DIGESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.containedDigests.size()));
            for (Digest _iter246 : struct.containedDigests)
            {
              _iter246.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.missingDigests != null) {
        if (struct.isSetMissingDigests()) {
          oprot.writeFieldBegin(MISSING_DIGESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.missingDigests.size()));
            for (Digest _iter247 : struct.missingDigests)
            {
              _iter247.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteExecutionContainsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RemoteExecutionContainsResponseTupleScheme getScheme() {
      return new RemoteExecutionContainsResponseTupleScheme();
    }
  }

  private static class RemoteExecutionContainsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<RemoteExecutionContainsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteExecutionContainsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContainedDigests()) {
        optionals.set(0);
      }
      if (struct.isSetMissingDigests()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetContainedDigests()) {
        {
          oprot.writeI32(struct.containedDigests.size());
          for (Digest _iter248 : struct.containedDigests)
          {
            _iter248.write(oprot);
          }
        }
      }
      if (struct.isSetMissingDigests()) {
        {
          oprot.writeI32(struct.missingDigests.size());
          for (Digest _iter249 : struct.missingDigests)
          {
            _iter249.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteExecutionContainsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list250 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.containedDigests = new java.util.ArrayList<Digest>(_list250.size);
          @org.apache.thrift.annotation.Nullable Digest _elem251;
          for (int _i252 = 0; _i252 < _list250.size; ++_i252)
          {
            _elem251 = new Digest();
            _elem251.read(iprot);
            struct.containedDigests.add(_elem251);
          }
        }
        struct.setContainedDigestsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list253 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.missingDigests = new java.util.ArrayList<Digest>(_list253.size);
          @org.apache.thrift.annotation.Nullable Digest _elem254;
          for (int _i255 = 0; _i255 < _list253.size; ++_i255)
          {
            _elem254 = new Digest();
            _elem254.read(iprot);
            struct.missingDigests.add(_elem254);
          }
        }
        struct.setMissingDigestsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

