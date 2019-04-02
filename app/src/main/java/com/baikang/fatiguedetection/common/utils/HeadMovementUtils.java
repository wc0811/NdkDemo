package com.baikang.fatiguedetection.common.utils;

public class HeadMovementUtils {
    static {
        System.loadLibrary("headmovement-lib");
    }

    public static native float[] getResult(float x, float y, float z,
                                           float wx, float wy, float wz,
                                           float mfx, float mfy, float mfz);
}
