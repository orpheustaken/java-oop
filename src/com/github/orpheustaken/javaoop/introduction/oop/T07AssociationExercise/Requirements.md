## Software to manage university presentations.

### Description:

Write a simple system that will manage university presentations.

It should allow registering presentations, students, professors and places.

### Requirements:

* Student can have only one Presentation
* Presentation can have none or multiple Students
* Professor can minister one or multiple Presentations
* Presentation must have a Place

### Basic Attributes:

* presentation: title
* student: name, age
* professor: name, researchField
* place: address

### Association Attributes:

* Presentation: Student[], Place
*
    * Student is not required but Place is, so two constructors are necessary.
*
    * One for a scenario where Student is not present but Place is.
*
    * Other for a scenario where both Student and Place are present.
* Student: Presentation
* Professor: Presentation[]
