
Please be aware that OnTrack is still under active development and as
such, several of the features are still implemented in a prototypical
manner. If you experience any problems or have any questions on
running any parts of the tool please contact: cspj@swansea.ac.uk

******************
Required Software:
******************

An Eclipse installation with EMF, GMF and Epsilon is required to run
these projects. A ready to use distribution with all the required
components can be found here: http://www.eclipse.org/epsilon/download/


*********************************
Importing OnTrack:
*********************************

To import the full OnTrack editor into your eclipse workspace, Select
File -> Import -> Existing Projects into Workspace. Then select the
following projects from the zip folder:

Bjoerner_Complete
Bjoerner_Complete.edit
Bjoerner_Complete.editor
Bjoerner_Complete.tests
Bjoerner_Complete.diagram
Bjoerner_Generator

Once imported, the Bjoerner_Generator project will have errors
present. To solve these, remove all the external Jars from the
libraries list in the Java Build Path for the project. Then click Add
External Jars... and add all files in the
GeneratorReferencedLibraries.zip file.

The project should now be error free!


*****************************
Using the track plan editor:
*****************************

Right-click the Bjoerner_Complete.diagram project that you have
imported above. Select Run as -> Eclipse Application. This will launch
another Eclipse instance.

Within this new workspace, create a new general project to contain
your track plan diagrams.

Right-click on the project and select New -> Example...

Select BjoernerComplete diagram and confirm a name. This will create 2
files, a .bjoernercomplete file which will contain the model instance
and a .bjoernercomplete_diagram file.

A track plan can be constructed using the elements from the palette
window.  Some example files can also be copy/pasted from the
Bjoerner_Complete.zip:

Bjoerner_Generator/models/doublejunction.bjoernercomplete
Bjoerner_Generator/models/doublejunction.bjoernercomplete_diagram

To generate the Control Table for the track plan, a wizard currently
needs to be imported. Copy the following file from the
Bjoerner_Complete.zip to the new project:

Bjoerner_Generator/Epsilon/Bjoerner_Complete_Wizards.ewl

To register the wizard, select 'Eclipse' -> 'Preferences...' and
navigate to the 'Epsilon -> 'EMF/GMF Wizards' screen. Click 'Add...'
and select the http://bjoernercomplete/1.0 EPackage from the list and
enter the above .ewl filename into the Wizards field. Click OK to
close the preferences window

To use the wizard, right-click on the track plan background and select
'Wizards' -> 'Generate Control Table'. This will create a control
table containing all the possible routes in the plan. The state of the
control table will be output to the console and a blank node
representing the control table will be added to the track plan.

The routes that are included in the control table can then be edited
in the Properties view. The current status of the control table can be
viewed by right-clicking the control table object and selecting
'Wizards' -> 'Display Control Table'.


*****************************
Using the Generator project:
*****************************

The generation process for CSPB||B and CASL have not yet been
implemented as wizards for the editor. Currently they can be accesses
via the java classes, for example for CSP||B:

Bjoerner_Generator/src/tool/TrackScheme2CSPB.java

To run this generation process requires an input track plan
model. Once a track plan and it's control table have been created in
the track plan editor, copy and paste the .bjoernercomplete file to
the Bjoerner_Generator/models folder (in the original eclipse window).

Edit the main method of the java class so when the constructor is
called the filename of the model is passed in.

The generate() method performs translation of the model and processes
one template file to produce output scripts. The main method is
currently setup to process all files in the
Bjoerner_Generator/templates folder. The program assumes that a
corresponding .etl file exists in the Bjoerner_Generator/Epsilon with
the same name as the template file. This controls the translation of
the source model and an error will occur if not present.

Generated scripts are created in the Bjoerner_Generator/output folder
within a unique date_time folder.

The program will produce multiple versions of the output files
depending on how many trains are required for verification by the
input model. This can be set to a fixed value by setting constant
numTrains to a value greater than zero in the constants list. An
upper-limit, MAX_TRAINS, can also be set.

Note: In a similar manner, the abstraction process for computing
abstract version of a scheme plan can be run through using the
following java file:

Bjoerner_Generator/src/tool/Abstraction.java


*********************************
The Track Plan Editor Source Files:
*********************************

The main GMF files for the editor are contained within the
Bjoerner_Complete folder:

Bjoerner_Complete/model/BjoernerComplete.ecore
Bjoerner_Complete/model/BjoernerComplete.gmfgraph
Bjoerner_Complete/model/BjoernerComplete.gmfmap
Bjoerner_Complete/model/BjoernerComplete.gmftool

**If required (although this should not be the case)**, these can be
used to regenerate the track plan editor through the following steps:

1. Using the 'GMF Dashboard' view in Eclipse select the
BjoernerComplete.ecore as the domain model, BjoernerComplete.gmfgraph
as the Graphical Def Model, BjoernerComplete.gmftool as the Tooling
Def Model and BjoernerComplete.gmfmap as the Mapping Model.

2. Click 'Derive' above the Domain Gen Model in the GMF
Dashboard. Confirm the name for the model, click Next, Select 'Ecore
model'. then Next, load the model, click Next and then Finish.

3. The .genmodel file should automatically open. Right click on the
'BjoernerComplete' element and select 'Generate All'.

4. In the GMF Dashboard click 'Transform'. This should create a
.gmfgen file in the model folder

5, In the GMF Dashboard click Generate diagram editor.


*********************************
The Generator Source Files:
*********************************

The main Epsilon files for various model transformations are contained
within the Bjoerner_Generator folder:

Bjoerner_Generator/Epsilon/ -- Contains the main Epsilon files for
computing Control Tables, Abstractions, and generating CSP||B and CASL.

Bjoerner_Generator/src/ -- Contains the java files associated with
running the above model transformations.

Bjoerner_Generator/templates/ -- Contains CSP and B templates used
within the CSP||B generation process.

Bjoerner_Generator/models/ -- Contains example scheme plan models
created by the OnTrack editor, also contains examples of computed
abstractions of these models.

Bjoerner_Generator/output/ -- Folder where generated CSP||B
verification scripts will be placed when running the generation
process.
