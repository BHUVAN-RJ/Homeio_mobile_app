# Homeio

Android companion app for a Homeio smart home setup. The app presents a simple touch UI for a house: a home screen that greets the user based on the time of day and links out to per room screens where lights and appliances are listed as buttons.

This is an early prototype from December 2023. The navigation and the screen layouts work, but the app does not yet talk to any hardware.

## What is in the app

- `MainActivity`: shows a greeting that changes with the hour (morning, afternoon, evening, night) and holds buttons for Living Room, Bedroom 1, Bedroom 2, Kitchen and Master. Kitchen and Bedroom 1 are the two that currently open a screen.
- `Kitchen`: a Lights section (Light 1, Light 2) and an Appliances section (Microwave, Mixer), plus a back button. Tapping Light 1 changes its button colour locally to indicate an on state.
- `Bedroom1`: the bedroom layout with a back button.

## Current limitations

- No device control is implemented. OkHttp and Volley are declared as dependencies and an `OkHttpClient` is created in `MainActivity`, but the request URL is an empty string, so nothing is sent anywhere.
- Only two of the five room buttons lead to a screen.
- The user name in the greeting is hard coded.
- The test sources are the default Android Studio template tests.

## Tech

- Java, Android SDK, `compileSdk` 32, `minSdk` 21, `targetSdk` 32
- Gradle with the Android Gradle plugin
- AndroidX AppCompat, Material Components, ConstraintLayout
- OkHttp and Volley (declared, not yet used)

## Build and run

Open the project in Android Studio and run the `app` module on a device or emulator running Android 5.0 or newer, or build from the command line:

```
./gradlew assembleDebug
```

The APK is written to `app/build/outputs/apk/debug/`.
