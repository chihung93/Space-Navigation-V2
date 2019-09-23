
# Tech Docs 
[![Kotlin 1.3.41](https://img.shields.io/badge/kotlin-1.3.41-brightgreen)](https://kotlinlang.org/)

![MIT License](https://img.shields.io/github/license/ammaratef45/Attendance.svg)

[![](https://jitpack.io/v/chihung93/Space-Navigation-V2.svg)](https://jitpack.io/#chihung93/Space-Navigation-V2)
## Overview

**Litho Exmaple  with Kotlin** is a opensource for Beginer who have applied for social network app look like facebok.
 - Requirements 
	 - Android 5.0+
	- Android Studio 3.4.2
    
### Tech Stack

**Android Developer Programming Task** uses a number of open source projects to work properly:

* [Google Support Libraries](https://developer.android.com/jetpack) - Google libraries : Appcompat, Design, ConstraintLayout, Recyclerview, CardView, Navigation, Paging.
* [RxJava/RxAndroid](https://github.com/ReactiveX/RxAndroid) - RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
* [Retrofit](https://github.com/square/retrofit) - Type-safe HTTP client for Android and Java by Square, Inc.
* [Dagger2](https://github.com/google/dagger) - A fast dependency injector for Android and Java.
* [Espresso](https://developer.android.com/training/testing/espresso) - Use Espresso to write concise, beautiful, and reliable Android UI tests
* [Glide](https://bumptech.github.io/glide/) - Glide is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.

* [Litho](https://fblitho.com/docs/tutorial)- Litho is a declarative framework for building efficient user interfaces (UI) on Android. It allows you to write highly-optimized Android views through a simple functional API based on Java annotations. It was  [primarily built](https://fblitho.com/docs/uses)  to implement complex scrollable UIs based on RecyclerView..
### Installation

In general, the steps necessary to build the APK file:

1. Install git 
3. Install and setup Android Studio.
4. Use git to clone the source code from the central Github repository where the developers have put the actual code for the app. 
` git clone https://github.com/litho-kotlin-android/hungnguyen.git`
5. Open the cloned project in Android Studio as active project.
6. Build the signed APK.
7. Transfer the signed APK to your smart phone.

## Install
**Step 1.**  Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.**  Add the dependency
```css
dependencies {
	        implementation 'com.github.chihung93:Space-Navigation-V2:1.0'
	}
```
License
----
Project is released under the MIT license.
See [LICENSE](LICENSE) for details.
