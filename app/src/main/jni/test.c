#include "andro_jf_jni_NativeCodeInterface.h"
JNIEXPORT jint JNICALL Java_andro_jf_jni_NativeCodeInterface_calcul1
  (JNIEnv * je, jclass jc, jint a, jint b)
{
   return a+b;
}

