# LongLog
LongLog is a very simple library that can print large data on Logcat for debugging purpose.

##Setup
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```
Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.p4rv3z:LongLog:v-1.0.0'
	}
```

##How to use:
```
_L.d(TAG, MESSAGE); //DEBUG log message
_L.v(TAG, MESSAGE); //VERBOSE log message.
_L.i(TAG, MESSAGE); //INFO log message.
_L.w(TAG, MESSAGE); //WARN log message.
_L.e(TAG, MESSAGE); //ERROR log message.
_L.wtf(TAG, MESSAGE); //What a Terrible Failure log message.
```
We can also use these function with default *TAG* and the default TAG is *_LONG_LOG__*
```
_L.d(MESSAGE); //DEBUG log message
_L.v(MESSAGE); //VERBOSE log message.
_L.i(MESSAGE); //INFO log message.
_L.w(MESSAGE); //WARN log message.
_L.e(MESSAGE); //ERROR log message.
_L.wtf(MESSAGE); //What a Terrible Failure log message.
```
