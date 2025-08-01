

plugins {
    alias(libs.plugins.deeplinkLauncher.composeMultiplatform)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.feature.deeplink.api)
            implementation(projects.feature.settings.api)
            implementation(projects.feature.dataTransfer.api)
            implementation(projects.library.purchase.api)

            implementation(projects.core.preferences)
            implementation(projects.core.designsystem)
            implementation(projects.core.navigation)
            implementation(projects.core.platform)
            implementation(projects.core.coroutines)
            implementation(projects.core.uiEvent)

            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.viewmodel)
            implementation(libs.kotlinx.immutable)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.aboutlibraries.compose)

            implementation(libs.compose.navigation)

            implementation(compose.components.uiToolingPreview)
        }
    }
}

dependencies {
    debugImplementation(libs.androidx.ui.tooling)
}