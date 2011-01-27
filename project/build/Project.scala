/*
* Copyright 2010 Sanjiv Sahayam
* Licensed under the Apache License, Version 2.0
*/

import sbt._
import shortbread._
import shortbread.DefaultDrivers._

class Project(info:ProjectInfo) extends DefaultWebProject(info) with ShortbreadPlugin {

  override def driverSeq:Seq[NamedDriver] = Seq(DefaultFoxConfig.webDriver)
}