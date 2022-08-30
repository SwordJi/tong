package com.elong.framework.netmid.process;

import com.elong.base.utils.encrypt.Base64;

import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

import java.nio.charset.StandardCharsets;

public class ProcessUtils {


    private static byte[] a;

    static {
        ProcessUtils.a = new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
    }

    public static  String a(String p0, String p1) {

        try {
            PaddedBufferedBlockCipher paddedBuffer = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
            paddedBuffer.init(true, new ParametersWithIV(new KeyParameter(p1.getBytes()), ProcessUtils.a));
            byte[] bytes = p0.getBytes(StandardCharsets.UTF_8);
            byte[] bytearray = new byte[paddedBuffer.getOutputSize(bytes.length)];
            int i = paddedBuffer.processBytes(bytes, 0, bytes.length, bytearray, 0);
            byte[] byteArray1 = new byte[(i + paddedBuffer.doFinal(bytearray, i))];
            System.arraycopy(bytearray, 0, byteArray1, 0, byteArray1.length);
            return Base64.a(byteArray1);
        } catch (Exception e10) {
            System.out.println(p0);
        }
        return null;
    }


}
