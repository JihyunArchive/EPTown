plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
}