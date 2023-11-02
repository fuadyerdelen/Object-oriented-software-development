REM Variable JDK_PATH setzen (muss von Ihnen angepasst werden):
SET JDK_PATH=C:\Program Files\Java\openjdk-18.0.2.1

"%JDK_PATH%\bin\java" -Dfile.encoding=UTF8 -classpath "%JDK_PATH%\lib\tools.jar";. -jar .\Debugger.jar

REM Beispiel (altes JDK 8):
REM SET JDK_PATH=C:\Program Files\Java\jdk1.8.0_60   
REM "%JDK_PATH%\bin\java" -classpath "%JDK_PATH%\lib\tools.jar";. -jar .\Debugger.jar

PAUSE


