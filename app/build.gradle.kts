plugins {
    alias(libs.plugins.android.application)
//    id("com.android.application")

}

android {
    namespace = "com.vote"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.vote"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("com.airbnb.android:lottie:6.4.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.airbnb.android:lottie:6.4.0")

    implementation("com.google.firebase:firebase-analytics:22.0.0")

    implementation("com.google.firebase:firebase-firestore-ktx")

    implementation("com.google.firebase:firebase-auth:23.0.0")
    implementation("com.google.firebase:firebase-firestore:25.0.0")
    implementation("com.google.firebase:firebase-storage:21.0.0")

    implementation("com.theartofdev.edmodo:android-image-cropper:2.8.+")
}