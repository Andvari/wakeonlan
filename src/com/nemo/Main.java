package com.nemo;

import java.io.IOException;
import java.net.*;


public class Main {

    public static void main(String[] args) throws IOException {

        byte[] addr = {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};

        byte[] kdg =
                {
                        (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                };


        DatagramSocket s = new DatagramSocket(null);
        DatagramPacket p = new DatagramPacket(kdg, kdg.length);

        p.setAddress(InetAddress.getByAddress(addr));

        s.setBroadcast(true);
        s.send(p);

    }
}
