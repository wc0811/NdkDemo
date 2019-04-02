#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jfloatArray JNICALL
Java_com_baikang_fatiguedetection_common_utils_HeadMovementUtils_getResult(JNIEnv *env, jclass type,
                                                                           jfloat x, jfloat y,
                                                                           jfloat z, jfloat wx,
                                                                           jfloat wy, jfloat wz,
                                                                           jfloat mfx, jfloat mfy,
                                                                           jfloat mfz) {

    // TODO
    jfloatArray jfloatArray;
    //在这个位置处理算法


    return jfloatArray;
}