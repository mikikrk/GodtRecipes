buildscript {
    val kotlinVersion: String by extra {
        "1.3.11"
    }

    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.1")
        classpath(kotlin("gradle-plugin", kotlinVersion))
    }
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://maven.google.com")
    }
}

task(name = "clean", type = Delete::class) {
    delete(rootProject.buildDir)
}
