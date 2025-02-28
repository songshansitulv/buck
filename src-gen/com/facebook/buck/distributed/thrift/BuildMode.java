/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public enum BuildMode implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  REMOTE_BUILD(1),
  DISTRIBUTED_BUILD_WITH_REMOTE_COORDINATOR(2),
  DISTRIBUTED_BUILD_WITH_LOCAL_COORDINATOR(3),
  LOCAL_BUILD_WITH_REMOTE_EXECUTION(4);

  private final int value;

  private BuildMode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static BuildMode findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return REMOTE_BUILD;
      case 2:
        return DISTRIBUTED_BUILD_WITH_REMOTE_COORDINATOR;
      case 3:
        return DISTRIBUTED_BUILD_WITH_LOCAL_COORDINATOR;
      case 4:
        return LOCAL_BUILD_WITH_REMOTE_EXECUTION;
      default:
        return null;
    }
  }
}
