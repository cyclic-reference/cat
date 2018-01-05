package io.acari.intro;

public class IPv4Validator {


  /**
   * An IP address is a numerical label assigned to each device
   * (e.g., computer, printer) participating in a computer network
   * that uses the Internet Protocol for communication.
   *
   * There are two versions of the Internet protocol, and thus two versions of addresses.
   * One of them is the IPv4 address.
   *
   * IPv4 addresses are represented in dot-decimal notation,
   * which consists of four decimal numbers, each ranging
   * from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.
   *
   * Given a string, find out if it satisfies the IPv4 address naming rules.
   * @param inputString
   * @return if it satisfies the IPv4 address naming rules.
   */
  boolean isIPv4Address(String inputString) {
    return inputString.matches("((25[0-5]|2[0-4][0-9])|(1[0-9]{2})|([0-9]?[0-9]))\\.((25[0-5]|2[0-4][0-9])|(1[0-9]{2})|([0-9]?[0-9]))\\.((25[0-5]|2[0-4][0-9])|(1[0-9]{2})|([0-9]?[0-9]))\\.((25[0-5]|2[0-4][0-9])|(1[0-9]{2})|([0-9]?[0-9]))");
  }
}
