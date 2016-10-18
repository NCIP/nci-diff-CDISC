# nci-diff-CDISC
diff specific for CDISC reports

CDISC Changes Report Generator v2.0
===================================

This program will generate a changes report between two CDISC releases.
The releases may span any amount of time.

Requirements (with install commands for *nix gurus)
---------------------------------------------------
Git (sudo apt-get install git)

Apache Ant (sudo apt-get install ant)

Java Developers Kit (sudo apt-get install openjdk-8-jdk)

Building the program
--------------------

Download this entire project as a .zip.

OR

Clone the DiffCDISC repository onto your local filesystem using Git:

C:\> git clone https://github.com/NCIEVS/diff-cdisc.git

Open a Command Prompt and navigate to the repository directory.

Run an ant build

C:\DiffCDISC> ant build

This will create a 'classes' and add a jar file to the 'dist' directory 
where program dependancies are stored.  The program is now ready to run.

NOTE: If the build fails, you may need to inspect your ant configurations.
See: https://ant.apache.org/manual/

Preparing data for the program
------------------------------

Users should pull two reports in .txt format from the same EVS CDISC
Archive directory (e.g., ADaM, SDTM, SEND).

Included in this repository are two example reports from the SDTM Archive
directory.  The example below will demonstrate how to run the program
using these two files.

Running the program
-------------------

Each report is input into the program (newest followed by oldest),
followed by a "release date" and then the filename of the output.

C:\DiffCDISC\dist>RunChanges "..\docs\SDTM Terminology 2015-09-25.txt" "..\docs\SDTM Terminology 2015-06-26.txt" "9/25/2015" Changes.txt

Initializing diff report...

Getting changes...

Printing changes report...

About the program
-----------------

The following changes between CDISC releases are detected.  In the event 
of an Update, original and new values are reported.

- Add new CDISC Synonym
- Add new term to existing codelist
- Add new term to new codelist
- Addition of new codelist
- Remove CDISC Synonym
- Remove term entirely from codelist
- Remove term from retired codelist
- Retire codelist
- Update CDISC Codelist Name
- Update CDISC Definition
- Update CDISC Extensible List
- Update CDISC Submission Value
- Update CDISC Synonym
- Update NCI Preferred Term

Known issues
------------

The 'Request Code' column will always be empty as they are stored in the
JIRA tracking system.  This column is manually populated by EVS before
each quarterly release.

Version 2.0 was implemented in 2015

Release notes between 1.0 and 2.0
---------------------------------

1. Initialize the diff program if and only if there are 4 program arguments
2. The "Request Code" column values no longer appear as "unknown" (they are now empty)
3. Reported changes on non-differing Codelists have been removed
4. Report changes on removed Codelists
5. Verbaige updates to "Change Types" ("Add" or "Remove" on "CDISC Synonyms" is now just "Update" for existing codelists.)
6. Improved handling of inputs
