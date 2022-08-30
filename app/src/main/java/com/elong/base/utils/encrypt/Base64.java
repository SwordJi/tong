package com.elong.base.utils.encrypt;

public class Base64 {


    private static char[] a;
    private static byte[] c;

    static {
        Base64.a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        Base64.c = new byte[128];
        int i = 0;
        for (int i1 = i; i1 < Base64.c.length; i1 = i1 + 1) {
            Base64.c[i1] = 127;
        }
        char[] a = Base64.a;
        while (i < a.length) {
            Base64.c[a[i]] = (byte) i;
            i = i + 1;
        }
    }


    public static String a(byte[] p0) {
        return Base64.a(p0, 0, p0.length);
    }


    public static String a(byte[] p0, int p1, int p2) {
        int i4;
        int i = 3;
        if (p2 <= 0) {
            return "";
        }
        char[] charArray = new char[(((p2 / 3) * 4) + 4)];
        int i1 = 0;
        for (; p2 >= i; p2 = p2 - 3) {
            int i2 = (((p0[p1] & 0x00ff) << 16) + ((p0[(p1 + 1)] & 0x00ff) << 8)) + (p0[(p1 + 2)] & 0x00ff);
            int i3 = i1 + 1;
            char[] a = Base64.a;
            charArray[i1] = a[(i2 >> 18)];
            i1 = i3 + 1;
            charArray[i3] = a[((i2 >> 12) & 0x3f)];
            i3 = i1 + 1;
            charArray[i1] = a[((i2 >> 6) & 0x3f)];
            i1 = i3 + 1;
            charArray[i3] = a[(i2 & 0x3f)];
            p1 = p1 + 3;
        }
        if (p2 == 1) {
            i4 = p0[p1] & 0x00ff;
            p1 = i1 + 1;
            char[] a1 = Base64.a;
            charArray[i1] = a1[(i4 >> 2)];
            i1 = p1 + 1;
            charArray[p1] = a1[((i4 << 4) & 0x3f)];
            i4 = i1 + 1;
            charArray[i1] = '=';
            i1 = i4 + 1;
            charArray[i4] = '=';
        } else if (p2 == 2) {
            p2 = ((p0[p1] & 0x00ff) << 8) + (p0[(p1 + 1)] & 0x00ff);
            i4 = i1 + 1;
            char[] a2 = Base64.a;
            charArray[i1] = a2[(p2 >> 10)];
            i1 = i4 + 1;
            charArray[i4] = a2[((p2 >> 4) & 0x3f)];
            i4 = i1 + 1;
            charArray[i1] = a2[((p2 << 2) & 0x3f)];
            i1 = i4 + 1;
            charArray[i4] = '=';
        }
        return new String(charArray, 0, i1);
    }

}
