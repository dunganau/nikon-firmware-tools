package com.nikonhacker.emu.peripherials.serialInterface;

/**
 * External emulated devices that wish to be connected to a MicroController's Serial Interface must :
 * - implement this interface to be informed when data transmitted by the MCU is ready and when config changes
 * - call SerialInterface.read() to obtain these values
 * - call SerialInterface.write() to transmit data back to the MCU
 *
 * @see SerialInterface
 */
public interface SerialInterfaceListener {
    public void onValueReady(SerialInterface serialInterface);
    public void onBitNumberChange(SerialInterface serialInterface, int numBits);
}
