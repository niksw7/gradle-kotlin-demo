# gradle-kotlin-demo
This is a sample application written in Kotlin to package the application as fat jar.

<b>./gradlew build<br/>
java -jar build/libs/gradle-kotlin-demo-0.0.1.jar</b>

The intent of this project is to get a shippable jar out of kotlin source code.
And to avoid getting entangled in java.lang.NoClassDefFoundError errors.  
eg: This [branch](https://github.com/niksw7/gradle-kotlin-demo/tree/failing_jar) has code for failing jar which produces this error output 
```
Exception in thread "main" java.lang.NoClassDefFoundError: kotlin/jvm/internal/Intrinsics
	at com.loreans.demo.GreeterApplicationKt.main(GreeterApplication.kt)
Caused by: java.lang.ClassNotFoundException: kotlin.jvm.internal.Intrinsics
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
  ```
  
 The fix has been provided in [here](https://github.com/niksw7/gradle-kotlin-demo/tree/master)
