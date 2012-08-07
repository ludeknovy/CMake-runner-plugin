TeamCity CMake & Make Support Plugin
=============

Current status
--------------
![Status](http://teamcity.jetbrains.com/app/rest/builds/buildType:\(id:bt347\)/statusIcon)

Notice
------
See documentation at http://www.jetbrains.net/confluence/display/TW/CMake+Plugin

Building
--------
Build with IntelliJ IDEA. Don't forget to specify "TeamCityDistribution" variable as path to your TeamCity installation directory.

Sources
-------

 |- root
 |--- [cmake-runner-agent] - Agent's part of Teamcity CMake & Make Runners, JAVA sources
 |--- [cmake-runner-common] - Common code for Agent's and Server's parts or Teamcity CMake & Make Runners, JAVA
 |--- [cmake-runner-server] - Server's part of Teamcity CMake & Make Runners, JAVA
 |--- [cmake-runner-test] - Tests for cmake-runner. TeamCity tests API is required for running tests
 |--- [regex-parser] - Special xml-configurable parser module for per-line parsing, JAVA
 |--- [out] - Compilation output directory
 |--- [lib] - Libraries
 |--- build-hooks.xml - Special ant script for building plugin
 |--- copyright.txt - Copyright for sources
 |--- README.md - this file

Installation
------------
Just follow standard TeamCity plugin installation instructions.
Plugin file is "cmake-runner.zip" at "out/artifacts/plugin_zip" directory.
