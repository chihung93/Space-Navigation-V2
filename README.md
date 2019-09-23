
# Tech Docs 
[![Kotlin 1.3.41](https://img.shields.io/badge/kotlin-1.3.41-brightgreen)](https://kotlinlang.org/)

![MIT License](https://img.shields.io/github/license/ammaratef45/Attendance.svg)

[![](https://jitpack.io/v/chihung93/Space-Navigation-V2.svg)](https://jitpack.io/#chihung93/Space-Navigation-V2)
## Overview
# Space-Navigation-V2 
Space Navigation is a library allowing easily integrate fully customizable Google Spaces like navigation to your app.

[Fork from https://github.com/armcha/Space-Navigation-View] 

**I have converted Space Navigation View from Java to Kotlin**

Some Changes:
1. Remove features Icon and Text on the same line 
2. Put text under icon
3. Migrate to Android X and Kotlin 
4. Minimum SDK 21 - Target 29
5. Replace all of ***Deprecated*** API to news API.

### Installation

In general, the steps necessary to build the APK file:

1. Install git 
3. Install and setup Android Studio.
4. Use git to clone the source code from the central Github repository where the developers have put the actual code for the app. 
` git clone https://github.com/chihung93/Space-Navigation-V2.git`
5. Open the cloned project in Android Studio as active project.
6. Build the signed APK.
7. Transfer the signed APK to your smart phone.

## Install
**Step 1.**  Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { 
			url 'https://jitpack.io' 
			}
		}
	}
```
**Step 2.**  Add the dependency
```
dependencies {
	implementation 'com.github.chihung93:Space-Navigation-V2:{lasted_version}'
	}
```

## Usage
Please check on this link https://github.com/armcha/Space-Navigation-View

License
----
Project is released under the MIT license.
See [LICENSE](LICENSE) for details.
