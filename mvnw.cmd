@echo off
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one or more
@REM contributor license agreements.  See the NOTICE file distributed with
@REM this work for additional information regarding copyright ownership.
@REM The ASF licenses this file to You under the Apache License, Version 2.0
@REM (the "License"); you may not use this file except in compliance with
@REM the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Maven2 Start Up Batch script
@REM
@REM Required ENV vars:
@REM ------------------
@REM   JAVA_HOME - location of a JDK home dir
@REM
@REM Optional ENV vars
@REM ------------------
@REM   M2_HOME - location of a Maven2 installation
@REM   MAVEN_OPTS - parameters passed to the Java VM when running Maven
@REM     e.g. to debug Maven itself, use
@REM       set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000
@REM   MAVEN_SKIP_RC - flag to disable loading of mavenrc files
@REM ----------------------------------------------------------------------------

@REM Get the absolute path of this batch script
setlocal
set MAVEN_PROJECTBASEDIR=%~dp0..

@REM Resolve any symbolic links
for %%I in ("%MAVEN_PROJECTBASEDIR%") do set MAVEN_PROJECTBASEDIR=%%~dpI
cd /D "%MAVEN_PROJECTBASEDIR%"

set EXEC="%MAVEN_PROJECTBASEDIR%/.mvn/wrapper/maven-wrapper.jar"
if not exist %EXEC% (
    echo Error: The wrapper jar file does not exist at: %EXEC%
    exit /B 1
)

@REM Ensure JAVA_HOME is set
if not defined JAVA_HOME (
    echo Error: JAVA_HOME environment variable is not defined correctly.
    echo We cannot execute %EXEC%.
    exit /B 1
)

@REM Check for leading quote
set EXECJAVA=%JAVA_HOME%\bin\java.exe
if "%EXECJAVA:~0,1%"=="""" (
    set EXECJAVA=%EXECJAVA:~1%
    set EXECJAVA=%EXECJAVA:~0,-1%
)

"%EXECJAVA%" %MAVEN_OPTS% -classpath "%MAVEN_PROJECTBASEDIR%/.mvn/wrapper/maven-wrapper.jar" "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" org.apache.maven.wrapper.MavenWrapperMain %*
