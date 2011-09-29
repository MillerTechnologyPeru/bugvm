#include <nullvm.h>

Class* Java_java_lang_reflect_Field_getDeclaringClass(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return field->clazz;
}

Object* Java_java_lang_reflect_Field_getName(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return nvmNewStringUTF(env, field->name, -1);
}

jint Java_java_lang_reflect_Field_getModifiers(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return field->access & 0xffff; // Hide NullVM special flags
}

Class* Java_java_lang_reflect_Field_getType(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return nvmFindClassByDescriptor(env, field->desc, field->clazz->classLoader);
}

Object* Java_java_lang_reflect_Field_getSignatureAttribute(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return nvmAttributeGetFieldSignature(env, field);
}

ObjectArray* Java_java_lang_reflect_Field_getDeclaredAnnotations(Env* env, Class* clazz, jlong fieldPtr) {
    Field* field = (Field*) fieldPtr;
    return nvmAttributeGetFieldRuntimeVisibleAnnotations(env, field);
}

