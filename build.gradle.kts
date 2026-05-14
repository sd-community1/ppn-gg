import com.lagradost.cloudstream3.gradle.CloudstreamExtension

// 1. تعريف من أين يحمل البرنامج الأدوات (Plugins)
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
    }
}

// 2. تفعيل الأدوات
apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// 3. إعدادات الأندرويد
android {
    namespace = "com.iraq.cee"
    compileSdk = 33
    
    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

// 4. إعدادات كلودستريم
configure<CloudstreamExtension> {
    // يمكنك تركها فارغة حالياً
}
