A simple project for demonstrating the use of [Shortbread](http://github.com/ssanj/Shortbread).

#Building from source

    git clone git@github.com:ssanj/Shortbread-Sample.git
    cd Shortbread-Sample
    sbt
    update

#Running QUnit tests

    shob

#Selecting why browsers to run

 Firefox is the default browser. Customize which browsers run by overriding driverSeq in `project/build/Project.scala` file:
    override def driverSeq:Seq[NamedDriver] = Seq(add_your_drivers_here) 
    
Eg. If you want to run both Firefox and Chrome browsers, then remove the following line in `project/build/Project.scala`
    override def driverSeq:Seq[NamedDriver] = Seq(DefaultFoxConfig.webDriver)

A list of default browsers/drivers can be found in [DefaultDrivers](Shortbread/blob/master/src/main/scala/DefaultDrivers.scala). You can add a sequence of these drivers to driverSeq to run the QUnit tests in various browsers.
