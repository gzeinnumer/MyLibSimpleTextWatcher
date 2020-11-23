<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibUtils/blob/master/preview/bg.jpg" width="400"/>
</p>

<h1 align="center">
    MyLibUtils
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Remove Useless Function TextWacher.</p>
</p>

---
## Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:MyLibSimpleTextWatcher:version'
}
```

## Feature List
- [x] **beforeTextChanged.**
- [x] **onTextChanged.**
- [x] **afterTextChanged.**

## Tech stack and 3rd library
- TextWatcher ([docs](https://developer.android.com/reference/android/text/TextWatcher))

---
## USE

### Before
> **Java**
```java
editText.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
    }

    @Override
    public void afterTextChanged(Editable s) {
        Log.d(TAG, "afterTextChanged: "+s.toString());
    }
});
```
> **Kotlin**
```kotlin
editText.addTextChangedListener(object : TextWatcher {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        Log.d(TAG, "beforeTextChanged: " + s + "_" + start + "_" + count + "_" + after)
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        Log.d(TAG, "onTextChanged: " + s + "_" + start + "_" + before + "_" + count)
    }

    override fun afterTextChanged(s: Editable) {
        Log.d(TAG, "afterTextChanged: $s")
    }
})
```
#
### beforeTextChanged.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new SimpleTextWatcher.TWBeforeTextChanged() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
    }
}));
```
> **Kotlin**
```kotlin
editText.addTextChangedListener(SimpleTextWatcher(object : SimpleTextWatcher.TWBeforeTextChanged {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        Log.d(TAG, "beforeTextChanged: " + s + "_" + start + "_" + count + "_" + after)
    }
}))
```

#
### onTextChanged.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new SimpleTextWatcher.TWnOnTextChanged() {
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
    }
}));
```
> **Kotlin**
```kotlin
editText.addTextChangedListener(SimpleTextWatcher(object : SimpleTextWatcher.TWnOnTextChanged {
    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        Log.d(TAG, "onTextChanged: " + s + "_" + start + "_" + before + "_" + count)
    }
}))
```

#
### **afterTextChanged.**
To check your date is in range between 2 date or not.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new SimpleTextWatcher.TWAfterTextChanged() {
    @Override
    public void afterTextChanged(Editable s) {
        Log.d(TAG, "afterTextChanged: "+s.toString());
    }
}));
```
> **Kotlin**
```kotlin
editText.addTextChangedListener(SimpleTextWatcher(object : SimpleTextWatcher.TWAfterTextChanged {
    override fun afterTextChanged(s: Editable) {
        Log.d(TAG, "afterTextChanged: $s")
    }
}))
```

---

### Version
- **1.0.0**
  - First Release

---

### Contribution
You can sent your constibution to `branche` `open-pull`.

---

```
Copyright 2020 M. Fadli Zein
```
