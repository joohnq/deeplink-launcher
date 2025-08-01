

plugins {
    alias(libs.plugins.deeplinkLauncher.composeMultiplatform)
}

kotlin {
    explicitApi()

    sourceSets {
        commonMain.dependencies {
            implementation(projects.feature.deeplink.api)
            implementation(projects.feature.deeplink.uiComponent)
            implementation(projects.core.preferences)
            implementation(projects.core.date)
            implementation(projects.core.database)
            implementation(projects.core.designsystem)
            implementation(projects.core.navigation)
            implementation(projects.core.platform)
            implementation(projects.core.coroutines)
            implementation(projects.core.ui)

            implementation(libs.koin.core)
            implementation(libs.koin.viewmodel)
            implementation(libs.sqldelight.coroutines.extensions)
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.immutable)

            implementation(libs.compose.navigation)
            implementation(libs.material3.windowSizeClass)
            implementation(compose.components.uiToolingPreview)
        }

        jvmMain.dependencies {
            implementation(projects.library.deviceBridge.api)
        }
    }
}

dependencies {
    debugImplementation(libs.androidx.ui.tooling)
}