/*
* Copyright 2010 Sanjiv Sahayam
* Licensed under the Apache License, Version 2.0
*/

import sbt._

class Plugins(info:ProjectInfo) extends PluginDefinition(info) {
  val shortbread = "com.github.ssanj" % "shortbread" % "0.0.11"
}