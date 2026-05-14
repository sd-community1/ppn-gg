// 1. التعريفات الأساسية في البداية
plugins {
    id("com.android.library")
    kotlin("android")
    id("com.lagradost.cloudstream3.gradle")
}

// 2. إعدادات الأندرويد (تأكد من كتابتها داخل بلوك android)
android {
    namespace = "com.iraq.cee"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

// 3. تأكد من إضافة هذا الجزء لكي يعرف من أين يحمل المكتبات
repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // هنا توضع المكتبات الإضافية إذا احتجت مستقبلاً
}
