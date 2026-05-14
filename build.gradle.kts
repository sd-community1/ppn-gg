import com.lagradost.cloudstream3.gradle.CloudstreamExtension

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.lagradost.cloudstream3.gradle")
}

android {
    namespace = "com.iraq.cee"
    compileSdk = 33
}

cloudstream {
    // إعدادات بناء الإضافة
}
