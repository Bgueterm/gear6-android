package com.shift.gear6.adapters

import android.bluetooth.BluetoothAdapter
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

class BlueToothAdapter : IAdapter {
    private var socket: Socket? = null

    constructor()
    {
        /*var adapter = BluetoothAdapter.getDefaultAdapter()
        if (adapter == null)
        {
            throw NullPointerException("Bluetooth is not available on this device")
        }*/

        throw NotImplementedError("Bluetooth adapter is not yet implemented")
    }

    override fun getInputStream(): InputStream {
        return getInputStream()
    }

    override fun getOutputStream(): OutputStream {
        return getOutputStream()
    }
}