plugins {
    id("com.android.application")
}

android {
    namespace = "com.AdeebTechLab.RahamTV"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.AdeebTechLab.RahamTV"
        minSdk = 24
        targetSdk = 35
        versionCode = 8
        versionName = "0.8"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.27")

    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")

}