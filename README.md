
# react-native-ahs-native-helper

## Getting started

`$ npm install react-native-ahs-native-helper --save`

### Mostly automatic installation

`$ react-native link react-native-ahs-native-helper`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-ahs-native-helper` and add `RNAhsNativeHelper.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAhsNativeHelper.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAhsNativeHelperPackage;` to the imports at the top of the file
  - Add `new RNAhsNativeHelperPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-ahs-native-helper'
  	project(':react-native-ahs-native-helper').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-ahs-native-helper/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-ahs-native-helper')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAhsNativeHelper.sln` in `node_modules/react-native-ahs-native-helper/windows/RNAhsNativeHelper.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Ahs.Native.Helper.RNAhsNativeHelper;` to the usings at the top of the file
  - Add `new RNAhsNativeHelperPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAhsNativeHelper from 'react-native-ahs-native-helper';

// TODO: What to do with the module?
RNAhsNativeHelper;
```
  