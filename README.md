# OnTrack

*Please be aware that OnTrack is still under active development and as such, several of the features are still implemented in a prototypical manner.*
*If you experience any problems or have any questions on running any parts of the tool please contact: cspj@swansea.ac.uk*

The OnTrack toolset automates workflows for railway verification, starting with graphical scheme plans and finishing with automatically generated formal models set up for verification. OnTrack is grounded on an established [domain specification language](https://en.wikipedia.org/wiki/Domain-specific_language) (DSL) and is generic in the formal specification languages used. Using a DSL allows the formulation of abstractions that work for verification in several formal specification languages.

## The Team

* [Dr Helen Treharne](http://www2.surrey.ac.uk/computing/people/helen_treharne/)
* [Professor Steve Schneider](http://www2.surrey.ac.uk/computing/people/steve_schneider/)
* [Markus Roggenbach](http://www.cs.swan.ac.uk/~csmarkus/)
* [Phillip James](http://cs.swan.ac.uk/~cspj/)
* [Jorden Whitefield](http://uk.linkedin.com/in/jwhitefield/)
* Matthew Trumble

## Prerequisites

The following is required to run these projects:

* [Eclipse Epsilon](http://www.eclipse.org/epsilon/download/)
* [Java 7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
* [ProB](http://www.stups.uni-duesseldorf.de/ProB/index.php5/Download)

## Running OnTrack

To import the full OnTrack editor into your eclipse workspace, Select:

`File -> Import -> Existing Projects into Workspace`

Then select the following projects from the zip folder:

* Bjoerner_Complete
* Bjoerner_Complete.edit
* Bjoerner_Complete.editor
* Bjoerner_Complete.tests
* Bjoerner_Complete.diagram
* Bjoerner_Generator

**Once imported, the Bjoerner_Generator project will have errors present.** 

To solve these, remove all the external Jars from the libraries list in the Java Build Path for the project. Then click Add
External Jars... and add all files in the
GeneratorReferencedLibraries file.

*Currently working on a `Tycho` and `Gradle` build process in place, therefore updating libraries and adding where needed without the need to do it manually.*

The project should now be error free!

Right-click the `Bjoerner_Complete.diagram` project that you have imported above. Select:

`Run as -> Eclipse Application`

This will launch another Eclipse instance.

See [Using OnTrack](https://github.com/lordqwerty/OnTrack/blob/master/Using%20OnTrack.md) for more details.

## References

* [CSP||B](http://csp-b.org/)
* [CASL](http://www.informatik.uni-bremen.de/cofi/wiki/index.php/CoFI)
* [CSP Book](http://www.usingcsp.com/cspbook.pdf)
* [Epsilon](http://www.eclipse.org/epsilon/)

# To do

* Update GMF files once all the EMFs have been updated. 